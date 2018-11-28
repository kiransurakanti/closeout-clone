package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPortfolioPage extends BasePage
{

	public UserPortfolioPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'User Portfolio')]")
	WebElement userportfolio;
	
	public void clickuserportfolio()
	{
		userportfolio.click();
	}

}
