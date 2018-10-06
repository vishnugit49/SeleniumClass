package SeleniumClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleCloseSpecificBrowserTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Note: Some time it is not working 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		String mw = driver.getWindowHandle();
		
		Set<String> AW = driver.getWindowHandles();
		int count = AW.size();
		System.out.println(count);
		for(String W : AW)
		{
			if(!W.equals(mw))
			{
				driver.switchTo().window(W);
				if(driver.getTitle().equals("Amazon"))
				{	
					System.out.println(driver.getTitle());
					System.out.println(W);
					driver.close();
				}
			}
		}
		driver.quit();
	}

}
