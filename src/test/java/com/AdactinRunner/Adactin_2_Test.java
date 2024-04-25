package com.AdactinRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseClassAdactin.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactinfeature" 
, glue = "com.stepdefinition"
, tags = ("@Login")
, plugin = {"html:Report/Cucumber_Report", "pretty", "json:Report/Cucumber.json",  "com.cucumber.listener.ExtentCucumberFormatter:Folder/File.html"})

public class Adactin_2_Test extends BaseClass { //Importing base class 
	
  public static WebDriver driver;  //importing driver from base class using name of base class
 
  @BeforeClass 
    public static void BrowserLaunch() {
		
	      driver = browserLaunch();
	}
 
@AfterClass
public static void BrowserClose() {
	
	        urlClose();
	        
	
}
  

}
