package SeleniumClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadUsingRobot {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://wordtojpeg.com/");
		driver.findElement(By.xpath("//div[@id='pick-files']")).click();
		
		//Using StringSelection to take path into clipboard
		StringSelection stringSelection = new StringSelection("C:\\Users\\vishn\\Desktop\\test.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		//Using Robot with KeyEvents
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='download-all']")));
		boolean b = driver.findElement(By.xpath("//button[@id='download-all']")).isEnabled();
		if(b)
		System.out.println("FileUpload Pass");
		else
		System.out.println("FileUpload Fail");
		driver.close();
}
}
