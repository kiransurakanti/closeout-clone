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
import com.pype.closeout.testsuite.pages.LoginPage;

public class IVT_SuperAdminTest extends BaseTest {
	public IVT_SuperAdminTest() throws Exception {
		super(true);
	}

	@Test
	public void CheckSuperAdmin() throws Exception {
		Log log = LogFactory.getLog("IVT_SuperAdminTest");

		// login as Super admin
		
		
		
		// Validating the list of tabs and entering into each tab.
		
		log.info("List of tabs available for compnay admin are as follows");
		LeftNavigationMenuBehaviour Nav = new LeftNavigationMenuBehaviour(driver);
		Thread.sleep(2000);
		ScreenShots.takeScreenshots(driver,"SuperAdmin\\", "ProjectsPage");
		Nav.dashboard();
		Thread.sleep(2000);
		ScreenShots.takeScreenshots(driver,"SuperAdmin\\", "DashBoardPage");
		Nav.submittals();
		Thread.sleep(2000);
		ScreenShots.takeScreenshots(driver,"SuperAdmin\\", "SubmittalsPage");
		Nav.directory();
		Thread.sleep(2000);
		ScreenShots.takeScreenshots(driver,"SuperAdmin\\", "DirectoryPage");
		Nav.reports();
		Thread.sleep(3000);
		ScreenShots.takeScreenshots(driver,"SuperAdmin\\", "reportsPage");
		Nav.emails();
		Thread.sleep(3000);
		ScreenShots.takeScreenshots(driver,"SuperAdmin\\", "EmailsPage");
		Nav.portfolio();
		Thread.sleep(3000);
		ScreenShots.takeScreenshots(driver,"SuperAdmin\\", "PortfolioPage");
		
		
	/*	Nav.clickcompanyportfolio();
		String companyportfoliotext = Nav.getcompanyportfolio();
		log.info(companyportfoliotext);
		Thread.sleep(3000);
		ScreenShots.takeScreenshots(driver,"SuperAdmin\\", "CompanyPorfolioPage");
	*/	
		Nav.clickadmin();
		Thread.sleep(3000);
		ScreenShots.takeScreenshots(driver,"SuperAdmin\\", "AdminPage");
		Nav.clickpypeadmin();
		Thread.sleep(3000);
		ScreenShots.takeScreenshots(driver,"SuperAdmin\\", "PypeadminPage");
		System.out.println("All tabs are present for super admin");

	}
	
	// closing the driver after validating the test case
	
	@AfterClass
	 public void quitBrowser()
	 {
		driverManager.quitDriver();
	 }
}
