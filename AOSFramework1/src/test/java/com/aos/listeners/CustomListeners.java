package com.aos.listeners;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.xml.sax.Locator;

import com.aos.constants.Constants;
import com.aos.keyword.Keyword;
import com.sun.org.apache.bcel.internal.classfile.Constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomListeners implements ISuiteListener, ITestListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println(suite.getName() + "Execution has Started");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println(suite.getName() + "Execution has been Finished");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "On Test Start is Executed");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "On Test Success is Executed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Screen Shot has been Taken with Below Code");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Random random=new Random();
		int index=random.nextInt(100);
		TakesScreenshot scshot =((TakesScreenshot)Constants.driver);
		File source =scshot.getScreenshotAs(OutputType.FILE);
		File destination =new File("E:\\My Java Practice\\AOSFramework1\\ScreenShot\\test" + index + ".png");
	
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "On Test Skipped is Executed");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName() + "On Test Failed But With in Success Percentage is Executed");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + "On Start is Executed");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + "On Finish is Executed");
		
	}

}
