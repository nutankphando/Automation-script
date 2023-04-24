package Saasuattesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyUrl {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://saasuat.vdoapi.com/login");

		String ExpectedURL = ("https://saasuat.vdoapi.com/login");

		String ActualURL = driver.getCurrentUrl();

		if (ExpectedURL.equals(ActualURL)) {
			System.out.println("Correct Page");
		} else {
			System.out.println("Incorrect Page");
		}
		Thread.sleep(2000);

		String ExpectedTitle = ("saasuat");
		String ActualTitle = driver.getTitle();

		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Correct Title");
		} else {
			System.out.println("Incorrect Title");
			Thread.sleep(2000);

			driver.navigate().back();
			Thread.sleep(2000);

			driver.navigate().forward();
			Thread.sleep(2000);

			driver.navigate().refresh();
			Thread.sleep(2000);
		}

		driver.close();

	}

}
