import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) throws InterruptedException {
		
			  
			  System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			  
			  ChromeDriver driver= new ChromeDriver();
				  
			  driver.get("https://google.com");
			  
			  driver.manage().window().maximize();
			  
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("naber");
			
		}

	}


