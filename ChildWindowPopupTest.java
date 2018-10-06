package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindowPopupTest {

	private static final String ExpcectedConditions = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://wordpress.com/log-in?redirect_to=http%3A%2F%2Fabodeqa.wordpress.com%2F");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Continue with Google']")));
		
		driver.findElement(By.xpath("//button[@class='social-buttons__button button']")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']")));
		
		
		String mw = driver.getWindowHandle();
		
		for (String cw : driver.getWindowHandles()) {
			  //If window handle is not main window handle then close it 
			  if(!cw.equals(mw)){
			  driver.switchTo().window(cw);
			  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("VISHNU123");
			  Thread.sleep(3000);
			  driver.close(); 
			  }
			}
		driver.switchTo().window(mw);
		driver.close();
			
				
	}

}
