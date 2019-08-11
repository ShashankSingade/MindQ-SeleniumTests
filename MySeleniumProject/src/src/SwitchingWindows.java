package src;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) throws InterruptedException {

		String chromepath = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		String baseURL = "https://learn.letskodeit.com/p/practice";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(baseURL);

		String parentWindow = driver.getWindowHandle();
		System.out.println("The parent window handle is: " + parentWindow);

		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles)

		{
			System.out.println("The current window handle is: " + handle);

			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				WebElement searchBox = driver.findElement(By.id("search-courses"));
				searchBox.clear();
				searchBox.sendKeys("Mac");
				Thread.sleep(3000);
				driver.close();
				break;
			}

		}

		// Switching back to parent window
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).sendKeys("Switching tested successfully");
		Thread.sleep(3000);
		driver.quit();

	}

}
