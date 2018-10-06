package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileUploadPopUpTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='file-upload']"));
		ele1.sendKeys("C:\\Users\\vishn\\Documents\\TestFile.txt");
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='uploaded-files']"));
		String s = ele2.getText();
		if(s.equals("TestFile.txt"))
		{
			System.out.println("File Upload Success");
		}
		else
		{
			System.out.println("File Upload Fail");
		}
		driver.close();
					
	}

}
