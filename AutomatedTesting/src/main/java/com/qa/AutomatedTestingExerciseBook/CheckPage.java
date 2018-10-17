package com.qa.AutomatedTestingExerciseBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckPage {
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote")
	private WebElement userpassText;
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote")
	private WebElement loginText;

	public String getuserpass() {
		return userpassText.getText();
	}

	public String getlogin() {
		return loginText.getText();
	}
}
