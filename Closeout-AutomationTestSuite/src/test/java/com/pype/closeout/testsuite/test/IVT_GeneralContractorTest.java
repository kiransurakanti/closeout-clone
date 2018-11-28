package com.pype.closeout.testsuite.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.LeftNavigationMenuBehaviour;

public class IVT_GeneralContractorTest  extends BaseTest{
    
	
	
	public IVT_GeneralContractorTest() throws Exception 
	{
		super(true);	
	}
  
	//validating list of tabs availabe for General Contractor
	
	
	@Test
	public void GCTabs() throws Exception
	{
		Log log = LogFactory.getLog("IVT_GeneralContractorTest");
		log.info("List of tabs available for General Contractor are as follows");
		LeftNavigationMenuBehaviour Nav = new LeftNavigationMenuBehaviour(driver);
		Thread.sleep(2000);
		String protext = Nav.getprojecttext();
		log.info("project tab has opened"+ protext);
		Thread.sleep(2000);
		Nav.dashboard();
		String dashboardtext = Nav.getdashboardtext();
		log.info("Dashboard has opened"+ dashboardtext);
		Thread.sleep(2000);
		Nav.submittals();
		String submittalstext = Nav.getsubmittalstext();
		log.info("Submittals tab has opened "+ submittalstext);
		Thread.sleep(2000);
		Nav.directory();
		String directorytext = Nav.getdirectorytext();
		log.info("Directory tab has  opened "+ directorytext);
		Thread.sleep(2000);
		Nav.reports();
		String reportstext = Nav.getreportstext();
		log.info("Reports tab has opened"+ reportstext);
		Nav.portfolio();
		String portfoliotext = Nav.getportfoliotext();
		log.info("Portfolio tab has opened"+ portfoliotext);
				
	
	}
}