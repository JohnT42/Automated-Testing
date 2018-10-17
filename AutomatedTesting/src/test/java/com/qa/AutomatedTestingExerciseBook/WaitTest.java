package com.qa.AutomatedTestingExerciseBook;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {
	WebDriver driver = null;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void mthodTest() throws InterruptedException {
		driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/");
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("shafeeq")));
		String text1 = "I HATE YOU!\n" + "-The Shafeeq";
		assertEquals(text1, myDynamicElement.getText());
	}
}
