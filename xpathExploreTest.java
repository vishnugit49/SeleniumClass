package SeleniumClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathExploreTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://127.0.0.1:8090/login.do");
		//driver.get("http://www.half.com");
		//Thread.sleep(3000);
		//xpath with attribute
		//driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//xpath with contains and text() function
		//driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		

	}

}
