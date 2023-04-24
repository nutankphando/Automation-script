package practicetask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	WebDriver driver;

	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}

	@Test
	public void dropdown() throws InterruptedException {

		WebElement web = driver.findElement(By.xpath("//body/div[1]/div[4]/div[2]/div[1]/select[1]"));

		Thread.sleep(2000);
		Thread.sleep(2000);

		Select drpvalue = new Select(web);

		drpvalue.selectByValue("1");

		Thread.sleep(2000);

		drpvalue.selectByValue("2");

		Thread.sleep(2000);

		drpvalue.selectByValue("3");

		Thread.sleep(2000);

		drpvalue.selectByValue("4");

		Thread.sleep(2000);

		drpvalue.selectByValue("5");

		Thread.sleep(2000);

		drpvalue.selectByValue("6");

		Thread.sleep(2000);

		drpvalue.selectByValue("7");

		Thread.sleep(2000);

		drpvalue.selectByValue("8");

		Thread.sleep(2000);

		drpvalue.selectByValue("9");

		Thread.sleep(2000);

		drpvalue.selectByValue("10");

		Thread.sleep(2000);
	}

	@AfterTest
	public void teardown() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();

	}
}
