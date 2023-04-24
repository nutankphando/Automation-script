package Saasuattesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://saasuat.vdoapi.com/login");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div/div/div/div/div[6]/p/a")).click();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("first_name"));
		ele.sendKeys("Nutan");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("last_name"));
		ele1.sendKeys("Kamat");
		Thread.sleep(2000);

		WebElement ele5 = driver.findElement(By.id("email"));
		ele5.sendKeys("nutan.k@phando.com");
		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.id("Mobile_num"));
		ele2.sendKeys("9625613978");
		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.id("Password"));
		ele3.sendKeys("abc@28Gh");
		Thread.sleep(2000);

		WebElement ele4 = driver.findElement(By.id("c_password"));
		ele4.sendKeys("abc@28Gh");
		Thread.sleep(2000);

		driver.findElement(By.id("checkbox")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);

		WebElement ele6 = driver.findElement(By.id("otp"));
		ele6.sendKeys("");
		Thread.sleep(2000);

		driver.findElement(By.id("/html/body/div[1]/div[1]/div[4]/div[2]/div/div/div/div/form/div[6]/ul/li[1]/button"))
				.click();
		Thread.sleep(2000);

		driver.close();

	}
}
