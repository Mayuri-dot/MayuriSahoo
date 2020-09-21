package com.test;

import java.sql.Driver;

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
	WebDriver driver = new ChromeDriver();
	driver.get("https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html");
	}
	

}
