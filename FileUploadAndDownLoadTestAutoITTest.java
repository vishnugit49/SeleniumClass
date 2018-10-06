package SeleniumClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadAndDownLoadTestAutoITTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://wordtojpeg.com/");
		driver.findElement(By.xpath("//div[@id='pick-files']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\GCVSEL\\AutoIT\\FileUpload.exe");
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='download-all']")));
		
		boolean enable = driver.findElement(By.xpath("//button[@id='download-all']")).isEnabled();
		if(enable)
		{
			System.out.println("FileUploadPass");
		}
		else
		{
			System.out.println("FileUploadFail");
		}
		
		driver.findElement(By.xpath("//button[@id='download-all']")).click();
		Thread.sleep(6000);
		Runtime.getRuntime().exec("C:\\GCVSEL\\AutoIT\\FileDelete.exe");
		driver.close();
	}

}
