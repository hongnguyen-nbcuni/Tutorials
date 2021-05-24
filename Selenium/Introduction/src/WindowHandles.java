import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		// class="blinkingText"
		//driver.findElement(By.cssSelector(".blinkingText")).click();
		// // selector: a[class='blinkingText']
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		
		// both parent , child window ids are stored in Set
		Set<String> windows= driver.getWindowHandles();
		
		Iterator<String> id = windows.iterator();
		String parentId = id.next();    // parent window
		String childId = id.next();	// child window
		
		driver.switchTo().window(childId);
		
		// class="im-para red"
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		String str = driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		// mentor@rahulshettyacademy.com with below templ
		String email = str.split("at")[1].trim().split(" ")[0];
		
		System.out.println(email);
		
		// switch to parent window
		driver.switchTo().window(parentId);
		
		driver.findElement(By.id("username")).sendKeys(email);
	
		

	}

}
