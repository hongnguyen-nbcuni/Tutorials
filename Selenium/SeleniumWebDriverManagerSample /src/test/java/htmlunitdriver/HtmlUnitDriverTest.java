package htmlunitdriver;

import java.lang.reflect.Field;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;


public class HtmlUnitDriverTest {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new HtmlUnitDriver();
		
		//WebDriver driver = new HtmlUnitDriver ( BrowserVersion.CHROME );
		

		driver.get("http://selenium.dev");

		//WebElement element = driver.findElement(By.name("q"));  

		//element.sendKeys("Edureka");
		//element.submit();   

		System.out.println("Page title is: " + driver.getTitle());   // syso <ctlr> <space bar>
		
		WebClient webClient1 = (WebClient) get(driver, "webClient"); 	// call object to get browser's version
		
		
		System.out.println("Browser version is: "+webClient1.getBrowserVersion());
		
		System.out.println("Browser version is Chrome: "+webClient1.getBrowserVersion().isChrome());
		System.out.println("Browser version is Edge: "+webClient1.getBrowserVersion().isEdge());
		System.out.println("Browser version is Firefox: "+webClient1.getBrowserVersion().isFirefox());
	
		driver.quit();

	}
	
	private static Object get(Object object, String field) throws Exception {  

		Field f = object.getClass().getDeclaredField(field);  

		f.setAccessible(true);  

		return f.get(object);  

		}  
	

}
