package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseTests {
	private WebDriver driver;
	protected HomePage homePage;

	/*
	 * public static void main(String[] args) { new BaseTests().setUp(); }
	 */
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		goHome();

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		homePage = new HomePage(driver);

	}

	@BeforeMethod
	public void goHome() {
		driver.get("https://www.ionicpartners.com/");

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
