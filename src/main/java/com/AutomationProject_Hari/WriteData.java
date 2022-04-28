package com.AutomationProject_Hari;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
	public static void main(String[] args) throws IOException {
		
	
	File f = new File("C:\\Users\\Jose\\eclipse-workspace\\AutomationProject_Hari\\UserData.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	//FileInputStream --- reads data from the file
	//FileOutputStream --- write data to the file
	Workbook wb = new XSSFWorkbook(fis);
	Sheet createSheet = wb.createSheet("userData");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("Username");
	
	wb.getSheet("userData").getRow(0).createCell(1).setCellValue("password");
	wb.getSheet("userData").createRow(1).createCell(0).setCellValue("Arun");
	wb.getSheet("userData").getRow(1).createCell(1).setCellValue("Test@123");
	wb.getSheet("userData").createRow(2).createCell(0).setCellValue("vijay");
	wb.getSheet("userData").getRow(2).createCell(1).setCellValue("Test@111");
	
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	
	
	
	}
}
