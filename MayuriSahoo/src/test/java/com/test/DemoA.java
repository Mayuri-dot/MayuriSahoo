package com.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoA {
	static
	{
	System.setProperty("webdriver.chrome.driver","./src/test/resources/driver/chromedriver.exe");	
	}
	public static WebDriver driver;
	@Test
	public void testBrowser()
	{
		
	System.out.println("Hello Manu Kakkar Visited ur program");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.close();
	
		
	
	}
	
	
	
	

}
