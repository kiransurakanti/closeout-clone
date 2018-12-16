package com.pype.closeout.testsuite.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.LeftNavigationMenuBehaviour;
import com.pype.closeout.testsuite.behaviour.LoginPageBehaviour;
import com.pype.closeout.testsuite.core.ConfigProperties;
import com.pype.closeout.testsuite.core.ReadExcel;
import com.pype.closeout.testsuite.core.ScreenShots;

public class IVT_CompanyUserTest extends BaseTest {

	public IVT_CompanyUserTest() throws Exception {
		super(false);
	}

	// validating list of tabs availabe for Company User

	@Test
	public void CompanyUserTabs() throws Exception {
		Log log = LogFactory.getLog("IVT_CompanyUserTest");
		
		// login as Company User

		ReadExcel excel = new ReadExcel();
		String excelpath = ConfigProperties.get(ConfigProperties.READ_EXCEL_PATH);
		Row row = excel.ReadExcel(excelpath, "TestData.xlsx", "login", 2);
		log.info("reading the data from excel");
		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);
		_LoginPageBehaviour.login(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
		Thread.sleep(500);
		ScreenShots.takeScreenshots(driver,"CU\\", "login");
		log.info("login credentials entered");

		// Validating the list of tabs and entering into each tab.

		log.info("List of tabs available for Company User are as follows");
		LeftNavigationMenuBehaviour Nav = new LeftNavigationMenuBehaviour(driver);
		ScreenShots.takeScreenshots(driver,"CU\\", "ProjectsPage");
		Thread.sleep(2000);
		Nav.dashboard();
		ScreenShots.takeScreenshots(driver,"CU\\", "DashBoardPage");
		Thread.sleep(2000);
		Nav.submittals();
		ScreenShots.takeScreenshots(driver,"CU\\", "SubmittalsPage");
		Thread.sleep(2000);
		Nav.directory();
		ScreenShots.takeScreenshots(driver,"CU\\", "DirectoryPage");
		Thread.sleep(2000);
		Nav.reports();
		ScreenShots.takeScreenshots(driver,"CU\\", "ReportsPage");
		Thread.sleep(2000);
		Nav.emails();
		ScreenShots.takeScreenshots(driver,"CU\\", "EmailsPage");
		Thread.sleep(2000);
		Nav.portfolio();
		ScreenShots.takeScreenshots(driver,"CU\\", "PortfolioPage");
		Thread.sleep(3000);
        
		System.out.println("List of All tabs are displayed for Company User");

		
	}

	// closing the driver after validating the test case

	   @AfterClass
	    public void quitBrowser() {
		driverManager.quitDriver();
	    }
}
