package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		WebElement ele = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		Thread.sleep(2000);
		driver.close();

		
	}

}
