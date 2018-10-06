package SeleniumClass;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateMultipleAndDeleteTaskInActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		System.out.println("How many task you want to create? ");
		System.out.println("Enter the task number: ");
		Scanner n = new Scanner(System.in);
		String snum = n.next();
		int nnum = Integer.parseInt(snum);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//launch and login to actiTime.
		driver.get("http://127.0.0.1:8090/login.do");
		driver.findElement(By.id("username")).sendKeys("user1");
		driver.findElement(By.name("pwd")).sendKeys("user1");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//create task
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		for(int i = 0; i<nnum; i++)
		{
			createActiTask(driver, i);
		}
		
		//select select ALL check box.
		driver.findElement(By.xpath("//a[@class='listtblcolheadersmall']")).click();
		//click on delete button.
		driver.findElement(By.xpath("//input[@class='hierarchy_element_wide_button']")).click();
		Thread.sleep(3000);
		//get Delete message popup.
		//String msg = driver.findElement(By.xpath("//td[@id='deleteAttention']")).getText();
		//System.out.println(msg);
		//click on delete pop up.
		//driver.findElement(By.xpath("//input[@id='deleteButton']")).click();
		Thread.sleep(3000);
		//logout form actiTime and close the browser.
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		driver.close();
	}

	
	static String createActiTask(WebDriver driver, int i) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Create Tasks']")).click();
		driver.findElement(By.xpath("//select[@name='customerId']")).sendKeys("Vishnu");
		driver.findElement(By.xpath("//select[@name='projectId']")).sendKeys("ROCKON");
		driver.findElement(By.xpath("//input[@id='task[0].name']")).sendKeys("Task"+i);
		driver.findElement(By.xpath("//input[@id='task[0].budgetedTimeStr']")).sendKeys("3:00");
		driver.findElement(By.xpath("//img[@id='ext-gen7']")).click();
		driver.findElement(By.xpath("//a[@class='x-date-date']")).sendKeys("Sep 27, 2018");
		driver.findElement(By.xpath("//select[@id='task[0].billingType']")).sendKeys("Billable");
		driver.findElement(By.xpath("//input[@id='task[0].markedToBeAddedToUserTasks']")).click();
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		Thread.sleep(3000);
		return null;
	}





}
