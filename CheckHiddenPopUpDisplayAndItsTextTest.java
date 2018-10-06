package SeleniumClass;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHiddenPopUpDisplayAndItsTextTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		
			try{
				WebElement ele = driver.findElement(By.xpath("//div[@class='active-month-holder']"));
		
				if(ele.isDisplayed())
				{
					System.out.println(ele.getText());
				}
				else
				{
					System.out.println("Not displayed");
				}
		
			}
			catch(NoSuchElementException e){
				System.out.println("Not Displayed...");
			}
			driver.close();
	}

}
