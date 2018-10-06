package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBoxTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\MultiSelectListBoxWebPage.html");
		
		WebElement mlist = driver.findElement(By.xpath("//select[@id='s1']"));
		Select msel = new Select(mlist);
		msel.selectByIndex(0);
		msel.selectByValue("IND");
		msel.selectByVisibleText("AUS");
		
		Thread.sleep(3000);
		//deselect by checking condition isMulti select.
		if(msel.isMultiple())
		{
			msel.deselectByIndex(1);
			msel.deselectByValue("IND");
			msel.deselectByVisibleText("AUS");
		}
		//Or we can use deselectAll to deselect all.
		msel.deselectAll();
		
		driver.close();
	}

}
