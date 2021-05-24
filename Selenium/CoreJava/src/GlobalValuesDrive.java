import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		
		// this class will help you to scan and extract the values of any dot properties
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("/Users/hnguyen/qa-development/Tutorials/Selenium/CoreJava/src/data.properties");
		
		prop.load(fis);   // load file in reading mode
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fos = new FileOutputStream("/Users/hnguyen/qa-development/Tutorials/Selenium/CoreJava/src/data.properties");
		prop.store(fos, null);     // store file in write mode // null comments
		

	}

}
