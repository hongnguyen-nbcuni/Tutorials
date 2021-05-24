package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSeleniumTest;

public class PropertiesFile {
	
	// this should be available to all the functions
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		//readPropertiesFile();
	}
	
	
	public static void readPropertiesFile() {
		// Properties prop = new Properties();
		try {
			
			InputStream input = new FileInputStream("/Users/hnguyen/qa-development/Tutorials/Selenium/SeleniumTest/src/config/config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("result"));
			
			FirstSeleniumTest.browser = prop.getProperty("browser");
			System.out.println(FirstSeleniumTest.browser);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void writePropertiesFile() {
		// create an object for output stream
		try {
			
			OutputStream output = new FileOutputStream("/Users/hnguyen/qa-development/Tutorials/Selenium/SeleniumTest/src/config/config.properties");
			prop.setProperty("browser", "Chrome");
			prop.setProperty("result", "pass");
			prop.store(output, "comments here or null");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
