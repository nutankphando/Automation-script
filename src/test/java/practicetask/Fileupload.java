package practicetask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(2000);

		driver.findElement(By.id("inputGroupFile02")).sendKeys("C:\\Users\\91986\\Downloads\\videoplayback");
		Thread.sleep(2000);

		driver.findElement(By.id("Upload")).click();
		driver.close();
		Thread.sleep(2000);

	}

}
