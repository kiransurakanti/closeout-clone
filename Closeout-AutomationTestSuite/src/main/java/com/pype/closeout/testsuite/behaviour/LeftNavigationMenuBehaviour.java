package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;

import com.pype.closeout.testsuite.pages.LeftNavigationMenuPage;

public class LeftNavigationMenuBehaviour extends BaseBehaviour{
     
	WebDriver driver;
	
	
	
	public LeftNavigationMenuBehaviour(WebDriver driver) 
	{
	  this.driver = driver; 
	  
	}
	
	public String getprojecttext() throws Exception
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		String protext = nav.getprojecttext(driver);
		Thread.sleep(2000);
		return protext;
		
	}
	// click on the company shared to see the list of menu's available for GC,SC,Owner and Archi.
	
	public void clickcompanyshared()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.clickcompanyshared();
	}
	
	public void dashboard()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.clickdashboard();
	}
	
	public String getdashboardtext()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		String dashboardtext =  nav.getdashboardtext();
		
		return dashboardtext;
	}
	
	public void submittals()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.clicksubmittals();
	}
	
	public String getsubmittalstext()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
        String Submittaltext =nav.getsubmittalstext();
    	return Submittaltext;
	}
	
	public void directory()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.clickdirectory();
	}
	
	public String getdirectorytext()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		String directorytext = nav.getdirectorytext();
		return directorytext;
	}
	
	public void reports()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.clickreports();
	}
	
	public String getreportstext()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		String reportstext= nav.getreportstext();
		return reportstext;
	}
	
	public void portfolio()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.clickuserportfolio();
	}
	
	public String getportfoliotext()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		String portfoliotext= nav.getportfoliotext();
		return portfoliotext;
	}
	
	public void emialdisplayed()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.emailisdisplayed();
	}
	public void emails()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.clickemails();
	}
	
	public String getemail()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		return nav.getemailtext();
	}
   
	public void clickcompanyportfolio()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.companyportfolio();
	}
	
	public String getcompanyportfolio()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		return nav.getcompanyportfoliotext();
	}
	
	public void clickadmin()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.admin();
	}
	
	public String getadmintext()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		return nav.getadmintext();
	}
	
	public void clickpypeadmin()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		nav.pypeadmin();
	}
	public String getpypeadmin()
	{
		LeftNavigationMenuPage nav = new LeftNavigationMenuPage(driver);
		return nav.getpypeadmintext();
	}
}
