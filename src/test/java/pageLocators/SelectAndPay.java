package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SelectAndPay extends TestBase{
 
	@FindBy(xpath="//div[@class='tab-content']//ul[@id='homefeatured']/child::li[1]")
	protected WebElement item;
	
	@FindBy(xpath="//div[@class='tab-content']//ul[@id='homefeatured']//child::li[1]//a[@class='quick-view']")
	protected WebElement quickView;
	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	protected WebElement addicon;
	
	@FindBy(xpath="//p[@id='add_to_cart']/button[@type='submit']")
	protected WebElement addToCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	protected WebElement checkOutButton;
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
	protected WebElement checkoutPannek;
	
	@FindBy(xpath="//button[@name='processAddress']")
	protected WebElement addressPannelCheckoutbtn;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	protected WebElement carrierCheckoutBtn;
	
	@FindBy(id="cgv")
	protected WebElement termNcondition;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	protected WebElement paymentOption;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	protected WebElement confirmOrder;
	
	@FindBy(xpath="//a[@title='View my customer account']")
	protected WebElement myProfileBtn;
	
	@FindBy(xpath="//a[@title='Orders']")
	protected WebElement viewOrder;
	
	
	
	
	public SelectAndPay(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
