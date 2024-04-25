package com.AdactinRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactinfeature" ,
glue = "com.stepdefinition" ,
tags = ("@Login"))

public class runnerTest {
	
public static WebDriver  driver;

	@BeforeClass
	public static void BeforeLaunch() {
	    WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		

	}
	
	
	@AfterClass
	public static void AfterLaunch() {
		
         driver.close();
	}

}
