package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {

	public static final String USERNAME = "hnguyen12151";
	public static final String ACCESS_KEY = "93e9b346-3dbf-4ba7-9345-e716b1a8c379";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	//public static final String URL = "http://hnguyen12151:93e9b346-3dbf-4ba7-9345-e716b1a8c379@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		//caps.setCapability("platform", "Linux");
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "GoogleTest1");
		caps.setCapability("extendedDebugging", "true");
		caps.setCapability("buildNumber", "3.0");

		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		System.out.println(driver.getTitle());
		
		//driver.get("https://saucelabs.com/test/guinea-pig");
		
		System.out.println("title of page is: " + driver.getTitle());
		
		driver.quit();
		
		System.out.println("Test completed");


	}
	
}
