package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestChromeDriver {
	public static void main(String[] args) {
	
		//String projectLocation = System.getProperty("user.dir");
		
		// set ChromeDriver in SystemProperties
		System.setProperty("webdriver.chorme.driver","/usr/local/bin/chromedriver");
	
		WebDriver driver = new ChromeDriver();

	}
	

}
