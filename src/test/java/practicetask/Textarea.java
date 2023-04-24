package practicetask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textarea {

	WebDriver driver;

	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}

	@Test
	public void textarea() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("name"));
		ele.sendKeys("Nutan");
		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.id("phone"));
		ele2.sendKeys("9625613978");
		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.id("email"));
		ele3.sendKeys("nutankamat077@gmail.com");
		Thread.sleep(2000);

		WebElement ele4 = driver.findElement(By.id("password"));
		ele4.sendKeys("123456789");
		Thread.sleep(2000);

		WebElement ele5 = driver.findElement(By.id("address"));
		ele5.sendKeys("Gaurcity");
		Thread.sleep(2000);

		driver.findElement(By.name("submit")).click();
	}

	@AfterTest
	public void teardown() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();
	}
}
