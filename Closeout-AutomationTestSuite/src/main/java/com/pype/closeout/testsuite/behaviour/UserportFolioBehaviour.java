package com.pype.closeout.testsuite.behaviour;

import org.openqa.selenium.WebDriver;

import com.pype.closeout.testsuite.pages.UserPortfolioPage;

public class UserportFolioBehaviour extends BaseBehaviour
{
   
	 WebDriver driver;
	 
	 public UserportFolioBehaviour(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 public void Clickportfolio() throws Exception
	 {
		 UserPortfolioPage portfolio = new UserPortfolioPage(driver);
		 Thread.sleep(3000);
		 portfolio.clickuserportfolio();
	 }
}
