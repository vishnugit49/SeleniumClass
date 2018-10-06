package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IE_DE_xpathSeleniumSiteTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//xpath to get IE and DE of Selenium website
		
		//xpath to get IE of Ruby.
		driver.get("https://www.seleniumhq.org/download/");
		String RubyVer = driver.findElement(By.xpath("//td[text()='Ruby']")).getText();
		System.out.println(RubyVer);
		
		//xpath to get DE of Java Version.
		String javaVer = driver.findElement(By.xpath("//td[text()='Ruby']/../../tr[1]/td[2]")).getText();
		System.out.println(javaVer);
		
		//xpath to get DE of JavaScript Version.
		String jsVer = driver.findElement(By.xpath("//td[text()='Ruby']/../../tr[5]/td[2]")).getText();
		System.out.println(jsVer);

		driver.close();
	}

}
