package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginEmail {

	WebDriver driver;

	public LoginEmail(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement button1;

	@FindBy(id = "exampleInputEmail1")
	WebElement uname;

	@FindBy(id = "exampleInputPassword1")
	WebElement pswd;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement button;

	public void loginToSaasuat(String exampleInputEmail1, String exampleInputPassword1) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		button1.click();
		uname.sendKeys(exampleInputEmail1);
		pswd.sendKeys(exampleInputPassword1);

		button1.click();
	}

}
