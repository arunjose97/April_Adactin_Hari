package com.AutomationProject_Hari;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void particular_Data() throws IOException {
		//to convert into file format
		File f = new File("C:\\Users\\Jose\\eclipse-workspace\\AutomationProject_Hari\\UserData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(3);
		
		Cell cell = row.getCell(0);
		//to find cell type
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int i = (int) numericCellValue;
			System.out.println(i);
		}
	}
	
	
	public static void allData() throws IOException {
		File f = new File("C:\\Users\\Jose\\eclipse-workspace\\AutomationProject_Hari\\UserData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		//print all datas from sheet
		//getPhysicalNumberOfRows
		int rowSize = sheet.getPhysicalNumberOfRows();
		for(int i=0; i<rowSize;i++) {
			Row row = sheet.getRow(i);
			int cellSize = row.getPhysicalNumberOfCells();
			for(int j=0; j<cellSize;j++) {
				Cell cell = row.getCell(j);
				//cell type
				CellType cellType = cell.getCellType();
				if(cellType.equals(CellType.STRING)) {
					
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if(cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int k=(int)numericCellValue;
					System.out.println(k);
				}
			}
		}
		
	}
	public static void main(String[] args) throws Exception {
		particular_Data();
		allData();
	}
	
	
}
