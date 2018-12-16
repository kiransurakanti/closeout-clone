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

public class IVT_OwnerTest extends BaseTest
{
   public IVT_OwnerTest() throws Exception
   {
	   super(false);
   }
   
   @Test
    public void OwnerTabs() throws Exception
    {
		Log log = LogFactory.getLog("IVT_OwnerTest");

		// login as Owner

		ReadExcel excel = new ReadExcel();
		String excelpath = ConfigProperties.get(ConfigProperties.READ_EXCEL_PATH);
		Row row = excel.ReadExcel(excelpath, "TestData.xlsx", "login", 6);
		log.info("reading the data from excel");
		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);
		_LoginPageBehaviour.login(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
		Thread.sleep(500);
		ScreenShots.takeScreenshots(driver,"Owner\\", "login");
		log.info("login credentials entered");

		// Validating the list of tabs and entering into each tab.

		log.info("List of tabs available for Owner are as follows");
		LeftNavigationMenuBehaviour Nav = new LeftNavigationMenuBehaviour(driver);

		// selecting the project which was shared by company admin.

		Nav.clickcompanyshared();
		ScreenShots.takeScreenshots(driver,"Owner\\", "SharedPage");
		Thread.sleep(3000);

		// Validating the list of tabs.

		ScreenShots.takeScreenshots(driver,"Owner\\", "ProjectsPage");
		Nav.dashboard();
		ScreenShots.takeScreenshots(driver,"Owner\\", "DashBoardPage");
		Thread.sleep(2000);
		Nav.submittals();
		ScreenShots.takeScreenshots(driver,"Owner\\", "SubmittalsPage");
		Thread.sleep(2000);
		// Nav.directory();
		// String directorytext = Nav.getdirectorytext();
		// log.info("Directory tab has opened "+ directorytext);
		// Thread.sleep(2000);
		Nav.reports();
		ScreenShots.takeScreenshots(driver,"Owner\\", "ReportsPage");
		Thread.sleep(2000);
		Nav.portfolio();
		ScreenShots.takeScreenshots(driver,"Owner\\", "PortfolioPage");
		Thread.sleep(3000);
		
		System.out.println("List all the tabs are present for owner");
		
    }
   
// closing the driver after validating the test case
	
	@AfterClass
	 public void quitBrowser()
	 {
		driverManager.quitDriver();
	 }
   
}
