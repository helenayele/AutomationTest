package blog;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.BlogPage;

public class BlogTest extends BaseTests{

	@Test
	public void scrollToBlogPage() {
		BlogPage blog = homePage.clickBlogMenu();
		blog.scrollBlogPage();
	}
}
