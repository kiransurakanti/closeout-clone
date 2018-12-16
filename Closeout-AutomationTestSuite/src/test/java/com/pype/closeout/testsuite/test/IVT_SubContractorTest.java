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

public class IVT_SubContractorTest  extends BaseTest{
    
	
	
	public IVT_SubContractorTest() throws Exception 
	{
		super(false);	
	}
  
	//validating list of tabs availabe for SubContractor
	
	
	@Test
	public void SCTabs() throws Exception
	{
		Log log = LogFactory.getLog("IVT_SubContractorTest");

		// login as Sub-Contractor

		ReadExcel excel = new ReadExcel();
		String excelpath = ConfigProperties.get(ConfigProperties.READ_EXCEL_PATH);
		Row row = excel.ReadExcel(excelpath, "TestData.xlsx", "login", 7);
		log.info("reading the data from excel");
		LoginPageBehaviour _LoginPageBehaviour = new LoginPageBehaviour(driver);
		_LoginPageBehaviour.login(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
		Thread.sleep(500);
		ScreenShots.takeScreenshots(driver,"SC\\", "SC-loginpage");
		log.info("login credentials entered");

		// Validating the list of tabs and entering into each tab.
		log.info("List of tabs available for SubContractor are as follows");
		LeftNavigationMenuBehaviour Nav = new LeftNavigationMenuBehaviour(driver);

		// selecting the project which was shared by company admin.
        
		Nav.clickcompanyshared();
		Thread.sleep(2000);
		ScreenShots.takeScreenshots(driver,"SC\\","ProjectShared");
		

		// Validating the list of tabs.

		Thread.sleep(2000);
		ScreenShots.takeScreenshots(driver,"SC\\","projectpage");
		Nav.dashboard();
		Thread.sleep(2000);
		ScreenShots.takeScreenshots(driver,"SC\\","dashboardpage");
		Nav.submittals();
		Thread.sleep(2000);
		ScreenShots.takeScreenshots(driver,"SC\\","submitalspage");
		System.out.println("all tabs are present for SC");
	
	}

	// closing the driver after validating the test case
	
		@AfterClass
		 public void quitBrowser()
		 {
			driverManager.quitDriver();
		 }

}
