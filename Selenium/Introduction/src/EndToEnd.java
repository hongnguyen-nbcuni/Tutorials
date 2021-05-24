import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.get("https://www.spicejet.com/");
				
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		// select round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		// calendar
		//.ui-state-default.ui-state-highlight.ui-state-active
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//a[@class='ui-state-default' and text()='18']

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		// if (driver.findElement(By.id("Div1")).isEnabled()) {

		// style="display: block; opacity: 1;"
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			System.out.println("it's enabled");
			Assert.assertTrue(true);
			driver.findElement(By.id("Div1")).click();	
			// ui-state-default ui-state-active
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

		} else {
			Assert.assertTrue(false);
		}

		// get all the elements in the dropdown
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option :options) {
			System.out.println(option.getText());
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
			}

		}

		// select currentcy
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("AED");   // another way of selecting an option
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");   // value attribute
				
	

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		// or 
		// driver.findElement(By.cssSelector("input[value='Search']")).click();
		// or
		//driver.findElement(By.xpath("//input[@value='Search']")).click();
		// or
		//driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();


	}

}
