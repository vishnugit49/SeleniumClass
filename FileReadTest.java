package SeleniumClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileReadTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream("C:\\GCVSEL\\GCVJAVA\\src\\AwesomeJava\\PropSource\\vdata.properties");
		Properties prop = new Properties();
		prop.load(fi);
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(prop.getProperty("url"));
		driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(""+prop.get("username")+"");
		driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(""+prop.get("password")+"");
		driver.findElement(By.xpath(prop.getProperty("loginBtn_xpath"))).click();
		driver.close();
		
		}

}
