/**
 * 
 */
package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author shashank
 *
 */
public class LaunchChromeBrowser {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		String Chrome_path = "C:\\MySelenium_workspace\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",Chrome_path);

WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");

driver.manage().window().maximize();

Thread.sleep(4000);

driver.findElement(By.name("firstname")).clear();
driver.findElement(By.name("firstname")).sendKeys("Robert");

driver.findElement(By.id("u_0_n")).clear();
driver.findElement(By.id("u_0_n")).sendKeys("Keller");





	}

}
