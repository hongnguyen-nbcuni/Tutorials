package utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	// xlsx format (new)
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	// xls format (old)
	//static HSSFWorkbook workbook;
	//static HSSFSheet sheet;

	// constructor
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			// xlsx format
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

		/*
		try {		
			InputStream file = new FileInputStream(excelPath);			
			// xls older fomrat
			workbook = new HSSFWorkbook(new POIFSFileSystem(file));
			sheet = workbook.getSheet(sheetName);	
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		 */
	}


	public static void getCellData(int rowNum, int colNum) throws IOException {

		/*
		String excelPath = "./data/TestData.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		 */
		DataFormatter formatter = new DataFormatter();
		// object to store any datatype
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum)); 
		System.out.println(value);

	}

	// create a function to get row count
	public static void getRowCount() {

		//String projDir = System.getProperty("user.dir");
		//System.out.println(projDir);
		/*
		try {
			String excelPath = "./data/TestData.xlsx";
			SSFWorkbook workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows: " + rowCount);
		} 
		catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		 */

		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows: " + rowCount);

	}
}
