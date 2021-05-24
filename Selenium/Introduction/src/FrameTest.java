import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/droppable/");
		
		// switch to index of frame, frameId, or webelement of frame
		// driver.switchTo().frame(By.id(id)); but this frame doesn't have Id
				
		// WebElement elm = driver.findElement(By.cssSelector(".demo-frame"));
		
		// driver.switchTo().frame(1);
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		WebElement elm = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		
		driver.switchTo().frame(elm);
		
		driver.findElement(By.id("draggable")).click();

		// drag and drop
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target =  driver.findElement(By.id("droppable"));
	
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent(); 		// back to normal window 
		

	}

}
