package SeleniumClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextWithoutSendKeys {
	public static void main(String arg[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1:8090/login.do");
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("document.getElementById(\"username\").value=\"Vishnu\";");
	Thread.sleep(3000);
	driver.close();
	}
}
