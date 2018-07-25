package ProjectHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Lib {
	
	public static WebDriver Driver;
	
//=================================================================================
	/*
	 Method Name 	: LunchHRM
	 Description 	: It is used to launch HRM login page
	 Author			: Sindhu
	 Return value 	: true/false
	 Date Created 	: 01-Apr-2018
	 Date Modified 	: 
	 Modified by 	: Sindhu	
	 */
	
	public static boolean LaunchHRM() 
	{
		boolean stepstatus = false;

		try
		{
		
		Driver = new FirefoxDriver();
		Driver.get("http://testingmasters.com/hrm/");
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Boolean ver = Driver.findElement(By.xpath("//div[text()='LOGIN Panel']")).isDisplayed();
		 
		 if(ver)
			 
			 stepstatus = true;
		 else
			 stepstatus = false;
		}
		
		catch(Exception e)
		{
			stepstatus = false;
		}
		
		return stepstatus;

	}
	
	
	//=================================================================================
		/*
		 Method Name 	: LoginHRM
		 Description 	: It is used to login HRM page
		 Author			: Sindhu
		 Return value 	: true/false
		 Date Created 	: 01-Apr-2018
		 Date Modified 	: 
		 Modified by 	: Sindhu	
		 */

	
	public static boolean LoginHRM()
	
	{
		boolean stepstatus = true;
		
		try{
			
		Driver.findElement(By.id("txtUsername")).sendKeys("user01");
		Driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		Driver.findElement(By.id("btnLogin")).click();
 Boolean ver = Driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed();
		 
		 if(ver)
			 
			 stepstatus = true;
		 else
			 stepstatus = false;
		}
		
		catch(Exception e)
		{
			stepstatus = false;
		}
		
		return stepstatus;	
	}
	
//==================================================================================================================	
	
			/*
			 Method Name 	: NavApplyLeave
			 Description 	: It is used to navigate to my leave page
			 Author			: Sindhu
			 Return value 	: true/false
			 Date Created 	: 01-Apr-2018
			 Date Modified 	: 
			 Modified by 	: Sindhu	
			 */

		public static boolean NavApplyLeave()
		
		{
			boolean stepstatus = false;
			
			try
			{
			
			Actions act_obj = new Actions(Driver);
			
			WebElement leave = Driver.findElement(By.id("menu_leave_viewLeaveModule"));
			act_obj.moveToElement(leave).build().perform();
			Driver.findElement(By.id("menu_leave_applyLeave")).click();
			
			Boolean ver = Driver.findElement(By.xpath("//h1[text()='Apply Leave']")).isDisplayed();
			 
			 if(ver)
				 
				 stepstatus = true;
			 else
				 stepstatus = false;
			}
			
			catch(Exception e)
			{
				stepstatus = false;
			}
			
			return stepstatus;	
		}
		//==============================================================================================	
		
		/*
		 Method Name 	: Select leave type
		 Description 	: It is used to select leave type
		 Author			: Sindhu
		 Return value 	: true/false
		 Date Created 	: 01-Apr-2018
		 Date Modified 	: 
		 Modified by 	: Sindhu	
		 */

	public static void SelectLevaeType(String LeaveType)
	
	{
		
		switch(LeaveType)
		{
		case "Annual Leave" :
			
							{
								WebElement dropdown = Driver.findElement(By.id("applyleave_txtLeaveType"));
							Select obj = new Select(dropdown);
							obj.selectByVisibleText("Annual Leave");
						     boolean sel = Driver.findElement(By.xpath("//option[text() = 'Annual Leave']")).isDisplayed();
						     if(sel)
						    	 System.out.println("Annual leave is selected");
						     else
						    	 System.out.println("Annual leave is not selected");
						     break;
						     }
		case "Personal Leave" :
			
							{
								WebElement dropdown = Driver.findElement(By.id("applyleave_txtLeaveType"));
							Select obj = new Select(dropdown);
							obj.selectByVisibleText("Personal Leave");
						     boolean sel = Driver.findElement(By.xpath("//option[text() = 'Personal Leave']")).isDisplayed();
						     if(sel)
						    	 System.out.println("Personal Leave is selected");
						     else
						    	 System.out.println("Personal Leave is not selected");
						     break;
						     }					
			
	 default :
							 {
								 boolean sel = Driver.findElement(By.xpath("//option[text() = '--Select--']")).isDisplayed(); 
								 
								 if(sel)
							    	 System.out.println("No Leave type  is selected");
								 
							 }
			
			
		}
		
		
	}

	//==============================================================================================	
	
			/*
			 Method Name 	: NavMyLeave
			 Description 	: It is used to navigate to my leave page
			 Author			: Sindhu
			 Return value 	: true/false
			 Date Created 	: 01-Apr-2018
			 Date Modified 	: 
			 Modified by 	: Sindhu	
			 */

		public static boolean NavLeave()
		
		{
			boolean stepstatus = false;
			
			try
			{
			
			Actions act_obj = new Actions(Driver);
			
			WebElement leave = Driver.findElement(By.id("menu_leave_viewLeaveModule"));
			act_obj.moveToElement(leave).build().perform();
			Driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
			
			Boolean ver = Driver.findElement(By.xpath("//h1[text()='My Leave List']")).isDisplayed();
			 
			 if(ver)
				 
				 stepstatus = true;
			 else
				 stepstatus = false;
			}
			
			catch(Exception e)
			{
				stepstatus = false;
			}
			
			return stepstatus;	
		}
			
		//=============================================================================================
	
	
//==============================================================================================	
	
			/*
			 Method Name 	: GetRowcount
			 Description 	: It is used to get row count of myleave table
			 Author			: Sindhu
			 Return value 	: int
			 Date Created 	: 01-Apr-2018
			 Date Modified 	: 
			 Modified by 	: Sindhu	
			 */
	
	public static int RowCount()
	{
		
		List<WebElement> row = Driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int count = row.size();
		return count;
		
	}
	//==============================================================================================	
	
	/*
	 Method Name 	: Cancel leave
	 Description 	: It is used to cancel leave
	 Author			: Sindhu
	 Return value 	: true/false
	 Date Created 	: 01-Apr-2018
	 Date Modified 	: 
	 Modified by 	: Sindhu	
	 */	
	
	public static boolean CancelLeave(String LeaveDate)
	{
          boolean stepstatus = false;
		
		try
				{
				
				int r = RowCount();
				
				for(int i=1;i<=r;i++)
						{
				
						 String DateGot = Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).getText();
						 if(DateGot.contentEquals(LeaveDate))
								 {
									WebElement dropdown =  Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[8]/select"));
									Select obj = new Select(dropdown);
									obj.selectByVisibleText("Cancel");
									stepstatus = true;
									break;
								 }
						
						
						}
				}
		

		catch(Exception e)
				{
					stepstatus = false;
				}
		
		return stepstatus;	
	
	}
	//==============================================================================================	
	
		/*
		 Method Name 	: Verify leave status
		 Description 	: It is used to cancel leave
		 Author			: Sindhu
		 Return value 	: true/false
		 Date Created 	: 01-Apr-2018
		 Date Modified 	: 
		 Modified by 	: Sindhu	
		 */	
		
		public static boolean LeaveStatus(String LeaveDate)
		{
	          boolean stepstatus = false;
			
			try{

					int r = RowCount();
					
					for(int i=1;i<=r;i++) {
	
							 String DateGot = Driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).getText();
							 if(DateGot.contentEquals(LeaveDate))
									 {
										String status = Driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr["+i+"]/td[6]/a")).getText();
										if(status.contains("Cancelled"))
												{
													System.out.println("leave got cancelled");
													stepstatus = true;
												}
										
										else
												{
													System.out.println("leave is not cancelled");
													stepstatus = false;
												}
										
										break;
									 }
							
							
							}
					}
			

			catch(Exception e)
					{
						stepstatus = false;
					}
			
			return stepstatus;	
		}
	
	
	
	
}
