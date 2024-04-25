package com.pom_pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver LPdriver;//Null driver
	
	//POM concept
	@FindBy(id="username")
	private WebElement adactinusername;
	
	@FindBy(id="password")
	private WebElement adactinpassword;
	
	 @FindBy(id="login")
	 private WebElement adactinlogin;
	 
	//POJO concept
	
		public WebElement getAdactinusername() {
			return adactinusername;
		}

		public WebElement getAdactinpassword() {
			return adactinpassword;
		}

		public WebElement getAdactinlogin() {
			return adactinlogin;
		} 
		 
	    public LoginPage(WebDriver driver) {
			this.LPdriver = driver; // LPdriver has changed to chrome driver 
			PageFactory.initElements(LPdriver, this);
		}
}
