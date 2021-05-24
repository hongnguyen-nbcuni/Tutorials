import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesTest {

	public static void main(String[] args) {
		
		// SSL Certification
				
		// Designed capabilities
		// general chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		// or
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		// set your local browser setting
		ChromeOptions c = new ChromeOptions();
		// merging your chrome profile into your actual browser
		// Belongs to your local browser
		// now your local browser now has knowledge of handling this insecure certification
		c.merge(ch);  
		
		System.setProperty("Webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver(c);	// now it can click "Proceed Anyway"
		

	}

}
