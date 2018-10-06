package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllCheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\CheckBoxesWebPage.html");
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(ele.size());
		for(int i=0;i<ele.size();i++)
		{
			System.out.println(ele.get(i).getAttribute("value"));
		}
		driver.close();
		
	}

}
