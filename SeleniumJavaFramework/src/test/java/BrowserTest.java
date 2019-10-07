import org.openqa.selenium.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import jdk.internal.org.jline.utils.Log;



import org.junit.Test;
import pages.LoginPage;
import pages.ActionBuilder;
public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		/* String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com.tr");
		driver.close();
		//driver.quit(); */
		 
		   Logger logger=LogManager.getLogger(BrowserTest.class);

	try {
		    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
         
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.amazon.com.tr/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3Fref_%3Dnav_ya_signin%26_encoding%3DUTF8&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		    LoginPage.login(driver,"adwe2011@hotmail.com","salih_1996");
		    logger.error("Email and password sent." );
		  
			
		  
		  Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		  dropdown.selectByValue("search-alias=computers");
		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("msi");
		  logger.error("msi sent" );
		  driver.findElement(By.className("nav-input")).click();
		  logger.error("Search button clicked" );
		  driver.findElement(By.className("a-normal")).click();
		  logger.error("Page 2  selected.");
		  driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=1']//div[@class='a-section aok-relative s-image-square-aspect']")).click(); 
		  logger.error("Second product selected");
		  driver.findElement(By.id("add-to-wishlist-button-submit")).click();
		  logger.error("Product added");
		
		
		  try {
			  Thread.sleep(2000);
			  driver.get("https://www.amazon.com.tr/");
			  ActionBuilder actionBuilder=new ActionBuilder();
			  actionBuilder.Builder(driver,"nav-link-accountList","Favori Listem","Ürünü kaldýr");
			  logger.error("Product removed");
			  actionBuilder.Builder(driver,"nav-link-accountList","nav-item-signout");
			  logger.error("Sign out");
		      Thread.sleep(5000);  // Let the user actually see something!
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Error is"+e);
		}
	      driver.quit();
	}
	catch(WebDriverException ex ) {
		logger.warn(ex);
		
	}
		  
		 
	   
			
	}
	

}
