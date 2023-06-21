Feature: Update My Profile Functionality

Scenario: Verify My Profile Functionality
Given I am in Landing Page
When I click on login menu
Then click on Customer login menu
Then enter User Id as david@gmail.com
And enter password as 1234
And I click on login button
Then Click on My Profile on customer welcome page
Then Click on Update Info
Then Clear and Enter First name
Then Clear and Enter Last Name 
Then Clear and Enter DOB 
Then Clear and Enter Gender
Then Clear and Enter Phone Number 
Then Clear and Enter Address
Then Click on Submit
Then Verify On Update Page My Info
Then Verify Phone Number on Update Info Page