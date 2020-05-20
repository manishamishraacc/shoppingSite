package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.LandingPageLocators;

public class LandingPageActions extends LandingPageLocators{
	
	public LandingPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void enter_username_pwd(String username,String password) {
		existingUserEmail.sendKeys(username);
		existingUserpwd.sendKeys(password);
		singIN.click();
		
	}
	public void clickSignIN() {
		signINPage.click();
	}
	
	public void signOut() {
		signout.click();
		}
	
}
