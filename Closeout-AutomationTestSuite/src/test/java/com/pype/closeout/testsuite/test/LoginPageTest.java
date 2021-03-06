package com.pype.closeout.testsuite.test;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.mail.EmailAttachment;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.pype.closeout.testsuite.behaviour.LoginPageBehaviour;
import com.pype.closeout.testsuite.core.ConfigProperties;
import com.pype.closeout.testsuite.core.DemoMailer;
import com.pype.closeout.testsuite.core.ReadExcel;
import com.pype.closeout.testsuite.core.ScreenRecording;
import com.pype.closeout.testsuite.core.ScreenShots;

//import com.pype.closeout.testsuite.core.excel.ScreenShots;

public class LoginPageTest extends BaseTest {

	public LoginPageTest() throws Exception {

		super(false);

	}

	@Test

	public void login() throws Exception {

		Log log = LogFactory.getLog("LoginPageTest");
		
		 ScreenRecording.Recorder("Logintest3");
		
		 ScreenRecording.start();

		log.info("screen recording started");

		ReadExcel excel = new ReadExcel();

		// Properties property = new Properties();
		// property.load(new FileInputStream("config.properties"));
		// String excelpath = property.getProperty("readexcel");

		String excelpath = ConfigProperties.get(ConfigProperties.READ_EXCEL_PATH);

		Row row = excel.ReadExcel(excelpath, "TestData.xlsx", "login",1);

		log.info("reading the data from excel");

		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);

		_LoginPageBehaviour.login(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());

		//ScreenShots.takeScreenshots(driver, "test11");
		 
		log.info("login credentials entered");

		Thread.sleep(5000);

		String url = driver.getCurrentUrl();

		log.info(url);

		if (url.equals("https://closeout-dev.pype.io/projects"))

		{

			log.info("user logged in Successfully");
		}

		else {

			//ScreenShots.takeScreenshots(driver, "Testl1ogin.png");

			log.info("Login Failed and took screenshot");

			// DemoMailer.SendEmail("kiran.surakanti@pype.io", "Login page validation",
			// "login page failed.",true);
			//
			// log.info("mail sent");
			//
			// ScreenRecording.stop();

		//	log.info("screen recording stopped");

		}
	}
}