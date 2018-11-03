package com.pype.closeout.testsuite.core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.poi.ss.usermodel.Row;

public class FileUpload {
	static ReadExcel excel = new ReadExcel();

	public void fileupload() throws Exception {
		try {
			Row row = excel.ReadExcel("C:\\Wrokspace\\CloseoutTestData", "TestData.xlsx", "FileUpload", 1);
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
