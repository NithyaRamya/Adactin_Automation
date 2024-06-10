package com.qa.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;



public class PageObjects_01_LoginPage extends BaseClass{

	WebDriver driver;

	@FindBy(id = "username")
	WebElement txt_Username;

	@FindBy(name = "password")
	WebElement txt_Password;

	@FindBy(xpath = "//a[text()='Forgot Password?']")
	WebElement link_ForgotPassword;

	@FindBy(name = "login")
	WebElement btn_Login;

	@FindBy(xpath = "//a[@href='Register.php']")
	WebElement link_NewUserregistration;

	@FindBy(xpath = "//img[@src='img/google-play.png']")
	WebElement btn_GooglePlay;

	@FindBy(xpath = "//img[@src='img/ios-button.png']")
	WebElement btn_IOS;

	@FindBy(xpath = "//a[text()='info@adactin.com']")
	WebElement link_info;
	
	public PageObjects_01_LoginPage(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public void getUsername(String Username) {
		txt_Username.sendKeys(Username);
	}

	public void getPassword(String Password) {
		txt_Password.sendKeys(Password);
	}

	public void forgotpassword() {
		link_ForgotPassword.click();
	}

	public void login() {
		btn_Login.click();
	}

	public void registration() {
		link_NewUserregistration.click();
	}

	public void GooglePlay() {
		btn_GooglePlay.click();
	}

	public void IOS() {
		btn_IOS.click();
	}

	public void info() {
		link_info.click();
	}
	
	

}
