import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:/www.ebay.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gh-ac")).sendKeys("Rigid vacuum");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("gh-btn")).click();

		WebElement signin = driver.findElement(By.linkText("Sign in"));
		
		signin.findElement(By.className("s-item__image-img")).click();
		
		
		
		Point point= signin.getLocation();
		
		int xcord=point.getX();
		int ycord=point.getY();
		
		System.out.println("Position of signin from left side is: "+ xcord+" pixels");
		System.out.println("Position of signin from left side is: "+ ycord+" pixels");
		
		
		

	}

}
