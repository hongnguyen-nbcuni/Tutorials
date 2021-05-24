package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	WebDriver driver;
	
	// class constructor
	public RediffLoginpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
   By username=By.xpath(".//*[@id='login1']");
   By Password=By.name("passwd");
   By go=By.name("proceed");
   //By home=By.linkText("Home");
   By home=By.linkText("rediff.com");
   
   // return locators
   public WebElement Emaild()
   {
	   return driver.findElement(username);
   }
         
   public WebElement Password()
   {
	   return driver.findElement(Password);
   }
   
   public WebElement submit()
   {
	   return driver.findElement(go);
   }
   
   public WebElement Home()
   {
	   return driver.findElement(home);
   }
	
	
}
