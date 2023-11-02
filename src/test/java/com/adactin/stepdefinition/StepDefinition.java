package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	static WebDriver driver = RunnerClass.driver;
	
	
	@Given("^user Launch the Adatcin Application$")
	public void user_Launch_the_Adatcin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter the Username$")
	public void user_Enter_the_Username() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("vicky97899");
	}

	@When("^user Enter the Password$")
	public void user_Enter_the_Password() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("SQ95EJ");
	}

	@Then("^user click the Login Button and Navigates to Serach Hotel Page$")
	public void user_click_the_Login_Button_and_Navigates_to_Serach_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

	@When("^user Select The Loaction in Dropdown Field$")
	public void user_Select_The_Loaction_in_Dropdown_Field() throws Throwable {
		driver.findElement(By.xpath("//select[@id='location']")).click();
		driver.findElement(By.xpath("//option[text()='Melbourne']")).click();
	}

	@When("^user Select The Hotels Using Dropdown Field$")
	public void user_Select_The_Hotels_Using_Dropdown_Field() throws Throwable {
		driver.findElement(By.xpath("//select[@id='hotels']")).click();
		driver.findElement(By.xpath("//option[text()='Hotel Hervey']")).click();
	}

	@When("^user Select The Room Type Using Dropdown Field$")
	public void user_Select_The_Room_Type_Using_Dropdown_Field() throws Throwable {
		driver.findElement(By.xpath("//select[@id='room_type']")).click();
		driver.findElement(By.xpath("//option[text()='Deluxe']")).click();
	}

	@When("^user Select The Number of Rooms Using Dropdown Field$")
	public void user_Select_The_Number_of_Rooms_Using_Dropdown_Field() throws Throwable {
		driver.findElement(By.xpath("//select[@id='room_nos']")).click();
		driver.findElement(By.xpath("//option[text()='3 - Three']")).click();
	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.clear();
		checkin.sendKeys("06/08/2023");
	}

	@When("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("07/08/2023");
	}

	@When("^user Select The Adult per Room Using Dropdown Field$")
	public void user_Select_The_Adult_per_Room_Using_Dropdown_Field() throws Throwable {
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		WebElement option = driver.findElement(By.xpath("(//option[text()='2 - Two'])[2]"));
		option.click();
	}

	@When("^user Select The Children Per Room Using Dropdown Field$")
	public void user_Select_The_Children_Per_Room_Using_Dropdown_Field() throws Throwable {
		WebElement findElement = driver.findElement(By.xpath("//select[@id='child_room']"));
		findElement.click();
		Select a = new Select(findElement);
		a.selectByVisibleText("3 - Three");
		findElement.click();
	}

	@Then("^user click The Search Button And Navigates to Select Hotel Page$")
	public void user_click_The_Search_Button_And_Navigates_to_Select_Hotel_Page() throws Throwable {
		driver.findElement(By.id("Submit")).click();
	}

	@When("^user Click The Select Hotel$")
	public void user_Click_The_Select_Hotel() throws Throwable {
		driver.findElement(By.id("radiobutton_0")).click();
	}

	@Then("^user Click The Continue Button And Navigates to Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_Navigates_to_Book_A_Hotel_Page() throws Throwable {
		driver.findElement(By.id("continue")).click();
	}

	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		WebElement fristname = driver.findElement(By.id("first_name"));
		fristname.click();
		fristname.sendKeys("Vigneshwaran");
	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.click();
		lastname.sendKeys("S");
	}

	@When("^user Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
		WebElement address = driver.findElement(By.id("address"));
		address.click();
		address.sendKeys("No 63, KKR Nagar, 2nd Street, Coimbatore 623456. ");
	}

	@When("^user Enter The Cerdit card No$")
	public void user_Enter_The_Cerdit_card_No() throws Throwable {
		WebElement ccno = driver.findElement(By.id("cc_num"));
		ccno.click();
		ccno.sendKeys("5432167890123456");
	}

	@When("^user Select The Cerdit card Type And Click on The Visa$")
	public void user_Select_The_Cerdit_card_Type_And_Click_on_The_Visa() throws Throwable {
		driver.findElement(By.xpath("//select[@id='cc_type']")).click();
		driver.findElement(By.xpath("//option[text()='VISA']")).click();
	}

	@When("^user Select The Expiry Date And Select Month And Year$")
	public void user_Select_The_Expiry_Date_And_Select_Month_And_Year() throws Throwable {
		driver.findElement(By.xpath("//select[@id='cc_exp_month']")).click();
		driver.findElement(By.xpath("//option[text()='April']")).click();
		
		driver.findElement(By.xpath("//select[@id='cc_exp_year']")).click();
		driver.findElement(By.xpath("//option[text()='2029']")).click();
	}

	@When("^user Enter The CCV Number$")
	public void user_Enter_The_CCV_Number() throws Throwable {
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.click();
		cvv.sendKeys("123");
	}

	@Then("^user Click The Book Hotel And Navigates to Booking Comfrimation$")
	public void user_Click_The_Book_Hotel_And_Navigates_to_Booking_Comfrimation() throws Throwable {
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
	}


}
