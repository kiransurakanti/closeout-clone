package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeftNavigationMenuPage extends BasePage
{

	public LeftNavigationMenuPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	

	// side Navigation Bar elements.
	
	@FindBy(css = ".pype-heading > h1 > span")
	WebElement projecttext;
   
	@FindBy(xpath = "//span[@class='content-menu'][contains(text(),'Dashboard')]")
	WebElement dashboard;
	
	@FindBy(css = "app-dashboard > div > h1 > span")
	WebElement dashboardtext;
	
	@FindBy(xpath = "//span[@class='content-menu'][contains(text(),'Submittals')]")
	WebElement submittals;
	
	@FindBy(css = "app-submittal-list > div > div > h1 > span")
	WebElement submittalstext;
	
	@FindBy(xpath = "//span[contains(text(),'Directory')]")
	WebElement projectdirectory;
	
	@FindBy(css = "app-contact-list > div > h1 > span")
	WebElement directorytext;

	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	WebElement reports;
	
	@FindBy(css = "app-home > div > h1 > span")
	WebElement reportstext;
	
	@FindBy(xpath = "//span[contains(text(),'Portfolio')]")
	WebElement userportfolio;
	
	@FindBy(css = "app-portfolio > div > h1 > span")
	WebElement portfoliotext;
	
	@FindBy(xpath = "//span[contains(text(),'Emails')]")
	WebElement email;
	
	@FindBy(xpath = "//span[contains(text(),'Email Management')]")
	WebElement emailtext;
	
	@FindBy(xpath = "//span[contains(text(),'Company Portfolio')]")
	WebElement companyportfolio;
	
	@FindBy(className = "class='ng-binding")
	WebElement companypotfoliotext;
	
	@FindBy(xpath = "//span[contains(text(),'Admin')]")
	WebElement Administration;
	
	@FindBy(xpath = "//span[contains(text(),'Participant Groups')]")
	WebElement Administrationtext;
	
	@FindBy(xpath = "//span[contains(text(),'Pype Admin')]")
	WebElement PypeAdmin;
	
	@FindBy(xpath = "//span[contains(text(),'Contact Types')]")
	WebElement PypeAdmintext;
	
   // opening the project to see the role and list of menu's available.
	
	@FindBy(xpath = "//p[contains(text(),'mailinator1.com')]")
	WebElement clickcompany;
	
	public String getprojecttext(WebDriver driver) 
	     {
		   
		    return projecttext.getText();
		 }
	
	public void clickdashboard()
	    {
		   dashboard.click();
	    }
	
	public String getdashboardtext()
	    {
		return dashboardtext.getText();
	    }
	
	public void clicksubmittals()
	   {
		submittals.click();
	   }
	
	public String getsubmittalstext()
	   {
		return submittalstext.getText();
	   }
	
	public void clickdirectory()
	  {
		projectdirectory.click();
	  }
	
	public String getdirectorytext()
	  {
		return directorytext.getText();
	  }
	
	public void clickreports()
	  {
		reports.click();
	  }
	
	public String getreportstext()
	  {
		return reportstext.getText();
	  }
	
	public void clickuserportfolio()
	  {
		userportfolio.click();
	  }
	
	public String getportfoliotext()
	  {
		return portfoliotext.getText();
	  }
	
	public void clickemails()
	{
		email.click();
	}
	
	public String getemailtext()
	{
		return emailtext.getText();
	}
	
	public void emailisdisplayed()
	{
		email.isDisplayed();
	}
	
	public void companyportfolio()
	{
		companyportfolio.click();
	}
	
	public String getcompanyportfoliotext()
	{
		return companypotfoliotext.getText();
	}
	
	public void admin()
	{
		Administration.click();
	}
	
	public String getadmintext()
	{
		return Administrationtext.getText();
	}
	
	public void pypeadmin()
	{
		PypeAdmin.click();
	}
	
	public String getpypeadmintext()
	{
		return PypeAdmintext.getText();
	}
	
	public void clickcompanyshared()
	{
		clickcompany.click();
	}
 }