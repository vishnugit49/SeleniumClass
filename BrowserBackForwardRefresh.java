package SeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserBackForwardRefresh {
	public static void main(String age[]) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}

}
