package com.qa.pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Scanner;

public class PageObjects_02_RegistrationPage {

	WebDriver driver;

	@FindBy(xpath = "//a[@href='index.php'] ")
	WebElement link_backtologinpage;

	@FindBy(name = "username")
	WebElement txt_Username;

	@FindBy(id = "password")
	WebElement txt_Password;

	@FindBy(id = "re_password")
	WebElement txt_Confirm_Password;

	@FindBy(name = "full_name")
	WebElement txt_Full_Name;

	@FindBy(name = "email_add")
	WebElement txt_Email_Address;
	
	@FindBy(id = "captcha-form")
	WebElement txt_captcha;

	@FindBy(xpath = "//img[@src='img/refresh.png']")
	WebElement img_captcha_refresh;

	@FindBy(name = "tnc_box")
	WebElement chkbx_TandC;

	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	WebElement link_TandC;

	@FindBy(id = "Submit")
	WebElement btn_Register;

	@FindBy(id = "Reset")
	WebElement btn_Reset;

	public PageObjects_02_RegistrationPage(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public void _backtologinpage() {
		link_backtologinpage.click();

	}
	
	public boolean registerpagenavigationcheck() {
		link_backtologinpage.isEnabled();
		return true;

	}

	public void Username(String Username) {
		txt_Username.sendKeys(Username);

	}

	public void Password(String Password) {
		txt_Password.sendKeys(Password);

	}

	public void Confirm_Password(String CP) {
		txt_Confirm_Password.sendKeys(CP);

	}

	public void Full_Name(String FullNmae) {
		txt_Full_Name.sendKeys(FullNmae);

	}

	public void Email_Address(String EmailAddress) {
		txt_Email_Address.sendKeys(EmailAddress);

	}

	public void captcha_refresh() {
		img_captcha_refresh.click();

	}
	public void captcha_text(String Captcha) {
		//txt_captcha.sendKeys(Captcha);
        Scanner input = new Scanner(System.in);
        System.out.println(Captcha);
       // String Captcha = input.next();
	}

	public void TandC() {
		chkbx_TandC.click();
		Assert.assertTrue(chkbx_TandC.isSelected());

	}

	public void T_C() {
		link_TandC.click();
		// check for title Terms and Conditions - AdactIn.com

	}

	public void Register() {
		btn_Register.click();

	}

	public void btn_Reset() {
		btn_Reset.click();

	}
}
