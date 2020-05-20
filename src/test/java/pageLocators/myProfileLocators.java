package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class myProfileLocators extends TestBase{
 
	@FindBy(xpath="//a[@title='Return to Home']")
	protected WebElement homeicon;
	
	@FindBy(xpath="//a[@title='Orders']")
	protected WebElement orderDeyails;
	
	@FindBy(xpath="//a[@title='View my customer account']")
	protected WebElement myprofile;
	
	public myProfileLocators(WebDriver driver) {
		//Initializing the Page Objects:
		PageFactory.initElements(driver, this);
	}
}
