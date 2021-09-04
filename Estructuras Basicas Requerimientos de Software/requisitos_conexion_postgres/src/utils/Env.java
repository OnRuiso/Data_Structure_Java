package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Env {
	
	
	  public  Properties pr;
	  
	  public Env() {
		  String fileName = "src/.env";
	        pr = new Properties();
	        InputStream input = null;
	        try {
	            input = new FileInputStream(fileName);
	            pr.load(input);
	            
	        } catch (FileNotFoundException ex) {
	        } catch (IOException ex) {
	        }
	  }

	
	 
}