package sindhu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedXPath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		//first
				/*
				List<WebElement> list = driver.findElements(By.xpath("//th[text()='Designation']/parent::tr/parent::thead/following-sibling::tbody/tr/td[5][text()='Analyst']/preceding-sibling::td[3]"));
		          int size = list.size();
		          System.out.println(size);
		          
		          for(int i=0;i<size-1;i++)
		          {
		        	  String emp_id = list.get(i).getText();
		        	  System.out.println(emp_id);
		          }
		          
		*/
		
         //second 
		          /*
		          List<WebElement> list2 = driver.findElements(By.xpath(".//*[@id='VisitingTable']/tbody/tr/td[7][text()<5]/preceding-sibling::td[3]"));
		          int size2 = list2.size();
		          System.out.println(size2);
		          
		          for(int i=0;i<size2-1;i++)
		          {
		        	  String mail_id = list2.get(i).getText();
		        	  System.out.println(mail_id);
		          }
		          */
		
		
          //third
		          /*
		          List<WebElement> check = driver.findElements(By.xpath("//th[text()='Designation']/parent::tr/parent::thead/following-sibling::tbody/tr/td[5][text()='Manager']/preceding-sibling::td[4]"));
		         
		         for(WebElement ele:check)
		          {
		          	ele.click();
		          }
		  			*/
		
		
		//fourth
				/*
				List<WebElement> check_day8 = driver.findElements(By.xpath(".//*[@id='VisitingTable']/tbody/tr/td[7][text()>8]/preceding-sibling::td[6]"));
		        
				for(WebElement ele:check_day8)
		        {
		        	ele.click();
		        }
		          
		          */
		
		
		//Fifth
				/*
				List<WebElement> reject_list = driver.findElements(By.xpath("//th[text()='Designation']/parent::tr/parent::thead/following-sibling::tbody/tr/td[5][text()='Analyst']/following-sibling::td[3]/select"));
				
				for(WebElement ele:reject_list)
		        {
		        	Select sel_list = new Select (ele);
		        	sel_list.selectByVisibleText("Rejected");
		        }
				*/
		
		//Sixth
		
		List<WebElement> status = driver.findElements(By.xpath(".//*[@id='VisitingTable']/tbody/tr/td[8]/select"));
		List<WebElement> Empid = driver.findElements(By.xpath(".//*[@id='VisitingTable']/tbody/tr/td[2]"));
		
		int size = status.size()-1;
		for(int i=0;i<=size;i++)
		{
			WebElement ele = status.get(i);
			Select sc = new Select(ele);
			String sel_opt = sc.getFirstSelectedOption().getText();
			if(sel_opt.equals("Accepted"))
			{
				String id_text = Empid.get(i).getText();	
				System.out.println(id_text);
			}
			
			
		}
		
		
		
		
		//Seventh
		/*
		List<WebElement> check = driver.findElements(By.xpath("//td[text()='Vinod']/following-sibling::td[2][text()='Analyst']/preceding-sibling::td[4]"));
		
		int size = check.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			
			check.get(i).click();
			
		}
		*/
		
		
		//Eight
				/*
		         List<WebElement> check_first5 = driver.findElements(By.xpath(".//*[@id='VisitingTable']/tbody/tr[position()<6]/td[1]/input"));
		        
				for(WebElement ele:check_first5)
		        {
		        	ele.click();
		        }
				*/
		
		
		//Nine
				/*
				List<WebElement> check_last4 = driver.findElements(By.xpath("(.//*[@id='VisitingTable']/tbody/tr/td[1])[position()>=last()-3]/input"));
		        
				for(WebElement ele:check_last4)
		        {
		        	ele.click();
		        }
		        */
		
		
		//Ten
		
		/*
				List<WebElement> check_demo = driver.findElements(By.xpath(".//*[@id='VisitingTable']/tbody/tr/td[4][starts-with(text(),'demo')]/preceding-sibling::td[3]/input"));
				        
						for(WebElement ele:check_demo)
				        {
				        	ele.click();
				        }
		*/
	}

}
