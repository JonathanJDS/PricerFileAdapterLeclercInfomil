package com.pricer;

import java.io.File;
import java.io.IOException;

import it.sauronsoftware.cron4j.Predictor;
import it.sauronsoftware.cron4j.Scheduler;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;
import org.apache.logging.log4j.*;

public class Start {


	static Logger logger =  LogManager.getLogger(Start.class);
	static Wini ini;


	public static void InitializeIni() {
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InitializeIni();
		/* Using Cron Value for checking archives files to delete according to nbre of fdays to keep from preference.ini*/
		String cronValue = ini.get("Folders", "CheckArchiveCronValue");
		Scheduler scheduler = new Scheduler();
		it.sauronsoftware.cron4j.Predictor predictor = new Predictor(cronValue);
		logger.info("Starting adapter leclerc Infomil xml format V1.0 By MDZ on 2020-03 ");
		logger.info("Next execution date for Checking old files in Archives Folder : " + predictor.nextMatchingDate());


		try {

			scheduler.schedule(cronValue, new Runnable() {

				public void run() {

					ThreadCheckHistoryFolder threadCheckHistoryFolder = new ThreadCheckHistoryFolder();
					threadCheckHistoryFolder.setPriority(1);
					threadCheckHistoryFolder.start();

				}
			});
		}

		catch (IndexOutOfBoundsException iofbe) {
			// iofbe.printStackTrace();
			logger.error("Unable to execute scheduler with value " + cronValue + " Please check your parameters...");

		}

		scheduler.start();

		ThreadCheckPriceFiles getPriceFiles = new ThreadCheckPriceFiles();
		getPriceFiles.setPriority(1);
		getPriceFiles.start();


		
	}
	
 
	   
	}


