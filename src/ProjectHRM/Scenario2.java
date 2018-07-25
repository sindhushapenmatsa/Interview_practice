package ProjectHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Scenario2 extends Lib {
	
	//Verify all column status

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
		
		// navigate to Myleave
		boolean status = NavLeave(); 
		if(status)
			System.out.println("My leave page is opened");
		else
			System.out.println("My leave page is not opened");
		
	// Uncheck "ALL" checkbox & click search
		
		Driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
		Driver.findElement(By.id("leaveList_chkSearchFilter_1")).click();
		Driver.findElement(By.id("btnSearch")).click();
		
	//Veriy status column of all leave dates
		
		int r = RowCount();
		
		for(int i=1;i<=r;i++)
				{
			String date = Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]/a")).getText();
			System.out.print(date);   
			String Col_status = Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]/a")).getText();
			
			if(Col_status.contains("Pending Approval"))
			{
				System.out.println(" - Correct status");
			}
			else
			{
				System.out.println(" - inCorrect status");
			}
			
			
			
			
		         /*
				 String date = Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]/a")).getText();
				  System.out.print(date);
				  String Col_status = Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]/a")).getText();
				  System.out.println(" - " + Col_status);
				  
				  */
				
				}
		
		
		
		

	}

}
