Feature: Customer Contact Number Modification functionality
Scenario: Verify Customer Contact Number Modification functionality

Given I am in landing page http://it.microtechlimited.com
When I Click on Login Menu button
And I Click on Customer Login button
Then Enter User Id as david@gmail.com          -- called Test Step
And I Enter Password as 1234
Then Verify that I am in Home Page
And I Click on Profile Menu
And I Click on Update Info
And I Replace the Contact Number to "44555"
And I Click Submit button
Then Verify Contact Number is changed to "44555"


#Gherkin Language - 
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, * 
#Given - Precondition
#called Test Step