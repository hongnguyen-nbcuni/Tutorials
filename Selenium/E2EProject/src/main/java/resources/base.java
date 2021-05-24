package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{

		prop= new Properties();
		
		// File path
		System.out.println(System.getProperty("user.dir"));
		// data properties file path
		String path = System.getProperty("user.dir") + "/src/main/java/resources/data.properties"; // where your path file should be stored

		FileInputStream fis=new FileInputStream(path);

		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);

		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			// for Chrome Headless Execution Mechanism
			//ChromeOptions options = new ChromeOptions(); 
			//options.addArguments("--headless");   // "--headless" or "headless" is up to you
			//driver= new ChromeDriver(options);
			driver= new ChromeDriver();
			//execute in chrome driver

		}
		else if (browserName.equals("firefox"))
		{
			driver= new FirefoxDriver();
			//firefox code
		}
		else if (browserName.equals("IE"))
		{
			//	IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;


	}


	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}

}