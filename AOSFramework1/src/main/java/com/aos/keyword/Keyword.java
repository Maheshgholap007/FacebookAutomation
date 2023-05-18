/*
 * Project Name:AOS Application
 * Author: MG Creation
 * Client: Java Class
 * Organization:Future Automation
 */
package com.aos.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.aos.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class Keyword {

	private static final WebElement Day = null;
	private static final WebElement Month = null;
	private static final WebElement Year = null;
	public static void openBrowser(String browserName) {
		switch(browserName) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			Constants.driver=new ChromeDriver();
			Constants.driver.manage().window().maximize();
			break;
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			Constants.driver=new FirefoxDriver();
			Constants.driver.manage().window().maximize();
			break;
			
			default:
				System.err.print("Invalid Browser Name :- "+ browserName);
				
		}
	}
	/**
	 * It Will Open The Specified URL Recently Open By Driver Instance
	 * @param URL{@code String}
	 */
	public static void openURL(String URL) {
		Constants.driver.get(URL);
		}
		public static void enterText(String LocatorType, String Locatorvalue, String textToEnter) {
			getWebElement( LocatorType,  Locatorvalue).sendKeys(textToEnter);;
		}
	public static void clickonElement(String LocatorType, String Locatorvalue) {
		getWebElement( LocatorType,  Locatorvalue).click();
	}
	
	
	public static void selectDropdownValueUsingText(String LocatorType, String Locatorvalue, String textToSelect) {
		WebElement element=getWebElement(LocatorType, Locatorvalue);
		Select select=new Select(element);
		select.selectByVisibleText(textToSelect);
	   
	}
	public static void selectDropdownValueUsingvalue(String LocatorType, String Locatorvalue, String textToSelect) {
		WebElement element=getWebElement(LocatorType, Locatorvalue);
		Select select=new Select(element);
		select.selectByValue(textToSelect);
	}
	
	public static void selectDropdownValueUsingindex(String LocatorType, String Locatorvalue, int textToSelect) {
		WebElement element=getWebElement(LocatorType, Locatorvalue);
		Select select=new Select(element);
		select.selectByIndex(textToSelect);
	}	
public static WebElement getWebElement(String LocatorType, String Locatorvalue) {
	WebElement element=null;
	switch(LocatorType) {
	
	case"XPATH":
		element=Constants.driver.findElement(By.xpath(Locatorvalue));
		break;
	case"ID":
		element=Constants.driver.findElement(By.id(Locatorvalue));
		break;
	case"CSSSELECTOR":
		element=Constants.driver.findElement(By.cssSelector(Locatorvalue));
		break;
	case"LINKTEXT":
		element=Constants.driver.findElement(By.linkText(Locatorvalue));
		break;
	case"PARTIALLINKTEXT":
		element=Constants.driver.findElement(By.partialLinkText(Locatorvalue));
		break;
	case"NAME":
		element=Constants.driver.findElement(By.name(Locatorvalue));
		break;
	case"CLASSNAME":
		element=Constants.driver.findElement(By.className(Locatorvalue));
		break;
	case"TAGNAME":
		element=	Constants.driver.findElement(By.tagName(Locatorvalue));
		break;
		default:
			System.err.print("Invalid Locator Type:"+LocatorType+",Expected XPATH, ID, CSSSELECTOR, LINKTEXT PARTIALLINKTEXT, NAME, CLASSNAME, TAGNAME");
	}
	return element;
    }

}


	
	
	
	













