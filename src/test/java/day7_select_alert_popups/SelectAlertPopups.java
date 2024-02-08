package day7_select_alert_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAlertPopups {

	public static void main(String[] args) {
		selectDemo();
	}
	
	public static void selectDemo() {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://Amazon.com");
		WebElement allDept = driver.findElement(By.id("searchDropdownBox"));
		Select letsSelect = new Select(allDept);
		
		letsSelect.selectByVisibleText("Home & Kitchen");
	}
}
