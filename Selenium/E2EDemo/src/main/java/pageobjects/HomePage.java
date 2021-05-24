package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


	By translatorLogo = By.cssSelector("img[src*='logo-translator-no-g.svg']");
	By search = By.cssSelector("input[type='search']");
	By workorderText = By.xpath("//div[@class='ng-scope' and text()='Work Orders']");
	By workorderLink = By.cssSelector("button[ng-click*='/job']");
	By mappingText =  By.xpath("//div[@class='ng-scope' and text()='Mapping']");
	By mappingLink = By.cssSelector("button[ng-click*='/queue']");
	By assetsText = By.xpath("//div[@class='ng-scope' and text()='Assets']");
	By assetsLink = By.cssSelector("button[ng-click*='/asset']");
	
	By admin = By.xpath("//div[@class='ng-scope' @xpath='1' and text()='Admin']");
	
	// recent headers & titles
	By recentTVHeader = By.xpath("//h2[text()='Recent TV Assets']");
	By recentFeatureHeader = By.xpath("//h2[text()='Recent Feature Assets']");
	By recentMostPopHeader = By.xpath("//h2[text()='Most Popular']");
	By recentTitles = By.xpath("//span[@class='carousel-caption-title ng-binding']");
	
	
	// span.carousel-caption-title.ng-binding
	
	public String url = "/supply/translator/app/home";
	
	// button[ng-click*='/job']
	// button[ng-click*='/queue']
	// button[ng-click*='/asset']
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement translatorLogo() {
		return driver.findElement(translatorLogo);	
	}

	public WebElement searchField() {
		return driver.findElement(search);	
	}
	

	public WebElement workOrderLink() {
		return driver.findElement(workorderLink);	
	}

	public WebElement mappingLink() {
		return driver.findElement(mappingLink);	
	}
	
	public WebElement mappingText() {
		return driver.findElement(mappingText);	
	}

	public WebElement assetsLink() {
		return driver.findElement(assetsLink);	
	}
	
	public WebElement adminLink() {
		return driver.findElement(admin);	
	}
	
	public WebElement recentTVHeader() {
		return driver.findElement(recentTVHeader);	
	}
	
	public WebElement recentFeatureHeader() {
		return driver.findElement(recentFeatureHeader);	
	}
	
	public WebElement recentMostPopHeader() {
		return driver.findElement(recentMostPopHeader);	
	}
	
	public  List<WebElement> recentTitles() {	
		return driver.findElements(recentTitles);	
			
	}

}
