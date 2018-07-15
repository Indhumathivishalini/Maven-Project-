package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class EditLeadPage extends WebDriverServiceImpl{

	public EditLeadPage(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "updateLeadForm_firstName")
	WebElement eleupdatefname;
	
	public  EditLeadPage typeUpdateFirstName(String vupfn) {
		type(eleupdatefname, vupfn);
		return this;
	}
	
	@FindBy(className = "smallSubmit")
	WebElement eleClickUpdatebtn;
	
	public ViewLeadPage clicksubup() {
		click(eleClickUpdatebtn);
		return new ViewLeadPage(driver,test);
	}

	
	
	
	

}
