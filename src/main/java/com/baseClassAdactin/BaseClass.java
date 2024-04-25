package com.baseClassAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver; // null driver

	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		  return driver;

	}

	public static void urlLaunch(String urlLink) {

		driver.get(urlLink);

	}

	public static void keySends(WebElement elements, String key) {
		elements.sendKeys(key);

	}

	public static WebElement buttonClick(WebElement element) {
		element.click();
		return element;

	}

	public static void urlClose() {
		driver.close();
	}

}
