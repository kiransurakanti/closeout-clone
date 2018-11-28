package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;

import com.pype.closeout.testsuite.pages.SubmittalsPage;

public class SubmittalsBehaviour  extends BaseBehaviour
{
    WebDriver driver;
    
    public SubmittalsBehaviour(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void Clicksubmittals() throws Exception
    {
    	SubmittalsPage submittals = new SubmittalsPage(driver);
    	Thread.sleep(3000);
    	submittals.clickSubmittals();
    }
}
