package SeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeBrowser {
	public static void main(String arg[]) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	}
}
