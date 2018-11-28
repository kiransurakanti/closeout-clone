package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;

import com.pype.closeout.testsuite.pages.ReportsPage;

public class ReportsBehaviour extends BaseBehaviour
{
   WebDriver driver;
   
   public ReportsBehaviour(WebDriver driver)
   {
	   this.driver = driver;
	   
   }
   
   public void ClickReports() throws Exception
   {
	   ReportsPage reports = new ReportsPage(driver);
	   Thread.sleep(3000);
	   reports.clickreports();
   }
}  
