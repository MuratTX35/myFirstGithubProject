import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https:/www.facebook.com");
			
			/*WebElement elm=driver.findElement(By.id("month"));
			Select select=new Select(elm);
			select.selectByVisibleText("Mar");
			
			WebElement elm1=driver.findElement(By.id("day"));
			Select select1=new Select(elm1);
			select1.selectByVisibleText("10");
			
			WebElement elm2=driver.findElement(By.id("year"));
			Select select2=new Select(elm2);
			select2.selectByVisibleText("2000");*/
			
			WebElement month= driver.findElement(By.id("month"));
			DropDown(month,"Mar");
			
		
		
	}

	public static void DropDown(WebElement element, String value) {
		
		Select select=new Select(element);
		select.selectByVisibleText(value);
		
		
				
		
	}
	
}
