package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {

	@Test
	public void verifyFacebook(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://facebook.com");
		String title =driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
	}
	
	@Test
	public void verifyFacebookNew(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://facebook.com");
		String title =driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
	}
}
