package com.pricer;

import com.jcraft.jsch.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


public class ThreadGetSFTPFiles extends Thread {

	static Logger logger =  LogManager.getLogger(ThreadGetSFTPFiles.class);
	static Wini ini;
	
	
  Timer timer = new Timer();
  


  public ThreadGetSFTPFiles()
  {
   
	  
	  
	  logger.info("Starting Application PricerGetSFTPFile Version 1.0 by MDZ 2020/09");


	  InitializeIni();
	  String host					= ini.get("FTP", "host");
	  int	   port					= Integer.valueOf(ini.get("FTP", "port"));
	  String username				= ini.get("FTP", "username");
	  String password				= ini.get("FTP", "password");
	  String remotefolder			= ini.get("FTP", "remotefolder");
	  String filenamefilter			= ini.get("FTP", "filenamefilter");
	  String destinationpath		= ini.get("FTP", "destinationpath");
	  boolean unzipfile				= Boolean.valueOf(ini.get("FTP", "unzipfile"));
	  boolean removefileaftercopy	= Boolean.valueOf(ini.get("FTP", "removefileaftercopy"));
	  int tempo						= Integer.valueOf(ini.get("FTP", "timer"));





	  // get the property value and print it out
		 logger.info("host = " + host);
		 logger.info("port = " + port);
		 logger.info("username = " + username);
		 logger.info("password = " + password);
		 logger.info("filenamefilter = " + filenamefilter);
		 logger.info("destinationpath = " + destinationpath);
		 logger.info("removefileaftercopy = " + removefileaftercopy);
		 logger.info("timer = " + tempo + " Sec");
				
		TimerTask task = new TimerTask()
    
    
    
    
    
    
    {





      public void run()
      {
    	  
    		
  		JSch jsch = new JSch();	
  		
          
          try {
  			
  			Properties config = new Properties();
  			config.put("StrictHostKeyChecking", "no");
  			Session session = jsch.getSession(username,host,port);
  			session.setConfig(config);
  			session.setPassword(password);
  			session.connect();

  			logger.info("session connected");
  			
  			ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");


  			sftpChannel.connect();
  			logger.info("channelconnected");
  			
  			@SuppressWarnings("unchecked")
			Vector<ChannelSftp.LsEntry> list = sftpChannel.ls(filenamefilter);
  			
  			for(ChannelSftp.LsEntry entry : list) {
  				sftpChannel.get(entry.getFilename(), destinationpath + "/" + entry.getFilename());
  				logger.info("file copied : " +  entry.getFilename());
  				
  				
  				
  				if (removefileaftercopy == true) {
  				sftpChannel.rm(entry.getFilename());
  				
  				logger.info("file deleted from remote server : " +  entry.getFilename());
  				}


				if (unzipfile ==true) {
	unZipIt(entry.getFilename(),destinationpath);

				}
			//	unZipIt(String zipFile, String outputFolder)


  				
  				}
  			
  			
  		       
  			
  		 
  		     sftpChannel.disconnect();
  		   logger.info("sftp channel disconnected");
  		     
  		     session.disconnect();    
  		   logger.info("session disconnected");  
  			
  		} catch (JSchException | SftpException e) {
  			
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  			
  			logger.error(e.getStackTrace().toString());
  		}
  			  
    	  
    	  
    	  
    	  
      }
      



    };
    timer.scheduleAtFixedRate(task, 0L, tempo*1000);
  }



	/**
	 * Unzip it
	 *
	 * @param zipFile input zip file
	 * @param outputFolder  zip file output folder
	 */
	public static boolean unZipIt(String zipFile, String outputFolder) {

		byte[] buffer = new byte[1024];

		try {

			// create output directory is not exists
			File folder = new File(outputFolder);
			if (!folder.exists()) {
				folder.mkdir();
			}

			// get the zip file content
			ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile));
			// get the zipped file list entry
			ZipEntry ze = zis.getNextEntry();

			while (ze != null) {

				String fileName = ze.getName();
				File newFile = new File(outputFolder + File.separator + fileName);


				logger.info("file unzip : " + newFile.getAbsoluteFile());
				// create all non exists folders
				// else you will hit FileNotFoundException for compressed folder
				new File(newFile.getParent()).mkdirs();

				FileOutputStream fos = new FileOutputStream(newFile);

				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}

				fos.close();
				ze = zis.getNextEntry();
			}

			zis.closeEntry();
			zis.close();

			logger.info("unzip Done");

		} catch (IOException ex) {
			logger.error("Unable to Unzip file :" + outputFolder  + "/"+ zipFile + " ==> " + ex.getMessage() + "; " + ex.getCause());


			return false;

		}

		return true;

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
 
}
