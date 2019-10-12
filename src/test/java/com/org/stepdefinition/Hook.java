package com.org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
public static WebDriver d;
	
	@Before
	public void launching()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\CumcumberExcel\\driver\\chromedrive.exe");
		d=new ChromeDriver();
		
	}
	
	@After
	public void quiting() {
		d.quit();
	}

}
