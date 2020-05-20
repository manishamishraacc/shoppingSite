package pageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageLocators.RegisterPageLocators;

public class RegisterPageAction extends RegisterPageLocators{

	public RegisterPageAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void enter_RegisterPage_EmailID(String EmailId) {
		wait = new WebDriverWait(driver, 15);
		newUserEmail.sendKeys(EmailId);
		logger.info("Entered new user email");
	} 
	public void createUser() {
		createAccount.click();
		logger.info("enter after emailid");
	}
	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
		logger.info("Entered first name");
	}
	public void enterLasttName(String lastNamevalue) {
		lastName.sendKeys(lastNamevalue);
		logger.info("Entered last name");
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
		logger.info("Entered password");
	}
	public void addressLine(String address) {
		addressLine1.sendKeys(address);
		logger.info("Entered adress");
	}
	public void enterCity(String cityvalue) {
		city.sendKeys(cityvalue);
		logger.info("Entered city");
	}
	public void selectState(String stateValue) {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", stateDrp);
		Select drpState = new Select(stateDrp);
		drpState.selectByVisibleText(stateValue);
		logger.info("state selected");
	}
	public void enterZip(String zipvalue) {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", zipCode);
		zipCode.sendKeys(zipvalue);
		logger.info("Entered zip");
	}
	
	public void enterphone(String phonenumber) {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", phone);
		phone.sendKeys(phonenumber);
		logger.info("Entered phone");
	}
	public void submitButton() {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", registerButton);
		registerButton.click();
		logger.info("user created after all infor provided");
	}
	
	
	
}
