package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IE_DE_xpathActiTimeSiteTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8090/login.do");
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("pwd")).sendKeys("user1");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		//xpath getting DE 'Delete Selected Tasks' by using IE of 'Complete Selected Tasks'	 
		String btn = driver.findElement(By.xpath("//input[@class='hierarchy_element_wide_button']/../../td[1]/input[1]")).getAttribute("value");
		System.out.println(btn);
		
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		driver.close();
		
		
		
	}

}
