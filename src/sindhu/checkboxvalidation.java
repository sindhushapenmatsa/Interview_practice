package sindhu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxvalidation {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/register");
		Boolean disp = driver.findElement(By.id("Newsletter")).isDisplayed(); // is displayed ot not
		
		if(disp)
		   System.out.println("check is displayed");
		else
		System.out.println("check is not displayed");
		
Boolean Enb = driver.findElement(By.id("Newsletter")).isEnabled(); // is enabled or not
		
		if(Enb)
		   System.out.println("check is enabled");
		else
		System.out.println("check is not enabled");
		
Boolean sel = driver.findElement(By.id("Newsletter")).isSelected(); // is checked or not
		
		if(sel)
		   System.out.println("check is selected");
		else
		System.out.println("check is not selected");
		
		driver.findElement(By.id("Newsletter")).click(); //check/uncheck
		
Boolean sel2 = driver.findElement(By.id("Newsletter")).isSelected(); // is re- checked or not
		
		if(sel2)
		   System.out.println("check is selected");
		else
		System.out.println("check is not selected");

	}

}
