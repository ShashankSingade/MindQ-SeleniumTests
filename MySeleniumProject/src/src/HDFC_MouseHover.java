package src;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HDFC_MouseHover {

	public static void main(String[] args) throws InterruptedException {
	
		String Chromepath = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chromepath);
		//JavascriptExecutor jse;
	
		
		String baseURL = "https://www.hdfcbank.com/";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
		Thread.sleep(5000);
		//jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,600)");
		
	//	Alert alert = driver.switchTo().alert();
	//	alert.dismiss();
		
	//	WebElement popup = driver.findElement(By.xpath("//img[@class='popupbanner at-element-click-tracking']"));		
	
		
		//img[@class='popupbanner at-element-click-tracking']
		
		WebElement LocateusTab = driver.findElement(By.xpath("//span[contains(text(),'Locate Us')]")); 
		Actions location = new Actions(driver);
		location.moveToElement(LocateusTab).perform();
		
		WebElement BranchandATM = driver.findElement(By.xpath("//a[contains(text(),'Branch and ATM')]"));
		location.moveToElement(BranchandATM).click().perform();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
