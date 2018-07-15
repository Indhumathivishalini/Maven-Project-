package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class LoginPage extends PreAndPost {

	public LoginPage(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="//input[@id='username']")
	WebElement eleusername;
	
	public  LoginPage typeUsername() {

		type(eleusername, "DemoSalesManager");
		return this;
	}
	
	@FindBy(id="//input[@id='username']")
	WebElement elepassword;

	public LoginPage typePassword() {

		type(elepassword, "crmsfa");
		return this;
	}
	
	@FindBy(className ="decorativeSubmit")
	WebElement eleclick;
	
	public MyHome clickLoginbtn() {
		eleclick.click();
		return new MyHome(driver, test);
	}


}
