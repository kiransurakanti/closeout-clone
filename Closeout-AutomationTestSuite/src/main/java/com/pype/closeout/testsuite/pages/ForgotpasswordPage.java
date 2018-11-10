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

	public void SetEAddress(String EmailAddress) {
		emailaddress.sendKeys(EmailAddress);
	}

	public String GetEmailRequired() {
		return emailrequired.getText();
	}

	public void reset(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(ResetButton));
		ResetButton.click();

	}

	public void signup(WebDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(SignupButton));
		SignupButton.click();
	}

}