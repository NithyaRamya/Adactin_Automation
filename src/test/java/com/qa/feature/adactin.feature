Feature: Checking Functionality of Adactin Application

Background:
Given user Lauches The Application

@register
Scenario Outline: Register
Given user Is On Login Page
When user Clicks New User Register Here Link
Then user Is Naviated To Registration Page
And user Enter "<Username>" In Username Field
And user Enter "<Password>" In Password Field
And user Reconfirms Password Entering "<samePassword>" In Confirm Password Field
And user Enter "<Fullname>" In Full Name Field
And user Enter "<EmailAddress>" In Email Address Field
#Then user Clicks Captcha Refresh image If Required
And user Enters CaptchaText Referring to Captcha Image
Then user Clicks TermsandConditions Checkbox
Then user Clicks Register Button
#And user Clicks Reset Button

Examples:

|Username   |Password      |samePassword  |Fullname        |EmailAddress|
|R|June@123456789|June@123456789|Risr|rj@gmail.com|           

@valid-invalidcred
Scenario Outline: Login
Given user Lauches The Application
When user Enter Valid "<Username>" In The Username Field
And user Enter "<Password>" In The Password Field
And user Click On The Login Button
Then user Confirms It Navigates To The Homepage

Examples:

|Username | Password|
|NithyaBharathi|F86N67| 
#|NithyaBharathi|Ranjini@12345| #invalid pwd
#|Rishan|AUKMJ6|#invalid un
#|Tanisha|Ramya@12345|#invalid cred

Scenario Outline: Search
Given user Is Logged In Successfully And In The Search Page
When user Selects The "<location>" In The Location Field
And user Selects The "<Hotel>" In The Dropdown Field
And user Selects The "<Roomtype>" In The Roomtype Field
And user Selects The "<NoOfRooms>" In The Number Of Rooms Field
And user Selects The "<CheckInDate>" In The Check In Date Field
And user Selects The "<CheckOutDate>" In The Check Out Date Field
And user Selects The "<Adultscount>" In The Adults Room Field
And user Selects The "<Childcount>" In The Child Room Field
And user Clicks On The Search Button
Then user Confirms That The Search Is Carried Out Successfully

Examples:
|location|Hotel      |Roomtype|NoOfRooms|CheckInDate|CheckOutDate|Adultscount|Childcount|
|New York|Hotel Creek|1       |5        |05/07/2024 |07/07/2024  |4          |2 - Two   |


Scenario: Select
Given user Is On Select Hotel Page
When user Clicks On Radio Button To Select The Hotel
And user clicks On Continue Button
Then user Confirms The Confirmation Is Successfull

Scenario Outline: Book
Given the Page Is Already Partially Autopopulated And The Rest Dropdown To Be Filled
When user Enters "<Firstname>" In Firstname Field
And user Enters "<Lastname>" in Lastname Field
And user Enters "<Address>" In Address Field
And user Enters Valid "<CreditcardNumber>" In Creditcard Filed
And user Selects The "<CardType>" In The Cardtype Field
And user Selects The "<Cardexpirymonth>" In The Date Field
And user Selects The "<Cardexpiryyear>" In The Year Field
And user Enters Valid "<CvvNumber>" In The Number Field
And user Clicks On Book Now Button

Examples:

|Firstname|Lastname|Address|CreditcardNumber   |CardType|Cardexpirymonth|Cardexpiryyear|CvvNumber|
|Nithya   |Bharathi|2F/248 |6684276875535765875|1    | 3             |2029          |455|


Scenario: Booking Confirmation
Given the Page Is Already Filled With Details
When user Clicks On MyItinerary Button

#Scenario: Booked Itinerary
