package sindhu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class itemsindropdown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement mon = driver.findElement(By.id("month"));
		
		List<WebElement> items = mon.findElements(By.tagName("option"));
		
		System.out.println(items.size());
		
		for(WebElement itm:items)
		{
			String st = itm.getText();
			System.out.println(st);
			
		}
		
		

	}

}
