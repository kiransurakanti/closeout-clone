package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txt-email")
	WebElement UserName;

	@FindBy(id = "txt-password")
	WebElement Password;

	@FindBy(id = "btn-login")
	WebElement LoginButton;

	@FindBy(xpath = "//a[contains(text(),'Forgot Password ?')]")
	WebElement ForgotPasswordLink;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement SignupButton;

	public void setusername(String UName) {
		HighlightElement(driver ,UserName);
		UserName.sendKeys(UName);
		UnhighlightElement(driver ,UserName);
		
	}

	public void setPassword(String password) {
		Password.sendKeys(password);
	}

	public void forgorpasswordlink()
	{
		ForgotPasswordLink.click();
	}
	public void loginbutton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
		LoginButton.click();
	}

	public void Signuplink(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(SignupButton));
		SignupButton.click();
	}

}
