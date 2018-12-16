package com.pype.closeout.testsuite.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.LoginPageBehaviour;
import com.pype.closeout.testsuite.behaviour.RegistrationPageBehaviour;
import com.pype.closeout.testsuite.core.ReadExcel;
import com.pype.closeout.testsuite.core.ScreenShots;
import com.pype.closeout.testsuite.drivers.DriverManager;

public class RegistrationPageTest  extends BaseTest {
	
	public RegistrationPageTest() throws Exception {

	super(false);
	}

	@Test

	public void Register() throws Exception {

		// create an object to call the propert files.

		Properties property = new Properties();

		property.load(new FileInputStream("config.properties"));

		String Excelpath = property.getProperty("WriteExcel");

		ReadExcel excel = new ReadExcel();

		Row row = excel.ReadExcel(Excelpath, "TestData.xlsx", "WriteData", 1);

		Log log = LogFactory.getLog("RegistrationPageTest");

		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);

		_LoginPageBehaviour.sigupbutton();

		log.info("clicked on signup button");

		RegistrationPageBehaviour _RegistrationPageBehaviour = new RegistrationPageBehaviour(driver);

		log.info("enter all the mandatory fields");

		_RegistrationPageBehaviour.registration(row.getCell(0).getStringCellValue(), "kiran Reddy", "pype",
				"0987654321");

		ScreenShots.takeScreenshots(driver, "RegPage\\","Registrationpage");

		log.info("clicked on signup");

		Thread.sleep(6000);

		String url = driver.getCurrentUrl();

		// validating the successfull Regestration

		try

		{

			if (url.equals("https://closeout-dev.pype.io/registerconfirm"))

			{

				log.info("registration successfull and mail has sent to new user");

			}

		}

		catch (Exception e) {

			log.error(e);

		} finally

		{
			
			ScreenShots.takeScreenshots(driver,"RegPage\\", "Registration");

		}

		
	}
	
	
	
}
