package SeleniumClass;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeAndMoveBrowser {
	public static void main(String arg[]) {
		WebDriver driver = new FirefoxDriver();
		
		//Dimension d = new Dimension(420,600);
		//driver.manage().window().setSize(d);
		
		Point newPoint = new Point(300, 500);
		driver.manage().window().setPosition(newPoint);
		
	}
}
