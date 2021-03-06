package com.pype.closeout.testsuite.behaviour;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.mortbay.log.Log;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pype.closeout.testsuite.core.FileUpload;
import com.pype.closeout.testsuite.pages.ProjectPage;

public class ProjectPageBehaviour extends BaseBehaviour
{
     WebDriver driver;

	public ProjectPageBehaviour(WebDriver driver)
    {
    	 
		this.driver = driver;
    	
    }
	
	
	
/*	public void createproject() throws Exception
	{
		ProjectPage project = new ProjectPage(driver);
		project.projectcreate(driver);
	}
*/
	
	// Add project
	
	public void addproject() throws Exception
	{
		ProjectPage project = new ProjectPage(driver);
		project.addproject(driver);
	}
	
	
	public void addprojectinfo(String proname, String num, String creationdate,String percentageprofit, String desc,String EnterRange) throws Exception
	{
		ProjectPage project = new ProjectPage(driver);
		Robot robot = new Robot();
		project.setprojectname(proname);
		Thread.sleep(1000);
		project.setpronumber(num);
		Thread.sleep(1000);
	/*	project.projType();
		Thread.sleep(2000);
		project.selectprotype();
		Thread.sleep(500);
	*/	
		project.date(creationdate);
		Thread.sleep(500);
		Log.info("selecting project range");
       
			
		
//		project.projrange(EnterRange);		
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
		
		Log.info("selected project range");
		Thread.sleep(500);
	    project.setprofit(percentageprofit);
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
        project.clickmapcontinuebutton();
        
        
		
		
		
		
	}
	}

