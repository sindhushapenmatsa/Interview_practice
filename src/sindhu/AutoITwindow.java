package sindhu;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITwindow {

	public static void main(String[] args) throws IOException, InterruptedException {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://testingmasters.com/hrm/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	 driver.findElement(By.id("txtUsername")).sendKeys("user01");
	 driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	 driver.findElement(By.id("btnLogin")).click();
	 
	 driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	 driver.findElement(By.id("btnAddAttachment")).click();
	 driver.findElement(By.id("ufile")).click();
	 
	 Runtime.getRuntime().exec("C:\\Users\\sindh\\Desktop\\window.exe");
	 Thread.sleep(12000);
	 driver.findElement(By.id("btnSaveAttachment")).click();

	}

}
