package com.selenium.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.selenium.pages.*;

public class TestCases {
	public static WebDriver driver=null;
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");

		 driver=new ChromeDriver();

		driver.get("http://google.com");

		driver.manage().window().maximize();
		
		//Three lines of code for testing now
		Google_Page_Object pom=new Google_Page_Object(driver);
		pom.textbox("Page object Model");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pom.SearchButton();
		driver.close();
		
		
		
	}

}
