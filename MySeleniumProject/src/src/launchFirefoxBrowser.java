package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefoxBrowser {

	public static void main(String[] args) {

String Firefox_path = "C:\\MySelenium_workspace\\geckodriver.exe";
System.setProperty("webdriver.gecko.driver", Firefox_path);

WebDriver driver = new FirefoxDriver();
driver.get("https://www.makemytrip.com");

driver.manage().window().maximize();

driver.findElement(By.name("fromCity")).click();
driver.findElement(By.name("fromcity")).sendKeys("Hyderabad");

driver.findElement(By.name("toCity")).click();
driver.findElement(By.name("tocity")).sendKeys("Mumbai");



	}

}
