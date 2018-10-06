package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHiddenDivisionTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();

		WebElement ele = driver.findElement(By.xpath("//div[@class='active-month-holder']"));
		System.out.println(ele.getText());
		
		driver.findElement(By.xpath("//td[@id='27/09/2018']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
