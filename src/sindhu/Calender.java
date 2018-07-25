package sindhu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.switchTo().frame("mainpanel");
		WebElement cal = driver.findElement(By.xpath("//div[@id='navmenu']/ul/li[2]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(cal).perform();
		
		driver.findElement(By.xpath("//a[@title='View Today']")).click();
		
		
		String date = "15-August-2017";
		String arr[]=date.split("-");
		         String day = arr[0];
		         String mon = arr[1];
		         String year = arr[2];
		         
		         Select sel_mon = new Select(driver.findElement(By.name("slctMonth")));
		         sel_mon.selectByVisibleText(mon);
		         
		         Select sel_year = new Select(driver.findElement(By.name("slctYear")));
		         sel_year.selectByVisibleText(year);
		         
		         Boolean flag = false;
		         for(int r=2;r<=6;r++){
		        	 
		        	 for(int c=1;c<=7;c++){
		        		 
		        		String compdate = driver.findElement(By.xpath("//div[@id='crmcalendar']/table/tbody/tr[2]//tbody/tr["+r+"]/td["+c+"]")).getText();
		        		 if(compdate.equals(day))
		        		 {
		        			 driver.findElement(By.xpath("//div[@id='crmcalendar']/table/tbody/tr[2]//tbody/tr["+r+"]/td["+c+"]")).click();
		        			 flag=true;
		        			 break;
		        		 }
		        		 
		        	 }
		        	 
		        	 if(flag)
		        		 break;
		        	 
		         }
		         
		         
		       
		
		
		

	}

}
