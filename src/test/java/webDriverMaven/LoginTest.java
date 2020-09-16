package webDriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	// WebDriverManager.chromedriver().setup();
	public static WebDriver driver;

	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void doLogin() {
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("meraselen3@gmail.com");

		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]"))
				.click();
		System.out.println("Hello ");
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
/* Add new comments to check if jenkins auto build works*/
}
