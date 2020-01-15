import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BankOfAmerica {

	public static void main(String[] args) throws InterruptedException {
		


        System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
        

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bankofamerica.com/mortgage/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("purchase-price-input-medium")).clear();
		
		
		
		driver.findElement(By.id("purchase-price-input-medium")).sendKeys("300000");
		
		
		
		driver.findElement(By.id("down-payment-input-medium")).clear();
		
		
		driver.findElement(By.id("down-payment-input-medium")).sendKeys("40000");
		
		
		
		driver.findElement(By.id("zip-code-input-medium")).clear();
		
		
		
		driver.findElement(By.id("zip-code-input-medium")).sendKeys("76227");
		
		driver.findElement(By.id("update-button-medium")).click();
		
		
		String rate = driver.findElement(By.xpath("//div[@class='row grayscaletrue' and @data-product-name='Fixed 30 Years']/div//descendant::span[2]")).getText();
		
		System.out.println("Rate = "+ rate);
		
		String payment = driver.findElement(By.xpath("//div[@class='row grayscaletrue' and @data-product-name='Fixed 30 Years']/div[5]/descendant::span[@class='update-partial']")).getText();
		
		System.out.println(payment);
		//$x("//div[@class='row grayscaletrue' and @data-product-name='Fixed 30 Years']/div[5]/descendant::span[@class='update-partial']")
	
	driver.close();
	driver.quit();
	}

}
