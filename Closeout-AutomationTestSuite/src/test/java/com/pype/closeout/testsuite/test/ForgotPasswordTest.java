package com.pype.closeout.testsuite.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.pype.closeout.testsuite.behaviour.ForgotPasswordBehaviour;
import com.pype.closeout.testsuite.behaviour.LoginPageBehaviour;
import com.pype.closeout.testsuite.core.ScreenShots;

public class ForgotPasswordTest extends BaseTest

  {

	public ForgotPasswordTest() throws Exception 
	
	{
	
		super(false);
	
	
	}
	
	@Test
	
	public void forgotpassword() throws Exception
	
	{
		Log log = LogFactory.getLog("ForgotPasswordTest");
		
		log.info("clicked on forgot password link");
		
		LoginPageBehaviour _login = new LoginPageBehaviour(driver);
	
		_login.forgotpasswordlink();
		
		log.info("email address entered");
		
		ForgotPasswordBehaviour _forgot = new ForgotPasswordBehaviour(driver);
		
		_forgot.forgotpassword("abcd@gmail.com");
		
		log.info("email entered and submitted");
		
		Thread.sleep(5000);
		
		String url = driver.getCurrentUrl();
		
		log.info(url);
		
		// validating the password confirmation page
		  
		try 
		   {
			  
			if (url.equals("https://closeout-dev.pype.io/forgotpasswordconfirm"))
			
			   {
				   
				   log.info("password reset mail has sent successfully");
				
			   }
			
			 else 
			   {
				
				  log.info("Test Case Failed");
			   }
			
		    } 
		
		catch (Exception e)
		     
		{
			
			log.error(e);
			  
	     }
		
		finally 
		
			{
			
				ScreenShots.takeScreenshots(driver, "Forgotpassword\\","Forgotpassword");	
			}
	    
		
	 }
}
