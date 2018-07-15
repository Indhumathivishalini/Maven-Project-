package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class MyHome extends PreAndPost{

	public MyHome(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "CRM/SFA" )
	WebElement eleclick;
	public Mylead clickleadbtn() {

		eleclick.click(); 
		return new Mylead(driver, test);

	}

}
