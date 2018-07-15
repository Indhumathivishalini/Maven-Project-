package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class Mylead extends PreAndPost{ 

	public Mylead(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Leads']" )
	WebElement eleclick;
	
	public CreateLeadPage clickleadbtn() {

		eleclick.click(); 
		// return new CreateLeadPage(driver, test) ;
		return new CreateLeadPage() ;

	}
}
