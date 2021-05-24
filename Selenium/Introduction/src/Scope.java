import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		
		// 1. Give me the count of the links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// 2. Get the count of links in the footer section
		// id = "gf-BIG"
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
	
		// 3. Get the count of the first session of footer
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		// 4. Click on each link in the column and check if the page are opening
		
		int size = columnDriver.findElements(By.tagName("a")).size();
		
		for (int i = 1; i < size; i++) {
			// this line doesn't not open another tab:
			//columnDriver.findElements(By.tagName("a")).get(i).click();
			//System.out.println(columnDriver.findElements(By.tagName("a")).get(i).getText());

			// to open another tab, we need to click on CONTROL -> this is windows
			//String clickonLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);	
			
			// On mac -> hold down the COMMAND key
			String clickonLinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);	
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			
			Thread.sleep(5000L);
			
			//System.out.println(columnDriver.findElements(By.tagName("a")).get(i).getText());
			
		}
		
		// go to each window and print its title
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			
			System.out.println(driver.getTitle());
		}
		

	}

}
