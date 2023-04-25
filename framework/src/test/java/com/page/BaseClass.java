package com.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.Browserfactory;

public class BaseClass {

	public WebDriver driver;

	@BeforeClass

	public void setup() {
		driver = Browserfactory.startAppliction(driver, "Chrome", "https://saasuat.vdoapi.com/login");
	}

	@AfterClass

	public void teardown() {
		Browserfactory.quitBrowser(driver);
	}

}
