package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;

import com.pype.closeout.testsuite.pages.LoginPage;
import com.pype.closeout.testsuite.pages.RegisterPage;

public class LoginPageBehaviour extends BaseBehaviour 
{
	 WebDriver driver;
	
   public LoginPageBehaviour(WebDriver driver)
   {
	    this.driver =  driver;
	    
   }
   
   public void login(String username , String pass) throws Exception
   
   {
   
	   LoginPage _login =  new LoginPage(driver);
   
	   _login.setusername(username);
   
	   _login.setPassword(pass);
   
	   Thread.sleep(1000);
   
	   _login.loginbutton(driver);
   
   }
   
    public void sigupbutton()
   
     {
	  
    	LoginPage _login = new LoginPage(driver);
	   
    	_login.Signuplink(driver);
	   
     }
   
   
     public void forgotpasswordlink()
       
       {
	      
    	 LoginPage _login = new LoginPage(driver);
	   
    	 _login.forgorpasswordlink();
       
       }


}
