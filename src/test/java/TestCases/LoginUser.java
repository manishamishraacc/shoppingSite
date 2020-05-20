package TestCases;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pageActions.LandingPageActions;
import pageActions.MyProfileAction;
import pageActions.SelectAndPayAction;

public class LoginUser extends TestBase {
		@BeforeTest
	public void beforeTest() throws SQLException {
		setChromeOptions();
	}
	@BeforeClass
	public void setUp() {
		launchPage();
	}
	@Test
	public void Loginuser() throws InterruptedException {
		LandingPageActions landingPageobj=new LandingPageActions(driver);
		SelectAndPayAction selectandpayObj=new SelectAndPayAction(driver);
		MyProfileAction MyProfileActionobj=new MyProfileAction(driver);
		landingPageobj.clickSignIN();
		Thread.sleep(10000);
		logger.info("User on sign in page");
		landingPageobj.enter_username_pwd("Qatask@gmail.com", "Password24");
		Thread.sleep(10000);
		logger.info("User logged in");
		MyProfileActionobj.clickHomeIcon();
		logger.info("User navigated to home page");
		selectandpayObj.mouseHover();
		logger.info("mouse hover on a product");
		selectandpayObj.click_QucikView();
		logger.info("click on quick  view");
		Thread.sleep(15000);
		WebElement frmaexpath=driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frmaexpath);
		
		selectandpayObj.click_addIcon();
		selectandpayObj.addToCart();
		logger.info("add to cart");
		driver.switchTo().defaultContent();
		getText("xpath","//div[@class='layer_cart_row']//span[@class='ajax_block_cart_total']");
		selectandpayObj.checkOut();
		logger.info("proceed checkout");
		getText("xpath", "//tfoot/tr[7]/td[2]");
		selectandpayObj.checkoutPannel();
		selectandpayObj.checkOut_address();
		selectandpayObj.termnconition();
		selectandpayObj.checkOut_carrier();
		getText("xpath", "//tfoot/tr[@class='cart_total_price'][2]//td[2]");
		selectandpayObj.paymentOption();
		selectandpayObj.confirmOrder();
		MyProfileActionobj.myProfileBtn();
		selectandpayObj.orderDetails();
		signoutLP(); 
		

		
	}
	
	  
	  
	  @AfterClass public void tearDown() { driver.quit(); }
	 
}
