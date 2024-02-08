package day7_select_alert_popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDownHW1 {
	
	public static void main(String[] args) {
		//dropDownAmazon();
		VerifyAmazon();
	}

	public static void dropDownAmazon () {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://Amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement dropdownButt = driver.findElement(By.id("searchDropdownBox"));
	//dropdownButt.click();
	
	
	Select letsSelect = new Select(dropdownButt);
	List<WebElement> allDept = letsSelect.getOptions();
	System.out.println("dept avaialbe: " + allDept.size());
	System.out.println("");
	System.out.println(dropdownButt.getText());
	}

	
	
	public static void VerifyAmazon() {
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver1.get("https://Amazon.com");
		String AmazonHP = driver1.getTitle();
		System.out.println("you are on " + AmazonHP);
		WebElement dropDownB = driver1.findElement(By.id("searchDropdownBox"));
		Select letsSelect = new Select(dropDownB);
		String firstOpt = letsSelect.getFirstSelectedOption().getText();
			
			if(firstOpt.equals("All Departments")) {
				System.out.println("default choice is correct");
			}else {
				System.out.println("Wrong choice");
			}
			
			letsSelect.selectByVisibleText("Home & Kitchen");
			driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee Mug" + Keys.ENTER);
			
		String CoffeeMugTitle =	driver1.getTitle();
			System.out.println(CoffeeMugTitle);
			if(CoffeeMugTitle.contains("Amazon.com : Coffee Mug")) {
				System.out.println("Title is a MATCH");
			}else {
				System.out.println("not a match");
			}
			
			System.out.println(letsSelect.getFirstSelectedOption().getText());
			
	WebElement currentDept = driver1.findElement(By.xpath("//div[@id='nav-search-dropdown-card']"));	
			//System.out.println(currentDept.getText());
			
 
			if((letsSelect.getFirstSelectedOption().equals("Home & Kitchen"))) {
				System.out.println("MATCH");
			}else {
				System.out.println("No match");
			}
			
			
			
	}
			
		}
	
	
	
			
	
	
	
	

