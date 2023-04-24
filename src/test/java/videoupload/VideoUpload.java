package videoupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VideoUpload {

		WebDriver driver;

		@BeforeTest
		public void beforetest() throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		driver.get("https://saasuat.vdoapi.com/login");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		}
		
		@Test

		public void VideoUpload1() throws InterruptedException {
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"))
				.click();
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("exampleInputEmail1"));
		ele1.sendKeys("admin@phandoqa.com");
		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.id("exampleInputPassword1"));
		ele3.sendKeys("Admin@123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Media Management')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Videos')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//body/div[2]/div[1]/section[2]/div[1]/div[1]/a[2]")).click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//body/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/label[1]"))
				.click();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("title"));
		ele.sendKeys("DW English HD");
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//body/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/span[1]/label[4]/span[1]"))
				.click();

		WebElement ele2 = driver.findElement(By.name("phando_media_url"));
		ele2.sendKeys("https://livectv.phando.com/8000/playlist.m3u8");
		Thread.sleep(2000);
		}
		

		@AfterTest

		public void teardown() throws InterruptedException {
			Thread.sleep(2000);

			driver.close();

		}
	}
