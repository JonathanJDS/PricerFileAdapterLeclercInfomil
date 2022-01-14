package com.pricer;

import org.apache.logging.log4j.*;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ThreadCheckGestFiles extends Thread {

	static Logger logger =  LogManager.getLogger(ThreadCheckGestFiles.class);
	static Wini ini;
	static String priceArchiveFolder;
	static String gestFileName;
	static int tempo;
	static String sourceFolder;
	static String temporaryFolder;
	static String pricerDataFilesFolder;
	static String pricerMessageFilesFolder;
	static String pricerResultFilesFolder;
	static HashMap<String, String> lstPFIs;


	Timer timer = new Timer();
	FileUtility utility = new FileUtility();


	public ThreadCheckGestFiles() {

		logger.info("Starting Thread ThreadCheckGestFiles");
		InitializeIni();


		/*******Archive folders **********/
		priceArchiveFolder		= ini.get("Folders", "PriceArchiveFolder");

		/********* FileNames *************/
		gestFileName 		= ini.get("Files","GestFileName");

		/*****Pricer Path **************/
		tempo 						= Integer.valueOf(ini.get("Files", "timer"));
		sourceFolder 				= ini.get("Folders", "SourceFolder");
		temporaryFolder 			= ini.get("Folders", "TemporaryFolder");
		pricerDataFilesFolder 		= ini.get("Folders", "PricerDataFiles");
		pricerMessageFilesFolder 	= ini.get("Folders", "PricerMessageFiles");
		pricerResultFilesFolder		= ini.get("Folders", "PricerResultFiles");

		


		TimerTask task = new TimerTask() {
			@Override
			public void run() {

				


				ArrayList<String> allDatafiles=listFilesFromDirectory(sourceFolder + "\\", gestFileName);
				ArrayList<String> alltempfiles=listFilesFromDirectory(temporaryFolder + "\\", gestFileName);


				System.out.println("searching file with filter Name = " + gestFileName);
				FileUtility FdataFile = null;
				FileUtility FTemporaryFile = null;

				if (allDatafiles.size()>0) {
					//taking only the first file of several, the second on will become the first one at next iteration 
				FdataFile = new FileUtility(sourceFolder + "\\" + allDatafiles.get(0));
					System.out.println("current File Name = " + FdataFile.getPathFilename());
					logger.info("current File Name = " + FdataFile.getPathFilename());
				}


				if (alltempfiles.size()>0) {
					FTemporaryFile = new FileUtility(temporaryFolder + "\\" + alltempfiles.get(0));
					System.out.println("current Temporary File Name = " + FTemporaryFile.getPathFilename());
					logger.info("current Temporary File Name = " + FTemporaryFile.getPathFilename());
				}



				
				// check first if something is present in temporary Folder, if not process source Folder

				if (FTemporaryFile!=null) {
					if (FTemporaryFile.FileExist()) {
						logger.warn("File is present in temporary Folder !! priority for that !!!!");
						logger.info("processing Temporary File : " + FTemporaryFile.getPathFilename());
						ProcessFileSigma(FTemporaryFile);
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
									ProcessFileSigma(FTemporaryFile);
								}
							}

						}

						//ProcessFileSigma(FTemporaryFile);

					}

			}

		};

		// execute this thread 2 s after original tempo value.
		timer.scheduleAtFixedRate(task, 0, (tempo * 1000) + 2000);
	}
	
	
	private void ProcessFileSigma(FileUtility FtemporaryFile) {
		
		//FileProperty fpTemporaryFile = new FileProperty(temporaryFile);
	    boolean bdatafile_Update_opened=false;
	    String dataFileName_Update		=	null;
        String messageFileName_Update	=	null;
        String resultFileName_Update	=	null;
        PrintStream datafile_Update		=	null;
        String contentMessageFile_Update=	null;
       	PrintStream messagefile_Update	=	null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_Hmmss");
        Date d = new Date(); 
        String dateOfFile		=	sdf.format(d);
        StringBuffer completeLine ;
        
        
        
        
        String ean;
        String natureDuProduit;
        String quantiteEnStock;
        String qteEnStockGamme;
        String uniteQuantiteEnStock;
        String encoursDeCommande;
        String uniteEncoursDeCommande;
        String dateProchaineLivraison;
        String prochaineQuantitéLivre;
        String uniteProchaineQuantiteLivre;
        String UVCparCarton;
        String fondDeRayon;
        String nbreJoursReserve;
        String quantiteDeReserve;
        String uniteQuantiteDeReserve;
        String etatCentraleEtatMagasin;
        String dateDerniereVente;
        String qteDerniereVente;
        String uniteDerniereVente;
        String numeroDePese;
        String designationAffichette;
        String provenance;
        String categorie;
        String variete;
        String calibre;
        String codePays;
        String libellePays;
        String traitement;
        String qteLot;
        String contenanceArticle;
        String uniteDeContenance;
        String taille;
        String colori;
        String gondole;
        String element;
        String niveau;
        String gondole2;
        String libelle2;
        String libelle3;
        
       
        
        
        dataFileName_Update		=	pricerDataFilesFolder		+ "\\"	+ "data_stock_" + dateOfFile + ".i1";
        messageFileName_Update	=	pricerMessageFilesFolder	+ "\\"	+ "data_stock_" + dateOfFile + ".m1";
        resultFileName_Update	=	pricerResultFilesFolder		+ "\\"	+ "data_stock_" + dateOfFile + ".r7";
        
        
        contentMessageFile_Update = "UPDATE,0001,," + dataFileName_Update + "," + resultFileName_Update;
       
		
		if (!FtemporaryFile.FileExist()) {
			logger.warn("temporary file " + FtemporaryFile.getPathFilename()  + " is not present");
			return;
		}


		if (FtemporaryFile.fileIsGrowing()) {
			logger.warn("file is growing waiting... : " + FtemporaryFile.getPathFilename());
			return;
		}
		
		
		
		
		
		List<String> lstMapFile = FtemporaryFile.fileToMap();
		List<String> lstFile  =	new ArrayList<String>();
		String[] lineSplited2 = null;
		List<String> lstItems;
		
		logger.info("Purging gest file, getting linked items ... ");

		TreeSet<String> lstLinkedItems = new OperationOnDB().lstLinkedItems();
		
		for(String line : lstMapFile) {
			
			lineSplited2 = line.split(";");
			
		lstItems = new ArrayList<String>();
		lstItems.add(lineSplited2[2].trim());
			
				for(String itemid : lstItems) {
					
					if(lstLinkedItems.contains(itemid)) {
						lstFile.add(line);
					}
					
				}
			
			
			
		}
		
		
		
		
		for (String line : lstFile) {
			
			//System.out.println("line = " + line);
			
			if (line.trim().equals("")) {
			continue;
			}
			
			
			List<String> splitedTabLine = splitLine(line, ";");
			if (splitedTabLine.size() < 15) {
				continue;
			}
			
		
			
			 
			  try {
			 
				  if (bdatafile_Update_opened==false){
				  
					datafile_Update=new PrintStream(new BufferedOutputStream(new FileOutputStream(dataFileName_Update,true)),true);
					//System.out.println("dataFileName_Update =" + dataFileName_Update);
					bdatafile_Update_opened=true;
				  }
		    	
		    }
		    	catch (FileNotFoundException e) {
		    		logger.fatal("File Not Found, Unable to create File : " + dataFileName_Update );
		    		return;
		    	}
		 
			
			
			completeLine = new StringBuffer(); 
			
	try {		
		
		
		
		  ean 									= splitedTabLine.get(2).trim();
	      natureDuProduit						= splitedTabLine.get(7).trim();
	      quantiteEnStock						= splitedTabLine.get(14).trim();
	      uniteQuantiteEnStock					= splitedTabLine.get(15).trim();
	      qteEnStockGamme						= splitedTabLine.get(16).trim();
	      encoursDeCommande						= splitedTabLine.get(18).trim();
	      uniteEncoursDeCommande				= splitedTabLine.get(19).trim();
	      dateProchaineLivraison				= splitedTabLine.get(22).trim();
	      prochaineQuantitéLivre				= splitedTabLine.get(23).trim().replace(",", "");
	      uniteProchaineQuantiteLivre			= splitedTabLine.get(24).trim();
	      UVCparCarton							= splitedTabLine.get(25).trim();
	      fondDeRayon							= splitedTabLine.get(26).trim();
	      nbreJoursReserve						= splitedTabLine.get(27).trim();
	      quantiteDeReserve						= splitedTabLine.get(28).trim();
	      uniteQuantiteDeReserve				= splitedTabLine.get(29).trim();
	      etatCentraleEtatMagasin				= splitedTabLine.get(30).trim() + splitedTabLine.get(30).trim();
	      dateDerniereVente						= splitedTabLine.get(32).trim();
	      qteDerniereVente						= splitedTabLine.get(33).trim();
	      uniteDerniereVente					= splitedTabLine.get(34).trim();	
	      numeroDePese							= splitedTabLine.get(35).trim();
	      designationAffichette					= splitedTabLine.get(36).trim().replace("'", "`");
	      provenance							= splitedTabLine.get(37).trim();
	      categorie								= splitedTabLine.get(38).trim();
	      variete								= splitedTabLine.get(39).trim();
	      calibre								= splitedTabLine.get(40).trim();
	      codePays								= splitedTabLine.get(41).trim();
	      libellePays							= splitedTabLine.get(42).trim();
	      traitement							= splitedTabLine.get(43).trim();
	      qteLot								= splitedTabLine.get(44).trim();
	      contenanceArticle						= splitedTabLine.get(45).trim();
	      uniteDeContenance						= splitedTabLine.get(46).trim();
	      taille								= splitedTabLine.get(47).trim();
	      colori								= splitedTabLine.get(48).trim();
	      gondole								= splitedTabLine.get(49).trim();
	      element								= splitedTabLine.get(50).trim();
	      niveau								= splitedTabLine.get(51).trim();
	      gondole2								= splitedTabLine.get(3).trim();
	      libelle2								= splitedTabLine.get(11).trim().replace("'", "`");
	      libelle3								= splitedTabLine.get(12).trim().replace("'", "`");
	              
         
         completeLine.append("0001 ").append(ean);
         completeLine.append(" 340 0 |").append(natureDuProduit);
         completeLine.append("| 323 0 |").append(quantiteEnStock);
         completeLine.append("| 325 0 |").append(uniteQuantiteEnStock);
         completeLine.append("| 341 0 |").append(encoursDeCommande);
         completeLine.append("| 342 0 |").append(uniteEncoursDeCommande);
         completeLine.append("| 321 0 |").append(dateProchaineLivraison);
         completeLine.append("| 320 0 |").append(prochaineQuantitéLivre);
         completeLine.append("| 326 0 |").append(uniteProchaineQuantiteLivre);
         completeLine.append("| 327 0 |").append(UVCparCarton);
         completeLine.append("| 318 0 |").append(fondDeRayon);
         completeLine.append("| 343 0 |").append(nbreJoursReserve);
         completeLine.append("| 344 0 |").append(quantiteDeReserve);
         completeLine.append("| 345 0 |").append(uniteQuantiteDeReserve);
         completeLine.append("| 4 0 |").append(etatCentraleEtatMagasin);
         completeLine.append("| 346 0 |").append(dateDerniereVente);
         completeLine.append("| 322 0 |").append(qteDerniereVente);
         completeLine.append("| 328 0 |").append(uniteDerniereVente);
         completeLine.append("| 400 0 |").append(numeroDePese);
         completeLine.append("| 401 0 |").append(designationAffichette);
         completeLine.append("| 402 0 |").append(provenance);
         completeLine.append("| 403 0 |").append(categorie);
         completeLine.append("| 404 0 |").append(variete);
         completeLine.append("| 405 0 |").append(calibre);
         completeLine.append("| 406 0 |").append(codePays);
         completeLine.append("| 407 0 |").append(libellePays);
         completeLine.append("| 408 0 |").append(traitement);
         completeLine.append("| 409 0 |").append(qteLot);
         completeLine.append("| 410 0 |").append(contenanceArticle);
         completeLine.append("| 411 0 |").append(uniteDeContenance);
         completeLine.append("| 412 0 |").append(taille);
         completeLine.append("| 413 0 |").append(colori);
         completeLine.append("| 414 0 |").append(gondole);
         completeLine.append("| 415 0 |").append(element);
         completeLine.append("| 416 0 |").append(niveau);
         completeLine.append("| 417 0 |").append(gondole2);
         completeLine.append("| 418 0 |").append(libelle2);
         completeLine.append("| 419 0 |").append(libelle3);
         completeLine.append("| 450 0 |").append(qteEnStockGamme);
         
         
         completeLine.append("|,");
         
         
         //System.out.println( completeLine.toString());
         datafile_Update.println(completeLine.toString());
         datafile_Update.flush();

        
        	   }
        	  
     	
		 
		 catch (IndexOutOfBoundsException indx){
			logger.warn("line empty or out of bound...." + line);
		
			 
		 } 
			
		}
		
		
		if (bdatafile_Update_opened==true){
	 		datafile_Update.close(); 
	 		try {
				messagefile_Update=new PrintStream(new BufferedOutputStream(new FileOutputStream(messageFileName_Update)),true);
			} catch (FileNotFoundException e) {
				logger.fatal("unable to create Message File : " + e.getMessage() + ":" + e.getCause());
				
			}
	 messagefile_Update.print(contentMessageFile_Update);	
	 messagefile_Update.flush();
	 messagefile_Update.close();
	 	}
		
	try {	
		System.out.println("Trying to delete file " + temporaryFolder + "\\" + gestFileName);
		logger.info("Trying to delete file " + temporaryFolder + "\\" + gestFileName);
		new File(temporaryFolder + "\\" + gestFileName).delete();
		logger.info("File deleted ... ");
	}
	
	catch (Exception ex) {
		logger.error("Unable to delete File :" + temporaryFolder + "\\" + gestFileName);
		
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
