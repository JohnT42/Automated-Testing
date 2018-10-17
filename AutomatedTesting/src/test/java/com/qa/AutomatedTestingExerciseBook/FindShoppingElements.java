package com.qa.AutomatedTestingExerciseBook;

import static org.junit.Assert.assertEquals;

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

public class FindShoppingElements {
	WebDriver driver = null;
	public static ExtentReports report;
	public ExtentTest test;

	@BeforeClass
	public static void start() {
		report = new ExtentReports("C:/Users/Admin/Desktop/ShoppingReport.html", true);
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

	@Test

	public void mthodTest() throws InterruptedException {
		SearchPage users = PageFactory.initElements(driver, SearchPage.class);
		// getting the elements through the driver which lets the driver know of the
		// elements. Other method of instantiating only lets Java know of the elements
		CheckResultsPage checker = PageFactory.initElements(driver, CheckResultsPage.class);
		String user = "Bruce Wayne";
		String password = "Alfred3";
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		//users.add(user, password);

		String userpass = "The username: " + user + "\n" + "The password: " + password;
		System.out.print(userpass);

		test = report.startTest("Verify username and pasword entry");
		test.log(LogStatus.INFO, "Browser Started");
		if (checker.getusername().equals(userpass)) {
			test.log(LogStatus.PASS, "verify username and password of the page");
		} else {
			test.log(LogStatus.FAIL, "Unable to verify username and password of the page");
		}
		report.endTest(test);
		assertEquals(userpass, checker.getusername());

	}
}
