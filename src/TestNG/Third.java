package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Third {
	
	
	@BeforeTest
	
	public void BT()
	{
		System.out.println("BT Executed");
	}
	
@AfterTest
	
	public void AT()
	{
		System.out.println("AT Executed");
	}
@BeforeSuite

public void BS()
{
	System.out.println("BS Executed");
}

@AfterSuite

public void AS()
{
	System.out.println("AS Executed");
}
	
	@Test
	public void TC4()
	{
		System.out.println("TC4 Executed");
	}

}
