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

public class IVT_GeneralContractorTest extends BaseTest {

	public IVT_GeneralContractorTest() throws Exception {
		super(false);
	}

	// validating list of tabs availabe for General Contractor

	@Test
	public void GCTabs() throws Exception {
		Log log = LogFactory.getLog("IVT_GeneralContractorTest");

		// login as General Contractor

		ReadExcel excel = new ReadExcel();
		String excelpath = ConfigProperties.get(ConfigProperties.READ_EXCEL_PATH);
		Row row = excel.ReadExcel(excelpath, "TestData.xlsx", "login", 5);
		log.info("reading the data from excel");
		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);
		_LoginPageBehaviour.login(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
		Thread.sleep(500);
		ScreenShots.takeScreenshots(driver,"GC\\", "login");
		log.info("login credentials entered");

		// Validating the list of tabs and entering into each tab.

		log.info("List of tabs available for General Contractor are as follows");
		LeftNavigationMenuBehaviour Nav = new LeftNavigationMenuBehaviour(driver);
		Thread.sleep(2000);
		
		// opening the project shared by the company admin to GC
		
		Nav.clickcompanyshared();
		ScreenShots.takeScreenshots(driver,"GC\\", "Sharedproject");
		Thread.sleep(2000);
		// Validating the list of tabs availabel for GC
		
	    ScreenShots.takeScreenshots(driver,"GC\\", "ProjectPage");
		Nav.dashboard();
		ScreenShots.takeScreenshots(driver,"GC\\", "DashBoardPage");
		Thread.sleep(2000);
		Nav.submittals();
		ScreenShots.takeScreenshots(driver,"GC\\", "SubmittalsPage");
		Thread.sleep(2000);
		Nav.reports();
		ScreenShots.takeScreenshots(driver,"GC\\", "ReportsPage");
		Thread.sleep(3000);
		Nav.portfolio();
    	ScreenShots.takeScreenshots(driver,"GC\\", "PortfolioPage");
    	Thread.sleep(2000);
		System.out.println("opened the project shared by company admin and validated the tabs availabel for GC.");
	}

	// closing the driver after validating the test case

	@AfterClass
	public void quitBrowser() {
		driverManager.quitDriver();
	}
}
