package com.pype.closeout.testsuite.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcel 
{

	  public void WriteExcel(String filepath, String filename, String sheetname , int rownumber , String[] datatowrite) throws IOException
	  
	  {
		   
		   File file = new File(filepath +"\\" + filename);
		   
		   //Create an object of FileInputStream class to read excel file
		   
		   FileInputStream inputstream = new FileInputStream(file);
		   
		   Workbook workbook = null;
		   
		   //Find the file extension by splitting  file name in substring and getting only extension name
		   
		   String fileExtensionName = filename.substring(filename.indexOf("."));
		   
		   //Check condition if the file is .xlsx file
		   
		   if (fileExtensionName.contains(".xlsx"))
		   
		   {
			
			   workbook = new XSSFWorkbook(inputstream);
			   
		   }
		   
		   //Check condition if the file is .xls file
		   
		   else if(fileExtensionName.contains(".xls"))
		   
		   {
			   
			   workbook = new HSSFWorkbook(inputstream);
			   
		   }
	  
		     //Read excel sheet by sheet name    

		    Sheet sheet = workbook.getSheet(sheetname);

		    //Get the current count of rows in excel file

		    int rowCount = sheet.getLastRowNum()+1 ;

		   String[] data = datatowrite;
		  	    
		    //Get the first row from the sheet

		   Row row = sheet.getRow(0);
         
		    // create a new row and append it at last of the sheet
		    
		    Row newRow = sheet.createRow(rowCount);
		    
		    // create a loop for new added cells.
		    
//		    for (int i= 0 ; i<2 ; i++)
//		    	 
//		    {
		    	 // Fill data in row.
		    	
		    	Cell cell = newRow.createCell(0);
		    	
		    	cell.setCellValue(datatowrite[0]);
		    			    	
		//   }
		    	
	   // Close inputstream
		    
		    inputstream.close();
		    
	  //Create an object of FileOutputStream class to create write data in excel file
   	    
		    FileOutputStream outputstream = new FileOutputStream(file);
		    
		    // write data in excelfile
		    
		    workbook.write(outputstream);
		    
		    // close outputStream
		    
		    outputstream.close();  
	  }
	  
	  
	  
	 
	
}