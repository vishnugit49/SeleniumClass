package SeleniumClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestListOptionsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
		//Note: To find/inspect type right right click on the corner area to get source.
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
		
		//List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		
		System.out.println(ele.size());
		for(int i = 0; i<ele.size(); i++)
		{
				System.out.println(ele.get(i).getText());
				if(ele.get(i).getText().contains("ide"))
				{
					ele.get(i).click();
				}
		}
		Thread.sleep(5000);
		driver.close();
		
	}

}
