package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Note: Some time it is not working 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		driver.findElement(By.xpath("//input[@name='cs_name']")).sendKeys("Vishnu");
		//driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		driver.navigate().refresh();
		//driver.switchTo().frame("leftpanel");
		driver.findElement(By.xpath("//a[@title='Alerts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();
		driver.close();
		
	}

}
