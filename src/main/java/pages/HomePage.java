package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	private By blogMenu = By.id("slider-11-slide-47-layer-30");
	private By aboutUsMenu = By.id("slider-11-slide-47-layer-32");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public BlogPage clickBlogMenu() {
	
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement blog = wait1.until(ExpectedConditions.elementToBeClickable(blogMenu));
		blog.click();
		return new BlogPage(driver);
	}
	
	public AboutUsPage clickAboutUsMenu() {
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement aboutUs = wait1.until(ExpectedConditions.elementToBeClickable(aboutUsMenu));
		aboutUs.click();
		
		return new AboutUsPage(driver);
	}
	
}
