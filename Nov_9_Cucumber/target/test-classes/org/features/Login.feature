Feature: Loginpage feature
@smoke
Scenario: Validate login page fields
Given User is on the login page
Then Username field should be displayed
And Password field should be displayed
And Login button should be displayed

Scenario: Validate valid login credentials
Given User is on the login page
#When User enters login credentials
#When User enters Username as "admin"
#And User enters password as "manager"
When User enters Username 
And User enters password
And Clicks on the Login button 
Then Dashboard page should be displayed

#Scenario: Validate invalid login credentials
#Given User is on the login page
#When User enters login credentials
#And Clicks on the Login button
#Then User should be on login page