import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		  
		  ChromeOptions options= new ChromeOptions();
		  
		  options.setHeadless(true);
		  
		  WebDriver driver=new ChromeDriver(options);
			   driver.get("https://google.com");
		 
		  System.out.println(driver.getTitle());
		

	}

}
