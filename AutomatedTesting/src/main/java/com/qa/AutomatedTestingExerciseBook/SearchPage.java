package com.qa.AutomatedTestingExerciseBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	@FindBy(id = "search-query form-control ac_input")
	private WebElement searchBox;
	@FindBy(name = "submit_search")
	private WebElement submit;

	public void add(String text) throws InterruptedException {
		try {
			searchBox.sendKeys(text);
			submit.click();
		} catch (Exception e) {

		}
	}
}
