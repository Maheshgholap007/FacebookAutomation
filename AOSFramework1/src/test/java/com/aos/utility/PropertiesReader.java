package com.aos.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.aos.constants.Constants;

public class PropertiesReader {
public static String getProperty(String key) throws IOException {
	String value=null;
	try {
		FileInputStream fis=new FileInputStream("E:\\My Java Practice\\AOSFramework1\\Input\\ObjectRepository.properties");
		Properties prop=new Properties();
	prop.load(fis);
		value = prop.getProperty(key);
	} catch (FileNotFoundException e) {
		System.out.println("Unable To Open Object Repository");
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();  
	}
	return value;
}


public static String getProperty(String key, String filepath) throws IOException {
	String value=null;
	try {
		FileInputStream fis=new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(fis);
		value = prop.getProperty(key);
	} catch (FileNotFoundException e) {
	System.out.println("Unable To Open Object Repository");
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();  
	}
return value;
}

public static String[]getLocator(String key){
	String[] value=null;
	
	try {
		Constants.fis = new FileInputStream("E:\\My Java Practice\\AOSFramework1\\Input\\ObjectRepository.properties");
	Constants.prop=new Properties();
		Constants.prop.load(Constants.fis);
		String part= Constants.prop.getProperty(key);
		value= part.split("##");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return value;
	
}
public static void main(String[] args) {
	System.out.println("Main Method is Added Prop Read Utils");
}
}
