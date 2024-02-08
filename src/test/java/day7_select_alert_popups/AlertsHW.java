package day7_select_alert_popups;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsHW {

	public static void main(String[] args) {
		ClickMe ();
		//Homework2();
		//nestedIframe();
	}
		public static void ClickMe () {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demoqa.com/browser-windows");
	String MainPageTitle = driver.getTitle();
	
	String MainWindowID = driver.getWindowHandle();
	
	System.out.println("Main Window ID: "+MainWindowID);
	
	driver.findElement(By.id("tabButton")).click();
		
	Set <String> SetsOfID = driver.getWindowHandles();
		
		Iterator<String> iterator = SetsOfID.iterator();
		
		String firstWindowId = iterator.next();
		
		System.out.println("First window Id: "+ driver.getWindowHandle());
		
		String SecondWindowId = iterator.next();
		
			driver.switchTo().window(SecondWindowId);
			
		System.out.println ("Second Window Id: " + driver.getWindowHandle());
		
		if(driver.findElement(By.id("sampleHeading")).getText().equals("This is a sample page")){
			System.out.println("Text is a MATCH");
		}else {
			System.out.println("NO MATCH");
		}
	driver.close();
	driver.switchTo().window(firstWindowId);
	
	if(MainPageTitle.equals(driver.getTitle())) {
		System.out.println("you are on MAIN WINDOW");
	}else {
		System.out.println("WRONG");
	}
	
	
	
	driver.close();
	}
	
		public static void Homework2() {
			
		WebDriver driver2 = new ChromeDriver();
		
		driver2.manage().window().maximize();
		
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver2.get("http://demo.guru99.com/popup.php");
		
		String MainpTitle = driver2.getTitle();
		
		System.out.println("This is first window ID: "+ driver2.getWindowHandle());
		
		System.out.println(MainpTitle);
		
		driver2.findElement(By.linkText("Click Here")).click();
		
		Set<String> WindowsId = driver2.getWindowHandles();
		
		Iterator <String> iterator2 = WindowsId.iterator();
		
		String FirstWindow = iterator2.next();
		
		String SecondWindowId = iterator2.next();
		;
		driver2.switchTo().window(SecondWindowId);
		
		System.out.println(driver2.getTitle());
		
		driver2.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Johndoe1@gmail.com");
		
		driver2.findElement(By.name("btnLogin")).click();
		
		String UserIDBox =	driver2.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		
			System.out.println("this is user id  "+ UserIDBox);

		}
	
		public static void nestedIframe() {
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			
			// go to https://demoqa.com/nestedframes
				driver.get("https://demoqa.com/nestedframes");
			
			// get the main content text
				WebElement Maintext = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page.')]"));
				
			System.out.println(Maintext.getText());
			// switch to parent frame and get the text
			driver.switchTo().frame("frame1");
			//driver.switchTo().frame(driver.findElement(By.id("frame1")));
			
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Parent frame')]")));
				
				
				
				
		String FrameParentText = driver.findElement(By.xpath("//*[contains(text(),'Parent frame')]")).getText();
		
			System.out.println(FrameParentText);
			
				if(FrameParentText.equals("Parent frame")) {
					System.out.println("Parent Frame GOOD");
				}else {
				System.out.println("NOT parent frame");
				}
			// switch to child frame and get the text 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Child Iframe')]")));
		
			String ChildFrameText = driver.findElement(By.xpath("//*[contains(text(),'Child Iframe')]")).getText();
			
			System.out.println(ChildFrameText);
			
			// switch back to parent frame and get the text (print)
				driver.switchTo().parentFrame();
				
				String FrameParentText2 = driver.findElement(By.xpath("//*[contains(text(),'Parent frame')]")).getText();
				
				System.out.println(FrameParentText2);

				driver.switchTo().defaultContent();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Sample Nested Iframe page.')]")));
				
				WebElement Maintext1 = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page.')]"));
				
				System.out.println(Maintext1.getText());
				
				driver.close();
		}
	
	
}



