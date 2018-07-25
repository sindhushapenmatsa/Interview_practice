package sindhu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browsers {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sindh\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/"); 
		 
		
		
  /*  DesiredCapabilities Capabilities = DesiredCapabilities.internetExplorer();
     Capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
     Capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
     
     System.setProperty("webdriver.ie.driver","C:\\Users\\sindh\\Downloads\\IEDriverServer.exe");
     
     WebDriver driver = new InternetExplorerDriver();
     
     driver.get("https://www.facebook.com/"); */
		
		
		
		
		
		
	}

}
