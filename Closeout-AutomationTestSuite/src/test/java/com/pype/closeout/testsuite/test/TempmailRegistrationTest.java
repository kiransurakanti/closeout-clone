package com.pype.closeout.testsuite.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pype.closeout.testsuite.behaviour.TempmailregistrationBehaviour;
import com.pype.closeout.testsuite.core.WriteExcel;
import com.pype.closeout.testsuite.drivers.DriverManager;
import com.pype.closeout.testsuite.drivers.DriverManagerFactory;
import com.pype.closeout.testsuite.drivers.DriverType;

public class TempmailRegistrationTest 

{
	public class LoginPageTest extends BaseTest {
		
		public LoginPageTest() {
		
			super(false);
		
		}
	
		
		@Test
		 public void tempmail() throws FileNotFoundException, IOException
		 {
             
			driver.navigate().to("https://temp-mail.org/en");
			
			TempmailregistrationBehaviour _tempmail = new TempmailregistrationBehaviour(driver);
			_tempmail.TempReg();
			
			
			WriteExcel excel = new WriteExcel();
             
             Properties property = new Properties();
             
             property.load(new FileInputStream("config.properties"));
             
             String Excelpath = property.getProperty("writeExcel");
             
             String datatowrite = 
				  
				 // WriteExcel writeexcel = writeexcel.WriteExcel(Excelpath, "TestData.xlsx", "WriteData", 1, datatowrite);
				  
				 
			  }
		  
		 }
		

}
	
