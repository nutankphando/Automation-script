package Saasuattestsuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Email {

	WebDriver driver;

	@BeforeTest

	public void beforetest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://saasuat.vdoapi.com/");
	}

	@Test

	public void email() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'LOG IN')]")).click();

		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div/div/div/div/div[2]/div/input")).click();

		WebElement ele = driver.findElement(By.id("exampleInputEmail1"));
		ele.sendKeys("admin@phandoqa.com");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("exampleInputPassword1"));
		ele1.sendKeys("Admin@123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div/div/div/div/div[3]/form/div[3]/ul/li/button"))
				.click();
	}

	@AfterTest

	public void teardown() throws InterruptedException {
		Thread.sleep(2000);

		driver.close();

	}
}
