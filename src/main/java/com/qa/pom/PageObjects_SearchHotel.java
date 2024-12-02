package com.qa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

public class PageObjects_SearchHotel extends BaseClass {

	WebDriver driver;

	@FindBy(xpath = "//td[@class='login_title']")
	WebElement txt_SearchHotel;

	@FindBy(xpath = "//table/tbody/tr/td[@class='welcome_menu']//input[@name='username_show']")
	WebElement lbl_Hellomessage;

	@FindBy(xpath = "//a[@href=’SearchHotel.php’] ")
	WebElement link_SearchHotel;

	@FindBy(xpath = "//a[text()='Booked Itinerary'] ")
	WebElement link_BookedItinerary;

	@FindBy(linkText = "ChangePassword.php")
	WebElement link_ChangePassword;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement link_Logout;

	@FindBy(id = "location")
	WebElement dd_Location;

	@FindBy(id = "hotels")
	WebElement dd_Hotels;

	@FindBy(name = "room_type")
	WebElement dd_RoomType;

	@FindBy(id = "room_nos")
	WebElement dd_RoomNos;

	@FindBy(name = "datepick_in")
	WebElement txt_CheckInDate;

	@FindBy(name = "datepick_out")
	WebElement txt_CheckOutDate;

	@FindBy(name = "adult_room")
	WebElement dd_AdultsNo;

	@FindBy(name = "child_room")
	WebElement dd_ChildNo;

	@FindBy(id = "Submit")
	WebElement btn_Search;

	@FindBy(name = "Reset")
	WebElement btn_Reset;

	@FindBy(xpath = "//a[text()='www.adactin.com']")
	WebElement link_abtAdactin;

	@FindBy(xpath = "//a[text()='Adactin.com']")
	WebElement link_Adactin;

	public PageObjects_SearchHotel(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public void helloMessage() {
		System.out.println(lbl_Hellomessage.isDisplayed());
	}

	public void msg_SearchHotel() {
		System.out.println(txt_SearchHotel.getText());
	}

	public void select_Location(String location) {
		dropdown(dd_Location, "text", location);
		
	}

	public void select_Hotels(String Hotel) {
		dropdown(dd_Hotels, "text", Hotel);
	}

	public void select_RoomType(String Roomtype) {
		dropdown(dd_RoomType, "index", Roomtype);
	}

	public void select_NoOfRooms(String NoOfRooms) {
		dropdown(dd_RoomNos, "index", NoOfRooms);
	}

	public void select_CheckInDate(String CheckInDate) {
		txt_CheckInDate.sendKeys(CheckInDate);
	}

	public void select_CheckOutDate(String CheckOutDate) {
		txt_CheckOutDate.sendKeys(CheckOutDate);
	}

	public void select_AdultsPerRoom(String Adultscount) {
		 dropdown(dd_AdultsNo, "value", Adultscount);
		
	}

	public void select_ChildrenPerRoom(String Childcount) {
		dropdown(dd_RoomNos, "text", Childcount);
	}

	public void click_Search() {
		btn_Search.click();
	}

	public void clcik_Reset() {
		btn_Reset.click();
	}

}
