package SeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTitleURLCheck {
	public static void main(String arg[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
	}

}
