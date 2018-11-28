package com.pype.closeout.testsuite.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public Row ReadExcel(String filepath, String filename, String sheetname, int rownumber) throws IOException {

		// Create an object of File class to open xlsx file
		File file = new File(filepath + "\\" + filename);

		// Create an object of FileInputStream class to read excel file

		FileInputStream inputstream = new FileInputStream(file);

		Workbook workbook = null;
				// Find the file extension by splitting file name in substring and
		// getting only extension name
		String FileExtenstionName = filename.substring(filename.indexOf("."));

		// Check condition if the file is xlsx file
		if (FileExtenstionName.contains(".xlsx")) {
			// If it is xlsx file then create object of XSSFWorkbook class

			workbook = new XSSFWorkbook(inputstream);
		} else if (FileExtenstionName.contains(".xls")) {
			// If it is xlsx file then create object of XSSFWorkbook class

			workbook = new HSSFWorkbook(inputstream);
		}

		// Read sheet inside the workbook by its name
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownumber);
		
		return row;

	}

}
