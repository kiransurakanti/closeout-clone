package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pype.closeout.testsuite.pages.ProjectPage;

public class ProjectPageBehaviour extends BaseBehaviour
{
     WebDriver driver;

	public ProjectPageBehaviour(WebDriver driver)
    {
    	 
		this.driver = driver;
    	
    }
	
	 // Add project information
	
	public void addprojectinfo(String proname, String num, String creationdate, String desc) throws Exception
	{
		ProjectPage project = new ProjectPage(driver);
		project.setprojectname(proname);
		Thread.sleep(2000);
		project.setpronumber(num);
		Thread.sleep(2000);
		project.projType();
		Thread.sleep(2000);
		project.selectprotype();
		Thread.sleep(2000);
		project.date(creationdate);
		Thread.sleep(2000);
		project.projrange();
		Thread.sleep(2000);
		project.selectRange();
		Thread.sleep(2000);
		project.setdesciption(desc);
		Thread.sleep(2000);
		project.clickcontinue();
	}
	
	// Add Other Project Details
	
	public void projectdetails(String Address,String setcity,String State,String country,String zipcode,String mobile,String ofc,String fax ) throws Exception
	
	{
		ProjectPage project = new ProjectPage(driver);
		project.Setaddress(Address);
		Thread.sleep(2000);
		project.Setcity(setcity);
		Thread.sleep(2000);
		project.setstate(State);
		Thread.sleep(2000);
		project.setcountry(country);
		Thread.sleep(2000);
		project.setzipcode(zipcode);
		Thread.sleep(2000);
		project.setmobilenumber(mobile);
		Thread.sleep(2000);
		project.setofficephone(ofc);
		Thread.sleep(2000);
		project.setfax(fax);
		Thread.sleep(2000);
		project.clickcontinue();
	}
	}

