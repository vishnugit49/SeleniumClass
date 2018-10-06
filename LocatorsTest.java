package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class LocatorsTest {
	public static void main(String arg[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8090/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("pwd")).sendKeys("user1");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.linkText("Tasks")).click();
		driver.findElement(By.xpath("//*[@id='ext-comp-1016']/span")).click();
		
		
		Select select1 = new Select(driver.findElement(By.name("customerId")));
		select1.selectByVisibleText("-- new customer --");
		
		driver.findElement(By.name("customerName")).sendKeys("Vishnu");
		
		driver.findElement(By.name("projectName")).sendKeys("ROCKON");
		
		driver.findElement(By.id("task[0].name")).sendKeys("Automate");
		
		driver.findElement(By.name("task[0].budgetedTimeStr")).sendKeys("11:00");
		
		driver.findElement(By.id("task[0].deadline")).sendKeys("Sep 14, 2018");
		
		
		Select select2 = new Select(driver.findElement(By.id("task[0].billingType")));
		select2.selectByVisibleText("Billable");

		driver.findElement(By.id("task[0].markedToBeAddedToUserTasks")).click();

		driver.findElement(By.className("hierarchy_element_wide_button")).click();
		
		Thread.sleep(10000);
		

		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		
	}
	
}

 

