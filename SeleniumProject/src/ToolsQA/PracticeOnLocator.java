package ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOnLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("partial test passed");
		
		Thread.sleep(2000);
		
		driver.manage().timeouts();
		
		
		

		Thread.sleep(2000);
		
		

		

	}

}
