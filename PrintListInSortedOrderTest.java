package SeleniumClass;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintListInSortedOrderTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\MultiSelectListBoxWebPage.html");
	
		Select select = new Select(driver.findElement(By.xpath("//select[@id='s1']")));
//Not complete......

		driver.close();
	}



}
