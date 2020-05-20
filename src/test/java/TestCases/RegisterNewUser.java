package TestCases;

import java.sql.SQLException;
import java.util.Random;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pageActions.RegisterPageAction;

public class RegisterNewUser extends TestBase{
	
 
	@BeforeClass
	public void beforeTest() throws SQLException {
		setChromeOptions();
	}
	@BeforeMethod
	public void setUp() {
		launchPage();
	}
    @Test
    public void newUserRegister() {
    	String phonenumber = null;
    	String emailIDvalue=null;
    	Random rand = new Random();
    	phonenumber = "87" + (1000 + rand.nextInt(9000)) + (1000 + rand.nextInt(9000));
		emailIDvalue = "AutomationUser" + (1000 + rand.nextInt(9000)) + "@a" + (100 + rand.nextInt(900)) + ".com";
    	
    	RegisterPageAction registerPageObj = new RegisterPageAction(driver);
    	navigateToLoginSingup();
    	registerPageObj.enter_RegisterPage_EmailID(emailIDvalue);
    	registerPageObj.createUser();
    	registerPageObj.enterFirstName("Automation");
    	registerPageObj.enterLasttName("user");
    	registerPageObj.enterPassword("9893658203");
    	registerPageObj.addressLine("address");
    	registerPageObj.enterCity("city value");
    	registerPageObj.selectState("Connecticut");
    	registerPageObj.enterZip("00000");
    	registerPageObj.enterphone(phonenumber);
    	registerPageObj.submitButton();
    	signoutLP();
    	}
    	
    	

	
	  @AfterClass public void tearDown() { driver.quit(); }
	 
}
