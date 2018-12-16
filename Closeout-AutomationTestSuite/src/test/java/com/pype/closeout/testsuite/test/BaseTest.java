package com.pype.closeout.testsuite.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.mail.MessagingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.mail.EmailException;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.pype.closeout.testsuite.behaviour.LoginPageBehaviour;
import com.pype.closeout.testsuite.core.ConfigProperties;
import com.pype.closeout.testsuite.core.DemoMailer;
import com.pype.closeout.testsuite.core.ReadExcel;
import com.pype.closeout.testsuite.core.ScreenRecording;
import com.pype.closeout.testsuite.core.ScreenShots;
import com.pype.closeout.testsuite.drivers.DriverManager;
import com.pype.closeout.testsuite.drivers.DriverManagerFactory;
import com.pype.closeout.testsuite.drivers.DriverType;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;


public class BaseTest {

	protected WebDriver driver;
	protected DriverManager driverManager;
	protected WebDriverWait wait;

	public BaseTest(boolean isAuthentcationRequired) throws Exception {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
		driver.manage().window().maximize();
		driver.get("https://closeout-test.pype.io/");

		if (isAuthentcationRequired) {
			Login();
		}
	}

private void Login() throws Exception {
				Log log = LogFactory.getLog("LoginPageTest");
		
		// ScreenRecording.Recorder("Logintest3");
		
		// ScreenRecording.start();

		//log.info("screen recording started");

		ReadExcel excel = new ReadExcel();
		
		String excelpath = ConfigProperties.get(ConfigProperties.READ_EXCEL_PATH);

		Row row = excel.ReadExcel(excelpath, "TestData.xlsx", "login", 1);

		log.info("reading the data from excel");

		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);

		_LoginPageBehaviour.login(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());

		log.info("login credentials entered");
		
		

	}
	
	
	   
	@BeforeSuite
	public void Chromedriverload() {
		System.out.println("Reading configuration from '" + System.getenv("CONFIGURATION_PATH") + "' folder");

		Properties prop = new Properties();
		try {
			// load a properties file from class path, inside static method
			prop.load(new FileInputStream(System.getenv("CONFIGURATION_PATH") + "/config.properties"));

			// get the property value and print it out
			System.out.println(prop.getProperty("chrome.driver.path"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
/*	@AfterSuite
	   public void SendEmail() throws EmailException, MessagingException
	   {
		DemoMailer.SendEmail("kiran.surakanti@pype.io", "IVT Test Result", "IVT Test cases has been executed URL:///C:/closeout-clone/Closeout-AutomationTestSuite/test-output/emailable-report.html ", true);
		org.mortbay.log.Log.info("Mail has sent");
	   }
	   */
}