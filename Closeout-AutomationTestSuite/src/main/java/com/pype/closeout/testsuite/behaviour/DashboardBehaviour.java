package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;

import com.pype.closeout.testsuite.pages.DashBoardPage;

public class DashboardBehaviour  extends BaseBehaviour
{

	 WebDriver driver;
	 
	 public DashboardBehaviour(WebDriver driver)
	 {
		 this.driver = driver;
		 
	 }
	 
	 public void Dashboard() throws Exception
	 {
		 DashBoardPage dashboard =  new DashBoardPage(driver);
		 Thread.sleep(3000);
		 dashboard.clickdashboard();
	 }
}
