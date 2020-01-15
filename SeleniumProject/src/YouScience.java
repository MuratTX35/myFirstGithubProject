import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouScience {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youscience.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='https://app.youscience.com/login']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='c-input__field qa-login-email js-login-email']")).sendKeys("eakay@harmonytx.org");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='c-input__field pw qa-login-password js-login-password']")).sendKeys("6796112Ea35");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='c-group__item-container ng-binding']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='o-grid__item'][1]")).click();
		
	
	}
}
