package com.sdp.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.baseClassAdactin.BaseClass;
import com.pom_pojo.LoginPage;

public class PageObjectManager {
	
	public static WebDriver SDPdriver; //--> (singleton Design Driver --> Null Driver
	
	public LoginPage lpref;

	
	public LoginPage getLpref() {
		return lpref;
	}
	
	public BaseClass bcref;
	
	public BaseClass getBcref() {
		return bcref;
	}

	public PageObjectManager(WebDriver driver) {
		this.SDPdriver = driver; //--> chromre driver
	}
	
	
	
}
