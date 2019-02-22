package com.jxm.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileSample {
	static String FilePath = "C:\\Users\\Preyanshu\\Downloads\\StudentData.xlsx";

	public static void main(String[] args) {
		List StudentList = getStudentsListFromExcel();
		System.out.println(StudentList);
	}

	private static List getStudentsListFromExcel() {
		int count = 0;
		List StudentList = new ArrayList();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(FilePath);
			Workbook workbook = new XSSFWorkbook(fis);
			int numberOfSheets = workbook.getNumberOfSheets();
			System.out.println(numberOfSheets);
			for(int i=0; i<numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);
				Iterator rowIterator = sheet.iterator();
				while(rowIterator.hasNext()) {
					
					Student student = new Student();
					Row row =  (Row) rowIterator.next();
					Iterator cellIterator = row.cellIterator();
					while(cellIterator.hasNext()) {
						count += 1;
						Cell cell = (Cell) cellIterator.next();
						
						if(Cell.CELL_TYPE_STRING == cell.getCellType()) {
							student.setName(cell.getStringCellValue());
						}
						else if(Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
							if(cell.getColumnIndex() == 1) {
								student.setMaths(String.valueOf(cell.getNumericCellValue()));
							}
							else if(cell.getColumnIndex() == 2) {
								student.setScience(String.valueOf(cell.getNumericCellValue()));
							}
							else if(cell.getColumnIndex() == 3) {
								student.setEnglish(String.valueOf(cell.getNumericCellValue()));
							}
						}
					}
					StudentList.add(student);
				} 
			}
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(count);
		return StudentList;
	}

}
