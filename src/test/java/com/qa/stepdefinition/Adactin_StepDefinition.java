package com.qa.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.qa.base.BaseClass;
import com.qa.pom.PageObjects_BookHotel;
import com.qa.pom.PageObjects_BookingConfirmation;
import com.qa.pom.PageObjects_LoginPage;
import com.qa.pom.PageObjects_RegistrationPage;
import com.qa.pom.PageObjects_SearchHotel;
import com.qa.pom.PageObjects_SelectHotel;


import io.cucumber.java.en.*;

public class Adactin_StepDefinition extends BaseClass {

	public static WebDriver driver = BaseClass.browserLaunch("Chrome");

	PageObjects_LoginPage lp;
	PageObjects_RegistrationPage rp;
	PageObjects_SearchHotel sh;
	PageObjects_SelectHotel s_h;
	PageObjects_BookHotel bh;
	PageObjects_BookingConfirmation bc;

	String drivePath = "C:\\Users\\NITHYA\\latest eclipse workspace\\Adactin_QA_04_06_24\\driver\\chromedriver.exe";
	String URL = "https://adactinhotelapp.com/";

	@Given("user Lauches The Application")
	public void user_lauches_the_application() {
		// System.setProperty("webdriver.chrome.driver", drivePath);

		// driver = new ChromeDriver();

		driver.get(URL);
		driver.manage().window().maximize();

	}

//Login
	@When("user Enter Valid {string} In The Username Field")
	public void user_enter_valid_in_the_username_field(String Username) {
		lp = new PageObjects_LoginPage(driver);
		lp.getUsername(Username);
	}

	@When("user Enter {string} In The Password Field")
	public void user_enter_in_the_password_field(String Password) {
		lp.getPassword(Password);
	}

	@When("user Click On The Login Button")
	public void user_click_on_the_login_button() {
		lp.login();

	}

	@Then("user Confirms It Navigates To The Homepage")
	public void user_confirms_it_navigates_to_the_homepage() throws Throwable {

		sh = new PageObjects_SearchHotel(driver);

		try {
			sh.helloMessage();
			sh.msg_SearchHotel();
		} catch (Exception e) {
			throw new Exception("Not Navigated");
		}

	}

	// Search

	@Given("user Is Logged In Successfully And In The Search Page")
	public void user_is_logged_in_successfully_and_in_the_search_page() {
		sh = new PageObjects_SearchHotel(driver);
		sh.helloMessage();
	}

	@When("user Selects The {string} In The Location Field")
	public void user_selects_the_location_in_the_location_field(String location) {
		sh.select_Location(location);

	}

	@When("user Selects The {string} In The Dropdown Field")
	public void user_selects_the_hotel_in_the_dropdown_field(String Hotel) {
		sh.select_Hotels(Hotel);
	}

	@When("user Selects The {string} In The Roomtype Field")
	public void user_selects_the_roomtype_in_the_roomtype_field(String Roomtype) {
		sh.select_RoomType(Roomtype);
	}

	@When("user Selects The {string} In The Number Of Rooms Field")

	public void user_Selects_The_NoOfRooms_In_The_Number_Of_Rooms_Field(String NoOfRooms) {
		sh.select_NoOfRooms(NoOfRooms);
	}

	@When("user Selects The {string} In The Check In Date Field")
	public void user_Selects_The_CheckInDate_In_The_Check_In_Date_Field(String CheckInDate) {
		sh.select_CheckInDate(CheckInDate);
	}

	@When("user Selects The {string} In The Check Out Date Field")
	public void user_Selects_The_CheckOutDate_In_The_Check_Out_Date_Field(String CheckOutDate) {
		sh.select_CheckInDate(CheckOutDate);
	}

	@When("user Selects The {string} In The Adults Room Field")
	public void user_selects_the_adults_count_in_the_adults_room_field(String Adultscount) {
		sh.select_AdultsPerRoom(Adultscount);
	}

	@When("user Selects The {string} In The Child Room Field")
	public void user_selects_the_child_count_in_the_child_room_field(String Childcount) {
		sh.select_ChildrenPerRoom(Childcount);
	}

	@When("user Clicks On The Search Button")
	public void user_clicks_on_the_submit_button() {
		sh.click_Search();
	}

	@Then("user Confirms That The Search Is Carried Out Successfully")
	public void user_confirms_that_the_search_is_carried_out_successfully() {
		s_h = new PageObjects_SelectHotel(driver);
		s_h.lablelTitleSelectHotel();

	}

	// Select

	@Given("user Is On Select Hotel Page")
	public void user_is_on_select_hotel_page() {
		s_h = new PageObjects_SelectHotel(driver);
		s_h.lablelTitleSelectHotel();
		//s_h.lablelTitleSelectHotel();
		s_h.dynamicTableTitle();
	}

	@When("user Clicks On Radio Button To Select The Hotel")
	public void user_clicks_on_radio_button_to_select_the_hotel() {
		// s_h.fetchValuesOfDynamicTable();
		s_h.selectHotel();
		s_h.validate_yes_radio_is_selected();
	}

	@When("user clicks On Continue Button")
	public void user_clicks_on_continue_button() {
		s_h.Continue();
	}

	// Book
	@Then("user Confirms The Confirmation Is Successfull")
	public void user_confirms_the_confirmation_is_successfull() {
		bh = new PageObjects_BookHotel(driver);
		bh.bookAHotel();
		
	}

	@Given("the Page Is Already Partially Autopopulated And The Rest Dropdown To Be Filled")
	public void the_page_is_already_partially_autopopulated_and_the_rest_dropdown_to_be_filled() {
		bh = new PageObjects_BookHotel(driver);
		System.out.println(bh.title_BookHotelpage());
		bh.ppFields();
	}

	@When("user Enters {string} In Firstname Field")
	public void user_enters_firstname_in_firstname_field(String FirstName) {
		bh.firstName(FirstName);
	}

	@When("user Enters {string} in Lastname Field")
	public void user_enters_lastname_in_lastname_field(String LastName) {
		bh.lastName(LastName);
	}

	@When("user Enters {string} In Address Field")
	public void user_enters_address_in_address_field(String Address) {
		bh.address(Address);
	}

	@When("user Enters Valid {string} In Creditcard Filed")
	public void user_enters_valid_creditcardnumber_in_creditcard_filed(String CreditcardNumber) {
		bh.creditCardNo(CreditcardNumber);
	}

	@When("user Selects The {string} In The Cardtype Field")
	public void user_selects_the_cardtype_in_the_cardtype_field(String CreditCardType) {
		bh.cardType(CreditCardType);
	}

	@When("user Selects The {string} In The Date Field")
	public void user_selects_the_cardexpirymonth_in_the_date_field(String Cardexpirymonth) {
		bh.ccExpMnth(Cardexpirymonth);
	}

	@When("user Selects The {string} In The Year Field")
	public void user_selects_the_cardexpiryyear_in_the_year_field(String Cardexpiryyear) {
		bh.ccExpYear(Cardexpiryyear);
	}

	@When("user Enters Valid {string} In The Number Field")
	public void user_enters_valid_cvvnumber_in_the_number_field(String CvvNumber) {
		bh.cardCVV(CvvNumber);
	}

	@When("user Clicks On Book Now Button")
	public void user_clicks_on_book_now_button() throws Exception {
		bh.bookNow();
		
	}
	
	@Given("the Page Is Already Filled With Details")
	public void the_page_is_already_filled_with_details() throws Exception {
		Thread.sleep(5000);
		BaseClass.ScreenShot("C:\\Users\\NITHYA\\latest eclipse workspace\\Adactin_QA_04_06_24\\screenshot\\F_Itinerary.png");
		BaseClass.js();
		BaseClass.ScreenShot("C:\\Users\\NITHYA\\latest eclipse workspace\\Adactin_QA_04_06_24\\screenshot\\F_Itinerary2.png");
		Thread.sleep(2000);
		
		bc = new PageObjects_BookingConfirmation(driver);
		bc.orderNo();
	}

	@When("user Clicks On MyItinerary Button")
	public void user_clicks_on_my_itinerary_button() throws Exception {
	   
		bc.myItinerary();
		Thread.sleep(2000);
		BaseClass.ScreenShot("C:\\Users\\NITHYA\\latest eclipse workspace\\Adactin_QA_04_06_24\\ss\\up_MyItinerary.png");
		BaseClass.js();
		BaseClass.ScreenShot("C:\\Users\\NITHYA\\latest eclipse workspace\\Adactin_QA_04_06_24\\ss\\down_MyItinerary.png");
	}

}
