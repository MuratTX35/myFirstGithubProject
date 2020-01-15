import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeSofindia {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.timesofindia.indiatimes.com/poll.cms");
		
		
		for(int i=0; i<4; i++) {
		
		String numbers = driver.findElement(By.id("mathq2")).getText();
		
		String[] arrayString=numbers.split("\\s");
		
		int num1=Integer.parseInt(arrayString[0]);  //bu islemle stringi integera ceviriyoruz
		int num2=Integer.parseInt(arrayString[2]);   //bu islemle stringi integera ceviriyoruz
		
		if(arrayString[1].contains("+")){  //islemin icinde toplama varsa bunu yap methodunu uyguluyoruz else if statements cikarma veya carpma islerimlerinide yapabiliriz
			System.out.println(num1 + num2);
			
			int sum= num1+num2;
			
			driver.findElement(By.name("mathuserans2")).sendKeys(String.valueOf(sum));
	
		
		}
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();
		}

	}

}
