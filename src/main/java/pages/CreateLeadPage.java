package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

//public class CreateLeadPage extends PreAndPost
public class CreateLeadPage extends WebDriverServiceImpl{


	/*public CreateLeadPage(EventFiringWebDriver driver,ExtentTest test) 
	this.driver=driver;
		this.test=test; 
*/	
	public CreateLeadPage()
	{
		
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	
	public CreateLeadPage typeCompanyname(WebElement eleCompanyName,String data) {
		type(eleCompanyName, data);
		return this;
	}

	@FindBy(id = "createLeadForm_firstName")
	WebElement eleFirstName;
	
	public CreateLeadPage typeFirstname(WebElement eleFirstName,String data) {
		type(eleFirstName, data);
		return this;
	}

	@FindBy(id = "createLeadForm_lastName")
	WebElement eleLastName;
	public CreateLeadPage typeLastname(WebElement eleLastName,String data) {
		type(eleLastName,data);
		return this;
	}
	@FindBy(name = "submitButton")
	WebElement eleClickCreatebtn;
	

	public  ViewLeadPage clickCreateLead() {
		click(eleClickCreatebtn);
		return new ViewLeadPage(driver, test);

	}

}
