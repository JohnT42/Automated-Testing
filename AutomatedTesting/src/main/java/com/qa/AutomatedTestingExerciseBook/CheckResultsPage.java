package com.qa.AutomatedTestingExerciseBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckResultsPage {
@FindBy(xpath="/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote")
private WebElement usernameText;
//@FindBy(xpath="/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote/text()[2]")
//private WebElement passwordText;

public String getusername() {
	return usernameText.getText();
}
//public WebElement getpassword() {
	//return passwordText;
//}
}
