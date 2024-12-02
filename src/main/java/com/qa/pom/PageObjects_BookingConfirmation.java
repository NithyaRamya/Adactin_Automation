package com.qa.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects_BookingConfirmation {
	
	WebDriver driver;
	 @FindBy(id = "order_no")	
	 WebElement pp_Order_No;
	 
	 @FindBy(id = "my_itinerary")
	 WebElement btn_MyItinerary;
	 
	 @FindBy(xpath = "//td[text()='Booked Itinerary']")
	 WebElement title_BookingConfirmationpage;
	 
	 
	 
	 public PageObjects_BookingConfirmation(WebDriver driver2) {
	
		 this.driver = driver2;
		 PageFactory.initElements(driver2, this);
	}



	public void orderNo() {
		
		 System.out.println(pp_Order_No.isDisplayed());

	}

	public void myItinerary() {
		
		btn_MyItinerary.click();

	}
	
	
	  public void title_BookingConfirmationpage() {
	  
	  Assert.assertEquals(true, title_BookingConfirmationpage.isDisplayed()); }
	 

	}
	
