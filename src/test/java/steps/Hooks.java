package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lib.selenium.WebDriverServiceImpl;

public class Hooks extends WebDriverServiceImpl {
@Before 
public void beforeScenario(Scenario sc) {
	startReport();
	startTestCase(sc.getName(),sc.getId());
	
	startTestModule("CreateLead");
	test.assignAuthor("smoke");
	test.assignCategory("sanity");
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
	webdriver = new ChromeDriver();
	driver = new EventFiringWebDriver(webdriver);
	driver.register(this); 
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
}

@After
public void afterScenario(Scenario sc) {
	closeActiveBrowser();
	endResult();
	
}


}



