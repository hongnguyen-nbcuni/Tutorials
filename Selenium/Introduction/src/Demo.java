import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		// these two lines will invoke the chrome driver
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		/*
		// load google.com
		driver.get("http://www.google.com");	
		// get the title of the page
		System.out.println(driver.getTitle());	
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());

		//https://www.google.com/?gws_rd=ssl
		
		//System.out.println(driver.getPageSource());
		
		driver.get("http://www.yahoo.com");
		
		driver.navigate().back();
	
		*/
		
		
		driver.get("http://www.facebook.com");
		
		/*
		driver.findElement(By.className("inputtext")).sendKeys("hello world");
		
		driver.findElement(By.id("email")).sendKeys("test@yahoo.com");
		//driver.findElement(By.id("pass")).sendKeys("my password");	
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("my password");		
		driver.findElement(By.name("pass")).sendKeys("my password");	
		//driver.findElement(By.linkText("Forgot account")).click();	
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		// //*[@id="Login"]
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		*/
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("email address");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("your password");
		
		
		
		// driver.close();   // it closes current browser
		// driver.quit();    // it closes all the browsers opened by selenium script
			
		
		
	}

}
