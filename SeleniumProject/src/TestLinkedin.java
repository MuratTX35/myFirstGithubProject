

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLinkedin {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:/www.linkedin.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("nav__button-secondary")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("Eakayy@gmail.com");
		driver.findElement(By.id("password")).sendKeys("8172629936");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("btn__primary--large from__button--floating")).click();
		
		Thread.sleep(3000);
		
		WebElement signin= driver.findElement(By.className("btn__primary--large from__button--floating"));		
		
		Point point= signin.getLocation();
		
		System.out.println("X is : "+point.getX());
		System.out.println("Y is : "+point.getY());
		
		Dimension dim=signin.getSize();
		System.out.println(dim.height);
		System.out.println(dim.width);
	}
}
