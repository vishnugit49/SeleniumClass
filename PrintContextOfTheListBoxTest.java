package SeleniumClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintContextOfTheListBoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\MultiSelectListBoxWebPage.html");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='s1']")));
		//GetOptions and print count
		List<WebElement> allopt = select.getOptions();
		
		System.out.println(allopt.size());
		
		for(int i=0; i<allopt.size(); i++)
		{
			WebElement option = allopt.get(i);
			System.out.println(option.getText());
		}
		
		driver.close();
	}

}
