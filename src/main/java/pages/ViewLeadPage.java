package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class ViewLeadPage extends PreAndPost {


	public ViewLeadPage(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}


	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFirstName;

	public ViewLeadPage verifyFirstName(String fname) {
		verifyExactText(eleFirstName, fname);
		return this;

	}
	
	
	@FindBy(linkText = "Edit")
	WebElement eleEdit;
	public EditLeadPage clickEditLead() {
		click(eleEdit);
		return new EditLeadPage(driver, test);
	}
	

	@FindBy(linkText = "Duplicate Lead")
	WebElement eleDuplead;

	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplead);
		return new DuplicateLeadPage(driver,test);
	}
	
	
	@FindBy(linkText = "Delete")
	WebElement eleDelte;

	public Mylead clickDeleteLead() {
		click(eleDelte);
		return new Mylead(driver,test);
	}
	
	
	
	
	
	
	
	
	
}



 