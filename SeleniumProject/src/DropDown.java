import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	        

			WebDriver driver=new ChromeDriver();
			driver.get("https:/www.wikipedia.org/");
			
			List<WebElement>languages= driver.findElements(By.tagName("option"));
			
			for(int i=0; i<languages.size(); i++) {
				
				System.out.println(languages.get(i).getAttribute("value"));
				
				if(languages.get(i).getAttribute("value").equals("la")) {
					languages.get(i).click();
					break;
				}
				
			}
			
	}

}
