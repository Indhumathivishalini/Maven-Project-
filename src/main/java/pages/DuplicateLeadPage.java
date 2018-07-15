package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class DuplicateLeadPage extends WebDriverServiceImpl {

	public DuplicateLeadPage(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	
	}
	
	 @FindBy(id = "createLeadForm_firstName")
		WebElement eledupfname;
		
		
		public DuplicateLeadPage typeUpdatedFirstName(String dupfn) {
			type(eledupfname, dupfn);
			return this;
		}
		
		@FindBy(className = "smallSubmit")
		WebElement eleduplead;
		 
		public ViewLeadPage clicksubdup() {
			click(eledupfname);
			return new ViewLeadPage(driver,test);
		}


	

}
