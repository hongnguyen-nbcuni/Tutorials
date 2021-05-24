import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.path2usa.com/travel-companions");
		
		// select date and then month
		
		
		// click on Date calendar
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		
		// [class='datepicker-days'] [class='datepicker-switch'] ([parent] [child]
		
		// driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April");
		
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) {
			
			// click on >> to go the next month
			// [class='datepicker-days'] th[class='next']
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();	
			
		}
		
		// get all the dates into one list
		// find the elements that have className .day
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		int count = driver.findElements(By.className("day")).size();
		
		System.out.println(count);
		
		for (int i=0; i<count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break; // out of the for loop
			}
		}
	}
		

}
