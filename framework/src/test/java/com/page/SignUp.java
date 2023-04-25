package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp {

	WebDriver driver;

	public SignUp(WebDriver ldriver) {
		this.driver = ldriver;
	
		@FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/p[1]/a[1]")
		WebElement button1;

		@FindBy(id = "first_name")
		WebElement fname;

		@FindBy(id = "last_name")
		WebElement lname;

		
}
}

