package src;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		String chromepath = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		String baseURL = "https://jqueryui.com/droppable/";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(baseURL);
		Thread.sleep(3000);
		
		//Since the webelements drag and drop are in an iFrame, make sure you switch the frame.
		driver.switchTo().frame(0);
		
		WebElement fromElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement toElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions draganddrop = new Actions(driver);
		
		draganddrop.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
