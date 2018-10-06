package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCoordinatesAndSizeOfTextBoxTest {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\FirstToSecondCopyAndPasteTestWebPage.html");
	WebElement ele = driver.findElement(By.xpath("//input[1]"));
	
	Point p = ele.getLocation();
	System.out.println(p.x);
	System.out.println(p.y);
	
	Dimension d = ele.getSize();
	System.out.println(d.getWidth());
	System.out.println(d.getHeight());
	
	
	
	}

}
