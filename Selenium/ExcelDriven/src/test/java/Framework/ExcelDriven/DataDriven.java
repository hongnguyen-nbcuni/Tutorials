package Framework.ExcelDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	// use poi implement logic:
	// Identify Testcases column by scanning the entire list row
	// once column is identified then scan entire testcase column to identify purchase testcase row
	// after you grab purchase testcase row = pull all the data of that row and feed into test

	public ArrayList<String> getData(String testcaseName) throws IOException {


		ArrayList<String> a = new ArrayList<String>();

		// FileInputStream argument - to read your data
		FileInputStream fis = new FileInputStream("/Users/hnguyen/qa-development/Tutorials/Selenium/temp/ExcelDriven_test1.xlsx"); 
		// Create object for XSSFWorkbook class – get hold of excel sheet 
		// it has access to fis,it has ability to go inside this excel because of this fis object
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// get number of sheets
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i<sheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// iterate all the rows of that sheet
				Iterator<Row> rows = sheet.iterator(); 			// sheet is collection of rows
				Row firstrow = rows.next();
				Iterator<Cell> cell = firstrow.cellIterator(); 	// row is collection of cells

				int k = 0;
				int column = 0;

				// it's checking to see if it has next row but will not move to that cell
				while(cell.hasNext()) { 
					Cell value = cell.next(); // this will move to the next cell

					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						// desired column
						column = k;
					}
					k++;

				}
				System.out.println(column);

				// once column is identified and scan the column and get the specific Purchase row
				while(rows.hasNext()) {
					Row r = rows.next(); // now I"m in the first row
					// get me the cell value of the that column
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {


						// after you grab purchase testcase row = pull all the data of that row and feed into test
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {

							Cell c= cv.next();
							
							// is it a STRING value?
							if(c.getCellType()==CellType.STRING)
							//if(c.getCellTypeEnum()==CellType.STRING)
							{

								a.add(c.getStringCellValue());
							}
							else{
								// if it's a number
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

							}

						}
						// without this, getting exception?
						//break;

					}

				}		

			}

		}
		return a;

	}

}
