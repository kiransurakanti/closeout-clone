package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TempmailSignUp 
{
  @FindBy(id = "inboxfield")
  
  WebElement entermail;
  
  @FindBy(className = "btn-dark")
  
  WebElement go;
  
  @FindBy(xpath = "//td[contains(text(),'Pype Closeout Confirmation')]")
  
  WebElement emaillink;
  
  @FindBy(linkText ="Password Setup")
  
  WebElement passwordSetuplink;
  
  @FindBy(id = "txt-password")
  
  WebElement newpassword ;
  
  @FindBy(id = "txt-confirm-password")
  
  WebElement confirmpassword;
  
  @FindBy(id = "btn-submit")
  
  WebElement submitbutton;
  
  public  TempmailSignUp(WebDriver driver)
  {
	   super();
	   
	   PageFactory.initElements(driver, this);
	   
  }
  
   public void setemial(String email) throws Exception
    
   {
	   entermail.sendKeys(email);
	   
	   Thread.sleep(2000);
	   
   }
   
    
   public void clickbutton()
   {
	    
	   go.click();
   
   }
   
   public void openemail(WebDriver driver)
   {
	   WebDriverWait wait = new WebDriverWait(driver,20);
	   
	   wait.until(ExpectedConditions.elementToBeClickable(emaillink));
	   
	   emaillink.click();
   }
   
   
   
    
    public void clickpasswordlink()
     
    {
    	
    	passwordSetuplink.click();
    
    }
    
    public void setpassword(String password)
     
    {
    	
    	newpassword.sendKeys(password);
    	
    }
     
    public void setconfirmpassword(String confirmpass)
     
    {
    	
    	confirmpassword.sendKeys(confirmpass);
    	
    }
    
    public void clicksubmit(WebDriver driver)
    
    {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(submitbutton));  	
    	
    	submitbutton.click();
    	
    }
    
    
}
