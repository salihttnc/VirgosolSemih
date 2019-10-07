package pages;
import org.openqa.selenium.*;

import java.lang.System.Logger.Level;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.internal.org.jline.utils.Log;

import org.junit.Test;

public class LoginPage {
	
	
	public static void login(WebDriver driver,String name,String password) {
		
		  Logger logger=LogManager.getLogger(LoginPage.class);
	
		  boolean isChecked;
		  WebElement e = null;
		  driver.findElement(By.id("ap_email")).sendKeys(name);
		  logger.error("Ýnfo email : "+name);
		  driver.findElement(By.id("continue")).click();
		  logger.error("Email button clicked");
		  driver.findElement(By.id("ap_password")).sendKeys(password);
		  logger.info("Ýnfo of password : "+password);
		  driver.findElement(By.id("signInSubmit")).click();
		  logger.error("Password button clicked");
		 
		
		 
	}

}
