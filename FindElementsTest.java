package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\CheckBoxAndLinkWebPage.html");
		
		//No of Links present in the web page.
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("No of Links: "+links.size());
		
		//No of Checkboxes present in the web page.
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input"));
		System.out.println("No of CheckBoxes: "+checkboxes.size());
		
		//Select all the checkboxes present in the web page.
		for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(10000);
		System.out.println("Select all the checkboxes present in the web page - PASS");
		//Unselect all the checkboxes present in the web page.
		for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(10000);
		System.out.println("Unselect all the checkboxes present in the web page - PASS");
		//Check first and last checkboxes in the web page.
		checkboxes.get(0).click();
		checkboxes.get(checkboxes.size()-1).click();
		Thread.sleep(10000);
		System.out.println("Check first and last checkboxes in the web page - PASS");
		//Unselect above selected checkboxes present in the web page.
		checkboxes.get(0).click();
		checkboxes.get(checkboxes.size()-1).click();
		Thread.sleep(10000);
		System.out.println("Unselect above selected checkboxes present in the web page - PASS");
		//Check first and last checkbox in the web page using GroupIndexing.
		driver.findElement(By.xpath("(//input)[1]")).click();
		driver.findElement(By.xpath("(//input)[last()]")).click();
		Thread.sleep(10000);
		System.out.println("Check first and last checkbox in the web page using GroupIndexing - PASS");		
		driver.close();
		
	}

}
