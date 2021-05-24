import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class GetScreenshot {

	
	public static void getScreenshot(WebDriver driver) throws IOException {
		
		driver.get("http://google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src,new File("/Users/hnguyen/temp/screenshots/screenshot.png"));
		FileHandler.copy(src, new File("/Users/hnguyen/temp/screenshots/screenshot.png"));	
				
	}
}
