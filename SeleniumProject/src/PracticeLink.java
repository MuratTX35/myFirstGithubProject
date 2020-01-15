import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLink {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://wikipedia.org/");
		
		driver.findElement(By.linkText("Download Wikipedia for Android or iOS")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("View source")).sendKeys("hello");
		

		/*Thread.sleep(2000);
		
		driver.findElement(By.linkText("View history")).click();
		

		Thread.sleep(2000);
		
		driver.close();
		
		driver.quit();*/
		

	}

}
