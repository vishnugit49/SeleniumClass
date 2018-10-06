package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement source1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target1 = driver.findElement(By.xpath("//div[@id='droppable']"));
		String chk1 = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println("BeforeDrap: "+chk1);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source1, target1).perform();
		String chk2 = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println("AfterDrap: "+chk2);
		Thread.sleep(4000);
		driver.close();

	}
}
