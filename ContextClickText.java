package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8090/login.do");
		WebElement ele = driver.findElement(By.xpath("//a[@id='licenseLink']"));
		Actions act = new Actions(driver);
		//Right click on specified element
		act.contextClick(ele).perform();
		act.sendKeys("Link").perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.ESCAPE).perform();
		//Left click on specified element
		act.click().perform();
		Thread.sleep(4000);
		driver.quit();
	}

}
