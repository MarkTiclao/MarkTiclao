package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderFacebook {

	WebDriver driver;

	@Test(dataProvider = "LoginData")
	public void TestLogin(String userName, String passWord) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("pass")).sendKeys(passWord);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();

	}

	@DataProvider(name = "LoginData")
	public Object[][] loginData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "Admin123";

		data[1][0] = "Dennis";
		data[1][1] = "Dennis123";

		return data;

	}
}
