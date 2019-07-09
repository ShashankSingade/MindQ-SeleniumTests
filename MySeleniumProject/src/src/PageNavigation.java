package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigation {

	public static void main(String[] args) throws InterruptedException {
		String chromepath = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);

		String baseURL = "https://learn.letskodeit.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

		String currentURL = driver.getCurrentUrl();
		System.out.println("The current launched URL is :" + currentURL);
		
		driver.navigate().to("https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1");
		System.out.println("The current launched URL is :" + driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("The current launched URL is :" + driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("The current launched URL is :" + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("test@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='user_password']")).clear();
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("testpassword");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary btn-md login-button']")).click();
		driver.navigate().back();
		driver.navigate().back();
		System.out.println("The current launched URL is :" + driver.getCurrentUrl());
		
		
		


	}

}
