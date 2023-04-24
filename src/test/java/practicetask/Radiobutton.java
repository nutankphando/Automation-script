package practicetask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	WebDriver driver;

	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}

	@Test
	public void radio() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> radio = driver.findElements(By.xpath("//label[contains(text(),'year')]"));
		System.out.println("The size of the radio=:" + radio.size());
		for (WebElement btn : radio) {
			Thread.sleep(2000);
			btn.click();
		}
	}

	@AfterTest
	public void teardown() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();

	}
}
