package ProjectHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Scenario3 extends Lib{

	public static void main(String[] args) {
		LaunchHRM();
		LoginHRM();
		NavApplyLeave();
		SelectLevaeType("Annual Leave");
		//Select From date
		
		Driver.findElement(By.xpath("//form[@id='frmLeaveApply']/fieldset/ol/li[3]/img")).click();
		
		Select obj_mon = new Select(Driver.findElement(By.className("ui-datepicker-month")));
		obj_mon.selectByVisibleText("Oct"); // select month
		
		Select obj_Year = new Select(Driver.findElement(By.className("ui-datepicker-year")));
		obj_Year.selectByVisibleText("2018");  // Select year
        
	   Driver.findElement(By.xpath("//a[text()='26']")).click();
	   
// Verify To date = From date
	   
	   String from_date = Driver.findElement(By.id("applyleave_txtFromDate")).getText();
	   System.out.println(from_date);
	   String To_date = Driver.findElement(By.id("applyleave_txtToDate")).getText();
	   System.out.println(To_date);
	   if(from_date.contentEquals(To_date))
		   System.out.println("To date = From date");
	   else
		   System.out.println("To date != From date");
	   
// Enter comment
	   
	   Driver.findElement(By.id("applyleave_txtComment")).sendKeys("please accept my 3rd leave");
	   
//Apply 
	   Driver.findElement(By.id("applyBtn")).click();
	   System.out.println("Leave applied successfully");
	   
	   
//Nav to my leaves
	   NavLeave();
	   
// select date
	   
	 //Select From date
		
	 		Driver.findElement(By.xpath(".//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
	 		
	 		Select From_obj_mon = new Select(Driver.findElement(By.className("ui-datepicker-month")));
	 		From_obj_mon.selectByVisibleText("Oct"); // select month
	 		
	 		Select From_obj_Year = new Select(Driver.findElement(By.className("ui-datepicker-year")));
	 		From_obj_Year.selectByVisibleText("2018");  // Select year
	         
	 	   Driver.findElement(By.xpath("//a[text()='26']")).click();
	 	  Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 	   
	 	//Select To date
			
	 		Driver.findElement(By.xpath(".//*[@id='frmFilterLeave']/fieldset/ol/li[2]/img")).click();
	 		
	 		Select To_obj_mon = new Select(Driver.findElement(By.className("ui-datepicker-month")));
	 		To_obj_mon.selectByVisibleText("Oct"); // select month
	 		
	 		Select To_obj_Year = new Select(Driver.findElement(By.className("ui-datepicker-year")));
	 		To_obj_Year.selectByVisibleText("2018");  // Select year
	         
	 	   Driver.findElement(By.xpath("//a[text()='26']")).click();

	 	  Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //Search button 	   
	 	  Driver.findElement(By.id("btnSearch")).click();
	 // verify leave details
	 	  
	 	 int r = RowCount();
			
			for(int i=1;i<=r;i++)
					{
				 Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				String date = Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]/a")).getText();
				System.out.print(date);  
				String Leave_Type = Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[3]")).getText();
				System.out.print(" - " + Leave_Type); 
				String Col_status = Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]/a")).getText();
				System.out.print(" - " + Col_status); 
				String Comments = Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
				System.out.println(" - " + Comments); 
		
					}  
	 	  
	}

}
