import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByIndex(3);

		String str = dropdown.getFirstSelectedOption().getText();
		System.out.println(str);

		dropdown.selectByVisibleText("AED");   // another way of selecting an option
		str = dropdown.getFirstSelectedOption().getText();
		System.out.println(str);

		dropdown.selectByValue("INR");   // value attribute
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);
		int i=1;
		while(i<5)	{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		//Thread.sleep(2000);

		// selecting the second element of //a[@value= 'MAA']
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	
		Thread.sleep(2000);
		
		// use parent & child relationship xpath

		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MMA']")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();


	}

}
