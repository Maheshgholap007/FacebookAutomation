package com.aos.tests.logintests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aos.keyword.Keyword;
import com.aos.utility.PropertiesReader;

public class LoginTests {
	@Test
	public void AOS_002() throws InterruptedException, IOException {
		Keyword.openBrowser("chrome");
		Keyword.openURL("https://www.facebook.com/");
		Keyword.enterText(
				PropertiesReader.getLocator("emailField")[0],
				PropertiesReader.getLocator("emailField")[1],
				"Future");
		Keyword.enterText(
				PropertiesReader.getLocator("passField")[0],
				PropertiesReader.getLocator("passField")[1],
				"Admin@123");
		Keyword.clickonElement("XPATH","//a[text()='Create new account']");
		Thread.sleep(1000);
		Keyword.enterText("XPATH", "//input[@placeholder='First name']", "Mahesh");
		Keyword.enterText("XPATH", "//input[@name='lastname']", "Gholap");
		Keyword.enterText("XPATH", "//input[@name='reg_email__']", "8765439876");
		Keyword.enterText("XPATH", "//input[@data-type='password']", "Admin@123");
		Thread.sleep(2000);
		Keyword.selectDropdownValueUsingText("XPATH", "//select[@id='day']", "14");
	    Keyword.selectDropdownValueUsingvalue("XPATH", "//select[@id='month']", "6");
		Keyword.selectDropdownValueUsingindex("XPATH", "//select[@id='year']", (29));
		Thread.sleep(1000);
		Keyword.clickonElement("XPATH", "//label[text()=\"Male\"]");
		Keyword.clickonElement("XPATH", "(//button[text()=\"Sign Up\"])[1]");
	}
}
