package cucumber.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static void main(String args[]) throws IOException {
		File file = new File("D:\\Ruby\\study\\ds-algo\\dsalgo.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook excelWorkbook = new XSSFWorkbook(fis);
		XSSFSheet excelSheet = excelWorkbook.getSheetAt(1);
		// String data = excelSheet.getRow(0).getCell(0).getStringCellValue();
		// System.out.println(data);
		int rowCount = excelSheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowCount; i++) {
			XSSFRow row = excelSheet.getRow(i);

			int cellCount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = getCellValue(cell);
				System.out.print("||" + cellValue);
			}
			System.out.println();
		}
		excelWorkbook.close();
		fis.close();
	}

	public static String getCellValue(XSSFCell cell) {
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		default:
			return cell.getStringCellValue();

		}
	}

	public static String getExcelValue(int rowNumber, int columNumber) {
		String value = "";
		try {
			FileInputStream fis = new FileInputStream("D:\\Ruby\\study\\ds-algo\\dsalgo.xlsx");
			XSSFWorkbook excelWorkbook = new XSSFWorkbook(fis);
			XSSFSheet excelSheet = excelWorkbook.getSheetAt(1);
			XSSFRow row = excelSheet.getRow(rowNumber);
			XSSFCell cell = row.getCell(columNumber);
			value = getCellValue(cell);
			excelWorkbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public static String getCodeValue(int rowNumber, int columNumber) {
		String value="";
		try {
			FileInputStream fis = new FileInputStream("D:\\Ruby\\study\\ds-algo\\dsalgo.xlsx");
			XSSFWorkbook excelWorkbook = new XSSFWorkbook(fis);
			XSSFSheet excelSheet = excelWorkbook.getSheetAt(0);
			XSSFRow row = excelSheet.getRow(rowNumber);
			XSSFCell cell = row.getCell(columNumber);
			value = getCellValue(cell);
			excelWorkbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
	}

}
