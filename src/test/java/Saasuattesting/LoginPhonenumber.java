package Saasuattesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPhonenumber {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://saasuat.vdoapi.com/login");

		WebElement ele = driver.findElement(By.name("mobile"));
		ele.sendKeys("9625613978");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div/div/div/div/div[4]/form/div[2]/button"))
				.click();
		Thread.sleep(2000);

		String Url = driver.getCurrentUrl();
		System.out.println(Url);

		WebElement ele1 = driver.findElement(By.id("exampleInputOtp"));
		ele1.sendKeys("471136");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div/div/div/div[4]/form/div[5]/button"))
				.click();
		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.id(
				"//body/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/span[1]/span[1]/span[1]/ul[1]"));
		ele2.sendKeys("");
		Thread.sleep(2000);

		driver.close();

	}

}
