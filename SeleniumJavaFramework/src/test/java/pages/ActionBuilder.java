package pages;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class ActionBuilder {
	public static void Builder(WebDriver driver,String id,String text) throws InterruptedException  {
		  Logger logger=LogManager.getLogger(ActionBuilder.class);
		try {
	    	  Actions builder = new Actions(driver);
			  WebElement element = driver.findElement(By.id(id));
			  builder.moveToElement(element).build().perform();
			  Thread.sleep(2000);
			  element.click();
			  Thread.sleep(2000);
		      driver.findElement(By.id(text)).click();
			  Thread.sleep(5000);
		
		}
		catch(ElementNotSelectableException e) {
			logger.warn(e);
		}
			
		}
	      
	
public static void Builder(WebDriver driver,String id,String text,String text2) throws InterruptedException {
	  Logger logger=LogManager.getLogger(ActionBuilder.class);
		try {
	  Actions builder1 = new Actions(driver);
	  WebElement element1 = driver.findElement(By.id(id));
	  builder1.moveToElement(element1).build().perform();
	  Thread.sleep(2000);
	  element1.click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText(text)).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText(text2)).click();
	  Thread.sleep(5000);
		}
		catch(ElementNotSelectableException e) {
			logger.warn(e);
		}
	}

}
