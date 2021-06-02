package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BlogPage {

	private WebDriver driver;
    private By twitterIcon = By.xpath("//a[@href='https://twitter.com/IonicPartners']");
    
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}

	public void scrollBlogPage() {
		String script = "window.scrollTo(0,document.body.scrollHeight)";
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript(script);
		
		
	} 
	
}
