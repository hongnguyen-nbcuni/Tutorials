package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By headerLogo = By.cssSelector("img[src*='tl-gmo-logo.svg']");
	By directionText = By.xpath("//div[text()='Where would you like to go?']"); 
	By supply = By.cssSelector("div[onclick*='/supply']");
	By mam = By.cssSelector("div[onclick*='/mam']");
	By tact = By.cssSelector("div[onclick*='/tact']");
	By vod = By.cssSelector("div[onclick*='/vod']");

	// constructor
	public LandingPage(WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement headerLogo() {
		return driver.findElement(headerLogo);	
	}

	public WebElement directionText() {
		return driver.findElement(directionText);	
	}

	public WebElement supplyButton() {
		return driver.findElement(supply);	
	}

	public WebElement mamButton() {
		return driver.findElement(mam);	
	}


	public WebElement tactButton() {
		return driver.findElement(tact);	
	}
	
	public WebElement vodButton() {
		return driver.findElement(vod);	
	}

 
	public void clickSupply() {
		
		supplyButton().click();	
		//LoginPage loginPage =new LoginPage(driver);
		//return loginPage;
		
	}
	
	
	
	
	

}
