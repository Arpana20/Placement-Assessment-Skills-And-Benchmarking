package com.java.setOracleConn;

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

	public static void main(String[] args) {
		List StudentList = getStudentsListFromExcel();
		System.out.println(StudentList);
		List staffList = getStaffListFromExcel();
		System.out.println(staffList);
		List quesList = getQuestListFromExcel();
		System.out.println(quesList);
	}

	private static List getStudentsListFromExcel() {
		String FilePath = "E:\\Project ref\\StudentMarks.xlsx";
		int count = 0;
		List StudentList = new ArrayList();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(FilePath);
			Workbook workbook = new XSSFWorkbook(fis);
			int numberOfSheets = workbook.getNumberOfSheets();
			System.out.println(numberOfSheets);
			OracleConn oraConn = new OracleConn(); 
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
						if(count == 1) {
							student.setRollNo(cell.getStringCellValue());
						}
						if(count == 2) {
							student.setName(cell.getStringCellValue());
						}
						if(count == 3) { 
							student.setBatch((int)cell.getNumericCellValue());
						}
						if(count == 4) {
							student.setEmail(cell.getStringCellValue());
						}
						if(count == 5) {
							student.setDeptId((int)cell.getNumericCellValue());
						}	
						
					}
					//oraConn.saveStudent(student);
					StudentList.add(student);
				} 
			}
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(count);
		return StudentList;
	}

	private static List getStaffListFromExcel() {
		String FilePath = "E:\\Project ref\\staffList.xlsx";
		int count = 0;
		List staffList = new ArrayList();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(FilePath);
			Workbook workbook = new XSSFWorkbook(fis);
			int numberOfSheets = workbook.getNumberOfSheets();
			System.out.println(numberOfSheets);
			OracleConn oraConn = new OracleConn(); 
			for(int i=0; i<numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);
				Iterator rowIterator = sheet.iterator();
				while(rowIterator.hasNext()) {
					
					Staff staff = new Staff();
					Row row =  (Row) rowIterator.next();
					Iterator cellIterator = row.cellIterator();
					while(cellIterator.hasNext()) {
						count += 1;
						Cell cell = (Cell) cellIterator.next();
						if(count == 1) {
							staff.setStaffNo(cell.getStringCellValue());
						}
						if(count == 2) {
							staff.setName(cell.getStringCellValue());
						}						
						if(count == 3) {
							staff.setEmail(cell.getStringCellValue());
						}
						if(count == 4) {
							staff.setDeptId((int)cell.getNumericCellValue());
						}	
						
					}
					//oraConn.saveStaff(staff);
					staffList.add(staff);
				} 
			}
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(count);
		return staffList;
	}

	private static List getQuestListFromExcel() {
		String FilePath = "E:\\Project ref\\QuesUpload.xlsx";
		int count = 0;
		List questList = new ArrayList();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(FilePath);
			Workbook workbook = new XSSFWorkbook(fis);
			int numberOfSheets = workbook.getNumberOfSheets();
			System.out.println(numberOfSheets);
			OracleConn oraConn = new OracleConn(); 
			for(int i=0; i<numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);
				Iterator rowIterator = sheet.iterator();
				while(rowIterator.hasNext()) {
					
					Questionaire quest = new Questionaire();
					Row row =  (Row) rowIterator.next();
					Iterator cellIterator = row.cellIterator();
					while(cellIterator.hasNext()) {
						count += 1;
						Cell cell = (Cell) cellIterator.next();
						if(count == 1) {
							quest.setQuestionName(cell.getStringCellValue());
						}
						if(count == 2) {
							quest.setQuestionChoice1(cell.getStringCellValue());
						}						
						if(count == 3) {
							quest.setQuestionChoice2(cell.getStringCellValue());
						}
						if(count == 4) {
							quest.setQuestionChoice3(cell.getStringCellValue());
						}	
						if(count == 5) {
							quest.setQuestionChoice4(cell.getStringCellValue());
						}
						if(count == 6) {
							quest.setQuestionChoiceAns((int)cell.getNumericCellValue());
						}
						if(count == 7) {
							quest.setQuestionTextAns(cell.getStringCellValue());
						}
						
					}
					//oraConn.saveQuestionaire(quest);
					questList.add(quest);
				} 
			}
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(count);
		return questList;
	}

}
