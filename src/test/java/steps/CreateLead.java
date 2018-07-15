package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

	public ChromeDriver driver;

	@Given("Open the browser")
	public void  openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("Launch the url")
	public void launchUrl() {

		driver.get("http://leaftaps.com/opentaps/");
	}

	@And("Set the timeouts")
	public void setTimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Maximise the browser")
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	@And("Enter the username as (.*)")
	public void userName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("Enter the password as (.*)")
	public void passWord(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Login is successful")
	public void loginSuccess() {
		System.out.println("login successful");
		}
	
	@And("Click on crmsfalink")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	@And("Crmsfa successfull")
	public void successMsg() {
		System.out.println("crmsfa clicked succesfully");
	}
	
	@And("Click on leads")
	public void clickOnleads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Click on createlead")
	
	public void clickCreatelead() {
		driver.findElement(By.linkText("Create Lead")).click();
		}
	
	@And("Give companyname as (.*)")
	public void typeCompanyName(String companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	}
	@And("Give firstname as(.*)")
	public void typeFirstname(String firstname) {
	
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}
	
	@And("Give lastname as (.*)")
	public void typeLastname(String lastname) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

