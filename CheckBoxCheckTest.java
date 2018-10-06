package SeleniumClass;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxCheckTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:8090/login.do");

		WebElement ele = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		//Before CheckBox check
		System.out.println("Before Select");
		if(ele.isSelected())
		{
			System.out.println("ChekcBox is selected");
		}
		else
		{
			System.out.println("CheckBox is not selected");
		}
		
	
		System.out.println("After Select");
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		//After CheckBox check
		if(ele.isSelected())
		{
			System.out.println("ChekcBox is selected");
		}
		else
		{
			System.out.println("CheckBox is not selected");
		}
		
		driver.close();
		

	}

}
