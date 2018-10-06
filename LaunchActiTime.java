package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchActiTime {
	public static void main(String arg[]) {
			WebDriver driver = new FirefoxDriver();
			driver.get("http://127.0.0.1:8090/login.do");
			driver.findElement(By.name("username")).sendKeys("user1");
			driver.findElement(By.name("pwd")).sendKeys("user1");
			driver.findElement(By.id("loginButton")).click();
			String customerLink = driver.findElement(By.id("sortByCustomerNameLink")).getText();
			System.out.println(customerLink);
			driver.findElement(By.id("logoutLink")).click();
			driver.close();
	}

}

;
