package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmittalsPage extends BasePage
{

	public SubmittalsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[@class='content-menu'][contains(text(),'Submittals')]")
	WebElement submittals;
	

	public void clickSubmittals()
	{
		submittals.click();
	}
}
