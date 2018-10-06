package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMulitListBoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://lab.iamrohit.in/php_ajax_country_state_city_dropdown/");
		//select[@name='country']
		//select[@name='state']
		//select[@name='city']
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select selc = new Select(country);
		selc.selectByVisibleText("India");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		Select sels = new Select(state);
		sels.selectByVisibleText("Karnataka");
		
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select selt = new Select(city);
		selt.selectByVisibleText("Chitradurga");
		
		driver.close();
	}

}
