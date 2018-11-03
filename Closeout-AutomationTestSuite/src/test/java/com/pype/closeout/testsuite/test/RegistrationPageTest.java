package com.pype.closeout.testsuite.test;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.LoginPageBehaviour;
import com.pype.closeout.testsuite.behaviour.RegistrationPageBehaviour;
import com.pype.closeout.testsuite.core.ScreenShots;


public class RegistrationPageTest extends BaseTest {

	public RegistrationPageTest() {
		super(false);
	}

	@Test
	public void Register() throws Exception {

		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);
		_LoginPageBehaviour.signuplink();
		System.out.println("login");
		RegistrationPageBehaviour _RegistrationPageBehaviour = new RegistrationPageBehaviour(driver);
		_RegistrationPageBehaviour.registration("kiran@gmail.com", "kiran Reddy", "pype", "0987654321");
		ScreenShots.takeScreenshots(driver, "Registrationpage");
		System.out.println("signup success");
		
	}
}
