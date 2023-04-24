package practicetask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	
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

			List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox'  and contains(@id ,'day')]\"id"));
			System.out.println(checkboxes.size());

			for (WebElement box : checkboxes) {

				String chkn = box.getAttribute("id");
				System.out.println(chkn);
//				System.out.println(chkn.endsWith(""));
//				System.out.println(chkn.endsWith(""));

				if (chkn.equals("") || chkn.equals("")) {
					System.out.println("within if");
					box.click();
				}
			}

			Thread.sleep(4000);
			driver.close();

		}

	}

}
