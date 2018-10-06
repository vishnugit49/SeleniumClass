package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingInXpathTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\TraversingXpathWebPage.html");
		
		//Forward Traversing
		
		//xpath Traversing from table to subject. 
		String sub = driver.findElement(By.xpath("//table[@id='t1']/tbody/tr[1]/td[1]")).getText();
		System.out.println(sub);
		
		//xpath Traversing from table to java.
		String jav = driver.findElement(By.xpath("//table[@id='t1']/tbody/tr[2]/td[1]")).getText();
		System.out.println(jav);
		
		//Backword Traversing 
		
		//xpath Traversing Subject to table
		String tbl = driver.findElement(By.xpath("//td[text()='Subject']/../..")).getText();
		System.out.println("Table FirstTime"+"\n"+tbl);
		//xpath Traversing Java to table
		String tbl1 = driver.findElement(By.xpath("//td[text()='Java']/../..")).getText();
		System.out.println("Table SecondTime"+"\n"+tbl1);
		
		driver.close();
	}

}
