package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_First_Five {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("regex101");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);

		// =======================================================
		// LInks of First page Links

		List<WebElement> First_PAge_Links = driver.findElements(By.xpath("//h3/a"));
		
		System.out.println(First_PAge_Links.size());
		for (WebElement FPL : First_PAge_Links) {
			
			Actions ac = new Actions(driver);
			ac.contextClick(FPL).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			Thread.sleep(3000);

		}
		
		// =======================================================
		// LInks of First Five pages Links
		
//		for(int i=1;i<=5;i++)
//		
//		{
//			
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			
//			List<WebElement> remaining_pages = driver.findElements(By.xpath("//h3/a"));
//			System.out.println("no.of Links on "+i +" page are"+remaining_pages.size() +"and are displayed below");
//			System.out.println(remaining_pages.size());
//			for (WebElement FPL : remaining_pages) {
//
//				System.out.println(FPL.getText());
//
//			}
//			
//			
//		}
//		
//		
//		
//		
//		
//		
//
	}

}
