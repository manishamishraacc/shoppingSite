package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegisterPageLocators extends TestBase {
	
	@FindBy(xpath="//input[@name='email_create']")
	protected WebElement newUserEmail;
	
	@FindBy(id="SubmitCreate")
	protected WebElement createAccount;
	
	@FindBy(id="customer_firstname")
	protected WebElement firstName;
	
	@FindBy(id="customer_lastname")
	protected WebElement lastName;
	
	@FindBy(id="passwd")
	protected WebElement password;
	
	@FindBy(id="address1")
	protected WebElement addressLine1;
	
	@FindBy(id="city")
	protected WebElement city;
	
	@FindBy(id="id_state")
	protected WebElement stateDrp;
	

	@FindBy(id="postcode")
	protected WebElement zipCode;
	
	@FindBy(id="phone_mobile")
	protected WebElement phone;
	
	@FindBy(id="submitAccount")
	protected WebElement registerButton;
	
	public RegisterPageLocators(WebDriver driver) {
		//Initializing the Page Objects:
		PageFactory.initElements(driver, this);
	}
}
