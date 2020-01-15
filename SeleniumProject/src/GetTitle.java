import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
				
				driver.get("https:/uscis.gov/");
				
				System.out.println(driver.getTitle());
				System.out.println(driver.getPageSource());
				System.out.println(driver.getCurrentUrl());
				
				WebElement search = driver.findElement(By.name("query"));
				System.out.println(search.getTagName());

				
						
						
	}

}
