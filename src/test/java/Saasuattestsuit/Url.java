package Saasuattestsuit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url {

	WebDriver driver;

	@BeforeTest

	public void beforetest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://saasuat.vdoapi.com/");
	}

	@Test

	public void url() {

		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://saasuat.vdoapi.com/";
		assertEquals(expectedUrl, actualUrl);
		assertTrue(true);
	}

	@AfterTest

	public void teardown() throws InterruptedException {
		Thread.sleep(2000);

		driver.close();

	}
}
