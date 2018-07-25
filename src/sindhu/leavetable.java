package sindhu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class leavetable {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("user01");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		Actions act_item = new Actions(driver);
		WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		act_item.moveToElement(leave).build().perform(); 
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		
		//displays no.of rows
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int r = row.size();
		System.out.println(r);
	
		//Displays no.of columns
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td"));
		int c = row.size();
		System.out.println(c);
		
		//get text
		
		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[2]/td[6]/a")).click();
		driver.findElement(By.xpath("//*[@id='view_request_comments']")).click();
		driver.findElement(By.xpath("//*[@id='leaveComment']")).sendKeys("hello world");
		driver.findElement(By.xpath("//*[@id='commentSave']")).click();
		
	}

}
