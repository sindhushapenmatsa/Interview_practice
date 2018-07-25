package ProjectHRM;

public class LeaveCancel extends Lib {

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
	
// Navigate to leave page
			
			result = NavLeave();
			if(result)
				System.out.println("Navigated to leave page");
			else
				System.out.println("Navigation to leave page is failed");		
//row count
			
             int count = RowCount();
             System.out.println("Row count is :- " + count);
			
// Cancel Leave
             result = CancelLeave("2018-11-30");
             
             if(result)
 				System.out.println("Leave is cancelled");
 			else
 				System.out.println("Leave is not cancelled");	
			
			
	}

}
