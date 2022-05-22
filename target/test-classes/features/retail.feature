Feature: Retail Upskill

Scenario: Validate the Retail page functionality

Given User navigated to the Login Page
And Enter Username and password 
And Retail Login Page should load
When click on Coupons button
Then click on Add Coupan
Then Enter all the Necessary details and Save
And Verify the Coupan created
Then Click Edit the added Coupon 
When Edit Coupon Page Loaded, Update the coupon name
And Verify the Edited coupon in coupon list
And Delete the coupon

