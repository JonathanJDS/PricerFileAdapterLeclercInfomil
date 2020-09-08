package com.pricer;

import generated.MDA;
import org.apache.logging.log4j.*;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ThreadCheckPriceFiles extends Thread {

	static Logger logger =  LogManager.getLogger(ThreadCheckPriceFiles.class);
	static Wini ini;
	static String priceArchiveFolder;
	static String priceFileName;
	static int tempo;
	static String sourceFolder;
	static String temporaryFolder;
	static String pricerDataFilesFolder;
	static String pricerMessageFilesFolder;
	static String pricerResultFilesFolder;
	static HashMap<String, String> lstPFIs;


	Timer timer = new Timer();
	FileUtility utility = new FileUtility();


	public ThreadCheckPriceFiles() {

		logger.info("Starting Thread ThreadCheckPriceFiles");
		InitializeIni();


		/*******Archive folders **********/
		priceArchiveFolder		= ini.get("Folders", "PriceArchiveFolder");

		/********* FileNames *************/
		priceFileName 		= ini.get("Files","PriceFileName");

		/*****Pricer Path **************/
		tempo 						= Integer.valueOf(ini.get("Files", "timer"));
		sourceFolder 				= ini.get("Folders", "SourceFolder");
		temporaryFolder 			= ini.get("Folders", "TemporaryFolder");
		pricerDataFilesFolder 		= ini.get("Folders", "PricerDataFiles");
		pricerMessageFilesFolder 	= ini.get("Folders", "PricerMessageFiles");
		pricerResultFilesFolder		= ini.get("Folders", "PricerResultFiles");
		lstPFIs = new HashMap<>();
		for (String key : ini.get("PFIs").keySet()) {
			lstPFIs.put(key, ini.get("PFIs").fetch(key));
			System.out.println(key + ":" + ini.get("PFIs").fetch(key));
		}


		TimerTask task = new TimerTask() {
			@Override
			public void run() {

				


				ArrayList<String> allDatafiles=listFilesFromDirectory(sourceFolder + "\\", priceFileName);
				ArrayList<String> alltempfiles=listFilesFromDirectory(temporaryFolder + "\\", priceFileName);


				System.out.println("searching file with filter Name = " + priceFileName);
				FileUtility FdataFile = null;
				FileUtility FTemporaryFile = null;

				if (allDatafiles.size()>0) {
					//taking only the first file of several, the second on will become the first one at next iteration 
				FdataFile = new FileUtility(sourceFolder + "\\" + allDatafiles.get(0));
					System.out.println("current File Name = " + FdataFile.getPathFilename());
				}


				if (alltempfiles.size()>0) {
					FTemporaryFile = new FileUtility(temporaryFolder + "\\" + alltempfiles.get(0));
					System.out.println("current Temporary File Name = " + FTemporaryFile.getPathFilename());
				}



				
				// check first if something is present in temporary Folder, if not process source Folder

				if (FTemporaryFile!=null) {
					if (FTemporaryFile.FileExist()) {
						logger.warn("File is present in temporary Folder !! priority for that !!!!");
						logger.info("processing Temporary File : " + FTemporaryFile.getPathFilename());
						ProcessFile(FTemporaryFile);
					}
				}

					// process only one file in temporary (one by one ) .
					if (FdataFile!=null) {

						if (FdataFile.FileExist()) {
							utility.ZipFile(sourceFolder, FdataFile.getFileName(), priceArchiveFolder, FdataFile.getFileName());
							utility.MoveFile(sourceFolder + "\\" + FdataFile.getFileName(), temporaryFolder + "\\" + FdataFile.getFileName());

							if (FTemporaryFile!=null) {
								if (FTemporaryFile.FileExist() && !FTemporaryFile.fileIsGrowing()) {
									logger.info("processing Temporary File : " + FTemporaryFile.getPathFilename());
									ProcessFile(FTemporaryFile);
								}
							}

						}

					//	ProcessFile(FTemporaryFile);

					}

			}

		};

		// execute this thread 2 s after original tempo value.
		timer.scheduleAtFixedRate(task, 0, (tempo * 1000) + 2000);
	}

	private void ProcessFile(FileUtility FtemporaryFile) {

		System.out.println("Processing data file");
		logger.info("Processing data file : " + FtemporaryFile.getPathFilename() + "\\" + FtemporaryFile.getFileName());
		boolean bdatafile_Update_opened = false;
		boolean bdatafile_Delete_opened=false;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_Hmmss");
		String dateOfFile = sdf.format(d);
		String dataFileName_Update;
		String dataFileName_Delete;
		String messageFileName_Update;
		String resultFileName_Update;
		String messageFileName_Delete;
		String resultFileName_Delete;
		String contentMessageFile_Update;
		String contentMessageFile_Delete;
		PrintStream datafile_Update = null;
		PrintStream messagefile_Update = null;
		PrintStream datafile_Delete		=	null;
		PrintStream messagefile_Delete	=	null;
		Product product = null;
		Product productToDelete = null;
		List<Product> lstProducts = new ArrayList<Product>();
		List<Product> lstProductsToDelete = new ArrayList<Product>();
		StringBuffer completeLine2 = null;
		String Newligne=System.getProperty("line.separator"); /* just adding cr/lf at the end of each line */

		dataFileName_Update 	=	pricerDataFilesFolder		+ "\\" 	+	"data_price_"	+	dateOfFile + ".i1";
		messageFileName_Update 	=	pricerMessageFilesFolder	+ "\\" 	+	"data_price_"	+	dateOfFile + ".m1";
		resultFileName_Update 	=	pricerResultFilesFolder 	+ "\\" 	+	"data_price_"	+	dateOfFile + ".r7";


		dataFileName_Delete 	=	pricerDataFilesFolder		+ "\\"	+	"delete_"		+	dateOfFile + ".i1";
		messageFileName_Delete 	=	pricerMessageFilesFolder	+ "\\"	+	"delete_"		+	dateOfFile + ".m1";
		resultFileName_Delete 	=	pricerResultFilesFolder		+ "\\"	+ 	"delete_"		+	dateOfFile + ".r7";


		contentMessageFile_Update = "UPDATE,0001,," + dataFileName_Update + "," + resultFileName_Update;
		contentMessageFile_Delete 	=	"DELETE,0001,,"	+	dataFileName_Delete +	","	+	resultFileName_Delete;


		if (!FtemporaryFile.FileExist()) {
			logger.warn("temporary file " + FtemporaryFile.getPathFilename()  + " is not present");
			return;
		}


		if (FtemporaryFile.fileIsGrowing()) {
			logger.warn("file is growing waiting... : " + FtemporaryFile.getPathFilename());
			return;
		}

		System.out.println("let's GO!!!");
		JAXBContext jaxbContext = null;
		Unmarshaller jaxbUnmarshaller = null;

		try {
			jaxbContext = JAXBContext.newInstance(generated.MDA.class);
		} catch (JAXBException e) {
			logger.fatal("internal error unable to create instance of XSD to generated.MDA.class !!!");
			e.printStackTrace();
		}


		try {
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {

			//e.printStackTrace();
			System.out.println("message=" + e.getMessage());
			System.out.println("cause=" + e.getCause());
			logger.fatal("internal error unable to create unmarshaller  of object !!!");
		}


		MDA mda = null;
		try {
			mda = (MDA) jaxbUnmarshaller.unmarshal(new File(FtemporaryFile.getPathFilename()));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			logger.fatal("internal error unable to unmarshall xml file  to object !!!, check you file format : " + FtemporaryFile.getPathFilename());
			e.printStackTrace();
			logger.fatal("deleting File " + FtemporaryFile.getPathFilename());

			if (FtemporaryFile.deleteFile()) {
				logger.fatal("File Deleted " + FtemporaryFile.getPathFilename());
			}
			else {
				logger.fatal("Unable to delete File " + FtemporaryFile.getPathFilename() + " Please check that the file is not locked on ");

				}
			return;
		}


		System.out.println("monnaie = " + mda.getMONNAIE());
		List<Object> lstObjects = mda.getCOMMENTAIREAndARTSAndTTVA();

		// Map Iteration
		for (Object object : lstObjects) {

			if (object instanceof MDA.ARTS) {
				try {
					if (bdatafile_Update_opened == false) {
						datafile_Update = new PrintStream(new BufferedOutputStream(new FileOutputStream(dataFileName_Update, true)), true);
						System.out.println("dataFileName_Update =" + dataFileName_Update);
						bdatafile_Update_opened = true;
					}

				} catch (FileNotFoundException e) {
					logger.fatal("File Not Found, Unable to create File : " + dataFileName_Update);

				}


				MDA.ARTS arts = (MDA.ARTS) object;

				for (Object objectARTS : arts.getMARTAndSARTAndMCON()) {


					// update or create product
					if (objectARTS instanceof MDA.ARTS.MART) {

						MDA.ARTS.MART mart = (MDA.ARTS.MART) objectARTS;
						//System.out.println("libllé = " + mart.getLIB());

						product = new Product();
						product.setMDA_ARTS_MART_art(mart.getART()); // code article
						product.setMDA_ARTS_MART_lib(mart.getLIB()); // Libellé


						if (mart.getTAX() != null) {

							MDA.ARTS.MART.TAX tax = mart.getTAX();
							product.setMDA_ARTS_MART_TAX_tva(tax.getTVA());
							if (tax.getDEEE() != null) {


								MDA.ARTS.MART.TAX.DEEE deee = tax.getDEEE();

								if (deee.getD3EM()!=null) {
									product.setMDA_ARTS_MART_TAX_DEEE_d3em(String.valueOf(deee.getD3EM()));
								}

								if (deee.getD3ET()!=null) {
								product.setMDA_ARTS_MART_TAX_DEEE_d3et(deee.getD3ET());
								}


								if (deee.getD3EM() == null) {
									product.setMDA_ARTS_MART_TAX_DEEE_d3em("0");
									}

								if (deee.getD3ET() == null) {
									product.setMDA_ARTS_MART_TAX_DEEE_d3et("0");
								}

							}


							if (tax.getTAXE() != null) {

								List <MDA.ARTS.MART.TAX.TAXE> lstTaxe = tax.getTAXE();
								if (lstTaxe.size()>0) {
									MDA.ARTS.MART.TAX.TAXE taxe = lstTaxe.get(0);
									if (taxe!=null) {

										if (taxe.getCT() != null) {
											product.setMDA_ARTS_MART_TAX_TAXE_ct(taxe.getCT());
										}
										if (taxe.getCT() == null) {
											product.setMDA_ARTS_MART_TAX_TAXE_ct("0");
										}

										if (taxe.getVAL() != null) {
											product.setMDA_ARTS_MART_TAX_TAXE_val(String.valueOf(taxe.getVAL()));
										}
										if (taxe.getVAL() == null) {
											product.setMDA_ARTS_MART_TAX_TAXE_val("0");
										}

									}


								}



							}

						}


						MDA.ARTS.MART.PXQT pxqt = mart.getPXQT();
						//Object objectpxqt = MDA.ARTS.MART.PXQT;
						product.setMDA_ARTS_MART_PXQT_pxz(pxqt.getPXZ());

						// check if PRXU is not null
						List<MDA.ARTS.MART.PXQT.PRXU> lstPRXU = pxqt.getPRXU();
						if (lstPRXU.size() > 0) {
						//	System.out.println(" PRXU is not empty  ");

							StringBuilder prxuValue = new StringBuilder();

							// getting only the fist PRXU iteration value

							MDA.ARTS.MART.PXQT.PRXU prxu = lstPRXU.get(0);
							if (prxu !=null) {

								if (prxu.getPUTTC() != null) {
									product.setMDA_ARTS_MART_PXQT_PRXU_puttc(String.valueOf(prxu.getPUTTC()));
								}
								if (prxu.getPUTTC() == null) {
									product.setMDA_ARTS_MART_PXQT_PRXU_puttc("0");
								}
								if (prxu.getSEUIL() != null) {
									product.setMDA_ARTS_MART_PXQT_PRXU_seuil(String.valueOf(prxu.getSEUIL()));
								}

								if (prxu.getQTEU() != null) {
									product.setMDA_ARTS_MART_PXQT_PRXU_type("QTEU");

								}
								if (prxu.getQTES() != null) {
									product.setMDA_ARTS_MART_PXQT_PRXU_type("QTES");

									//System.out.println("QTES = saisie du nombre d'unité  quantité = 1 par défaut");

								}
								if (prxu.getQTEQ() != null) {
									product.setMDA_ARTS_MART_PXQT_PRXU_type("QTEQ");
									product.setMDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee(prxu.getQTEQ().getPESEE());
									product.setMDA_ARTS_MART_PXQT_PRXU_QTEQ_unite(prxu.getQTEQ().getUNITE());
									//System.out.println("QTEQ = Article vendu au poids ");
								}

								if (prxu.getQTEC() != null) {
									product.setMDA_ARTS_MART_PXQT_PRXU_type("QTEC");
									product.setMDA_ARTS_MART_PXQT_PRXU_QTEC_unite(prxu.getQTEC().getUNITE());
									//System.out.println("QTEC = quantité dans le code");
									//System.out.println("unité = " + prxs.getQTEC().getUNITE());

								}
							}
							/*
							for (MDA.ARTS.MART.PXQT.PRXU prxu : lstPRXU) {

								prxuValue.append(prxu.getPUTTC()).append(",").append(prxu.getSEUIL()).append(",");

								//System.out.println("puttc (prix unitaire)  = " + prxu.getPUTTC());
								//System.out.println("seuil = " + prxu.getSEUIL());

								if (prxu.getQTEU() != null) {
									//System.out.println("QTEU = vendu à l'unité ");
									prxuValue.append("QTEU");
								}
								if (prxu.getQTES() != null) {

									System.out.println("QTES = saisie du nombre d'unité  quantité = 1 par défaut");
									prxuValue.append("QTES");
								}
								if (prxu.getQTEQ() != null) {
									prxuValue.append("QTEQ").append(",");
									prxuValue.append(prxu.getQTEQ().getPESEE()).append(",").append(prxu.getQTEQ().getUNITE());
									//System.out.println("QTEQ = Article vendu au poids ");
									//System.out.println("pesée = " + prxu.getQTEQ().getPESEE());
									//System.out.println("unité = " + prxu.getQTEQ().getUNITE());

								}

								if (prxu.getQTEC() != null) {
									prxuValue.append("QTEC").append(",").append(prxu.getQTEC().getUNITE());
									//System.out.println("QTEC = quantité dans le code");
									//System.out.println("unité = " + prxu.getQTEC().getUNITE());

								}
								prxuValue.append("#");

							}

							*/
						///	product.setMDA_ARTS_MART_PXQT_PRXU_type(prxuValue.toString());

						}


						// checking if PRXS exist
						if (pxqt.getPRXS() != null) {
							//System.out.println("PRXS is not null");
							//System.out.println("QTEC = quantité dans le code");
							MDA.ARTS.MART.PXQT.PRXS prxs = pxqt.getPRXS();

							if (prxs.getQTEU() != null) {
								product.setMDA_ARTS_MART_PXQT_PRXS_type("QTEU");
								//System.out.println("QTEU = vendu à l'unité ");
							}
							if (prxs.getQTES() != null) {
								product.setMDA_ARTS_MART_PXQT_PRXS_type("QTES");

								//System.out.println("QTES = saisie du nombre d'unité  quantité = 1 par défaut");

							}
							if (prxs.getQTEQ() != null) {
								product.setMDA_ARTS_MART_PXQT_PRXS_type("QTEQ");
								product.setMDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee(prxs.getQTEQ().getPESEE());
								product.setMDA_ARTS_MART_PXQT_PRXS_QTEQ_unite(prxs.getQTEQ().getUNITE());
								//System.out.println("QTEQ = Article vendu au poids ");
								//System.out.println("pesée = " + prxs.getQTEQ().getPESEE());
								//System.out.println("unité = " + prxs.getQTEQ().getUNITE());

							}

							if (prxs.getQTEC() != null) {
								product.setMDA_ARTS_MART_PXQT_PRXS_type("QTEC");
								product.setMDA_ARTS_MART_PXQT_PRXS_QTEC_unite(prxs.getQTEC().getUNITE());
								//System.out.println("QTEC = quantité dans le code");
								//System.out.println("unité = " + prxs.getQTEC().getUNITE());

							}


						}


						// checking if PRXC exist
						if (pxqt.getPRXC() != null) {
							System.out.println("PRXC is not null");
							System.out.println("QTEC = quantité dans le code");
							MDA.ARTS.MART.PXQT.PRXC prxc = pxqt.getPRXC();

							if (prxc.getQTEU() != null) {
								product.setMDA_ARTS_MART_PXQT_PRXC_type("QTEU");
								//System.out.println("QTEU = vendu à l'unité ");

							}
							// fin de la balise


							if (prxc.getQTES() != null) {
								product.setMDA_ARTS_MART_PXQT_PRXC_type("QTES");
								//System.out.println("QTES = saisie du nombre d'unité  quantité = 1 par défaut");

							}


						}
						// fin de la balise PRXC
						//fin de la balise PXQT


						// debut de la balise CHA , Article ou consigne chainée
						if (mart.getCHA() != null) {
							System.out.println("article chainé, code = " + mart.getCHA());
							product.setMDA_ARTS_MART_cha(mart.getCHA());
						}
						// fin de la balise CHA


						// devut de la balise STM, Structure marchandise de l'article
						List<MDA.ARTS.MART.STM> lstSTM = mart.getSTM();
						//Stucture marchandise de l'article


						if (lstSTM.size() > 0) {
							MDA.ARTS.MART.STM stm_r = lstSTM.get(0);
							product.setMDA_ARTS_MART_STM_r(stm_r.getCE().toString());
						}

						if (lstSTM.size() >= 1) {
							MDA.ARTS.MART.STM stm_f = lstSTM.get(1);
							product.setMDA_ARTS_MART_STM_f(stm_f.getCE().toString());
						}
						if (lstSTM.size() >= 2) {
							MDA.ARTS.MART.STM stm_sf = lstSTM.get(2);
							product.setMDA_ARTS_MART_STM_sf(stm_sf.getCE().toString());
						}


						// fin de la balise STM

						// debut de la balise DCOG "données complémentaires de Gestion

						if (mart.getDCOG() != null) {
							MDA.ARTS.MART.DCOG dcog = mart.getDCOG();

							product.setMDA_ARTS_MART_DCOG_cia(dcog.getCIA());
							product.setMDA_ARTS_MART_DCOG_nac(dcog.getNAC());
							product.setMDA_ARTS_MART_DCOG_clec(dcog.getCLEC());

							product.setMDA_ARTS_MART_DCOG_libs(dcog.getLIBS());
							product.setMDA_ARTS_MART_DCOG_marq(dcog.getMARQ());
							product.setMDA_ARTS_MART_DCOG_nf(dcog.getNF());
							product.setMDA_ARTS_MART_DCOG_disp(dcog.getDISP());
							product.setMDA_ARTS_MART_DCOG_prom(dcog.getPROM());
							product.setMDA_ARTS_MART_DCOG_pdrf(String.valueOf(dcog.getPDRF()));
							product.setMDA_ARTS_MART_DCOG_trpr(String.valueOf(dcog.getTRPR()));
							product.setMDA_ARTS_MART_DCOG_txprc(dcog.getTXPRC());
							product.setMDA_ARTS_MART_DCOG_txprl(dcog.getTXPRL());
							product.setMDA_ARTS_MART_DCOG_rfpr(dcog.getRFPR());
							product.setMDA_ARTS_MART_DCOG_apar(dcog.getAPAR());


							//System.out.println("code interne CIA = " + dcog.getCIA());
							//System.out.println("Accord galec NAC = " + dcog.getNAC());
							//System.out.println("CODELEC CLEC = " + dcog.getCLEC());
							//System.out.println("Libéllé secondaire LIBS = " + dcog.getLIBS());
							//System.out.println("Marque MARQ = " + dcog.getMARQ());
							//System.out.println("Fournisseur NF = " + dcog.getNF());
							//System.out.println("Disp o/n = " + dcog.getDISP());
							//System.out.println("Prom o/n = " + dcog.getPROM());
							//System.out.println("Prix de reference PDRF = " + dcog.getPDRF());
							//System.out.println("Pourcentage de Reduction TRPR = " + dcog.getTRPR());
							//System.out.println("Text Reduction Court TXPRC = " + dcog.getTXPRC());
							//System.out.println("Text Reduction Long TXPRL = " + dcog.getTXPRL());
							//System.out.println("Reference Promotion RFPR = " + dcog.getRFPR());
							//System.out.println("Adresse Produit APAR = " + dcog.getAPAR());

							if (dcog.getIUM() != null) {
								MDA.ARTS.MART.DCOG.IUM ium = dcog.getIUM();

								if (ium.getLIBU() != null) {
									product.setMDA_ARTS_MART_DCOG_IUM_libu(ium.getLIBU());
									product.setMDA_ARTS_MART_DCOG_IUM_pum(String.valueOf(ium.getPUM()));
									//System.out.println("Prix à l'unité de mesure PUM = " + ium.getPUM());
									//System.out.println("Libéllé unité LIBU = " + ium.getLIBU());
								}
								else {
									product.setMDA_ARTS_MART_DCOG_IUM_libu("P");
									product.setMDA_ARTS_MART_DCOG_IUM_pum("0");
								}
							}


							if (dcog.getCONT() != null) {
								MDA.ARTS.MART.DCOG.CONT cont = dcog.getCONT();
								product.setMDA_ARTS_MART_DCOG_CONT_contv(String.valueOf(cont.getCONTV()));
								product.setMDA_ARTS_MART_DCOG_CONT_libu(cont.getLIBU());
								product.setMDA_ARTS_MART_DCOG_CONT_contt(cont.getCONTT());




							//	System.out.println("contv = " + product.getMDA_ARTS_MART_DCOG_CONT_contv());
						//		System.out.println("libu = " + product.getMDA_ARTS_MART_DCOG_CONT_libu());
						//		System.out.println("contt = " +product.getMDA_ARTS_MART_DCOG_CONT_contt());


							}



						}
						// fin de balise DCOG

						// debut de la balise DCOT, Données complémentaires optionnelles tiers
						if (mart.getDCOT() != null) {
							MDA.ARTS.MART.DCOT dcot = mart.getDCOT();
							//System.out.println("Lettre de marge LMRG = " + dcot.getLMRG());
							product.setMDA_ARTS_MART_DCOT_lmrg(dcot.getLMRG());
							// debut de la balise TAS, informations supplémentaires facultatives pour fournir des infos au EEG
							if (dcot.getTAS() != null) {
								product.setMDA_ARTS_MART_DCOT_TAS_tas(dcot.getTAS());
								//System.out.println("TAS = " + dcot.getTAS());
							}
							// fin de la balise TAS

							// debut de la balise DFL , Données F&L pour les EEG
							if (dcot.getDFL() != null) {
								MDA.ARTS.MART.DCOT.DFL dfl = dcot.getDFL();
								product.setMDA_ARTS_MART_DCOT_DFL_orig(dfl.getORIG());
								product.setMDA_ARTS_MART_DCOT_DFL_cal(dfl.getCAL());
								product.setMDA_ARTS_MART_DCOT_DFL_cat(dfl.getCAT());
								product.setMDA_ARTS_MART_DCOT_DFL_vart(dfl.getVART());
								product.setMDA_ARTS_MART_DCOT_DFL_plub(dfl.getPLUB());
								product.setMDA_ARTS_MART_DCOT_DFL_bio(dfl.getBIO());
								product.setMDA_ARTS_MART_DCOT_DFL_mesp1(dfl.getMESP1());
								product.setMDA_ARTS_MART_DCOT_DFL_mesp2(dfl.getMESP2());
								//System.out.println("Origine ORIG = " + dfl.getORIG());
								//System.out.println("Calibre CAL = " + dfl.getCAL());
								//System.out.println("Catégorie CAT = " + dfl.getCAT());
								//System.out.println("Variété VART = " + dfl.getVART());
								//System.out.println("PLU Balance PLUB= " + dfl.getPLUB());
								//System.out.println("Indicateur Produit BIO  = " + dfl.getBIO());
								//System.out.println("Premiere Mention Spécifique MESP1 = " + dfl.getMESP1());
								//System.out.println("deuxieme Mention Spécifique MESP2 = " + dfl.getMESP2());

							}
							// fin de la balise DFL

							// début de la balise TRTFL Traitement appliqué sur le produit
							if (dcot.getTRTFL() != null) {
								//System.out.println("Traitement appliqué sur le produit = " + dcot.getTRTFL());
								product.setMDA_ARTS_MART_DCOT_TRTFL_trtfl(dcot.getTRTFL());
							}
							// fin de la balise TRTFL

							// début de la balise BCO2, bilan carbone
							if (dcot.getBCO2() != null) {

								MDA.ARTS.MART.DCOT.BCO2 bco2 = dcot.getBCO2();
								product.setMDA_ARTS_MART_DCOT_BCO2_vcuv(String.valueOf(bco2.getVCUV()));
								product.setMDA_ARTS_MART_DCOT_BCO2_vcum(String.valueOf(bco2.getVCUM()));
								product.setMDA_ARTS_MART_DCOT_BCO2_libu(bco2.getLIBU());
								//System.out.println("Valeur carbone par UV : VCUV = " + bco2.getVCUV());
								//System.out.println("Valeur carbone par Unité de Mesure : VCUM = " + bco2.getVCUM());
								//System.out.println("Unité de Mesure : LIBU = " + bco2.getLIBU());
							}
							// fin de la balise BCO2

						}
						// fin de la balise DCOT


						// début de la balise DCOC, Données complémentaires optionnelles pour vente en caisse.
						if (mart.getDCOC() != null) {
							MDA.ARTS.MART.DCOC dcoc = mart.getDCOC();
							product.setMDA_ARTS_MART_DCOC_txt(dcoc.getTXT());
							product.setMDA_ARTS_MART_DCOC_msg(dcoc.getMSG());
							product.setMDA_ARTS_MART_DCOC_avol(dcoc.getAVOL());
							product.setMDA_ARTS_MART_DCOC_ssc(dcoc.getSSC());

							//System.out.println("sur ticket TXT = " + dcoc.getTXT());
							//System.out.println("Caissiere MSG = " + dcoc.getMSG());
							//System.out.println("oui/non  AVOL = " + dcoc.getAVOL());
							//System.out.println("Self Scanning oui/non SSC = " + dcoc.getSSC());

							// début de la balise ITCS, impression ticket complementaire
							if (dcoc.getITCS() != null) {
								MDA.ARTS.MART.DCOC.ITCS itcs = dcoc.getITCS();
								//System.out.println("Ticket Générateur NOTG = " + itcs.getNOTG());
								product.setMDA_ARTS_MART_DCOC_ITCS_notg(itcs.getNOTG());
								// début de la balise LGN
								if (itcs.getLGN().size() > 0) {
									List<MDA.ARTS.MART.DCOC.ITCS.LGN> lstLGN = itcs.getLGN();
									StringBuilder lgnValues = new StringBuilder();
									for (MDA.ARTS.MART.DCOC.ITCS.LGN lgn : lstLGN) {
										lgnValues.append(lgn.getTXT()).append(lgn.getSIZ()).append("#");
										//System.out.println("Texte Ligne TXT = " + lgn.getTXT());
										//System.out.println("Taille Font SIZ = " + lgn.getSIZ());

									}
									product.setMDA_ARTS_MART_DCOC_ITCS_lgn(lgnValues.toString());
								}
								// fin de la balise LGN

							}
							// fin de la balise ITCS

							// début de la balise ITCC, Impression Ticket Complémentaire au choix
							if (dcoc.getITCC() != null) {
								List<MDA.ARTS.MART.DCOC.ITCC> lstITCC = dcoc.getITCC();
								StringBuilder itccValues = new StringBuilder();
								if (lstITCC.size() > 0) {
									for (MDA.ARTS.MART.DCOC.ITCC itcc : lstITCC) {
										itccValues.append(itcc.getNOTG()).append(",").append(itcc.getLIBT()).append(",");
										//System.out.println("NOTG = " + itcc.getNOTG());
										//System.out.println("Intitulé LIBT = " + itcc.getLIBT());
										List<MDA.ARTS.MART.DCOC.ITCC.LGN> lstLGNITCC = itcc.getLGN();
										for (MDA.ARTS.MART.DCOC.ITCC.LGN lgnITCC : lstLGNITCC) {
											itccValues.append(lgnITCC.getTXT()).append(",").append(lgnITCC.getSIZ()).append("#");
											//System.out.println("Texte Ligne = " + lgnITCC.getTXT());
											//System.out.println("taille font = " + lgnITCC.getSIZ());

										}
									}


								}

							}
							// fin de la balise ITCC

						}
						// fin de la balise DCOC

						// début de la balise DTECH, Données articles techniques
						if (mart.getDTECH() != null) {

							MDA.ARTS.MART.DTECH dtech = mart.getDTECH();
							//System.out.println("Libélé info non communiquées DTECH = " + dtech.getLDNC());
							product.setMDA_ARTS_MART_DTECH_ldnc(dtech.getLDNC());

							// debut de la balise GTIE, Durée de garantie
							if (dtech.getGTIE() != null) {

								MDA.ARTS.MART.DTECH.GTIE gtie = dtech.getGTIE();
								product.setMDA_ARTS_MART_DTECH_GTIE_lgar(gtie.getLGAR());
								product.setMDA_ARTS_MART_DTECH_GTIE_dgar(String.valueOf(gtie.getDGAR()));
								product.setMDA_ARTS_MART_DTECH_GTIE_ugar(gtie.getUGAR());
								//System.out.println("Libélé Ticket de la garantie LGAR = " + gtie.getLGAR());
								//System.out.println("Durée garantie sans unité DGAR = " + gtie.getDGAR());
								//System.out.println("Unité de la durée UGAR = " + gtie.getUGAR());
							}
							// fin de la balise GTIE

							// debut de la balise PIEC
							if (dtech.getPIEC() != null) {
								MDA.ARTS.MART.DTECH.PIEC piec = dtech.getPIEC();

								product.setMDA_ARTS_MART_DTECH_PIEC_lpie(piec.getLPIE());            // libellé ticket de la fourniture
								product.setMDA_ARTS_MART_DTECH_PIEC_dpie(String.valueOf(piec.getDPIE()));
								product.setMDA_ARTS_MART_DTECH_PIEC_upie(String.valueOf(piec.getUPIE()));
								//System.out.println("Libéllé Ticket de la fourniture LPIE = " + piec.getLPIE());
								//System.out.println("Durée fourniture pièces sans unité DPIE = " + piec.getDPIE());
								//System.out.println("Unité de la durée UPIE = " + piec.getUPIE());
							}
							// fin de la balise PIECC

						}
						// fin de la balise DTECH

					}

					// fin de la balise MART on ajoute le produit dans la liste.
					lstProducts.add(product);


					// delete product debut de la balise SART pour la suppression
					if (objectARTS instanceof MDA.ARTS.SART) {
						MDA.ARTS.SART sart = (MDA.ARTS.SART) objectARTS;
						//System.out.println("product to delete ART = " + sart.getART() );
						productToDelete = new Product();
						productToDelete.setMDA_ARTS_SART_art(sart.getART());
						lstProductsToDelete.add(productToDelete);
						//System.out.println("product to delete ART = " + productToDelete.getMDA_ARTS_SART_art() );
					}

				}
			}
		}


				logger.info("nbre of products found  = " + lstProducts.size());

				for (Product produit : lstProducts) {

					try {


						if (!bdatafile_Update_opened) {


							try {
								datafile_Update = new PrintStream(new BufferedOutputStream(new FileOutputStream(dataFileName_Update, true)), true);
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								logger.fatal("unable to create file : " + dataFileName_Update );
								e.printStackTrace();
								return;

							}

							bdatafile_Update_opened = true;
						}

						completeLine2 = new StringBuffer();
						completeLine2.append("0001 ").append(produit.getMDA_ARTS_MART_art());




// remplacement de null par le chiffre zero pour certaines balises .
if (produit.getMDA_ARTS_MART_DCOG_IUM_pum()	 ==null || produit.getMDA_ARTS_MART_DCOG_IUM_pum().equalsIgnoreCase("null")) {
	produit.setMDA_ARTS_MART_DCOG_IUM_pum("0");
}

if (produit.getMDA_ARTS_MART_PXQT_PRXU_puttc()	 ==null || produit.getMDA_ARTS_MART_PXQT_PRXU_puttc().equalsIgnoreCase("null")) {
	produit.setMDA_ARTS_MART_PXQT_PRXU_puttc("0");
}

if (produit.getMDA_ARTS_MART_TAX_DEEE_d3em()	 ==null || produit.getMDA_ARTS_MART_TAX_DEEE_d3em().equalsIgnoreCase("null")) {
	produit.setMDA_ARTS_MART_TAX_DEEE_d3em("0");
}

if (produit.getMDA_ARTS_MART_TAX_DEEE_d3em()	 ==null || produit.getMDA_ARTS_MART_TAX_DEEE_d3em().equalsIgnoreCase("null")) {
	produit.setMDA_ARTS_MART_TAX_DEEE_d3em("0");
	}

if (produit.getMDA_ARTS_MART_TAX_TAXE_ct()	 ==null || produit.getMDA_ARTS_MART_TAX_TAXE_ct().equalsIgnoreCase("null")) {
	produit.setMDA_ARTS_MART_TAX_TAXE_ct("0");
 }

if (produit.getMDA_ARTS_MART_DCOG_IUM_libu()	 ==null || produit.getMDA_ARTS_MART_DCOG_IUM_libu().equalsIgnoreCase("null")) {
	produit.setMDA_ARTS_MART_DCOG_IUM_libu("P");
}




if (produit.getMDA_ARTS_MART_lib() 					!=null && !produit.getMDA_ARTS_MART_lib().equalsIgnoreCase("null") 					&& lstPFIs.get("MDA_ARTS_MART_lib") !=null)	 					completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_lib"))						.append(" 0 |").append(produit.getMDA_ARTS_MART_lib())					.append("|");
if (produit.getMDA_ARTS_MART_TAX_tva()				!=null && !produit.getMDA_ARTS_MART_TAX_tva().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_TAX_tva") !=null)					completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_TAX_tva"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_TAX_tva())				.append("|");
if (produit.getMDA_ARTS_MART_TAX_DEEE_d3em()		!=null && !produit.getMDA_ARTS_MART_TAX_DEEE_d3em().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_TAX_DEEE_d3em") !=null) 			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_TAX_DEEE_d3em"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_TAX_DEEE_d3em())		.append("|");
if (produit.getMDA_ARTS_MART_TAX_DEEE_d3et()		!=null && !produit.getMDA_ARTS_MART_TAX_DEEE_d3et().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_TAX_DEEE_d3et") !=null) 			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_TAX_DEEE_d3et"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_TAX_DEEE_d3et())		.append("|");
if (produit.getMDA_ARTS_MART_TAX_TAXE_ct()			!=null && !produit.getMDA_ARTS_MART_TAX_TAXE_ct().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_TAX_TAXE_ct") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_TAX_TAXE_ct"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_TAX_TAXE_ct())			.append("|");
if (produit.getMDA_ARTS_MART_TAX_TAXE_val()			!=null && !produit.getMDA_ARTS_MART_TAX_TAXE_val().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_TAX_TAXE_val") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_TAX_TAXE_val"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_TAX_TAXE_val())			.append("|");
if (produit.getMDA_ARTS_MART_PXQT_pxz()				!=null && !produit.getMDA_ARTS_MART_PXQT_pxz().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_PXQT_pxz") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_pxz"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_pxz())				.append("|");
if (produit.getMDA_ARTS_MART_PXQT_PRXU_type()		!=null && !produit.getMDA_ARTS_MART_PXQT_PRXU_type().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_type") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_type"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXU_type())		.append("|");
if (produit.getMDA_ARTS_MART_PXQT_PRXS_type()		!=null && !produit.getMDA_ARTS_MART_PXQT_PRXS_type().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXS_type") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXS_type"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXS_type())		.append("|");


if (produit.getMDA_ARTS_MART_PXQT_PRXU_puttc()		!=null && !produit.getMDA_ARTS_MART_PXQT_PRXU_puttc().equalsIgnoreCase("null") 		&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_puttc") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_puttc"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXU_puttc())		.append("|");
if (produit.getMDA_ARTS_MART_PXQT_PRXU_seuil()		!=null && !produit.getMDA_ARTS_MART_PXQT_PRXU_seuil().equalsIgnoreCase("null") 		&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_seuil") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_seuil"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXU_seuil())		.append("|");
if (produit.getMDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee()	!=null && !produit.getMDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee().equalsIgnoreCase("null") 	&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee") !=null)	completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee"))		.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXU_QTEQ_pesee())	.append("|");
if (produit.getMDA_ARTS_MART_PXQT_PRXU_QTEQ_unite()	!=null && !produit.getMDA_ARTS_MART_PXQT_PRXU_QTEQ_unite().equalsIgnoreCase("null") 	&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_QTEQ_unite") !=null)	completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_QTEQ_unite"))		.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXU_QTEQ_unite())	.append("|");
if (produit.getMDA_ARTS_MART_PXQT_PRXU_QTEC_unite()	!=null && !produit.getMDA_ARTS_MART_PXQT_PRXU_QTEC_unite().equalsIgnoreCase("null")	&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_QTEC_unite") !=null)	completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXU_QTEC_unite"))		.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXU_QTEC_unite())	.append("|");


if (produit.getMDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee()	!=null && !produit.getMDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee().equalsIgnoreCase("null") 	&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee") !=null)	completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee"))		.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXS_QTEQ_pesee())	.append("|");
if (produit.getMDA_ARTS_MART_PXQT_PRXS_QTEQ_unite()	!=null && !produit.getMDA_ARTS_MART_PXQT_PRXS_QTEQ_unite().equalsIgnoreCase("null") 	&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXS_QTEQ_unite") !=null)	completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXS_QTEQ_unite"))		.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXS_QTEQ_unite())	.append("|");
if (produit.getMDA_ARTS_MART_PXQT_PRXS_QTEC_unite()	!=null && !produit.getMDA_ARTS_MART_PXQT_PRXS_QTEC_unite().equalsIgnoreCase("null")	&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXS_QTEC_unite") !=null)	completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXS_QTEC_unite"))		.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXS_QTEC_unite())	.append("|");
if (produit.getMDA_ARTS_MART_PXQT_PRXC_type()		!=null && !produit.getMDA_ARTS_MART_PXQT_PRXC_type().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_PXQT_PRXC_type") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_PXQT_PRXC_type"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_PXQT_PRXC_type())		.append("|");
if (produit.getMDA_ARTS_MART_cha()					!=null && !produit.getMDA_ARTS_MART_cha().equalsIgnoreCase("null") 					&& lstPFIs.get("MDA_ARTS_MART_cha") !=null)						completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_cha"))						.append(" 0 |").append(produit.getMDA_ARTS_MART_cha())					.append("|");

if (produit.getMDA_ARTS_MART_STM_r()				!=null && !produit.getMDA_ARTS_MART_STM_r().equalsIgnoreCase("null") 					&& lstPFIs.get("MDA_ARTS_MART_STM_r") !=null)					completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_STM_r"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_STM_r())				.append("|");
if (produit.getMDA_ARTS_MART_STM_f()				!=null && !produit.getMDA_ARTS_MART_STM_f().equalsIgnoreCase("null") 					&& lstPFIs.get("MDA_ARTS_MART_STM_f") !=null)					completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_STM_f"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_STM_f())				.append("|");
if (produit.getMDA_ARTS_MART_STM_sf()				!=null && !produit.getMDA_ARTS_MART_STM_sf().equalsIgnoreCase("null") 					&& lstPFIs.get("MDA_ARTS_MART_STM_sf") !=null)					completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_STM_sf"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_STM_sf())				.append("|");

if (produit.getMDA_ARTS_MART_DCOG_cia()				!=null && !produit.getMDA_ARTS_MART_DCOG_cia().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_cia") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_cia"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_cia())				.append("|");
if (produit.getMDA_ARTS_MART_DCOG_nac()				!=null && !produit.getMDA_ARTS_MART_DCOG_nac().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_nac") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_nac"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_nac())				.append("|");
if (produit.getMDA_ARTS_MART_DCOG_clec()			!=null && !produit.getMDA_ARTS_MART_DCOG_clec().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_clec") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_clec"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_clec())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_libs()			!=null && !produit.getMDA_ARTS_MART_DCOG_libs().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_libs") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_libs"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_libs())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_marq()			!=null && !produit.getMDA_ARTS_MART_DCOG_marq().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_marq") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_marq"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_marq())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_nf()				!=null && !produit.getMDA_ARTS_MART_DCOG_nf().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_nf") !=null)					completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_nf"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_nf())				.append("|");
if (produit.getMDA_ARTS_MART_DCOG_disp()			!=null && !produit.getMDA_ARTS_MART_DCOG_disp().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_disp") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_disp"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_disp())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_prom()			!=null && !produit.getMDA_ARTS_MART_DCOG_prom().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_prom") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_prom"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_prom())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_pdrf()			!=null && !produit.getMDA_ARTS_MART_DCOG_pdrf().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_pdrf") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_pdrf"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_pdrf())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_trpr()			!=null && !produit.getMDA_ARTS_MART_DCOG_trpr().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_trpr") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_trpr"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_trpr())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_txprc()			!=null && !produit.getMDA_ARTS_MART_DCOG_txprc().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_txprc") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_txprc"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_txprc())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_txprl()			!=null && !produit.getMDA_ARTS_MART_DCOG_txprl().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_txprl") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_txprl"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_txprl())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_rfpr()			!=null && !produit.getMDA_ARTS_MART_DCOG_rfpr().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_rfpr") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_rfpr"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_rfpr())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_apar()			!=null && !produit.getMDA_ARTS_MART_DCOG_apar().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOG_apar") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_apar"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_apar())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_IUM_pum()			!=null && !produit.getMDA_ARTS_MART_DCOG_IUM_pum().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOG_IUM_pum") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_IUM_pum"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_IUM_pum())			.append("|");
if (produit.getMDA_ARTS_MART_DCOG_IUM_libu()		!=null && !produit.getMDA_ARTS_MART_DCOG_IUM_libu().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOG_IUM_libu") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_IUM_libu"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_IUM_libu())		.append("|");
if (produit.getMDA_ARTS_MART_DCOG_CONT_contv()		!=null && !produit.getMDA_ARTS_MART_DCOG_CONT_contv().equalsIgnoreCase("null") 		&& lstPFIs.get("MDA_ARTS_MART_DCOG_CONT_contv") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_CONT_contv"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_CONT_contv())		.append("|");
if (produit.getMDA_ARTS_MART_DCOG_CONT_libu()		!=null && !produit.getMDA_ARTS_MART_DCOG_CONT_libu().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOG_CONT_libu") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_CONT_libu"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_CONT_libu())		.append("|");
if (produit.getMDA_ARTS_MART_DCOG_CONT_contt()		!=null && !produit.getMDA_ARTS_MART_DCOG_CONT_contt().equalsIgnoreCase("null") 		&& lstPFIs.get("MDA_ARTS_MART_DCOG_CONT_contt") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOG_CONT_contt"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOG_CONT_contt())		.append("|");
if (produit.getMDA_ARTS_MART_DCOT_lmrg()			!=null && !produit.getMDA_ARTS_MART_DCOT_lmrg().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOT_lmrg") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_lmrg"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_lmrg())			.append("|");
if (produit.getMDA_ARTS_MART_DCOT_TAS_tas()			!=null && !produit.getMDA_ARTS_MART_DCOT_TAS_tas().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_TAS_tas") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_TAS_tas"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_TAS_tas())			.append("|");
if (produit.getMDA_ARTS_MART_DCOT_DFL_orig()		!=null && !produit.getMDA_ARTS_MART_DCOT_DFL_orig().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_orig") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_orig"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_DFL_orig())		.append("|");
if (produit.getMDA_ARTS_MART_DCOT_DFL_cal()			!=null && !produit.getMDA_ARTS_MART_DCOT_DFL_cal().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_cal") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_cal"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_DFL_cal())			.append("|");
if (produit.getMDA_ARTS_MART_DCOT_DFL_cat()			!=null && !produit.getMDA_ARTS_MART_DCOT_DFL_cat().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_cat") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_cat"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_DFL_cat())			.append("|");
if (produit.getMDA_ARTS_MART_DCOT_DFL_vart()		!=null && !produit.getMDA_ARTS_MART_DCOT_DFL_vart().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_vart") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_vart"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_DFL_vart())		.append("|");
if (produit.getMDA_ARTS_MART_DCOT_DFL_plub()		!=null && !produit.getMDA_ARTS_MART_DCOT_DFL_plub().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_plub") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_plub"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_DFL_plub())		.append("|");
if (produit.getMDA_ARTS_MART_DCOT_DFL_bio()			!=null && !produit.getMDA_ARTS_MART_DCOT_DFL_bio().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_bio") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_bio"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_DFL_bio())			.append("|");
if (produit.getMDA_ARTS_MART_DCOT_DFL_mesp1()		!=null && !produit.getMDA_ARTS_MART_DCOT_DFL_mesp1().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_mesp1") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_mesp1"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_DFL_mesp1())		.append("|");
if (produit.getMDA_ARTS_MART_DCOT_DFL_mesp2()		!=null && !produit.getMDA_ARTS_MART_DCOT_DFL_mesp2().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_mesp2") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_DFL_mesp2"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_DFL_mesp2())		.append("|");
if (produit.getMDA_ARTS_MART_DCOT_TRTFL_trtfl()		!=null && !produit.getMDA_ARTS_MART_DCOT_TRTFL_trtfl().equalsIgnoreCase("null")		&& lstPFIs.get("MDA_ARTS_MART_DCOT_TRTFL_trtfl") !=null)		completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_TRTFL_trtfl"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_TRTFL_trtfl())		.append("|");
if (produit.getMDA_ARTS_MART_DCOT_BCO2_vcuv()		!=null && !produit.getMDA_ARTS_MART_DCOT_BCO2_vcuv().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_BCO2_vcuv") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_BCO2_vcuv"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_BCO2_vcuv())		.append("|");
if (produit.getMDA_ARTS_MART_DCOT_BCO2_vcum()		!=null && !produit.getMDA_ARTS_MART_DCOT_BCO2_vcum().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_BCO2_vcum") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_BCO2_vcum"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_BCO2_vcum())		.append("|");
if (produit.getMDA_ARTS_MART_DCOT_BCO2_libu()		!=null && !produit.getMDA_ARTS_MART_DCOT_BCO2_libu().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOT_BCO2_libu") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOT_BCO2_libu"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOT_BCO2_libu())		.append("|");
if (produit.getMDA_ARTS_MART_DCOC_txt()				!=null && !produit.getMDA_ARTS_MART_DCOC_txt().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOC_txt") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOC_txt"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOC_txt())				.append("|");
if (produit.getMDA_ARTS_MART_DCOC_msg()				!=null && !produit.getMDA_ARTS_MART_DCOC_msg().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOC_msg") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOC_msg"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOC_msg())				.append("|");
if (produit.getMDA_ARTS_MART_DCOC_avol()			!=null && !produit.getMDA_ARTS_MART_DCOC_avol().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOC_avol") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOC_avol"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOC_avol())			.append("|");
if (produit.getMDA_ARTS_MART_DCOC_ssc()				!=null && !produit.getMDA_ARTS_MART_DCOC_ssc().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DCOC_ssc") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOC_ssc"))					.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOC_ssc())				.append("|");
if (produit.getMDA_ARTS_MART_DCOC_ITCS_notg()		!=null && !produit.getMDA_ARTS_MART_DCOC_ITCS_notg().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOC_ITCS_notg") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOC_ITCS_notg"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOC_ITCS_notg())		.append("|");
if (produit.getMDA_ARTS_MART_DCOC_ITCS_lgn()		!=null && !produit.getMDA_ARTS_MART_DCOC_ITCS_lgn().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOC_ITCS_lgn") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOC_ITCS_lgn"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOC_ITCS_lgn())		.append("|");
if (produit.getMDA_ARTS_MART_DCOC_ITCC_notg()		!=null && !produit.getMDA_ARTS_MART_DCOC_ITCC_notg().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOC_ITCC_notg") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOC_ITCC_notg"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOC_ITCC_notg())		.append("|");
if (produit.getMDA_ARTS_MART_DCOC_ITCC_libt()		!=null && !produit.getMDA_ARTS_MART_DCOC_ITCC_libt().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOC_ITCC_libt") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOC_ITCC_libt"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOC_ITCC_libt())		.append("|");
if (produit.getMDA_ARTS_MART_DCOC_ITCC_lgn()		!=null && !produit.getMDA_ARTS_MART_DCOC_ITCC_lgn().equalsIgnoreCase("null") 			&& lstPFIs.get("MDA_ARTS_MART_DCOC_ITCC_lgn") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DCOC_ITCC_lgn"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DCOC_ITCC_lgn())		.append("|");
if (produit.getMDA_ARTS_MART_DTECH_ldnc()			!=null && !produit.getMDA_ARTS_MART_DTECH_ldnc().equalsIgnoreCase("null") 				&& lstPFIs.get("MDA_ARTS_MART_DTECH_ldnc") !=null)				completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DTECH_ldnc"))				.append(" 0 |").append(produit.getMDA_ARTS_MART_DTECH_ldnc())			.append("|");
if (produit.getMDA_ARTS_MART_DTECH_GTIE_lgar()		!=null && !produit.getMDA_ARTS_MART_DTECH_GTIE_lgar().equalsIgnoreCase("null") 		&& lstPFIs.get("MDA_ARTS_MART_DTECH_GTIE_lgar") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DTECH_GTIE_lgar"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DTECH_GTIE_lgar())		.append("|");
if (produit.getMDA_ARTS_MART_DTECH_GTIE_dgar()		!=null && !produit.getMDA_ARTS_MART_DTECH_GTIE_dgar().equalsIgnoreCase("null")			&& lstPFIs.get("MDA_ARTS_MART_DTECH_GTIE_dgar") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DTECH_GTIE_dgar"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DTECH_GTIE_dgar())		.append("|");
if (produit.getMDA_ARTS_MART_DTECH_GTIE_ugar()		!=null && !produit.getMDA_ARTS_MART_DTECH_GTIE_ugar().equalsIgnoreCase("null") 		&& lstPFIs.get("MDA_ARTS_MART_DTECH_GTIE_ugar") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DTECH_GTIE_ugar"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DTECH_GTIE_ugar())		.append("|");
if (produit.getMDA_ARTS_MART_DTECH_PIEC_lpie()		!=null && !produit.getMDA_ARTS_MART_DTECH_PIEC_lpie().equalsIgnoreCase("null")			&& lstPFIs.get("MDA_ARTS_MART_DTECH_PIEC_lpie") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DTECH_PIEC_lpie"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DTECH_PIEC_lpie())		.append("|");
if (produit.getMDA_ARTS_MART_DTECH_PIEC_dpie()		!=null && !produit.getMDA_ARTS_MART_DTECH_PIEC_dpie().equalsIgnoreCase("null") 		&& lstPFIs.get("MDA_ARTS_MART_DTECH_PIEC_dpie") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DTECH_PIEC_dpie"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DTECH_PIEC_dpie())		.append("|");
if (produit.getMDA_ARTS_MART_DTECH_PIEC_upie()		!=null && !produit.getMDA_ARTS_MART_DTECH_PIEC_upie().equalsIgnoreCase("null") 		&& lstPFIs.get("MDA_ARTS_MART_DTECH_PIEC_upie") !=null)			completeLine2.append(" ").append(lstPFIs.get("MDA_ARTS_MART_DTECH_PIEC_upie"))			.append(" 0 |").append(produit.getMDA_ARTS_MART_DTECH_PIEC_upie());

completeLine2.append(",");

					} catch (NullPointerException ex) {
						logger.warn("anomalie product is empty or not forfamted correctly  : rejected " + "==>" + produit.toString());
						logger.log(Level.getLevel("REJECTED"),"anomalie product is empty or not formated correctly  : rejected " + "==>" + produit.toString());
					//	System.out.println("Produit is null");
					}


					datafile_Update.println(completeLine2.toString().replace("\\|\\|,","|,"));
					datafile_Update.flush();

				}
				logger.info("datafile (" + dataFileName_Update + ") is written......");


				if (bdatafile_Update_opened) {
					datafile_Update.close();
					try {
						messagefile_Update = new PrintStream(new BufferedOutputStream(new FileOutputStream(messageFileName_Update)), true);
					} catch (FileNotFoundException e) {
						logger.fatal("unable to create Message File : " + e.getMessage() + ":" + e.getCause());

					}
					messagefile_Update.print(contentMessageFile_Update);
					messagefile_Update.flush();
					messagefile_Update.close();
				}


				System.out.println("delete file " + temporaryFolder + "\\" + priceFileName);

				if (FtemporaryFile.FileExist()) {
					try {
						FtemporaryFile.deleteFile();
						logger.info("file deleted : " + FtemporaryFile.getPathFilename());
					} catch (Exception ioex) {
						logger.error("unable to delete file : " + FtemporaryFile.getPathFilename());
					}

				}




		if (lstProductsToDelete.size()>0){
			try {
				if (bdatafile_Delete_opened==false){

					datafile_Delete=new PrintStream(new BufferedOutputStream(new FileOutputStream(dataFileName_Delete,true)),true);

				}
				bdatafile_Delete_opened=true;

			}
			catch (FileNotFoundException e) {

				logger.fatal("unable to print into : " + dataFileName_Delete);
			}



			StringBuilder completeLineDelete = new StringBuilder();

			for (Product productToDeletePFI : lstProductsToDelete) {

				System.out.println("Product to delete : " + productToDeletePFI.getMDA_ARTS_SART_art());
				completeLineDelete.append("0001 ").append(productToDeletePFI.getMDA_ARTS_SART_art()).append(",").append(Newligne);

			}

			datafile_Delete.println(completeLineDelete.toString());
			datafile_Delete.flush();



			if (bdatafile_Delete_opened){
				datafile_Delete.close();
				try {
					messagefile_Delete=new PrintStream(new BufferedOutputStream(new FileOutputStream(messageFileName_Delete)),true);
					messagefile_Delete.print(contentMessageFile_Delete);
					messagefile_Delete.flush();
					messagefile_Delete.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

			}


		}




	}
			public void InitializeIni() {
		try {
			ini = new Wini(new File("preference.ini"));
		} catch (InvalidFileFormatException e1) {

			logger.fatal("Unable to Read Preference.ini File, check your configuration cause : " + e1.getCause() + "/"
					+ e1.getMessage());
			logger.fatal("Exit Application");
			System.exit(1);

		} catch (IOException e1) {
			logger.fatal("Unable to Read Preference.ini File, check your configuration cause : " + e1.getCause() + "/"
					+ e1.getMessage());
			logger.fatal("Exit Application");
			System.exit(1);

		}

	}






	static ArrayList<String> listFilesFromDirectory(String directoryPath,String filterName) {





		try{

			ArrayList<String> data=new ArrayList<String>();

			File directory = new File(directoryPath);

			if (!directory.exists()) {
				System.out.println("Le fichier/r?pertoire '" + directoryPath + "' n'existe pas");
			} else if (!directory.isDirectory()) {
				System.out.println("Le chemin '" + directoryPath + "' correspond ? un fichier et non ? un r?pertoire");
			} else{


				System.out.println("directoryPath = " + directoryPath );
				System.out.println("filterName = " + filterName.toUpperCase() );

				ListDataManager ldm=new ListDataManager(directoryPath, filterName.toUpperCase());
				ldm.sortFilesLeft();



				for (int i=0;i<ldm.getFilesLeftSize();i++){

					File subfile = ldm.getCurrentFile();




					String fileName= subfile.getName();

					data.add(fileName);
					System.out.println("fichier dans le repertoire : " + fileName);

					ldm.nextFile();


				}
			}


			return data;

		}
		catch(java.lang.Exception err){
			// vect.add(err.getMessage());

			System.out.println(err.getMessage());
			return null;
		}
	}



	private static List<String> splitLine(String sLine, String sSeparator) {

		List<String> lSplitLine = new ArrayList<String>();
		String tmp;
		boolean pipetmp = false;
		int j = 0;

		StringTokenizer st = new StringTokenizer(sLine, sSeparator, true);
		while (st.hasMoreTokens()) {

			tmp = st.nextToken();
			if (tmp.equals(sSeparator)) {
				if (pipetmp == true) {
					lSplitLine.add("");
					j++;
				}
				pipetmp = true;
			} else {
				pipetmp = false;
				lSplitLine.add(tmp);

				j++;
			}
		}
		j = 0;

		return lSplitLine;
	}


}
