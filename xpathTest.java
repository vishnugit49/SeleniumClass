package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathTest {

	public static void main(String arg[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\xpathTestPage.html");
	driver.findElement(By.xpath("//input[2]")).sendKeys("VISHNU ROCK on XPATH");
	Thread.sleep(3000);
	driver.close();
	}
	
	
}
