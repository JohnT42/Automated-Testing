package com.qa.AutomatedTestingExerciseBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUserData {
	public Collection<Object[]> data() {
	FileInputStream file = null;
	try {
		file = new FileInputStream(Constant.Path_TestData + Constant.File_TestData);
	} catch (FileNotFoundException e) {}
	XSSFWorkbook workbook=null;
	try {workbook= new XSSFWorkbook(file);}
	catch(IOException e) {}
	XSSFSheet sheet=workbook.getSheetAt(0);
	ArrayList<String> lists=new ArrayList<String>();
			for (int i; i< sheet.getPhysicalNumberOfRows();i++) {
				for (int j; j< sheet.getRow(i).getLastCellNum(); j++) {lists.add()}
			}
	//XSSFCell cell=sheet.getRow(1).getCell(0);
	//XSSFCell cell2=sheet.getRow(1).getCell(1);
	//ret;
}
}
