package day7_select_alert_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utility_usage_demo {
	
	public static void main(String[] args) {
		
		AlertUtildemo();
		
	}
	
	public static void AlertUtildemo() {
		
			//go to https://demoqa.com/alerts
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
				//Click on the first 'Click me'  button and Accept the alert.
		driver.findElement(By.id("alertButton")).click();
		
				
				// let's wait the alert to be present first, then interact with it
				//wait.until()
				// now it's time to handle the alert
				
				// accept is for anything confirmative like: Yes, Okay, Confirm, Accept etc....
		
		
	}

}
