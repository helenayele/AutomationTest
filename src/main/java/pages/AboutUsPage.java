package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AboutUsPage {
	
	private WebDriver driver;
    private By twiter = By.xpath("//a[@href='https://twitter.com/IonicPartners']");
	
    public AboutUsPage(WebDriver driver1) {
		
		this.driver = driver1;
	}
	
	public void scrollToEndOfPage() {
		String script = "window.scrollTo(0,document.body.scrollHeight)";
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript(script);
		
	}
	
	public void clickTwitterLink() {
		
		driver.findElement(twiter).click();
	}
}
