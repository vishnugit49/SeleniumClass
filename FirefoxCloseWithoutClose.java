package SeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxCloseWithoutClose {
	public static void main(String arg[]){
		WebDriver driver = new FirefoxDriver();
		FirefoxDriver f = (FirefoxDriver) driver;
		f.quit();
	}

}
