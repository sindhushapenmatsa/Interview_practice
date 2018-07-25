package sindhu;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firstprog {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		
		if(title.contentEquals("Google"))
		{
			System.out.println("google page is displayed");
		}
		else
		{
			System.out.println("google page is not displayed");
		}
	}

}
