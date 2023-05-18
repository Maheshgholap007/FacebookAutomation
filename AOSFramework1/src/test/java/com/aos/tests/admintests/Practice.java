package com.aos.tests.admintests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
@Test
public void practice() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	String expected="amazon.com";
	String actual=driver.getTitle();
	Assert.assertEquals(actual, expected,"Title Not Match");

}
}
