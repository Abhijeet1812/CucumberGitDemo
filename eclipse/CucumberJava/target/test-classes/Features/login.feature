
#Author Abhijeet
Feature: feature to test login fuctionality

  Scenario: check login is successful with valid credentionals
    Given user is on login page
    When users enter their id and password
    And clicks on login button
    Then user is navigated to the home page

