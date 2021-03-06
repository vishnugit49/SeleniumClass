package SeleniumClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MenuDropDownSelectByMouseTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.fatcow.com");
		WebElement menu = driver.findElement(By.xpath("//select[@id='countrySelect']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(menu).perform();
		
		driver.findElement(By.xpath("//option[@value='CAD']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}
	

}
