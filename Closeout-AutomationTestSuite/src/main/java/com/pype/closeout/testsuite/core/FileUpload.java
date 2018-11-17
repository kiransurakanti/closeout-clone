package com.pype.closeout.testsuite.core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;

public class FileUpload {
	static ReadExcel excel = new ReadExcel();

	private static Logger logger = LogManager.getLogger(FileUpload.class);
	
	public void fileupload() throws Exception {
		try {
			
//			Properties property = new Properties();
//			property.load(new FileInputStream("config.properties"));
//			String excelpath = property.getProperty("readexcel");
			
			// instead of calling property file created java class file 
			
			String excelpath = ConfigProperties.get(ConfigProperties.READ_EXCEL_PATH);
			
			
			Row row = excel.ReadExcel(excelpath, "TestData.xlsx", "FileUpload", 1);
			
			
			StringSelection ss = new StringSelection(row.getCell(0).getStringCellValue());
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			fileupload();
		} catch (Exception e) {

			System.out.println("GEtting exception while uploading file" + e);

		}

	}

	public static void upload() throws Exception {
		try {
			Thread.sleep(4000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
