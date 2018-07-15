package lib.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import excellearning.DeleteExcel;
import excellearning.EditExcel;
import excellearning.ReadExcel;
import leaf.leads.EditLead;

public class PreAndPost extends WebDriverServiceImpl{
	 
	public String tcname,tcdesc,authorname,category,nodename,excelSheet;
	
	@Parameters({"URL","userName","password"})
	@BeforeMethod
	public void beforeMethod(String url,String uName,String pWord) {
		//for reports
		startTestModule(nodename);
		test.assignAuthor(authorname);
		test.assignCategory(category);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this); 
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		type(locateElement("id", "username"), uName);	
		type(locateElement("id", "password"), pWord);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
	}
	@DataProvider(name="TST")
	public String[][] getdata() throws IOException  {
		ReadExcel excel = new ReadExcel();
		String[][] readExcel01 = excel.readExcel(excelSheet);
		return readExcel01;
		}
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}

	@BeforeClass
	public void beforeClass() {
		//startTestCase("TC001_CreateLead", "Create a new Lead");
		startTestCase(tcname,tcdesc);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}


	@AfterSuite
	public void afterSuite() {
		endResult();
	}

	/*@DataProvider(name="TST")
	public String[][] getdata() throws IOException  {
		ReadExcel excel = new ReadExcel();
		String[][] readExcel = excel.readExcel(excelSheet);
		return readExcel;
		}*/
	
	/*@DataProvider(name="TST")
	public String[][] getdata() throws IOException  {
		EditExcel excel = new EditExcel();
		String[][] readExcel = excel.editExcel(excelSheet);
		return readExcel  ;
		}*/
	
	
}


















