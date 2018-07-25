package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class low_High {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?id_category=11&controller=category");

		Select s = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
		s.selectByVisibleText("Price: Lowest first");

		Thread.sleep(3000);

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Summer Dresses']"))).build().perform();
		
		
		//Get the list of web elements
		List<WebElement> list_summer = driver
				.findElements(By.xpath("//ul[@class='product_list grid row']//div[1]/span[1]"));
		
		//Convert it in to list of strings
		List list_string = new ArrayList();

		for (WebElement LS : list_summer) {

			list_string.add(LS.getText());

		}

		System.out.println(list_string);
		
		
		//Pass the string list to new string list and sort the new one
		List list_string_new = new ArrayList(list_string);
		Collections.sort(list_string_new);
		
		
		//compare new lists
		boolean status = list_string.equals(list_string_new);

		if (status) {

			System.out.println("List is in ascending order");

		}

		else {
			System.out.println("List is in ascending order");
		}

	}

}
