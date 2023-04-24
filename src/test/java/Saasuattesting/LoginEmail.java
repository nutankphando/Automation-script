package Saasuattesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginEmail {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://saas.phando.com/login");

		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div/div/div/div/div[2]/div/input")).click();

		WebElement ele = driver.findElement(By.id("exampleInputEmail1"));
		ele.sendKeys("aadmin@phandoqa.com");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("exampleInputPassword1"));
		ele1.sendKeys("Admin@123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div/div/div/div/div[3]/form/div[3]/ul/li/button"))
				.click();
		Thread.sleep(2000);

		driver.close();

	}
}
