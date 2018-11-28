package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.pype.closeout.testsuite.core.FileUpload;
import com.pype.closeout.testsuite.pages.ProjectPage;

public class ProjectPageBehaviour extends BaseBehaviour
{
     WebDriver driver;

	public ProjectPageBehaviour(WebDriver driver)
    {
    	 
		this.driver = driver;
    	
    }
	
	 // Add project information
	
	public void createproject() throws Exception
	{
		ProjectPage project = new ProjectPage(driver);
		project.projectcreate(driver);
	}
	
	public void addprojectinfo(String proname, String num, String creationdate, String desc) throws Exception
	{
		ProjectPage project = new ProjectPage(driver);
		project.setprojectname(proname);
		Thread.sleep(1000);
		project.setpronumber(num);
		Thread.sleep(1000);
		project.projType();
		Thread.sleep(500);
		project.selectprotype();
		Thread.sleep(500);
		project.date(creationdate);
		Thread.sleep(500);
		project.projrange();
		Thread.sleep(500);
		project.selectRange();
		Thread.sleep(500);
		project.setdesciption(desc);
		Thread.sleep(500);
		project.clickcontinue();
		Thread.sleep(10000);
	}
	
	// Add Other Project Details
	
	public void projectdetails(String Address,String setcity,String State,String country,String zipcode,String mobile,String ofc,String fax ) throws Exception
	
	{
		
		ProjectPage project = new ProjectPage(driver);
		project.Setaddress(Address);
		Thread.sleep(500);
		project.Setcity(setcity);
		Thread.sleep(500);
		project.setstate(State);
		Thread.sleep(500);
		project.setcountry(country);
		Thread.sleep(500);
		project.setzipcode(zipcode);
		Thread.sleep(500);
		project.setmobilenumber(mobile);
		Thread.sleep(500);
		project.setofficephone(ofc);
		Thread.sleep(500);
		project.setfax(fax);
		Thread.sleep(500);
		project.clickcontinue();
		Thread.sleep(5000);
	}
	
	
	// add Contacts details.
	public void addcontacts() throws Exception
	{
		ProjectPage project = new ProjectPage(driver);
		project.clickcontinue();
		Thread.sleep(5000);
	}
	
	// Add Submittals or Import from a file
	
	public void AddSubmittals() throws Exception
	{   
		ProjectPage project = new ProjectPage(driver);
		project.importsubmitals();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("C:/Wrokspace/test.xls");
		Thread.sleep(3000);
		project.BrowseFile();
		FileUpload upload = new FileUpload();
		upload.fileupload();
		Thread.sleep(2000);
		project.clickupload();
		 //Using Action class for drag and drop.
		
		Thread.sleep(2000);
        Actions act=new Actions(driver);
        act.dragAndDrop(project.dragdivcode(), project.dropdcode()).build().perform();
        
        
		
		
		
		
	}
	}

