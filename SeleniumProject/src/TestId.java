import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestId {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://Facebook.com/");
		
		driver.findElement(By.id("u_0_f")).sendKeys("lutfen adinizi giriniz");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_h")).sendKeys("lutfen soyadinizi giriniz");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_k")).sendKeys("lutfen tel noyu giriniz");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_p")).sendKeys("lutfen passworkunuzu giriniz");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_a")).click();
		
		driver.quit();
		
		
	}

}
