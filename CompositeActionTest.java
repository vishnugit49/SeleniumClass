package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeActionTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.fatcow.com");
		WebElement ele = driver.findElement(By.xpath("//a[@class='cta get-started']"));
		
		Actions act = new Actions(driver);
		
	
		//control+click opens page in new tab, where a only click opens page in same tab.
		act.sendKeys(Keys.CONTROL).build().perform();
		act.click(ele).build().perform();
		
		//other example if case of composite operation. (not tested)
		//act.sendKeys(Keys.CONTROL).click().build().perform();
		//act.sendKeys(Keys.CONTROL,Keys.SHIFT).dragAndDrop(source,target).build().perform();
		
		
		Thread.sleep(4000);
		driver.quit();
	}

}
