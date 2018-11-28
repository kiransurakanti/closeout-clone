package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;

import com.pype.closeout.testsuite.pages.ProjectDirectoryPage;

public class ProjectDirectoryBehaviour extends BaseBehaviour
{
   WebDriver driver;
   
   public ProjectDirectoryBehaviour(WebDriver driver)
   {
	   this.driver = driver;
	   
   }
   
   public void Clickdirectory() throws Exception
   {
	   ProjectDirectoryPage directory = new ProjectDirectoryPage(driver);
	   Thread.sleep(3000);
	   directory.clickprojectdirectory();
   }
}
