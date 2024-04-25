Feature: Hotel Booking in Adacting Application 
@Login 
Scenario: User Launch The Application 
	Given user Launch the Adacting Application 
	When user enter the username in username Field 
	Then user enter the password in possword field 
	And user click the loing button 
	When user select the location in the location field 
	Then user select the hotel in the hotel field 
	Then user  select the rooms in the room field 
	Then user select  Rooms in Number of Rooms field 
	Then user enter the Check In Date in Check In Date field 
	Then user enter the Check Out Date in Check Out Date field 
	Then user select the numbers of adult in Adults per Room field 
	Then user select the numbers of children's in Children per Room field 
	And  user click the Search button 
	When user select hotel from select fiel 
	Then user click continne button 
	When user enter the first name in First Name field 
	Then user enter the last name in Last Name field 
	Then user enter the billing address in Billing Address field 
	Then user enter the CCN in Credit Card No field 
	Then user select card type in Credit Card Type field 
	Then user select expriy date in Expiry Date field 
	Then user enter the CCV nummber in CCV Nymber field 
	Then user click the Book Now Buton 
	And  user click the My Itinerary Buttton 
	
	
	#@Searchhotel
	#Scenario: User select the hotel in search hotel page 
	#	When user select the location in the location field
	#   Then user select the hotel in the hotel field
	#  Then user  select the rooms in the room field 
	# Then user select  Rooms in Number of Rooms field
	#Then user enter the Check In Date in Check In Date field
	#Then user enter the Check Out Date in Check Out Date field 
	#Then user select the numbers of adult in Adults per Room field 
	#Then user select the numbers of children's in Children per Room field
	#And  user click the Search button 
	
	#@selecthotel   
	#Scenario: User Select hotel from Select hotel page
	#   When user select hotel from select fiel
	#  Then user click continne button          
	
	#@bookhotel    
	#Scenario: user booking hotel from Book A Hotel page
	#   When  user enter the first name in First Name field
	#  Then  user enter the last name in Last Name field
	# Then  user enter the billing address in Billing Address field
	#Then  user enter the CCN in Credit Card No field
	#Then  user select card type in Credit Card Type field 
	#Then  user select expriy date in Expiry Date field 
	#  Then  user enter the CCV nummber in CCV Nymber field
	# Then  user click the Book Now Buton  
	
	
	
	
	#@Login1	
	#Scenario Outline:line: User Launch The Application 
	#Given user Launch the Adacting Application 
	#When user enter the "<userName>" in username Field 
	#Then user enter the "<passWord>" in possword field 
	#And user click the loing button 
	
	#Examples: 
	#	|userName|passWord|
	#	|imxxxxaz|imthiyaz007|
	#	|mohammedfazil|fazil12345|