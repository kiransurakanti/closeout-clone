package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProjectPage extends BasePage

{

	public ProjectPage(WebDriver driver) 
	{
		
		super(driver);
		PageFactory.initElements(driver, this);
		
	}

	 //  Add project informatio
	
	 @FindBy(id = "btn-create-project")
	 WebElement createproject;
	 
	 @FindBy(id = "txt-name")
	 WebElement projectname;
	 
	 @FindBy(id = "project-number")
	 WebElement projectnumber;
	 
	 @FindBy(id = "project-completion-date")
	 WebElement date;
	 
	 @FindBy(id = "project-type")
	 WebElement projecttype;
	 
	 @FindBy(xpath = "//option[@value='5: Education']")
	 WebElement selecttype;
	 	 	
	 @FindBy(id= "value-range")
	 WebElement range;
	 
	 @FindBy(xpath = "//option[@value='2: $1M to $5M']")
	 WebElement selectrange;
	 
	 @FindBy(id = "description")
	 WebElement desc;
	 
	 @FindBy(className = "btn green-btn-common float-right")
	 WebElement continuebutton;
	 
	 @FindBy(className = "btn btn-default float-right")
	 WebElement gotoproject;
	 
	 // Other Project details
	 
	 @FindBy(id = "address")
	 WebElement address;
	 
	 @FindBy(id = "city")
	 WebElement city;
	 
	 @FindBy(id = "state")
	 WebElement state;
	 
	 @FindBy(id = "country")
	 WebElement country;
	 
	 @FindBy(id = "zipcode")
	 WebElement zipcode;
	 
	 @FindBy(id = "mobile-number")
	 WebElement mobilenumber;
	 
	 @FindBy(id = "office-number")
	 WebElement officenumber;

	 @FindBy(id = "fax")
	 WebElement fax;
	 
	 //Add contacts
	 
	 @FindBy(xpath = "//span[contains(text(),'Add Contact')]")
	 WebElement addcontact;
	 
	 // as there are correct xpaths will be leaving this add contact for timebeing
	 
	 //Add submittals.
	 
	 @FindBy(xpath = "//span[contains(text(),'Add Submital')]")
	 WebElement addsubmittals;
	
	 @FindBy(xpath = "//span[contains(text(),'Import Data')]")
	 WebElement importdata;
	 	 
	 @FindBy (id = "divisioncode")
	 WebElement Divcode;
	 
	 @FindBy(id = "speccode")
	 WebElement specificationcode;
	 
	 
	 @FindBy(id= "specname")
	 WebElement specname;
	 
	 @FindBy(id = "speccategory")
	 WebElement speccategory;
	 
	 @FindBy(xpath = "//span[contains(text(),'Create')]")
	 WebElement createbutton;
	 
	 @FindBy(id = "txt-file-upload")
	 WebElement BrowseFile;
	 
	 @FindBy(xpath = "//span[contains(text(),'Upload')]")
	 WebElement upload;
	 
	 public void projectcreate(WebDriver driver)
	 {
		 WebDriverWait wait = new WebDriverWait(driver , 15);
		 
		 wait.until(ExpectedConditions.elementToBeClickable(createproject));
		 
		 createproject.click();
	 }
	
	 // AddProject Details
	 
	 public void setprojectname(String ProjectName)
	 { 
		 projectname.sendKeys(ProjectName);
	 }
	 
	 public void setpronumber(String projectnum)
	 {
		projectnumber.sendKeys(projectnum); 
	 }
	 
	 public void date(String Date)
	 {
		 date.sendKeys(Date);
	 }
	 
	 public void projType()
	 {
		 projecttype.click();
	 }
	 
	 public void selectprotype()
	 {
		 selecttype.click();
	 }
	 
	 public void setdesciption(String discription)
	 {
		 desc.sendKeys(discription);
	 }
	 
	 public void projrange()
	 {
		 range.click();
	 }
	 
	 public void selectRange()
	 {
		 selectrange.click();
	 }
	 
	 public void clickcontinue()
	 {
		 continuebutton.click();
	 }
	 
	 public void clickgotoprojects()
	 {
		 gotoproject.click();
	 }
	 
	 // Add other project Details
	 
	 public void Setaddress(String add)
	 {
		 address.sendKeys(add);
	 }
	 
	 public void Setcity(String City)
	 {
		 city.sendKeys(City);
	 }
	 
	 public void setstate(String State)
	 {
		 state.sendKeys(State);
	 }
	 
	 public void setcountry(String Country)
	 {
		 country.sendKeys(Country);
	 }
	 
	 public void setzipcode(String Zip)
	 {
		 zipcode.sendKeys(Zip);
	 }
	 
	 public void setmobilenumber(String Mobnumber)
	 {
		 mobilenumber.sendKeys(Mobnumber);
	 }
	 
	 public void setofficephone(String officenum)
	 {
		 officenumber.sendKeys(officenum);
	 }
	 
	 public void setfax(String faxnum)
	 {
		 fax.sendKeys(faxnum);
	 }
	 
	 // Adding the submittals
	 
	 public void clickaddsubmittals(WebDriver driver)
	 {
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(addsubmittals));
		 addsubmittals.click();
	 }
	 
	 public void setdivcode(String divisioncode)
	 {
		 Divcode.sendKeys(divisioncode);
	 }
	 public void setspecode(String speccode)
	 {
		 specificationcode.sendKeys(speccode);
	 }
	 
	 public void setspecname(String Specname)
	 {
		 specname.sendKeys(Specname);
	 }
	 
	 public void setSpeccategiory(String SpecCategiory)
	 {
		 speccategory.sendKeys(SpecCategiory);
	 }
	 
}	 
 
  
