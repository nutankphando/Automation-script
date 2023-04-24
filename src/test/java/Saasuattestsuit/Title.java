package Saasuattestsuit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title {

	WebDriver driver;

	@BeforeTest

	public void beforetest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://saasuat.vdoapi.com/");
	}

	@Test

	public void title() {

		String expectedtitle = driver.getTitle();
		String actualtitle = "Welcome - Phando Saas";
		assertEquals(expectedtitle, actualtitle);
		assertTrue(true);
	}

	@AfterTest

	public void teardown() throws InterruptedException {
		Thread.sleep(2000);

		driver.close();

	}
}
