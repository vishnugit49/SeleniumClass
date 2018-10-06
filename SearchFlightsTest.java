package SeleniumClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlightsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		WebElement source = driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']"));
		source.sendKeys("Bangalore, India (BLR)");
		source.sendKeys(Keys.ENTER);
		WebElement destination = driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']"));
		destination.sendKeys("Goa, India (GOI)");
		destination.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		driver.findElement(By.xpath("//td[@id='27/09/2018']")).click();
		driver.findElement(By.xpath("//input[@id='BE_flight_flsearch_btn']")).click();
		driver.close();

	}

}
