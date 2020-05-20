package base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageActions.LandingPageActions;
import pageLocators.LandingPageLocators;

public class TestBase {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static JavascriptExecutor je;
	public static String url="http://automationpractice.com/index.php";
	
	protected Logger logger=Logger.getLogger("TestBase");
	protected WebDriverWait wait;
	public void setChromeOptions() {
		WebDriverManager.chromedriver().version("80.0.3987.16").setup();
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("start-maximized"); 
		options.addArguments("enable-automation"); 
		options.addArguments("--no-sandbox"); 
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-browser-side-navigation"); 
	    options.addArguments("--disable-notifications");
		options.addArguments("--window-size=1920,1080");
		 PropertyConfigurator.configure("Log4j.properties");
		 driver = new ChromeDriver(options);
	}
	
	public void launchPage() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get(url);
	}
	public void navigateToLoginSingup() {
		LandingPageActions landingPageObj=new LandingPageActions(driver);
		landingPageObj.clickSignIN();
	}
	public void signoutLP() {
		LandingPageActions landingPageObj=new LandingPageActions(driver);
		landingPageObj.signOut();
	}
	
	public void getText(String locatortype, String locator) {
		 By by;
	        switch (locatortype) {
	            case "id":
	                by = By.id(locator);
	                break;
	            case "name":
	                by = By.name(locator);
	                break;
	            case "xpath":
	                by = By.xpath(locator);
	                break;
	            case "css":
	                by = By.cssSelector(locator);
	                break;
	            case "linkText":
	                by = By.linkText(locator);
	                break;
	            case "partialLinkText":
	                by = By.partialLinkText(locator);
	                break;
	            default:
	                by = null;
	                break;
	        }
		System.out.println(driver.findElement(by).getText() + "Total cost");
		logger.info(driver.findElement(by).getText() + "Total cost");
		
	}
}
