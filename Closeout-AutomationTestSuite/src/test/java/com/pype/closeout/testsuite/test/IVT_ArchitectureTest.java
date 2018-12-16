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

public class IVT_ArchitectureTest extends BaseTest {
	public IVT_ArchitectureTest() throws Exception {
		super(false);
	}

	@Test
	public void ArchitechTabs() throws Exception {
		Log log = LogFactory.getLog("IVT_ArchitectureTest");
		

		// login as Architech
        ReadExcel excel = new ReadExcel();
		String excelpath = ConfigProperties.get(ConfigProperties.READ_EXCEL_PATH);
		Row row = excel.ReadExcel(excelpath, "TestData.xlsx", "login", 4);
		log.info("reading the data from excel");
		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);
		_LoginPageBehaviour.login(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
		Thread.sleep(500);
		ScreenShots.takeScreenshots(driver,"Architech\\", "login");
		log.info("login credentials entered");

		// Validating the list of tabs and entering into each tab

		log.info("List of tabs available for Architech are as follows");
		LeftNavigationMenuBehaviour Nav = new LeftNavigationMenuBehaviour(driver);
		Thread.sleep(2000);
		
		// selecting the project which was shared by company admin.
		
		Nav.clickcompanyshared();
		Thread.sleep(5000);
		ScreenShots.takeScreenshots(driver,"Architech\\", "SharedProject");
		
		// Validating the list of tabs.
		
		ScreenShots.takeScreenshots(driver,"Architech\\", "Projectspage");
		Thread.sleep(2000);
		Nav.dashboard();
		ScreenShots.takeScreenshots(driver,"Architech\\", "DashBoardPage");
		Thread.sleep(2000);
		Nav.submittals();
		ScreenShots.takeScreenshots(driver,"Architech\\", "SubmittalsPage");
		Thread.sleep(2000);
		Nav.reports();
		ScreenShots.takeScreenshots(driver,"Architech\\", "ReportsPage");
		Thread.sleep(2000);
		Nav.portfolio();
		ScreenShots.takeScreenshots(driver,"Architech\\", "PortfolioPage");
		Thread.sleep(2000); 
		System.out.println("all the tabs are present for architech");
	}

	// closing the driver after validating the test case

	@AfterClass
	public void quitBrowser() {
		driverManager.quitDriver();
	}
}
