package com.qa.pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects_07_LogoutPage {

	WebDriver driver;

	@FindBy(xpath = "//a[@href='index.php']")
	WebElement link_Loginagain;

	@FindBy(xpath = "//td[@class='reg_success']")
	WebElement content_Logoutpage;

	public PageObjects_07_LogoutPage(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public void link_Loginagain() {

		link_Loginagain.click();

	}

	public void content_Logoutpage() {

		Assert.assertEquals(true, content_Logoutpage.isDisplayed());
	}

}
