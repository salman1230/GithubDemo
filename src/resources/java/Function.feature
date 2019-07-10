Feature: Demo File
Background: Browser Launch
Given Browser must be present in the system
When user opens the apps in the browser
Then Testme opens in the browser

Scenario: Login Functionality
Given User must be Already registeed	
When user enter the valid credential
Then User must be in the Home Page

Scenario: Search Product
Given User must have the search option
When search for the product with the name
Then searched product detail must be displayed in page
