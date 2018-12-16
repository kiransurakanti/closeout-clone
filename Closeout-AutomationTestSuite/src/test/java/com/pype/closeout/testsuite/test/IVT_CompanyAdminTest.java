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

public class IVT_CompanyAdminTest extends BaseTest {
	public IVT_CompanyAdminTest() throws Exception {
		super(false);
	}

	@Test
	public void CATabs() throws Exception {
		Log log = LogFactory.getLog("IVT_CompanyAdminTest");

		// login as company admin

		ReadExcel excel = new ReadExcel();
		String excelpath = ConfigProperties.get(ConfigProperties.READ_EXCEL_PATH);
		Row row = excel.ReadExcel(excelpath, "TestData.xlsx", "login",3);
		log.info("reading the data from excel");
		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);
		_LoginPageBehaviour.login(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
		Thread.sleep(500);
		ScreenShots.takeScreenshots(driver,"CA\\", "login");
		log.info("login credentials entered");

		// Validating the list of tabs and entering into each tab.
		
		log.info("List of tabs available for compnay admin are as follows");
		LeftNavigationMenuBehaviour Nav = new LeftNavigationMenuBehaviour(driver);
		ScreenShots.takeScreenshots(driver,"CA\\", "ProjectPage");
		Thread.sleep(2000);
		Nav.dashboard();
		ScreenShots.takeScreenshots(driver,"CA\\", "DashBoardPage");
		Thread.sleep(2000);
		Nav.submittals();
		ScreenShots.takeScreenshots(driver,"CA\\", "SubmittalsPage");
		Thread.sleep(2000);
		Nav.directory();
		ScreenShots.takeScreenshots(driver,"CA\\", "DirectoryPage");
		Thread.sleep(2000);
		Nav.reports();
		ScreenShots.takeScreenshots(driver,"CA\\", "ReportsPage");
		Thread.sleep(2000);
		Nav.emails();
		ScreenShots.takeScreenshots(driver,"CA\\", "EmailsPage");
		Thread.sleep(2000);
		Nav.portfolio();
		ScreenShots.takeScreenshots(driver,"CA\\", "PortfolioPage");
		Thread.sleep(2000);
		
		System.out.println("list of tabs available for company admin are displayed");

	}
	
	// closing the driver after validating the test case
	
		@AfterClass
		 public void quitBrowser()
		 {
			driverManager.quitDriver();
		 }
}
