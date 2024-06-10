package com.qa.pom;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.BaseClass;

import io.cucumber.core.backend.Backend;

public class PageObjects_05_BookHotel extends BaseClass {

	 WebDriver driver;

	public PageObjects_05_BookHotel(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	@FindBy(xpath = "(//td[@class='login_title'])[1]")
	WebElement link_Back;

	@FindBy(xpath = "(//td[@class='login_title'])[2]")
	WebElement lbl_Book_A_Hotel;

	@FindBy(id = "hotel_name_dis")
	WebElement pp_Hotel_Name;

	@FindBy(id = "location_dis")
	WebElement pp_Location;

	@FindBy(name = "room_type_dis")
	WebElement pp_Room_Type;

	@FindBy(id = "room_num_dis")
	WebElement pp_Number_of_Rooms;

	@FindBy(name = "total_days_dis")
	WebElement pp_Total_Days;

	@FindBy(name = "price_night_dis")
	WebElement pp_Price_per_Night;

	@FindBy(name = "total_price_dis")
	WebElement pp_Total_Price;

	@FindBy(name = "gst_dis")
	WebElement pp_GST;

	@FindBy(name = "final_price_dis")
	WebElement pp_Final_Billed_Price;

	@FindBy(name = "first_name")
	WebElement txt_First_Name;

	@FindBy(name = "last_name")
	WebElement txt_Last_Name;

	@FindBy(id = "address")
	WebElement txt_Billing_Address;

	@FindBy(name = "cc_num")
	WebElement txt_Credit_Card_No;

	@FindBy(name = "cc_type")
	WebElement dd_Credit_Card_Type;

	@FindBy(name = "cc_exp_month")
	WebElement dd_Select_Month;

	@FindBy(name = "cc_exp_year")
	WebElement dd_Select_Year;

	@FindBy(name = "cc_cvv")
	WebElement txt_CVV_Number;

	@FindBy(name = "book_now")
	WebElement btn_Book_Now;

	@FindBy(name = "Cancel")
	WebElement btn_Cancel;

	public void back() {

		link_Back.click();

	}

	public void bookAHotel() {

		Assert.assertEquals(true,lbl_Book_A_Hotel.isDisplayed());
	}

	public boolean title_BookHotelpage() {

		String testTitle = "Adactin.com - Book A Hotel";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, testTitle);
		return true;
		 
		
	}

	public void ppFields() {

		System.out.println(pp_Hotel_Name.getText());

	}

	public void firstName(String FirstName) {

		txt_First_Name.sendKeys(FirstName);

	}

	public void lastName(String LastName) {

		txt_Last_Name.sendKeys(LastName);

	}

	public void address(String Address) {

		txt_Billing_Address.sendKeys(Address);

	}

	public void creditCardNo(String CreditcardNumber) {

		txt_Credit_Card_No.sendKeys(CreditcardNumber);

	}

	public void cardType(String CreditCardType) {

		dropdown(dd_Credit_Card_Type, "index", CreditCardType);

	}

	public void ccExpMnth(String Cardexpirymonth) {

		dropdown(dd_Select_Month, "values", Cardexpirymonth);

	}

	public void ccExpYear(String Cardexpiryyear) {

		dropdown(dd_Select_Year, "text", Cardexpiryyear);

	}

	public void cardCVV(String CvvNumber) {

		txt_CVV_Number.sendKeys(CvvNumber);

	}

	public void bookNow() {

		btn_Book_Now.click();

	}

}
