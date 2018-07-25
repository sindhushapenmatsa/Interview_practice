package sindhu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class get_color {
	
	
	public static void main(String args[]) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		System.out.println(email.getText());
		email.sendKeys("sindhusha@gmail.com");
		email.sendKeys(Keys.TAB);
		System.out.println(email.getAttribute("value"));
		String color = email.getCssValue("color");
		System.out.println(color);
		
		//rgba(53, 179, 63, 1)
		
		
		
		
	}
	

}
