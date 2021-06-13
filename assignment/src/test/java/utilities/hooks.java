package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	

		public static WebDriver driver;
		@Before
		public void webDriverInitialization(){
			System.setProperty("webdriver.chrome.driver", 
		    		"C:\\Users\\DivyaCM\\Desktop\\SDET classes\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		@After
		public void closeDriver(){
		driver.quit();
		}

	}

