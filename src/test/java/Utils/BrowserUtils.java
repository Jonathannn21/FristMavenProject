package Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

	
	static Alert alert;
	WebDriverWait wait;
	Actions act;
	Select select;
	JavascriptExecutor js;
	
	
	
	
	
	//create a utility method that accepts Alerts
	//create a method that has a webdriver as parameters and does the alert accept 
	
	public static void AcceptAler(WebDriver driver ) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}
	
	//create a utility method that accepts Alerts
		//create a method that has a webdriver as parameters and does the alert accept 
		
		public static void AlertSendKeys(WebDriver driver, String input ) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(input);
			
		}
		
		//create a utility method that gets the text of the alert and returns it 
		
		public static String AlertGettext(WebDriver driver ) {
		alert = driver.switchTo().alert();
		return alert.getText();
		
		
		}
		
		
		public void Selecteithtext(WebElement dropdown, String option) {
			select = new Select(dropdown);
			select.selectByVisibleText(option);
			
		}
		
		
}


