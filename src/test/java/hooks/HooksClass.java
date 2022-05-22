package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
	
	public static WebDriver driver;
	public static String url = "http://retailm1.upskills.in/admin/";
	public static String username = "admin";
	public static String password = "Admin@123";

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void close() {
		driver.quit();
	}

}
