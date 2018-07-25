package sindhu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\sindh\\Desktop\\perks.png");

	}

}
