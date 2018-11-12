package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TempmailRegistration 
{
  @FindBy(id = "mail")
  
  WebElement newemial;
  
  @FindBy(xpath = "//a[@id='click-to-refresh']")
  
  WebElement refresh;
  
  
  public TempmailRegistration(WebDriver driver)
  {
	   	super();
		
	   	PageFactory.initElements(driver, this);
  }
  
  public String getemail()
  {
	  return newemial.getAttribute("value");
	 
  }
  
   public void refresh()
   {
	   refresh.click();
   }
}