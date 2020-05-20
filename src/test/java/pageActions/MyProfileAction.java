package pageActions;

import org.openqa.selenium.WebDriver;

import pageLocators.myProfileLocators;

public class MyProfileAction extends myProfileLocators{

	public MyProfileAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void clickHomeIcon() {
		homeicon.click();
	}
	public void clickOrderDetails() {
		orderDeyails.click();
	}
	public void myProfileBtn() {
		myprofile.click();
	}

}
