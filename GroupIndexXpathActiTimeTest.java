package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupIndexXpathActiTimeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8090/login.do");
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("pwd")).sendKeys("user1");
		driver.findElement(By.id("loginButton")).click();
		
		//GI: to get 3rd element 
		String e = driver.findElement(By.xpath("(//div[@class='popup_menu_arrow'])[3]")).getAttribute("value");
		System.out.println(e);
		
		//GI: to get 5th link 
		String l = driver.findElement(By.xpath("(//a)[5]")).getText();
		System.out.println(l);
		
		//GI: to get diff between //a links and (//a)[2] link
		List<WebElement> ele1 = driver.findElements(By.xpath("//a"));
		System.out.println("//a link count : "+ele1.size());
		
		List<WebElement> ele2 = driver.findElements(By.xpath("(//a)[2]"));
		System.out.println("(//a)[2] link count : "+ele2.size());
		
		//GI to get last link
		String ll = driver.findElement(By.xpath("(//a)[last()]")).getText();
		System.out.println(ll);
		
		//GI to get last but one (last()-1) link
		String ll_1 = driver.findElement(By.xpath("(//a)[last()-1]")).getText();
		System.out.println(ll_1);
		
		//GI to get last but one (last()-21) link
		String ll_21 = driver.findElement(By.xpath("(//a)[last()-21]")).getText();
		System.out.println(ll_21);
		
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		
		
	}

}
