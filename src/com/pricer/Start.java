package com.pricer;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import generated.MDA;
import generated.MDA.ARTS;
import generated.MDA.ARTS.MART;



public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				  
			
			  JAXBContext jaxbContext = null;  
			  Unmarshaller jaxbUnmarshaller = null;
			  
			  try 						{	jaxbContext = JAXBContext.newInstance(generated.MDA.class);		}
			  	catch (JAXBException e) {	e.printStackTrace();										}
			  	
			  
			  
			  try 					{	jaxbUnmarshaller = jaxbContext.createUnmarshaller();	}
			    catch (JAXBException e) {
			    	
			    	//e.printStackTrace();
			    	 System.out.println("message=" + e.getMessage());
			   	  System.out.println("cause=" + e.getCause());
			    
			    }
	
			  
			  
			  
			  MDA  mda= null;
			  try {
				mda = (MDA) jaxbUnmarshaller.unmarshal(new File("ressources/ficWLST006_170614_2_00890.xml"));
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			  
			  
		System.out.println("monnaie = " + mda.getMONNAIE());	  
	List<Object> lstObjects =  mda.getCOMMENTAIREAndARTSAndTTVA();

	for (Object object : lstObjects) {
		
		if (object instanceof ARTS) {
			
		ARTS arts = (ARTS) object;
				
		for (Object object2 : arts.getMARTAndSARTAndMCON()) {
			
			if (object2 instanceof ARTS.MART) {
				
			MART mart = (MART) object2;
			System.out.println("libllé = " + mart.getLIB());
				
			}
			
			
		}
		
		
				
			}
			
		}
		
		
	}
	
 
	   
	}


