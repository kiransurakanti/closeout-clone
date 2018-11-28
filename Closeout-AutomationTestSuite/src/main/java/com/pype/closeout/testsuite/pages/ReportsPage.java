package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage extends  BasePage
{

	public ReportsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	WebElement Reports;
	
	public void clickreports()
	{
		Reports.click();
	}

}
