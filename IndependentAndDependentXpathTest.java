package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependentXpathTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\IE_DE_WebPage.html");
		//Independent Xpath to get Java
		String IE = driver.findElement(By.xpath("//td[text() = 'Java']")).getText();
		System.out.println(IE);
		
		//Common parent xpath for Java
		String CP = driver.findElement(By.xpath("//td[text()='Java']/..")).getText();
		System.out.println(CP);
		
		//Dependent xpath to get 500
		String DE = driver.findElement(By.xpath("//td[text()='Java']/../td[2]")).getText();
		System.out.println(DE);
		
		driver.close();
	}

}
