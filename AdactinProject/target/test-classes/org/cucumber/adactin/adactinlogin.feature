Feature: Adactin Login Functionality

Background:
Given user launches the website
When user enters the username and password
Then user enters login
Then user selects location as given.
Then user selects hotel
Then user selects roomtype
Then user selects no of rooms


Scenario: To verify that system gives an error saying check-in-date should not be later than check-out-date.
Then user selects check-in date as seven and check-out date as five.

Scenario: To verify that application throws error message.
Then user selects check-in date as minus five and check-out date as minus three.

Scenario: To verify that hotel displayed is the same as selected in search Hotel form.			
Then user selects check-in date as today and check-out date as the day after today.
Then user selects no of adults and no of children as 1 and 0 respectively.

Scenario: To verify that check-in date and check-out date displayed is the same as selected in search Hotel form.			
Then user selects check-in date as today and check-out date as the day after today.
Then user selects no of adults and no of children as 1 and 0 respectively.