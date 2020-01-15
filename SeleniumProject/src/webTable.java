import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupz");
		
		int rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		int cols=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		
		System.out.println("number of rows: "+ rows+"number of cols : "+ cols);
		
		for(int i=2; i<=rows; i++) {
			for(int j=1; j<=cols; j++) {
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" +i+ "]/td[" +j+ "]")).getText());
				
			}
		}
			
				System.out.println(" ");
		
	}

}
