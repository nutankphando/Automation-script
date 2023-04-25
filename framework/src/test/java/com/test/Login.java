package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.BaseClass;
import com.page.LoginEmail;

public class Login extends BaseClass {

	@Test
	public void login() {

		LoginEmail loginemail = PageFactory.initElements(driver, LoginEmail.class);

		loginemail.loginToSaasuat("admin@mitwatv.com", "admin@mitwatv.com");

	}

}
