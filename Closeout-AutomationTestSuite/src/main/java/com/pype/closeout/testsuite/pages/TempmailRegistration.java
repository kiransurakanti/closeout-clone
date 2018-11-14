package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TempmailRegistration 
{
  @FindBy(css = "body > section.content-block-nopad.content-3-2 > div > div.col-lg-5.col-md-6.col-sm-6 >"
	 		+ " div.panel.panel-info > div.panel-body > div.visible-lg.visible-md > h4:nth-child(3) > span > a")
  
  WebElement newemial;
  
 
  
  
  public TempmailRegistration(WebDriver driver)
  {
	   	super();
		
	   	PageFactory.initElements(driver, this);
  }
  
  public String getemail()
  {
	  return newemial.getText();
	  
	 
  }
  
  
}