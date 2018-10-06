package SeleniumClass;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutWithoutSpefyingTimeOutTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:8090/login.do");
	    driver.findElement(By.id("username")).sendKeys("user1");
		driver.findElement(By.name("pwd")).sendKeys("user1");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		while(true)
		{
			try {
				driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
				System.out.println("PASS");
				break;
			}
			catch(NoSuchElementException ne){System.out.println("NSEE");}
		}
		driver.close();
		
	}

}
