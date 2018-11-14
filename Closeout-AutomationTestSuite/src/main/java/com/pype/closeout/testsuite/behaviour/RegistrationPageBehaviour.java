package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;

import com.pype.closeout.testsuite.core.ReadExcel;
import com.pype.closeout.testsuite.pages.RegisterPage;
import com.pype.closeout.testsuite.pages.TempmailRegistration;

//import com.google.inject.Inject;

public class RegistrationPageBehaviour extends BaseBehaviour {
	
	WebDriver driver;

	public RegistrationPageBehaviour(WebDriver driver) {
		
		this.driver = driver;
	}

	public void registration(String email, String Name, String CompanyName, String number) throws Exception {
		
		RegisterPage _RegisterPage = new RegisterPage(driver);
		
		_RegisterPage.SetEmail(email);
		
		Thread.sleep(2000);
		
		_RegisterPage.SetName(Name);
		
		Thread.sleep(2000);
		
		_RegisterPage.SetCompany(CompanyName);
		
		Thread.sleep(2000);
		
		_RegisterPage.SetNumber(number);
		
		Thread.sleep(2000);
		
		_RegisterPage.Signup(driver);

	}

	
}
