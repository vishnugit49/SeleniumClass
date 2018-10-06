package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorText {

	public static void main(String arg[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\cssSelectorTestPage.html");
	driver.findElement(By.cssSelector("input[type='pwd']")).sendKeys("VISHNU ROCK");
	Thread.sleep(3000);
	driver.close();
	}
	
	
}
