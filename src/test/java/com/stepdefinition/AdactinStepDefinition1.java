package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AdactinRunner.runnerTest;
import com.baseClassAdactin.BaseClass;
import com.pom_pojo.LoginPage;
import com.sdp.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepDefinition1 {

	public static class stepDefinition extends BaseClass {

		public static WebDriver driver = BaseClass.driver; // importing driver from runner Test class file

		//LoginPage lp = new LoginPage(driver); // creating obj creation for login page(pojo & pom) class
		
		PageObjectManager pom = new PageObjectManager(driver); //--> Importing PageObjectManager class
		

		public static Select select;

		@Given("^user Launch the Adacting Application$")
		public void user_Launch_the_Adacting_Application() throws Throwable {
//			driver.get("https://adactinhotelapp.com/");
			urlLaunch("https://adactinhotelapp.com/");
		    
		}

		@When("^user enter the username in username Field$")
		public void user_enter_the_username_in_username_Field() throws Throwable {
			
//			WebElement username = driver.findElement(By.id("username"));
//			username.sendKeys("imxxxxaz");
			keySends(pom.getLpref().getAdactinusername(),"imxxxxaz");
		}

		@Then("^user enter the password in possword field$")
		public void user_enter_the_password_in_possword_field() throws Throwable {
			
//			WebElement password = driver.findElement(By.id("password"));
//			password.sendKeys("imthiyaz007");
			keySends(pom.getLpref().getAdactinpassword(),"imthiyaz007");
		   
		}

		@Then("^user click the loing button$")
		public void user_click_the_loing_button() throws Throwable {
			
			WebElement loginbut = driver.findElement(By.id("login"));
//			loginbut.click();
			buttonClick(pom.getBcref().buttonClick(loginbut));
		}

		@When("^user select the location in the location field$")
		public void user_select_the_location_in_the_location_field() throws Throwable {
		 
			
			WebElement location = driver.findElement(By.id("location"));
//		    location.click();
//		    Select select = new Select(location);
//			select.selectByVisibleText("London");
		    
			select = new Select(location);
			select.selectByVisibleText("London");
		}
		

		@Then("^user select the hotel in the hotel field$")
		public void user_select_the_hotel_in_the_hotel_field() throws Throwable {
			
			WebElement hotel = driver.findElement(By.id("hotels"));
//	        hotel.click();
//	        Select hotels = new Select(hotel);
//	        hotels.selectByVisibleText("Hotel Sunshine");
	        
	        select = new Select(hotel);
	        select.selectByVisibleText("Hotel Sunshine");
	
		}

		@Then("^user  select the rooms in the room field$")
		public void user_select_the_rooms_in_the_room_field() throws Throwable {
			
			WebElement rooms = driver.findElement(By.id("room_type"));
	        rooms.click();
	        
	        Select room = new Select(rooms);
	        room.selectByValue("Double");
		   
		}

		@Then("^user select  Rooms in Number of Rooms field$")
		public void user_select_Rooms_in_Number_of_Rooms_field() throws Throwable {
			
			 WebElement members = driver.findElement(By.xpath("//select[@name='room_nos']"));
		        members.click();
		        
		        Select number = new Select(members);
		        number.selectByValue("2");
		    
		}

		@Then("^user enter the Check In Date in Check In Date field$")
		public void user_enter_the_Check_In_Date_in_Check_In_Date_field() throws Throwable {
		    
			 WebElement chickindate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		        chickindate.sendKeys("08.02.2024");
		}

		@Then("^user enter the Check Out Date in Check Out Date field$")
		public void user_enter_the_Check_Out_Date_in_Check_Out_Date_field() throws Throwable {
		  
			WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	        checkoutdate.sendKeys("12.02.2024");
		}

		@Then("^user select the numbers of adult in Adults per Room field$")
		public void user_select_the_numbers_of_adult_in_Adults_per_Room_field() throws Throwable {
		
			  WebElement person = driver.findElement(By.id("adult_room"));
		        person.click();
		        
		        Select adultpersons = new Select(person);
		        adultpersons.selectByVisibleText("2 - Two");
			
		}

		@Then("^user select the numbers of children's in Children per Room field$")
		public void user_select_the_numbers_of_children_s_in_Children_per_Room_field() throws Throwable {
		    
			 WebElement child = driver.findElement(By.id("child_room"));
		        child.click();
		        
		        Select childs = new Select(child);
		        childs.selectByVisibleText("0 - None");
			
		}

		@Then("^user click the Search button$")
		public void user_click_the_Search_button() throws Throwable {
		    
			WebElement searchbut = driver.findElement(By.id("Submit"));
	        searchbut.click();
			
		}

		@When("^user select hotel from select fiel$")
		public void user_select_hotel_from_select_fiel() throws Throwable {
		 
			 driver.findElement(By.xpath("//input[@type='radio']")).click();
			
		}

		@Then("^user click continne button$")
		public void user_click_continne_button() throws Throwable {
		    
			  driver.findElement(By.id("continue")).click();
		}

		@When("^user enter the first name in First Name field$")
		public void user_enter_the_first_name_in_First_Name_field() throws Throwable {
		    
			WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
	        firstname.sendKeys("imthiyaz");
			
		}

		@Then("^user enter the last name in Last Name field$")
		public void user_enter_the_last_name_in_Last_Name_field() throws Throwable {
		 
			 WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		        lastname.sendKeys("uddeen");
			
		}

		@Then("^user enter the billing address in Billing Address field$")
		public void user_enter_the_billing_address_in_Billing_Address_field() throws Throwable {
		    
			 driver.findElement(By.id("address")).sendKeys("west tambaram chennai-600045");
			
		}

		@Then("^user enter the CCN in Credit Card No field$")
		public void user_enter_the_CCN_in_Credit_Card_No_field() throws Throwable {
		   
			driver.findElement(By.id("cc_num")).sendKeys("1234567890876543");
			
		}

		@Then("^user select card type in Credit Card Type field$")
		public void user_select_card_type_in_Credit_Card_Type_field() throws Throwable {
		  
			WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
	        cardtype.click();
	        Select card = new Select(cardtype);
	        card.selectByVisibleText("VISA");
			
		}

		@Then("^user select expriy date in Expiry Date field$")
		public void user_select_expriy_date_in_Expiry_Date_field() throws Throwable {
		    
			 WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		        month.click();
		        Select months = new Select(month);
		        months.selectByVisibleText("September");
		        
		        WebElement years = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		        years.click();
		        Select year = new Select(years);
		        year.selectByValue("2024");

			
		}

		@Then("^user enter the CCV nummber in CCV Nymber field$")
		public void user_enter_the_CCV_nummber_in_CCV_Nymber_field() throws Throwable {
		   
			 driver.findElement(By.id("cc_cvv")).sendKeys("224");
			
		}

		@Then("^user click the Book Now Buton$")
		public void user_click_the_Book_Now_Buton() throws Throwable {
			
			 driver.findElement(By.name("book_now")).click();
		   
			 Thread.sleep(6000);
		}

		@Then("^user click the My Itinerary Buttton$")
		public void user_click_the_My_Itinerary_Buttton() throws Throwable {
		   
			  WebElement click = driver.findElement(By.xpath("//input[@value='My Itinerary']"));
		        click.click();
			
		}



		
		
		
		
		
//		@Given("^user Launch the Adacting Application$")
//		public void user_Launch_the_Adacting_Application() throws Throwable {
//			// driver.get("https://adactinhotelapp.com/");
//			urlLaunch("https://adactinhotelapp.com/");
//		}
//
//		@When("^user enter the username in username Field$")
//		public void user_enter_the_username_in_username_Field() throws Throwable {
//			// WebElement username = driver.findElement(By.id("username"));
//			// username.sendKeys("imxxxxaz");
//			// keySends(username, "imxxxxaz");
//			keySends(lp.getAdactinusername(), "imxxxxaz");
//
//		}
//
//		@Then("^user enter the password in possword field$")
//		public void user_enter_the_password_in_possword_field() throws Throwable {
//			// WebElement password = driver.findElement(By.id("password"));
//			// password.sendKeys("imthiyaz007");
//			// keySends(password, "imthiyaz007");
//			keySends(lp.getAdactinpassword(), "imthiyaz007");
//		}
//
//		@Then("^user click the loing button$")
//		public void user_click_the_loing_button() throws Throwable {
//			// WebElement loginbut = driver.findElement(By.id("login"));
//			// loginbut.click();
//			// buttonClick(loginbut);
//			buttonClick(lp.getAdactinlogin());
//		}
//
//		@When("^user select the location in the location field$")
//		public void user_select_the_location_in_the_location_field() throws Throwable {
//
//			WebElement location = driver.findElement(By.id("location"));
//			location.click();
//			Select select = new Select(location);
//			select.selectByVisibleText("London");
//		}
//
//		@Then("^user select the hotel in the hotel field$")
//		public void user_select_the_hotel_in_the_hotel_field() throws Throwable {
//
//			WebElement hotel = driver.findElement(By.id("hotels"));
//			hotel.click();
//
//			Select hotels = new Select(hotel);
//			hotels.selectByVisibleText("Hotel Sunshine");
//
//		}
//
//		@Then("^user  select the rooms in the room field$")
//		public void user_select_the_rooms_in_the_room_field() throws Throwable {
//
//			WebElement rooms = driver.findElement(By.id("room_type"));
//			rooms.click();
//
//			Select room = new Select(rooms);
//			room.selectByValue("Double");
//		}
//
//		@Then("^user select  Rooms in Number of Rooms field$")
//		public void user_select_Rooms_in_Number_of_Rooms_field() throws Throwable {
//
//			WebElement members = driver.findElement(By.xpath("//select[@name='room_nos']"));
//			members.click();
//
//			Select number = new Select(members);
//			number.selectByValue("2");
//		}
//
//		@Then("^user enter the Check In Date in Check In Date field$")
//		public void user_enter_the_Check_In_Date_in_Check_In_Date_field() throws Throwable {
//
//			WebElement chickindate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
//			chickindate.clear();
//			chickindate.sendKeys("01.04.2023");
//		}
//
//		@Then("^user enter the Check Out Date in Check Out Date field$")
//		public void user_enter_the_Check_Out_Date_in_Check_Out_Date_field() throws Throwable {
//
//			WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
//			checkoutdate.clear();
//			checkoutdate.sendKeys("05.04.2024");
//
//		}
//
//		@Then("^user select the numbers of adult in Adults per Room field$")
//		public void user_select_the_numbers_of_adult_in_Adults_per_Room_field() throws Throwable {
//
//			WebElement person = driver.findElement(By.id("adult_room"));
//			person.click();
//
//			Select adultpersons = new Select(person);
//			adultpersons.selectByVisibleText("2 - Two");
//		}
//
//		@Then("^user select the numbers of children's in Children per Room field$")
//		public void user_select_the_numbers_of_children_s_in_Children_per_Room_field() throws Throwable {
//
//			WebElement child = driver.findElement(By.id("child_room"));
//			child.click();
//
//			Select childs = new Select(child);
//			childs.selectByVisibleText("0 - None");
//		}
//
//		@Then("^user click the Search button$")
//		public void user_click_the_Search_button() throws Throwable {
//
//			WebElement searchbut = driver.findElement(By.id("Submit"));
//			searchbut.click();
//
//		}
//
//		@When("^user select hotel from select fiel$")
//		public void user_select_hotel_from_select_fiel() throws Throwable {
//			
//			 driver.findElement(By.xpath("//input[@type='radio']")).click();
//		}
//
//		@Then("^user click continne button$")
//		public void user_click_continne_button() throws Throwable {
//			
//			 driver.findElement(By.id("continue")).click();
//			
//		}
//
//		@When("^user enter the first name in First Name field$")
//		public void user_enter_the_first_name_in_First_Name_field() throws Throwable {
//			
//			WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
//	        firstname.sendKeys("imthiyaz");
//
//		}
//
//		@Then("^user enter the last name in Last Name field$")
//		public void user_enter_the_last_name_in_Last_Name_field() throws Throwable {
//	
//			WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
//	        lastname.sendKeys("uddeen");
//		}
//
//		@Then("^user enter the billing address in Billing Address field$")
//		public void user_enter_the_billing_address_in_Billing_Address_field() throws Throwable {
//		
//			 driver.findElement(By.id("address")).sendKeys("west tambaram chennai-600045");
//			
//		}
//
//		@Then("^user enter the CCN in Credit Card No field$")
//		public void user_enter_the_CCN_in_Credit_Card_No_field() throws Throwable {
//			
//			 driver.findElement(By.id("cc_num")).sendKeys("1234567890876543");
//			
//		}
//
//		@Then("^user select card type in Credit Card Type field$")
//		public void user_select_card_type_in_Credit_Card_Type_field() throws Throwable {
//		
//			 WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
//		      cardtype.click();
//		        
//		        Select card = new Select(cardtype);
//		        card.selectByVisibleText("VISA");
//			
//		}
//
//		@Then("^user select expriy date in Expiry Date field$")
//		public void user_select_expriy_date_in_Expiry_Date_field() throws Throwable {
//		
//			WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
//	        month.click();
//	        
//	        Select months = new Select(month);
//	        months.selectByVisibleText("September");
//			
//	        WebElement years = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
//	        years.click();
//	        
//	        Select year = new Select(years);
//	        year.selectByValue("2024");
//		}
//
//		@Then("^user enter the CCV nummber in CCV Nymber field$")
//		public void user_enter_the_CCV_nummber_in_CCV_Nymber_field() throws Throwable {
//			
//			 driver.findElement(By.id("cc_cvv")).sendKeys("224");
//			
//		}
//
//		@And("^user click the Book Now Buton$")
//		public void user_click_the_Book_Now_Buton() throws Throwable {
//			
//			WebElement booknowbutton = driver.findElement(By.name("book_now"));
//			booknowbutton.click();
//		
//			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//			Thread.sleep(7000);
		}

		
		
		
//		@When("^user enter the \"([^\"]*)\" in username Field$")
//		public void user_enter_the_in_username_Field(String usrname) throws Throwable {
//			WebElement username = driver.findElement(By.id("username"));
//			//username.sendKeys(usrname);
//			keySends(username, usrname); 
//		}
//
//		@Then("^user enter the \"([^\"]*)\" in possword field$")
//		public void user_enter_the_in_possword_field(String paswrd) throws Throwable {
//			WebElement password = driver.findElement(By.id("password"));
//			//password.sendKeys(paswrd);
//			keySends(password, paswrd);
//		}	

	//}

}
