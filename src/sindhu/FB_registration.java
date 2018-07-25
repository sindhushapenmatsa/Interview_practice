package sindhu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sindh\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_k")).sendKeys("testing");
		driver.findElement(By.name("lastname")).sendKeys("master");
		driver.findElement(By.name("reg_email__")).sendKeys("9100947040");
		driver.findElement(By.name("reg_passwd__")).sendKeys("pass1234");
		
		Select sel_day= new Select(driver.findElement(By.id("day")));
		sel_day.selectByVisibleText("13");
		
		Select sel_mon= new Select(driver.findElement(By.id("month")));
		sel_mon.selectByVisibleText("Mar");
		
		Select sel_yr= new Select(driver.findElement(By.id("year")));
		sel_yr.selectByVisibleText("2012");
		
		driver.findElement(By.id("u_0_a")).click();
		driver.findElement(By.id("u_0_12")).click();
	
		

	}

}
