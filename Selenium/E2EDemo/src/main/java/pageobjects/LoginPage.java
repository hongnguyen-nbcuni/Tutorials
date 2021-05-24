package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By ssoId = By.id("username");
	By password = By.id("password");
	By signin = By.id("submitBtn");
	By rememberMsg = By.xpath("//div[@class='rememberme-msg' and @id='c_blank']");
	By rememberBox = By.xpath("//div[@class='rememberme-msg' and @id='c_checked']");
	By forgotpwd = By.xpath("//a[text()='Forgot my password']");		
	By forgotUsername = By.xpath("//a[text()='Forgot My Username' and @xpath='1']");
	
			
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement ssoID()
	{
		return driver.findElement(ssoId);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}

	public WebElement rememberMsg() {
		return driver.findElement(rememberMsg);
	}
	
	public WebElement rememberBox() {
		return driver.findElement(rememberBox);
	}
	
	public WebElement forgotPassword()
	{
		return driver.findElement(forgotpwd);
	}
	
	public WebElement forgotUsername()
	{
		return driver.findElement(forgotUsername);
	}
	
	
	public void signIn() {
		driver.findElement(signin).click();
		// return new HomePage(driver);
	}
	
	
}
