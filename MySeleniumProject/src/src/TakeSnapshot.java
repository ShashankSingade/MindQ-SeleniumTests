package src;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class TakeSnapshot {
	
	
	public static String getRandomString(int length){
		StringBuilder sb = new StringBuilder();
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		for (int i=0;i<length;i++)
		{
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
	
		return sb.toString();
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		String Chromepath = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chromepath);
		
		WebDriver driver = new ChromeDriver();;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String baseURL = "https://www.expedia.co.in/";
		driver.get(baseURL);
				
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		
		WebElement Origin = driver.findElement(By.id("flight-origin-hp-flight"));
		WebElement Destination = driver.findElement(By.id("flight-destination-hp-flight"));
		WebElement DepartingDate = driver.findElement(By.id("flight-departing-hp-flight"));
		WebElement ReturningDate = driver.findElement(By.id("flight-returning-hp-flight"));
		WebElement Search = driver.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']"));
	
		Thread.sleep(2000);
		Origin.sendKeys("Mumbai");
		Thread.sleep(2000);
		Destination.sendKeys("Mumbai");
		Thread.sleep(2000);
		DepartingDate.sendKeys("31/07/2019");
		Thread.sleep(2000);
		ReturningDate.sendKeys("31/08/2019");
		Search.click();
		
		String fileName = getRandomString(12) + ".jpeg";
		String directory = "\\MySelenium_workspace\\Udemy Sample Programs\\Snapshots\\";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sourceFile, new File(directory + fileName));
		driver.quit();
	}

}
