package udemyLessons;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigation {
	
	String baseURL;
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		String chromePath = "C:\\MySelenium_workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		baseURL = "https://learn.letskodeit.com/";
		}

	@Test
	public void test() {
		driver.get(baseURL);
		
		
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
