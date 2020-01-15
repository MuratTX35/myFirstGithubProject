import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.facebook.com");
		
		driver.findElement(By.cssSelector("input#u_0_f")).sendKeys("test");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='u_0_h']")).sendKeys("soysadinizi giriniz");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='u_0_k']")).sendKeys("eakayy@gmail.com");
	}*/
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html");
		
	    

}
}