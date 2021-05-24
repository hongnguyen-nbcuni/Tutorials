import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartTest {

	public static void main(String[] args) throws Exception {
		
		//String[] itemsNeeded = {"Cucumber - 1 Kg", "Brocolli - 1 Kg"};
		
		String[] itemsNeeded = {"Cucumber", "Brocolli"};
	
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(3000);
			
		addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		// explicit wait
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		
		// the list of WebElement, find the 3rd index
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		int j = 0;
		// convert array into array list for easy search
		// why not here?
		List al = Arrays.asList(itemsNeeded);
		
		// System.out.println(al);
		
		for (int i=0; i < products.size(); i++) {
			
			// added this line fixed the List al to be outside to work?
			//System.out.println("In for loop");
			
			//String name = products.get(i).getText();
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
				
			// convert array into array list for easy search
			
			// List al = Arrays.asList(itemsNeeded);
			
			//System.out.println("List is " + al);
				
			//if (al.contains(name)) {
			if (al.contains(formattedName)) {
				
				j++;
				
				System.out.println(formattedName);		
				// click on Add to Cart
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();		
	
				// //div[@class='product-action']/button
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();	
				
				if (j == itemsNeeded.length) {
					break;
				}
	
			}
			
			
		}

	}
	
	

}
