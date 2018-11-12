package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;

import com.pype.closeout.testsuite.pages.TempmailRegistration;

public class TempmailregistrationBehaviour 
{
   WebDriver driver;
   
    public TempmailregistrationBehaviour(WebDriver driver)
    {
    	
    	this.driver = driver;
    
    }
     
    public void TempReg()
    {
    	 TempmailRegistration temp = new TempmailRegistration(driver);
    	 
    	 temp.getemail();
    	 
    	 String emial = temp.getemail();
       	 
    	 System.out.println(emial);
    	 
    }
    
}
