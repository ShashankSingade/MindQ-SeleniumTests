package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HDFC_Locator {

	public static void main(String[] args) throws InterruptedException {

		String Chrome_Path = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chrome_Path);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		/*
		driver.findElement(By.xpath(("span[@class='mainlink'])[19]"))).click();
		@FindBy(xpath = "//span[contains(.,'Locate Us')]")
		driver.findElement(By.linkText("Branch and ATM")).click(); */
		
		Select state = new Select(driver.findElement(By.id("customState")));
		state.selectByValue("telangana");
		
		Thread.sleep(3000);
		
		Select city = new Select(driver.findElement(By.name("cityName")));
		city.selectByVisibleText("Hyderabad");
		Thread.sleep(3000);
		
		driver.findElement(By.name("localityName")).clear();
		driver.findElement(By.name("localityName")).sendKeys("Champapet");

		Select searchRadius = new Select(driver.findElement(By.id("customRadius")));
		searchRadius.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@id='amenity_category_order_types49']")).click();
		driver.findElement(By.xpath("//input[@id='amenity_service_types52']")).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
		
		
		
		
		
	}

	

	}


