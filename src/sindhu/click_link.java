package sindhu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class click_link {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		driver.getPageSource();
		
		
		driver.findElement(By.partialLinkText("date of birth?")).click();
		 
		 
		 

	}

}
