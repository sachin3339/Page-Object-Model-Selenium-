package com.selenium.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.selenium.pages.*;
import com.selenium.testcases.Configuration;

public class TestCases {
	public static WebDriver driver=null;
	
	public static void main(String args[]) throws IOException
	{   
		Configuration conf= new Configuration();
		
	
		System.setProperty("webdriver.chrome.driver",conf.getChromePath());

		 driver=new ChromeDriver();

		driver.get(conf.getUrl());

		driver.manage().window().maximize();
		
		
		
		Google_Page_Object pom=new Google_Page_Object(driver);
		pom.textbox("Page object Model");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pom.SearchButton();
	    driver.close();
	    
		}


}