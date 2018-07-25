package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Second {
	
	@BeforeClass
	public void BC3()
	{
		System.out.println("BC3 Executed");
	}
	
	@AfterClass
	public void AC3()
	{
		System.out.println("AC3 Executed");
	}
	
	@Test
	public void TC3()
	{
		System.out.println("TC3 Executed");
	}

}
