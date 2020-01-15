import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class WebPage {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(4000);
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("rigid vacuum");
			
			Thread.sleep(4000);
			
			driver.findElement(By.className("nav-input")).click();
			
			driver.findElement(By.linkText("WOODRIVER")).click();
			
			driver.get("https://google.com/");
			
			Thread.sleep(4000);
			
			driver.navigate().back();
			
			driver.quit();
			
			
			
			
			

	}

}
