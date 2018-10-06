package SeleniumClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MuliSelectDeSelectTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\MultiSelectListBoxWebPage.html");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='s1']")));
		//GetOptions and print count
		List<WebElement> allopt = select.getOptions();
		System.out.println(allopt.size());
		
		//select and deselect all the options.
		for(int i=0;i<allopt.size();i++)
		{
			select.selectByIndex(i);
		}
		Thread.sleep(3000);
		select.deselectAll();
		
		//select and deselect in reverse order and without usingn deselectAll
		int count = allopt.size();
		
		for(int i=count-1; i>=0; i--)
		{
			select.selectByIndex(i);
		}
		Thread.sleep(2000);
		for(int i=count-1; i>=0; i--)
		{
			select.deselectByIndex(i);
		}
		Thread.sleep(2000);
		
		driver.close();
	}

}
