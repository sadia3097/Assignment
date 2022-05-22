package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.HooksClass;

public class LoginPage {
	
	WebDriver driver = HooksClass.driver;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement loginbutton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void user_navigated_to_login_page() {
		driver.get(HooksClass.url);
	    driver.manage().window().maximize();
	}
	
	public void enter_Username_and_password()  {
	    username.sendKeys(HooksClass.username);
	    password.sendKeys(HooksClass.password);
	    loginbutton.click();
	}
	
	

}
