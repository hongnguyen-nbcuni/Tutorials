package com.sample.test.demo;

import java.io.FileOutputStream;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	private WebDriver driver; 
	//private String folderPath = "/Users/hnguyen/temp/screenshots/";	
	
	public Screenshot(WebDriver driver)
	{ 
		this.driver = driver;
	}
	public void capture(String fileName) 
	{ 
		try { 
			String now = LocalDateTime.now().toString();

			now = now.replace(":", "_")
					.replace(";", "_")
					.replace(".", "_");
			
			String folderPath2 = System.getProperty("user.dir") + "/reports/";
						
			FileOutputStream file = new FileOutputStream(
					folderPath2 + fileName + "-" + now + ".png");

			byte[] info = 
					((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			file.write(info);
			file.close(); 
		} 
		catch (Exception ex) {
			throw new RuntimeException("cannot create screenshot;", ex);
		}

	}
}



