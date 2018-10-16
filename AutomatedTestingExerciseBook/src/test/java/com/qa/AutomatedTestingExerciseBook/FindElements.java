package com.qa.AutomatedTestingExerciseBook;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class FindElements {
WebDriver driver=null;
@Before
public void setup() {
System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
driver=new ChromeDriver();
}
@After
public void teardown() {
	driver.quit();
}
@Test

public void mthodTest() throws InterruptedException {
	EnterUserPage users = PageFactory.initElements(driver, EnterUserPage.class);
	CheckPage  checker= PageFactory.initElements(driver, CheckPage.class);
	String user="Bruce Wayne";
	String password="Alfred3";
	driver.manage().window().maximize();
	driver.get("http://thedemosite.co.uk/addauser.php");
	users.add(user, password);	

String userpass="The username: "+user+"\n"+"The password: "+password;
System.out.print(userpass);
assertEquals(userpass,checker.getusername());
//assertEquals(password,checker.getpassword());}
}
}


