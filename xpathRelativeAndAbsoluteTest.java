package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathRelativeAndAbsoluteTest {
	public static void main(String arg[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\GCVSEL\\GCVJAVA\\src\\SeleniumClass\\xpathRelativeAbsoulteTest.html");
	
	System.out.println("Absolute xpath:");
	String A1 = driver.findElement(By.xpath("/html/body/div[1]/input[1]")).getAttribute("value");
	String A2 = driver.findElement(By.xpath("/html/body/div[1]/input[2]")).getAttribute("value");
	String A3 = driver.findElement(By.xpath("/html/body/div[2]/input[1]")).getAttribute("value");
	String A4 = driver.findElement(By.xpath("/html/body/div[2]/input[2]")).getAttribute("value");
	System.out.println(A1+" "+A2+" "+A3+" "+A4);
	
	System.out.println("Relative xpath:");
	String B1 = driver.findElement(By.xpath("//div[1]/input[1]")).getAttribute("value");
	String B2 = driver.findElement(By.xpath("//div[1]/input[2]")).getAttribute("value");
	String B3 = driver.findElement(By.xpath("//div[2]/input[1]")).getAttribute("value");
	String B4 = driver.findElement(By.xpath("//div[2]/input[2]")).getAttribute("value");
	System.out.println(A1+" "+A2+" "+A3+" "+A4);
	

	Thread.sleep(3000);
	driver.close();
	}

}
