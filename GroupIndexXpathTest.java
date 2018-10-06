package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupIndexXpathTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\GroupIndexWebPage.html");
		//GI: To get 2 input value
		String GI = driver.findElement(By.xpath("(//input)[2]")).getAttribute("value");
		System.out.println(GI);
		
		//GI: To get last input value
		String GIL = driver.findElement(By.xpath("(//input)[last()]")).getAttribute("value");
		System.out.println(GIL);
		
		//GI: To get first input value
		String GIL_1 = driver.findElement(By.xpath("(//input)[last()-1]")).getAttribute("value");
		System.out.println(GIL_1);
				
		driver.close();
	}

}
