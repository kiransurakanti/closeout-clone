package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pype.closeout.testsuite.pages.ForgotpasswordPage;

public class ForgotPasswordBehaviour extends BaseBehaviour

{
  WebDriver driver;
  
  public ForgotPasswordBehaviour(WebDriver driver)
  {
	  this.driver = driver;
  }
  
 public void forgotpassword(String email) throws InterruptedException
 {
	 ForgotpasswordPage _forgot = new ForgotpasswordPage(driver);
	 _forgot.SetEAddress(email);
	 Thread.sleep(3000);
	 _forgot.reset(driver);
 }
 
 public void Signup()
 {
	 ForgotpasswordPage _forgot = new ForgotpasswordPage(driver);
	 _forgot.signup(driver);
 }

}