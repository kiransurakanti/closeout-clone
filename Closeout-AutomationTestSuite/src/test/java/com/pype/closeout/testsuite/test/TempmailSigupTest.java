package com.pype.closeout.testsuite.test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.TempmailSignUpBehaviour;
import com.pype.closeout.testsuite.core.ReadExcel;
import com.pype.closeout.testsuite.drivers.DriverManager;
import com.pype.closeout.testsuite.drivers.DriverManagerFactory;
import com.pype.closeout.testsuite.drivers.DriverType;

public class TempmailSigupTest 
{

	protected WebDriver driver;
	protected DriverManager driverManager;
	protected WebDriverWait wait;


	@Test
	public void tempsignup() throws Exception {
        
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		
		driver = driverManager.getDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.mailinator.com/");
		
		Log log = LogFactory.getLog("TempmailSigupTest");

		log.info("opening mailinator URL");
		
        ReadExcel excel = new ReadExcel();
		
		Properties property = new Properties();
		
		property.load(new FileInputStream("config.properties"));
		
		String excelpath = property.getProperty("WriteExcel");
		
		Row row = excel.ReadExcel(excelpath, "TestData.xlsx", "WriteData", 1);
		
		log.info("reading the data from excel");
		
		TempmailSignUpBehaviour signup = new TempmailSignUpBehaviour(driver);
		
	    signup.opentempmail(row.getCell(0).getStringCellValue());	
     
		log.info("checking for email received and clicking on the password setup link");
 
          	
        log.info("checking weather eamil has received");
       
        // opening the email received.
        
        signup.email();
        
        log.info("clicking on email received.");
       
        Thread.sleep(3000);
        
        log.info("switcing to received email frame");
        // switching to email frame
        
        driver.switchTo().frame("msg_body");
        
        log.info("switched frame");
        
        signup.openemail();
        
        Thread.sleep(3000);
        
        Set<String> windows = driver.getWindowHandles(); 
       
        Iterator<String> it = windows.iterator();
        
        String parentWindow = it.next();
        
        String childWindow = it.next();
        
        System.out.println(childWindow);
        
        driver.switchTo().window(childWindow);
		
        log.info("Switching to new tab");

		// perform the operation in new tab

		TempmailSignUpBehaviour _switchtab = new TempmailSignUpBehaviour(driver);

		log.info("new password and confirm password has entered");

		_switchtab.switchtab("Test123", "Test123");

		log.info("password has set successfully.");

	}
}


