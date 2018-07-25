package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBFriends {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sindhusha.ganesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("@ganpen30");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		driver.findElement(By.xpath("//div[@id='userNav']")).click();
		driver.findElement(By.xpath("//a[@data-tab-key='friends']")).click();
		

while(true)
{
	List<WebElement> list_friends_before = driver.findElements(By.xpath("//div[@class='fsl fwb fcb']/a"));
	
	WebElement last_friend = list_friends_before.get(list_friends_before.size()-1);
	int last_friend_position = last_friend.getLocation().y;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,"+last_friend_position+")");
	Thread.sleep(4000);

	List<WebElement> list_friends_after = driver.findElements(By.xpath("//div[@class='fsl fwb fcb']/a"));
	
	if(list_friends_before.size()==list_friends_after.size())
		
		break;
	
	
}
		
		
List<WebElement> list_friends_after = driver.findElements(By.xpath("//div[@class='fsl fwb fcb']/a"));

for(WebElement FL: list_friends_after)
{
	System.out.println(list_friends_after.size());
	System.out.println(FL.getText());
	
}
		
	
		
		
		
		
		
		
		//div[contains(@id,'collection_wrapper')]//li//img
		////div[contains(@id,"pagelet_timeline_app_collection")]//li/div[@data-testid="friend_list_item"]/a/img

	}

}
