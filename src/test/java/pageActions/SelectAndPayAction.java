package pageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageLocators.SelectAndPay;

public class SelectAndPayAction extends SelectAndPay {
	
	public SelectAndPayAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void mouseHover() {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", item);
		 Actions actions = new Actions(driver);
		 actions.moveToElement(item).perform();
		
	}
	public void click_QucikView() {
		quickView.click();
	}
	public void click_addIcon() {
		
		System.out.println();
		addicon.click();
	}
	public void addToCart() {
		addToCart.click();
	}
	public void checkOut() {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", checkOutButton);
		checkOutButton.click();
	}
	public void checkoutPannel() {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", checkoutPannek);
		checkoutPannek.click();
	}
	public void checkOut_address() {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", addressPannelCheckoutbtn);
		addressPannelCheckoutbtn.click();
	}
	
	public void termnconition() {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", termNcondition);
		if(!termNcondition.isSelected()) {
		termNcondition.click();}
	}
	public void checkOut_carrier() {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", carrierCheckoutBtn);
		carrierCheckoutBtn.click();
	}
	
	public void paymentOption() {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", paymentOption);
		paymentOption.click();
	}
	
	public void confirmOrder() {
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", confirmOrder);
		confirmOrder.click();
	}
	
	public void myProfileBtn() {
		myProfileBtn.click();
	}
	public void orderDetails() {
		viewOrder.click();
	}

}
