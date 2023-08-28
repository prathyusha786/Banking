package com.banking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL="https://demo.guru99.com/v4/";
	public String UserName="mngr524506";
	public String pwd="seserEn";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		//System.setProperty("WebDriver.chrome.driver"," D:\\Automation\\Banking\\Drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "D:\\Automation\\\\Banking\\\\Drivers\\msedgedriver.exe");
		 driver = new EdgeDriver();
	}
	@AfterClass
	public void shutdown() {
		driver.quit();
	}

}
