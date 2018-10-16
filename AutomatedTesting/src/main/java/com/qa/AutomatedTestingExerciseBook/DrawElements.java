package com.qa.AutomatedTestingExerciseBook;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrawElements {
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
	public void drawTest() throws InterruptedException {
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.youidraw.com/apps/painter/");
		WebElement brush = driver.findElement(By.id("brush"));
		action.moveToElement(brush).click().perform();
		action.moveByOffset(700, 200).clickAndHold().moveByOffset(100, 0).release().moveByOffset(-50, 0).clickAndHold()
				.moveByOffset(0, 200).release().clickAndHold().moveByOffset(-50, 0).release().moveByOffset(150, -200)
				.clickAndHold().moveByOffset(100, 0).moveByOffset(0, 200).moveByOffset(-100, 0).moveByOffset(0, -200)
				.release().moveByOffset(150, 0).clickAndHold().moveByOffset(0, 200).moveByOffset(0, -100)
				.moveByOffset(100, 0).moveByOffset(0, 100).moveByOffset(0, -200).release().moveByOffset(50, 0).clickAndHold()
				.moveByOffset(0, 200).moveByOffset(0, -200).moveByOffset(100, 200).moveByOffset(0, -200).release().perform();
		Thread.sleep(10000);
	}
}
