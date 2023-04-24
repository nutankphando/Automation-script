package Saasuattestsuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Phonenumber {

	WebDriver driver;

	@BeforeTest

	public void beforetest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://saasuat.vdoapi.com/");
	}

	@Test

	public void Login() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'LOG IN')]")).click();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.name("mobile"));
		ele.sendKeys("9625613978");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div/div/div/div/div[4]/form/div[2]/button"))
				.click();
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("exampleInputOtp"));
		ele1.sendKeys("");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div/div/div/div[4]/form/div[5]/button"))
				.click();
	}

	@AfterTest

	public void teardown() throws InterruptedException {
		Thread.sleep(2000);

		driver.close();

	}
}
