package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage 
{

	@FindBy(xpath = "//input[@id='txt-email']")
	WebElement EmailAddress;

	@FindBy(xpath = "//input[@id='txt-name']")
	WebElement Name;

	@FindBy(xpath = "//input[@id='txt-company-name']")
	WebElement Company;

	@FindBy(xpath = "//input[@id='txt-contact-number']")
	WebElement Number;

	@FindBy(xpath = "//div[contains(text(),'Email is required')]")
	WebElement EmailRequired;

	@FindBy(xpath = "//div[contains(text(),'Name is required')]")
	WebElement NameRequired;

	@FindBy(xpath = "//div[contains(text(),'Company Name is required')]")
	WebElement CompanyNameRequired;

	@FindBy(xpath = "//div[contains(text(),'Contact Number is required')]")
	WebElement NumberRequired;

	@FindBy(xpath = "//button[@id='btn-register']")
	WebElement SignUp;

	public RegisterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	public void SetEmail(String Email) {
		EmailAddress.sendKeys(Email);
	}

	public void SetName(String UserName) {
		Name.sendKeys(UserName);
	}

	public void SetCompany(String CompanyName) {
		Company.sendKeys(CompanyName);
	}

	public void SetNumber(String number) {
		Number.sendKeys(number);
	}

	public String getEmailRequired() {
		return this.EmailRequired.getText();
	}

	public String getNameRequired() {
		return this.NameRequired.getText();
	}

	public String getCompanyRequired() {
		return this.CompanyNameRequired.getText();
	}

	public String getNumberRewqired() {
		return this.NumberRequired.getText();
	}

	public void Signup(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(SignUp));
		SignUp.click();
	}
}
