package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;

import com.pype.closeout.testsuite.pages.TempmailSignUp;

public class TempmailSignUpBehaviour 

{
 
	WebDriver driver;
	
	public TempmailSignUpBehaviour(WebDriver driver)
	{
		
		this.driver = driver;
		
	}
	
	public void opentempmail(String email) throws Exception
	{
		
		TempmailSignUp temp = new TempmailSignUp(driver);
		
	    temp.setemial(email);
	    
	    temp.clickbutton();
	    
	    Thread.sleep(5000);
		
	}
	
	//opening email
	
	public void email()
	{
		
		TempmailSignUp temp = new TempmailSignUp(driver);
		
		temp.openemail(driver);
	}
	
	//clicking on password reset.
	
	public void openemail()
	{
		TempmailSignUp temp = new TempmailSignUp(driver);
		
		temp.clickpasswordlink();
		
	}
	 
	// navigate to new tab
	
	public void switchtab(String pass , String confirmpass)
	
	{
		TempmailSignUp _Tempmail = new TempmailSignUp(driver);
		
		_Tempmail.setpassword(pass);
		
		_Tempmail.setconfirmpassword(confirmpass);
		
		_Tempmail.clicksubmit(driver);
		
		
		
		
	}

	
		
	}

