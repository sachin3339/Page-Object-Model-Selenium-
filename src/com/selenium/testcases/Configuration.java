package com.selenium.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class Configuration {
	Properties pro;
	public Configuration(){
		try {
			File src=new File("./Config/Object_Repository");
			 
			// Create  FileInputStream object
			FileInputStream fis=new FileInputStream(src);
			 
			// Create Properties class object to read properties file
			 pro=new Properties();
			 
			// Load file so we can use into our script
			pro.load(fis);
		} catch (Exception e) 
		{
		  System.out.println("Exception is =="+e.getMessage());
		} 
		
		
	}
	public String getChromePath() {
		String path=pro.getProperty("ChromeDriver");
		return path;
	}
	
	public String getUrl() {
		String path=pro.getProperty("URL");
		return path;
	}
}
