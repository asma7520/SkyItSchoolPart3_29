Feature: Customer Login Functionality

Scenario: Verify Customer login functionality
Given I am in landing page
When I click on login menu
Then click on Customer login menu
Then enter User Id as david@gmail.com
And enter password as 1234
And I click on login Button
Then verify I am in my home page