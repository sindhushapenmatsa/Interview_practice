package TestNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class first {
	
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("After method");
	}
	
	@Test(priority = 2)
	public void TC2()
	{
		System.out.println("TC2 Executed");
	}
	
	
	@Test(priority = 1)
	public void TC1()
	{
		System.out.println("TC1 Executed");
	}
	
}
