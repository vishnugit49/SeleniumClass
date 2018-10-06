package SeleniumClass;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBoxText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.plus2net.com/contactus.php");
		WebElement ele = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sel = new Select(ele);
		sel.selectByValue("India");
		Thread.sleep(3000);
		sel.selectByIndex(21);
		Thread.sleep(3000);
		sel.selectByVisibleText("Albania");
		Thread.sleep(3000);
		driver.close();
	

		
	}

}
