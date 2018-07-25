package ProjectHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Scenario1 extends Lib {
	
	//Apply,cancel,verify leave status

	public static void main(String[] args) {
		// Launch HRM
				boolean result;
				
				result = LaunchHRM();
					if(result)
						System.out.println("loginpage opened");
					else
						System.out.println("loginpage not opened");
		// LoginHRM
					
			result = LoginHRM();
					if(result)
						System.out.println("Login successful");
					else
						System.out.println("Login not successful");
					
		//NavApplyLeave
					
					result = NavApplyLeave();
					if(result)
						System.out.println("ApplyLeave page is opened");
					else
						System.out.println("ApplyLeave page is not opened");
					
	 // Select Leave type
					
					SelectLevaeType("Annual Leave");
	//Select From date
					
					Driver.findElement(By.xpath("//form[@id='frmLeaveApply']/fieldset/ol/li[3]/img")).click();
					
					Select obj_mon = new Select(Driver.findElement(By.className("ui-datepicker-month")));
					obj_mon.selectByVisibleText("Oct"); // select month
					
					Select obj_Year = new Select(Driver.findElement(By.className("ui-datepicker-year")));
					obj_Year.selectByVisibleText("2018");  // Select year
                    
				   Driver.findElement(By.xpath("//a[text()='25']")).click();
				   
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
				   
				   Driver.findElement(By.id("applyleave_txtComment")).sendKeys("please accept my leave");
				   
	//Apply 
				   Driver.findElement(By.id("applyBtn")).click();
				   System.out.println("Leave applied successfully");
				   
				   
   //Nav to my leaves
				   NavLeave();
				   
  //Cancel leave
				   CancelLeave("2018-10-25");
  // Save
				   Driver.findElement(By.id("btnSave")).click();
  //Verify leave status
				   LeaveStatus("2018-10-25");
				   
				   
	}

}
