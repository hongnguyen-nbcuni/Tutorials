import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchFilterTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		for (WebElement list : veggies) {
			System.out.println(list.getText());
		}
		
		// 1 results, filter to search only Rice row
		List<WebElement> filteredList = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
				collect(Collectors.toList());
		// 1 result
		
		System.out.println(veggies.size());
		
		Assert.assertEquals(veggies.size(), filteredList.size());
				

	}

}
