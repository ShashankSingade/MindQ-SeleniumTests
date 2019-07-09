package src;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class List_SortingOrder {

	public static void main(String[] args) {
		String ChromePath = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		driver.manage().window().maximize();
		
		Select tools1 = new Select(driver.findElement(By.id("tools")));
		tools1.selectByVisibleText("Selenium");
				
		List<WebElement> myTools = tools1.getOptions();
		
		List actualList = new ArrayList();
		
		for(WebElement ele:myTools)
		{
			String data = ele.getText();
			actualList.add(data);
		}
			
		List temp = new ArrayList();
		
		temp.addAll(actualList);
		Collections.sort(temp);
		
		Assert.assertTrue(actualList.equals(temp));
		
	}

}