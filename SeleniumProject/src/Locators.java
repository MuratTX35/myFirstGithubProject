import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers.\\chromedriver.exe");
		
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://wwww.facebook.com");
		 
		  driver.findElement(By.className("nav__button-secondary")).sendKeys("my user id");
		 
		
		
		
		
		
	}

}
