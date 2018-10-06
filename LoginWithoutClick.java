package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutClick {
	public static void main(String arg[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8090/login.do");
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("pwd")).sendKeys("user1");
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("logoutLink")).click();
		driver.close();	
 	}
}
