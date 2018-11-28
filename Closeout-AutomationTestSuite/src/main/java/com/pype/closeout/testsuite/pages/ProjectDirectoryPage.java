package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectDirectoryPage extends BasePage
{

	public ProjectDirectoryPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Project Directory')]")
	WebElement projectdirectory;
	
	
	
	// Methods to Highlight WebElements
	
		public void Highlight(WebElement w, String WebElement) {
			HighlightElement(driver , w);
			w.sendKeys(WebElement);
			UnhighlightElement(driver ,w);
		}

		public void HighlightClick(WebElement clickElement) {
			HighlightElement(driver , clickElement);
			clickElement.click();
			UnhighlightElement(driver ,clickElement);
		}

		
	public void clickprojectdirectory()
	{
		HighlightClick(projectdirectory);
	}
}
