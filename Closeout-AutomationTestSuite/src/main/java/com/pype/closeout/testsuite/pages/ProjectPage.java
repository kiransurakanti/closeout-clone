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
	
//	 @FindBy(id = "btn-create-project")
//	 WebElement createproject;
	 
	 @FindBy(id = "btn-add-new-project")
	 WebElement addproject;
	 
	 @FindBy(id = "txt-name")
	 WebElement projectname;
	 
	 @FindBy(id = "project-number")
	 WebElement projectnumber;
	 
	 @FindBy(id = "project-completion-date")
	 WebElement date;
	 
	/* @FindBy(id = "project-type")
	 WebElement projecttype;
	 
	 @FindBy(xpath = "//div[@id='a0669773eb7e']")
	 WebElement selecttype;
	 */	 	
	 @FindBy(id= "value-range")
	 WebElement range;
	 
	 @FindBy(xpath = "//div[@id='afd869aa9ded']")
	 WebElement selectrange;
	 
	 @FindBy(id = "description")
	 WebElement desc;
	 
	 @FindBy(id = "profit-percentage")
	 WebElement profitpercentage;
	 
	 @FindBy(xpath = "//span[contains(text(),'Continue')]")
	 WebElement continuebutton;
	 
	 @FindBy(xpath = "//span[contains(text(),'Go To Projects')]")
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
	
	 @FindBy(xpath = "//span[contains(text(),'Import Submittals')]")
	 WebElement importdata;
	 
	 @FindBy(id = "txt-file-upload")
	 WebElement browsefile;
		 	 
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
	 
	 @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-column-selection/div/div[2]/div/div[1]/div/div/ul/li[1]")
	 WebElement dragsubgroup;
	 
	 @FindBy(xpath = "//li[contains(text(),'DIVISION CD')]")
	 WebElement dragDivcode;
	 
	 @FindBy(xpath = "//li[contains(text(),'SPECIFICATION NAME')]")
	 WebElement dragspecname;
	 
	 @FindBy(xpath = "//li[contains(text(),'SPECIFICATION NUMBER')]")
	 WebElement dragspecnum;
	 
	 @FindBy(xpath = "//div[@class='pype-field-list-div']//ul[5]")
	 WebElement dropspecname;
	 
	 @FindBy(xpath = "//div[@class='pype-field-list-div']//ul[3]")
	 WebElement dropdivicode;
	 
	 @FindBy(xpath = "//div[@class='pype-field-list-div']//ul[4]")
	 WebElement dropspeccode;
	 
	 @FindBy(xpath= "//button[@type='button']//span[contains(text(),'Continue')]")
	 WebElement mapcontinuebutton;
	 
	 
	 
	 @FindBy(xpath = "//span[contains(text(),'Continue')]")
	 WebElement clickcontinue;
	 
	 
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

/*		
	 public void projectcreate(WebDriver driver) throws Exception
	 {
		 WebDriverWait wait = new WebDriverWait(driver , 20);
		 
		 wait.until(ExpectedConditions.elementToBeClickable(createproject));
		 Thread.sleep(2000);
		 
		HighlightClick(createproject);
	 }
*/	
	 public void addproject(WebDriver driver) throws Exception
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(addproject));
		 Thread.sleep(2000);
		 //HighlightClick(addproject);
		 addproject.click();
	 }

		// AddProject Details
	 
	 public void setprojectname(String ProjectName)
	 { 
		 Highlight(projectname, ProjectName);
	 }
	 
	 public void setpronumber(String projectnum)
	 {
		Highlight(projectnumber, projectnum);
	 }
	 
	 public void date(String Date)
	 {
		Highlight(date, Date);
	 }
	 
/*	 public void projType()
	 {
		HighlightClick(projecttype);

	 }
	 
	 public void selectprotype()
	 {
		HighlightClick(selecttype);
		
	 }
*/	 
	 public void setprofit(String percentage)
	 {
		 Highlight(profitpercentage, percentage);
	 }
	 
	 public void setdesciption(String discription)
	 {
		 Highlight(desc, discription);
	 }
	 
	 public void  projrange() throws Exception
	 {
		 range.click();
		 Thread.sleep(2000);
		// range.sendKeys(Range);
	 }
	 
	 public void selectRange()
	 {
		 HighlightClick(selectrange);
	 }
	 
	 public void clickcontinue()
	 {
		 HighlightClick(continuebutton);
	 }
	 
	 public void clickgotoprojects()
	 {
		 HighlightClick(gotoproject);
	 }
	 
	 // Add other project Details
	 
	 public void Setaddress(String add)
	 {
		 Highlight(address, add);
	 }
	 
	 public void Setcity(String City)
	 {
		 Highlight(city, City);
	 }
	 
	 public void setstate(String State)
	 {
		 Highlight(state, State);
	 }
	 
	 public void setcountry(String Country)
	 {
		Highlight(country, Country);
	 }
	 
	 public void setzipcode(String Zip)
	 {
		 Highlight(zipcode, Zip);
	 }
	 
	 public void setmobilenumber(String Mobnumber)
	 {
		 Highlight(mobilenumber, Mobnumber);
	 }
	 
	 public void setofficephone(String officenum)
	 {
		 Highlight(officenumber, officenum);
	 }
	 
	 public void setfax(String faxnum)
	 {
		 Highlight(fax, faxnum);
	 }
	 
	 // Adding the submittals
	 
	 public void clickaddsubmittals(WebDriver driver)
	 {
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(addsubmittals));
		 HighlightClick(addsubmittals);
	 }
	 
	 public void setdivcode(String divisioncode)
	 {
		 Highlight(Divcode, divisioncode);
	 }
	 public void setspecode(String speccode)
	 {
		 Highlight(specificationcode, speccode);
	 }
	 
	 public void setspecname(String Specname)
	 {
		 specname.sendKeys(Specname);
	 }
	 
	 public void setSpeccategiory(String SpecCategiory)
	 {
		 speccategory.sendKeys(SpecCategiory);
	 }
	 
	 public void importsubmitals()
	 {
		 importdata.click();
	 }
	 
	 public void BrowseFile()
	 {
		 BrowseFile.click();
	 }
	 public void clickupload()
	 {
		 upload.click();
	 }
	
	 public WebElement dragdivcode()
	 {
		return dragDivcode;
		 
	 }
	 
	 public WebElement  dropdcode()
	 {
		return dropdivicode;
	 }
	 
	 
	 
	 public void clickmapcontinuebutton()
	 {
		 mapcontinuebutton.click();
	 }
	 
}
  
