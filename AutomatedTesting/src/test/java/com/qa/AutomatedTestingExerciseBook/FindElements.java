package com.qa.AutomatedTestingExerciseBook;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FindElements {
	String user;
	String password;
	String status;

	WebDriver driver = null;
	public static ExtentReports report;
	public ExtentTest test;

	@BeforeClass
	public static void start() {
		report = new ExtentReports("C:/Users/Admin/Desktop/Report1.html", true);
	}

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@AfterClass
	public static void end() {
		report.flush();
	}
	//public FindElements(String expected, String input1, String input2) {
		//user = input1;
		//password = input2;
		//status = expected;}
	@Test
	public void mthodTest() throws InterruptedException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(Constant.Path_TestData + Constant.File_TestData);
		} catch (FileNotFoundException e) {}
		XSSFWorkbook workbook=null;
		try {workbook= new XSSFWorkbook(file);}
		catch(IOException e) {}
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFCell cell=sheet.getRow(1).getCell(0);
		XSSFCell cell2=sheet.getRow(1).getCell(1);
		//ExcelUserData ex=new ExcelUserData();
		//ex.data();
		EnterUserPage users = PageFactory.initElements(driver, EnterUserPage.class);
		CheckPage checker = PageFactory.initElements(driver, CheckPage.class);
		// getting the elements through the driver which lets the driver know of the
		// elements. Other method of instantiating only lets Java know of the elements
		
		user = cell.getStringCellValue();
		password =cell2.getStringCellValue() ;
		test = report.startTest("Verify username and password entry");
		test.log(LogStatus.INFO, "Browser Started");
		driver.manage().window().maximize();
		driver.get(Constant.URL1);
		users.add(user, password);
		String userpass = "The username: " + user + "\n" + "The password: " + password;
		System.out.print(userpass);
		if (checker.getuserpass().equals(userpass)) {
			test.log(LogStatus.PASS, "Verified creation username and password");
		} else {
			test.log(LogStatus.FAIL, "Unable to verify the creation of username and password");
		}
		assertEquals(userpass, checker.getuserpass());

		driver.get(Constant.URL2);
		users.login(user, password);
		status="**Successful Login**";
		assertEquals(status, checker.getlogin());
		if (checker.getlogin().equals("**Successful Login**")) {
			test.log(LogStatus.PASS, "Verified the  login of new username and password");
		} else {
			test.log(LogStatus.FAIL, "Unable to verify the  login of new username and password");
		}
		report.endTest(test);
		
	}
}
