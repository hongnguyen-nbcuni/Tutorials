import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		// capture all WebElements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		// capture text of all webelements into new (original) list
		// this stream repeats all the elements in the list
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		// sort in the list of step 3 -> sorted list
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		// compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		//System.out.println("Done");
		

		for (WebElement elem : elementsList) {
			System.out.println(elem.getText());
		}
		
		
		
		// scan the name column with getText -> Beans -> print the price of the Rice
		// whatever it filters it will pass the web element into subsequence method like map
		// s is webelement is passes to filter()
		List<String> price = elementsList.stream().filter(s->s.getText().contains("Beans")).
		map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));  // a is every item in the list
			

	}

	private static String getPriceVeggie(WebElement s) {
		// Beans, 38 (price), 36 (discount price)
		// to get the 38
		// //tr/td[1]/following-sibling::td[1]
		
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		System.out.println("Price is " + priceValue);
		
		return priceValue;
		
				
	}

}
