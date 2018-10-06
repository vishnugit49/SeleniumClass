package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		String tooltip = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")).getAttribute("title");
		System.out.println(tooltip);
		driver.close();
		
//		driver.get("http://www.usa.com/");
//		WebElement ele = driver.findElement(By.xpath("//area[@href='/oregon-state.htm']"));
//		System.out.println(ele.getAttribute("title"));
	}

}
