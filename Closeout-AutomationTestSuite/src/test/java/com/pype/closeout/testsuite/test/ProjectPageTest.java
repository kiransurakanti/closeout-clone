package com.pype.closeout.testsuite.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.LoginPageBehaviour;
import com.pype.closeout.testsuite.behaviour.ProjectPageBehaviour;
import com.pype.closeout.testsuite.core.ConfigProperties;
import com.pype.closeout.testsuite.core.ReadExcel;

public class ProjectPageTest extends BaseTest
{

	public ProjectPageTest() throws Exception
	{
		super(true);
	}
   
	@Test
	 public void CreateProject() throws Exception
	 
	 {
		Log log = LogFactory.getLog("ProjectPageTest");
		
		ProjectPageBehaviour project = new ProjectPageBehaviour(driver);
		project.createproject();
		Thread.sleep(2000);
		project.addprojectinfo("SKRTEST", "1", "11/30/2018", "Testing");
		log.info("add project details entered");
		project.projectdetails("1-2-3", "Bangalore", "Karnataka", "India", "12346", "0987654321", "0987654321", "0987654321");
		log.info("personal details entered");
		project.addcontacts();
		log.info("project details have entered");
		project.AddSubmittals();
		System.out.println("drag and drop");
		
		
		
		
		
	 }
}


