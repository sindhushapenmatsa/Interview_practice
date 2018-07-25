package sindhu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class link_count {

	public static void main(String[] args) {
		
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/");
		List<WebElement> link = d.findElements(By.tagName("a"));
		
		     int   a =  link.size();
		     System.out.println("link count is"  +  a);
		     
		     for(int i = 0; i<a; i++)
		     {
		    	String linktext = link.get(i).getText();
		    	System.out.println(linktext);
		     }

	}

}
