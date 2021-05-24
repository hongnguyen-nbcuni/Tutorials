import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		// initialize JavasScriptExecutor to scroll
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 1. inspect and come to the Chrome's Console tab
		// > window.scrollBy(0,500) 
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		for (int i=0; i<values.size(); i++) {
			
			sum = sum + Integer.parseInt(values.get(i).getText());
			
			System.out.println(Integer.parseInt(values.get(i).getText()));
			
		}
		
		System.out.println("Sum = " + sum);
		
		// <div class="totalAmount" css="1"> Total Amount Collected: 296 </div>
		int expected = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, expected);
		
		
		

	}

}
