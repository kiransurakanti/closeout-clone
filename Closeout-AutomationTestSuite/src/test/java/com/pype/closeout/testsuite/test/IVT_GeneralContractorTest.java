package com.pype.closeout.testsuite.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Row;
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
		ScreenShots.takeScreenshots(driver, "GC-loginpage");
		log.info("login credentials entered");

		// Validating the list of tabs and entering into each tab.

		log.info("List of tabs available for General Contractor are as follows");
		LeftNavigationMenuBehaviour Nav = new LeftNavigationMenuBehaviour(driver);
		Thread.sleep(2000);
		String protext = Nav.getprojecttext();
		log.info("project tab has opened" + protext);
		Thread.sleep(2000);
		Nav.dashboard();
		String dashboardtext = Nav.getdashboardtext();
		log.info("Dashboard has opened" + dashboardtext);
		Thread.sleep(2000);
		Nav.submittals();
		String submittalstext = Nav.getsubmittalstext();
		log.info("Submittals tab has opened " + submittalstext);
		Thread.sleep(2000);
		Nav.directory();
		String directorytext = Nav.getdirectorytext();
		log.info("Directory tab has  opened " + directorytext);
		Thread.sleep(2000);
		Nav.reports();
		String reportstext = Nav.getreportstext();
		log.info("Reports tab has opened" + reportstext);
		Nav.portfolio();
		String portfoliotext = Nav.getportfoliotext();
		log.info("Portfolio tab has opened" + portfoliotext);

		// taking the screenshot page.

		ScreenShots.takeScreenshots(driver, "Gen-Contractor");
	}

	// closing the driver after validating the test case

	@AfterTest
	public void quitBrowser() {
		driverManager.quitDriver();
	}
}
