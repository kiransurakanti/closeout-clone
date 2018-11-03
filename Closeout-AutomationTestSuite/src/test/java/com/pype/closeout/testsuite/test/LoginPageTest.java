package com.pype.closeout.testsuite.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.pype.closeout.testsuite.behaviour.LoginPageBehaviour;
import com.pype.closeout.testsuite.core.DemoMailer;
import com.pype.closeout.testsuite.core.ReadExcel;
import com.pype.closeout.testsuite.core.ScreenRecording;
import com.pype.closeout.testsuite.core.ScreenShots;

//import com.pype.closeout.testsuite.core.excel.ScreenShots;

public class LoginPageTest extends BaseTest {
	public LoginPageTest() {
		super(false);
	}

	@Test
	public void login() throws Exception {
		 Log log = LogFactory.getLog("LoginPageTest");
		ScreenRecording.Recorder("Logintest");
		ScreenRecording.start();
		log.info("screen recording started");
		ReadExcel excel = new ReadExcel();
		Row row = excel.ReadExcel("C:\\Wrokspace\\CloseoutTestData", "TestData.xlsx", "login", 1);
		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);
		_LoginPageBehaviour.login(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
		log.info("login credentials entered");
		ScreenShots.takeScreenshots(driver, "loginValidation");
		log.info("screenshot taken");
		DemoMailer.SendEmail("kiran.surakanti@pype.io", "Login page validation", "login page verfied successfully",
				true);
		System.out.println("mail sent");
		log.info("mail sent");
		ScreenRecording.stop();
		log.info("screen recording stopped");

	}
}
