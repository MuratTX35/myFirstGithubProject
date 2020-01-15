import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("http://testautomationpractice.blogspot.com/");
		 * 
		 * driver.switchTo().frame("frame-one1434677811");
		 * 
		 * driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Akay");
		 */
		
		driver.get("file:///C:/Users/eakay/OneDrive/Desktop/iframe.html");
		
		driver.switchTo().frame("register");
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Akay");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("bing");
		
		driver.findElement(By.name("q")).sendKeys("Akay");

	}

}
