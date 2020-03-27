Feature: Practice_Automation_Testing

@TS01
Scenario: Resister_Page
Given user launch the browser
When user opens the url
Then click my account
Then fill the details 
And close the browser

@TS02
Scenario: Buy_a_Book 
Given  launch the browser
When user opens with correct url
Then select book and add to basket
Then select quantity
Then update the basket
Then get the total price
Then close the browser

@TS03
 Scenario: Filling details in Demosite
 Given user launches the chrome Application
 When user opens the AutomationPractice Homepage
 Then user clicks on the demosite and fill all necessary details
 Then Clicks on the refresh button