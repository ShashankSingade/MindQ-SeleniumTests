package src;

//import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleOptions {

	public static void main(String[] args) throws InterruptedException {
		
		
		String chromepath = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		
		String baseURL = "https://learn.letskodeit.com/p/practice"; 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		
		Select fruits = new Select(driver.findElement(By.id("multiple-select-example")));
		
		Thread.sleep(2000);
		System.out.println("Select apple now");
		fruits.selectByValue("apple");
		
		Thread.sleep(2000);
		System.out.println("Deselect apple now");
		fruits.deselectByValue("apple");
		
		Thread.sleep(2000);
		System.out.println("Select Peach now");
		fruits.selectByVisibleText("Peach");
		
		Thread.sleep(2000);
		System.out.println("Select Orange now");
		fruits.selectByIndex(1);
		
		Thread.sleep(2000);
		System.out.println("The selected options from the fruit basked are as below: ");
		List<WebElement> selectedFruits = fruits.getAllSelectedOptions();
		
		for (WebElement options : selectedFruits){
			System.out.println(options.getText());
			}
		
		
		System.out.println("Deselecting all the options now.");
		fruits.deselectAll();
				
				
		
	}

	

}
