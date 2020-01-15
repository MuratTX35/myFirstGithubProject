import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomework {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("computer");
		
		Thread.sleep(2000);
		
		List<WebElement>suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li/descendant::div[@class='sbl1']"));
		
		/*for(WebElement suggestion: suggestions) {
			System.out.println(suggestion.getText());
		}*/
		
		for(int i=0; i<list.size(); i++) {
			
		}

	}

}
