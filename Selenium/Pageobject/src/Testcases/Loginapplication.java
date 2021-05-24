package Testcases;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginapplication {
// Login page class implemented in normal page object pattern style
	
	// Home page class implemented in Page object factory methdos
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// create a Login page object - call Login page object
		RediffLoginpage rd=new RediffLoginpage(driver);
		
		// call Email method & Password method to get locators
		rd.Emaild().sendKeys("hello");
		rd.Password().sendKeys("hello");
		//rd.submit().click();
		rd.Home().click();
		
		// navigating to home page
		RediffHomepage rh = new RediffHomepage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
		
	}
	
}
