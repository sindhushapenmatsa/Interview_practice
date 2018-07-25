package sindhu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verify_enter {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		         String a =    "testing";
		driver.findElement(By.name("firstname")).sendKeys(a);
		 String b = driver.findElement(By.name("firstname")).getAttribute("placeholder");
		 
		 if(a.contentEquals(b))
		 {
			 System.out.println("success");
		 }
		 else
		 {
			 System.out.println("Faile");
		 }

	}

}
