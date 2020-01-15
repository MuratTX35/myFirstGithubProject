import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckbox {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
        

			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.mortgagecalculator.org/");
			
			String elm=driver.findElement(By.xpath("//h3[contains(text(),'$1,401.63')]")).getText();
			
			System.out.println("Total Monthly Payment: "+elm);
			
			String elm2=driver.findElement(By.xpath("//h3[contains(text(),'PMI')]")).getText();
			
			System.out.println(elm2+" not required");
			
			String str=driver.findElement(By.xpath("//h3[contains(text(),'$60,000.00')]")).getText();
			
			System.out.println("Down payment amount: "+ str);
			
			String str1= driver.findElement(By.xpath("//h3[contains(text(),'20.00%')]")).getText();
			
			System.out.println("Down payment : "+ str1);
			
			String str2=driver.findElement(By.xpath("//h3[contains(text(),'Nov, 2049')]")).getText();
			
			System.out.println("Loan pay-off date :"+ str2);
			
			String str3=driver.findElement(By.xpath("//h3[contains(text(),'$162,587.15')]")).getText();
			
			System.out.println("Total Interest Paid: "+ str3);
			
			
			
		
		
	}

}
