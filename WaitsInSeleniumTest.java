package SeleniumClass;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Thread.sleep() method wait
		driver.get("http://127.0.0.1:8090/login.do");
		driver.findElement(By.id("username")).sendKeys("user1");
		driver.findElement(By.name("pwd")).sendKeys("user1");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		driver.close();
		
		
		//Explicit wait using WebDriverWait
		driver.get("http://127.0.0.1:8090/login.do");
	    driver.findElement(By.id("username")).sendKeys("user1");
		driver.findElement(By.name("pwd")).sendKeys("user1");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logoutLink']")));
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		driver.close();
			
		//Implicit wait using implicitlyWait()
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8090/login.do");
	    driver.findElement(By.id("username")).sendKeys("user1");
		driver.findElement(By.name("pwd")).sendKeys("user1");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		driver.close();
		
		
	}

}
