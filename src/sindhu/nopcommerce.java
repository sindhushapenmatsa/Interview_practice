package sindhu;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class nopcommerce {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gender-female")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("sindhu");
		driver.findElement(By.id("LastName")).sendKeys("pericharla");
		
		Select DOD = new Select(driver.findElement(By.name("DateOfBirthDay")));
		DOD.selectByVisibleText("27");
		Select DOM = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		DOM.selectByVisibleText("December");
		Select DOY = new Select(driver.findElement(By.name("DateOfBirthYear")));
		DOY.selectByVisibleText("1991");
		
		driver.findElement(By.id("Email")).sendKeys("sindhusha.p@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("Baahubali-2");
		driver.findElement(By.id("Newsletter")).click();
		
		driver.findElement(By.id("Password")).sendKeys("pass123");

		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123");
		
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.name("register-continue")).click();
		
		String a = driver.getTitle();
		if(a.contentEquals("nopCommerce demo store"))
		{
			System.out.println("page is opened");
		}
		else
		{
			System.out.print("page is failed");
		}
		driver.quit();
	}

}



//sindhusha.ganesh
//pass1234
//ganesh.sindhusha
//pass12345
//sindhusha.p
//pass123