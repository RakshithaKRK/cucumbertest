
Feature: Verify the login functionality
@smok
Scenario: Login with valid credentials

Given enter the URL  
And user is on login page
When enter the valid username and password
Then user is able to land homescreen 