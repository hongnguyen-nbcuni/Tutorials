import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
// or
// download commons.io.FileUtils Jar like Commons IO 2.6 
// https://www.commons.apache.org/proper/commons-io/ 
// right click the Project name -> Properties -> Java Build Path -> Add External Jar -> import all the jars


public class Mscellaneous {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// maximize your browser
		driver.manage().window().maximize();
		
		// delete the cookies 
		
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		
		driver.get("https://www.google.com");
		
		// how to delete a screenshot
		// output that screenshot as a FILE
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // store a screenshot to src object
		
		//FileUtils.copy(src, new File("/Users/hnguyen/temp/screenshots/screenshot.png"));
		// or
		FileHandler.copy(src, new File("/Users/hnguyen/temp/screenshots/google_screenshot.png"));	
		
		
		
		

	}

}
