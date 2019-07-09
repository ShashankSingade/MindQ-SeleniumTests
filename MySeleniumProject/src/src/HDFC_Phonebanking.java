package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HDFC_Phonebanking {

	public static void main(String[] args) throws InterruptedException {

		String Chrome_Path = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chrome_Path);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/find-your-nearest/find-phone-banking");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(4,TimeUnit SECONDS);
		
		driver.findElement(By.xpath("//select[@id='state']"));
		Select State = new Select(driver.findElement(By.id("state")));
		State.selectByValue("Assam");
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//select[@id='city']"));
		Select City = new Select(driver.findElement(By.name("city")));
		City.selectByVisibleText("Barama");
		
		driver.findElement(By.xpath("//img[@id='display']")).click();
		
	}	
}

		
		
		
		
		
		
		
		
		
		
	
