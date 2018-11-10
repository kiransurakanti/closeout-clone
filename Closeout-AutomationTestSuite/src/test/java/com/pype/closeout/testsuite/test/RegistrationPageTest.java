package com.pype.closeout.testsuite.test;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.LoginPageBehaviour;
import com.pype.closeout.testsuite.behaviour.RegistrationPageBehaviour;
import com.pype.closeout.testsuite.core.ScreenShots;

public class RegistrationPageTest extends BaseTest 
{

	public RegistrationPageTest() 
	{

		super(false);
	
	}

	@Test
	
	public void Register() throws Exception 
	{
	
		Log log = LogFactory.getLog("RegistrationPageTest");
		
		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);
	
		_LoginPageBehaviour.sigupbutton();
        
		log.info("clicked on signup button");
		
		RegistrationPageBehaviour _RegistrationPageBehaviour = new RegistrationPageBehaviour(driver);
		
		log.info("enter all the mandatory fields");
		
		_RegistrationPageBehaviour.registration("kiran@gmail.com", "kiran Reddy", "pype", "0987654321");
		
		ScreenShots.takeScreenshots(driver, "Registrationpage");
		
		log.info("clicked on signup");
		
		String url  = driver.getCurrentUrl();
	    
		// validating the successfull Regestration
		
		try 
		
		  {
			
			 if (url.equals("https://closeout-dev.pype.io/registerconfirm"))
			
			  {
				
				 log.info("registration successfull");
				
			  }
		
		  }
		
		catch (Exception e) 
		   {
			
			 log.error(e);
						
		   }
		 finally 
		    
		    {
			     ScreenShots.takeScreenshots(driver, "Registration");
		
		    }
		
				
	 }
}
