package com.pype.closeout.testsuite.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.pype.closeout.testsuite.drivers.DriverManager;
import com.pype.closeout.testsuite.drivers.DriverManagerFactory;
import com.pype.closeout.testsuite.drivers.DriverType;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;


public class BaseTest {

	protected WebDriver driver;
	protected DriverManager driverManager;
	protected WebDriverWait wait;

	public BaseTest(boolean isAuthentcationRequired) {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
		driver.manage().window().maximize();
		driver.get("https://closeout-dev.pype.io/");

		if (isAuthentcationRequired) {
			Login();
		}
	}

	private void Login() {
		// TODO Auto-generated method stub

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
	
	// closing the browser after executing the test case
	
	@AfterTest
	 public void quitBrowser()
	 {
		driverManager.quitDriver();
	 }
}