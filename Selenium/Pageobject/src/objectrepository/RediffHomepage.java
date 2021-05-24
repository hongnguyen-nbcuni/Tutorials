package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepage {

	WebDriver driver;
	public RediffHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// By search = By.id("srchword");
	@FindBy(id="srchword")
	WebElement search;
	
	// By submit = By.xpath("//input[@type='submit']");
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;


	public WebElement Search()
	{
		// return driver.findElement(search);
		return search;
	}

	public WebElement Submit()
	{
		return submit;
	}







}
