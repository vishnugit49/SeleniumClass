package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.beans.property.SetProperty;

public class LocatorsTest2 {
	public static void main(String arg[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\LinkPage.html");
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.id("i1")).click();
		driver.findElement(By.name("n1")).click();
		driver.findElement(By.className("c1")).click();
		driver.findElement(By.linkText("Google")).click();
		driver.findElement(By.partialLinkText("oogle")).click();
		driver.findElement(By.xpath("//*[@id='i1']")).click();
		driver.findElement(By.cssSelector("a[id='i1']")).click();
		driver.findElement(By.cssSelector("#i1")).click();
		driver.close();
	}

}
