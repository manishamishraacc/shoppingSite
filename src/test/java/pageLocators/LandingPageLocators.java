package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LandingPageLocators extends TestBase {
	WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	protected WebElement signINPage;
	
	@FindBy(id="email")
	protected WebElement existingUserEmail;
	
	@FindBy(id="passwd")
	protected WebElement existingUserpwd;
	
	@FindBy(id="SubmitLogin")
	protected WebElement singIN;
	
	@FindBy(xpath="//a[@class='logout']")
	protected WebElement signout;
	
	@FindBy(xpath="//a[@title='Women']")
	protected WebElement womenSection;
	
	
	public LandingPageLocators( WebDriver driver) {
		this.driver=driver;
		//Initializing the Page Objects:
		PageFactory.initElements(driver, this);
	}
}
