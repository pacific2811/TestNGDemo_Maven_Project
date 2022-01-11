
Feature: login functionality check


  Background: login page common to all
    Given User is on login page

#@smoketest
Scenario: Check login is sucessfull with valid credentials
When User enters username and password
And User click on login button
Then User lands on homepage


#Scenario Outline: Check login is sucessfull with valid credentials
#When User enters <username> and <password>
#And User click on login button
#Then User lands on homepage
#
#Examples:
#|username|password|
#|user1|pass1|
#|user2|pass2|