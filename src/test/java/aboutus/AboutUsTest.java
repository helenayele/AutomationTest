package aboutus;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.AboutUsPage;

public class AboutUsTest extends BaseTests{

	@Test
	public void testAboutUs() {
		AboutUsPage aboutUs= homePage.clickAboutUsMenu();
		aboutUs.scrollToEndOfPage();
		aboutUs.clickTwitterLink();
	}
}
