package src;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
	
		String chromepath = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		
		String baseURL = "https://learn.letskodeit.com/p/practice";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		boolean isChecked = false;
	//	List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'radio')]"));
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@name,'cars')]"));
		int size = radioButtons.size();
		
		
		for (int i=0;i<size;i++)
		{
			isChecked = radioButtons.get(i).isSelected();
			
			if(!isChecked)
			{
				radioButtons.get(i).click();
				Thread.sleep(3000);
			}
			
		}
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
