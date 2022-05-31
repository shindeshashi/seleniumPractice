Feature: Loginpage feature

Scenario: Validate login page fields
Given User is on the login page
When User enters login credentials
And Clicks on the Login button 
Then Dashboard page should be displayed
And Four tabs should be displayed
And Logout field should be displayed