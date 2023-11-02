Feature: Hotel Booking In Adactin Application 
@login
Scenario: User Login in the Web Application 
	Given user Launch the Adatcin Application 
	When user Enter the Username 
	And user Enter the Password 
	Then user click the Login Button and Navigates to Serach Hotel Page 
	
@Search_Hotel	
Scenario: User Search Hotel in the Web Application 
	When user Select The Loaction in Dropdown Field 
	And user Select The Hotels Using Dropdown Field 
	And user Select The Room Type Using Dropdown Field 
	And user Select The Number of Rooms Using Dropdown Field 
	And user Enter The Check In Date 
	And user Enter The Check Out Date 
	And user Select The Adult per Room Using Dropdown Field 
	And user Select The Children Per Room Using Dropdown Field 
	Then user click The Search Button And Navigates to Select Hotel Page 
	
@Select_Hotel	
Scenario: User Select Hotel in the Web Application 
	When user Click The Select Hotel 
	Then user Click The Continue Button And Navigates to Book A Hotel Page 
	
@Book_Hotel	
Scenario: User Select Book A Hotel in the Web Application 
	When user Enter The First Name In The First Name Field 
	And user Enter The Last Name In The Last Name Field 
	And user Enter The Billing Address In The Billing Address Field 
	And user Enter The Cerdit card No 
	And user Select The Cerdit card Type And Click on The Visa 
	And user Select The Expiry Date And Select Month And Year 
	And user Enter The CCV Number 
	Then user Click The Book Hotel And Navigates to Booking Comfrimation  
	
	
	
