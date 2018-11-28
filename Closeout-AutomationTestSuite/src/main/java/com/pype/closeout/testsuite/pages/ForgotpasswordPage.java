package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotpasswordPage extends BasePage {
	public ForgotpasswordPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txt-email")
	WebElement emailaddress;

	@FindBy(className = "txt-email")
	WebElement emailrequired;

	@FindBy(id = "btn-reset")
	WebElement ResetButton;

	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	WebElement SignupButton;

	// Methods to Hightlight WebElements

	public void Highlight(WebElement w, String WebElement) {
		HighlightElement(driver, w);
		w.sendKeys(WebElement);
		UnhighlightElement(driver, w);
	}

	public void HighlightClick(WebElement clickElement) {
		HighlightElement(driver, clickElement);
		clickElement.click();
		UnhighlightElement(driver, clickElement);
	}

	public void SetEAddress(String EmailAddress) {
		Highlight(emailaddress, EmailAddress);
	}

	public String GetEmailRequired() {
		return emailrequired.getText();
	}

	public void reset(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(ResetButton));
		HighlightClick(ResetButton);

	}

	public void signup(WebDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(SignupButton));
		SignupButton.click();
	}

}