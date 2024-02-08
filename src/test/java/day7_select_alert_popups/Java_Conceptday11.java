package day7_select_alert_popups;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Conceptday11 {
	
	
	public static void main(String[] args) {
		System.out.println(ConcattwoStrings("Hi ", "bud"));
	}
	
	
	
	public static String ConcattwoStrings(String A, String b) {
		
		return A.concat(b);
		};
	
	
		
		 
		//create a method that accepts webElement and clicks on the WebElement
		
	public static void clicksFunctions (WebElement element ) {
		
	}
	
	//create a method that accepts a webelement and a input string that types the string to the webelement
	
	
	public static void SendtStringtoElement (WebElement element, String input ) {
		
	element.click();
	
		}
	
	//create a method that accepts a webelement and returns the text of the webelement as a string
	
	public static String GetTextOfEl (WebElement element ) {
		return element.getText();
		
	}
	
	
	}
