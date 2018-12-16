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

	// creted two method to highlight and unhighlight webelements

	public void Highlight(WebElement w, String WebElement) {
		HighlightElement(driver, w);
		if(WebElement!=null)
		w.sendKeys(WebElement);
		UnhighlightElement(driver, w);
	}

	public void HighlightClick(WebElement clickElement) {
		HighlightElement(driver, clickElement);
		clickElement.click();
		UnhighlightElement(driver, clickElement);
	}

	public void setusername(String UName) {
		Highlight(UserName, UName);
	}

	public void setPassword(String password) {
		Highlight(Password, password);
	}

	public void forgorpasswordlink() {
		HighlightClick(ForgotPasswordLink);
	}

	public void loginbutton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
		HighlightClick(LoginButton);

	}

	public void Signuplink(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(SignupButton));
		HighlightClick(SignupButton);
	}

}
