import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/List_of_countries_by_GDP_(nominal)");
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='wikitable']/descendant::table[1]/tbody/tr"));
		List<WebElement>cols=driver.findElements(By.xpath("//table[@class='wikitable']/descendant::table[1]/tbody/tr[2]/td"));
		
		for(int i=2; i<rows.size(); i++) {
			for(int k=1; k<cols.size(); k++) {
				
				System.out.print(driver.findElement(By.xpath("//table[@class='wikitable']/descendant::table[1]/tbody/tr[" +i+ "]/td[ "+k+ "]")).getText());
				
			}
			
			System.out.println(" ");
		}
		
	}

}
