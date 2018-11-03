package com.pype.closeout.testsuite.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public static WebDriver driver;
	public static WebDriverWait wait;	
	
	
	
	public static WebDriver HighlightElement(WebDriver driver, WebElement element){ 
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);
	    }
	    return driver;
	}
	public static WebDriver UnhighlightElement(WebDriver driver, WebElement element){   
	    if (driver instanceof JavascriptExecutor) {    
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border=''", element);
	    }
	    return driver;  
	}
}