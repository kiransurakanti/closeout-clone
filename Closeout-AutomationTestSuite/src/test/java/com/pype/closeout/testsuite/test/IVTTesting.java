package com.pype.closeout.testsuite.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.DashboardBehaviour;
import com.pype.closeout.testsuite.behaviour.ProjectDirectoryBehaviour;
import com.pype.closeout.testsuite.behaviour.ProjectPageBehaviour;
import com.pype.closeout.testsuite.behaviour.ReportsBehaviour;
import com.pype.closeout.testsuite.behaviour.SubmittalsBehaviour;
import com.pype.closeout.testsuite.behaviour.UserportFolioBehaviour;

public class IVTTesting extends BaseTest
{

	public IVTTesting() throws Exception
	{
		super(true);
		
	}
	
	// loading all the pages and getting the current URL of the respective pages.
	
	@Test
	 public void TestLoading() throws Exception
	 {
		Log log = LogFactory.getLog("IVTTesting");
		
		log.info("user loggedin");
		
		Thread.sleep(3000);

		String projectURL = driver.getCurrentUrl();
		
		log.info(projectURL);
		
		log.info("Loading DashBoard page");
		
		DashboardBehaviour dash = new DashboardBehaviour(driver);
		
		dash.Dashboard();
		
		String dasURL = driver.getCurrentUrl();
		
		log.info(dasURL);
		
		log.info("Loading Submittals page");
		
		SubmittalsBehaviour submittals = new SubmittalsBehaviour(driver);
		
		submittals.Clicksubmittals();
		
		String SubmittalsURL = driver.getCurrentUrl();
		
		log.info(SubmittalsURL);
		
		ProjectDirectoryBehaviour directory =  new ProjectDirectoryBehaviour(driver);
		
		directory.Clickdirectory();
		
		log.info("Loading directory page");
		
		String directoryURL = driver.getCurrentUrl();
		
		log.info(directoryURL);
		
		ReportsBehaviour reports = new ReportsBehaviour(driver);
		
		log.info("Loading reports page");
		
		reports.ClickReports();
		
		String ReportsURL = driver.getCurrentUrl();
		
		log.info(ReportsURL);
		
		UserportFolioBehaviour portfolio = new UserportFolioBehaviour(driver);
		
		log.info("Loading portfolio page");
		
		portfolio.Clickportfolio();
		
		String portfolioURL = driver.getCurrentUrl();
		
		log.info(portfolioURL);
		
				
	 }

}
