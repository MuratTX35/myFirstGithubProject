import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoPractice {

	public static void main(String[] args)  {
        
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='First Name']")).sendKeys("john");
		
		
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Last Name']")).sendKeys("Akay");
		
		
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("2404 Larimar Dr. Dallas Texas");
		
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("eakayyy@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("716 262 9936");
		
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		
		List<WebElement> languages=driver.findElements(By.tagName("a"));
		
		
		for(int i = 0; i < languages.size(); i++) {
			if(languages.get(i).getText().equalsIgnoreCase("english")) {
			languages.get(i).click();
			}
			
		}
		
		List<WebElement>skills= driver.findElements(By.tagName("option"));
		
		for(int i=0; i<skills.size(); i++) {
			
			System.out.println(skills.get(i).getAttribute("value"));
			
			if(skills.get(i).getAttribute("value").equals("APIs")) {
				skills.get(i).click();
				break;
			}
		}
			List<WebElement>country=driver.findElements(By.tagName("option"));
			
			for(int a=0; a<country.size(); a++) {
				
				if(country.get(a).getAttribute("value").equals("Turkey")) {
					country.get(a).click();
					break;
					
				}
			}
				
			
			driver.findElement(By.id("countries")).click();			
			Select dropCountries = new Select(driver.findElement(By.id("countries")));
			dropCountries.selectByVisibleText("Turkey");						
			
			driver.findElement(By.id("countries")).click();
			
			
			
	
	}
}
