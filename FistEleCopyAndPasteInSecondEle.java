package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FistEleCopyAndPasteInSecondEle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Copy and Paste Using shortcuts.
		//driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\FirstToSecondCopyAndPasteTestWebPage.html");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL,"ac");
		//driver.findElement(By.xpath("//input[2]")).sendKeys(Keys.CONTROL,"v");
		
		//Copy and Paste Without using shortcuts
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\FirstToSecondCopyAndPasteTestWebPage.html");
		String v = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		driver.findElement(By.xpath("//input[2]")).sendKeys(v);
		
	}

}
