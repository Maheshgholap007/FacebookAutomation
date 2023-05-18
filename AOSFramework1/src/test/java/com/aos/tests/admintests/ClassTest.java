package com.aos.tests.admintests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTest {                              
@Test
	public void m1() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	String expect="Google";
	String Actual=driver.getTitle();
	Assert.assertEquals(Actual, expect);
	System.out.println("Asseration is passed");
	
	}
@Test
public void m2() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	String expect="Gogle";
	String Actual=driver.getTitle();
	Assert.assertEquals(Actual, expect);
	System.out.println("Asseration is passed");
	
	}
@Test
public void m3() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	String expect="Google";
	String Actual=driver.getTitle();
	
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(Actual, expect,"Title is Not Match");
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Mahesh");
	softassert.assertAll();

	
	}



}

