package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathToFindImgAndLinksTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> li = driver.findElements(By.xpath("//a|//img"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
		}
		driver.close();
		
		
	}

}
