package com.pype.closeout.testsuite.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.LeftNavigationMenuBehaviour;

public class IVT_SuperAdminTest extends BaseTest
{
   public IVT_SuperAdminTest() throws Exception
   {
	   super(true);
   }
   
   @Test
    public void CheckSuperAdmin() throws Exception
    {
	   Log log = LogFactory.getLog("IVT_SuperAdminTest");
	   log.info("List of tabs available for compnay admin are as follows");
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
		Nav.emails();
		String emailstext = Nav.getemail();
		log.info(emailstext);
		Nav.clickcompanyportfolio();
		String companyportfoliotext =Nav.getcompanyportfolio();
		log.info(companyportfoliotext);
		Nav.clickadmin();
		String Admintext = Nav.getadmintext();
		log.info(Admintext);
		Nav.clickpypeadmin();
		String companyadmintext = Nav.getpypeadmin();
		log.info(companyadmintext);
    }
}
