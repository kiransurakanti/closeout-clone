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
     
    public String TempReg() throws Exception
    {
    	
    	
    	 TempmailRegistration temp = new TempmailRegistration(driver);
    	 
    	 temp.getemail();
    	 
    	 Thread.sleep(2000);
    	 
    	 String email = temp.getemail();
       	 
    	 Thread.sleep(2000);
    	 
    	 System.out.println(email);
    	 return email;
    }
    
}
