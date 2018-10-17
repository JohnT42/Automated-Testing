package com.qa.AutomatedTestingExerciseBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterUserPage {
	@FindBy(name = "username")
	private WebElement usernameBox;
	@FindBy(name = "password")
	private WebElement passwordBox;
	@FindBy(name = "FormsButton2")
	private WebElement submit;

public void add(String text, String text2) throws InterruptedException {
		try {
			usernameBox.sendKeys(text);
			passwordBox.sendKeys(text2);
			submit.click();
		} catch (Exception e) {
		}}
		public void login(String text, String text2) throws InterruptedException {
			try {
				usernameBox.sendKeys(text);
				passwordBox.sendKeys(text2);
				submit.click();
			} catch (Exception e) {
			}
	}
}
