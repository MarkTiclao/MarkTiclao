package OpenBrowser;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserDemo {

	@Test
	public void TestGoogle() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Capgemini", Keys.ENTER);

		String Expected = "Capgemini - Google Search";
		String Actual = driver.getTitle();
		assertEquals(Actual, Expected);
		Thread.sleep(3000);

		// driver.quit();

	}

}
