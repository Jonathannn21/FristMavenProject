package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	static WebDriver driver;
	
	public static WebDriver getDriver() {
		driver = new ChromeDriver();
		return driver;
		
	}
}
