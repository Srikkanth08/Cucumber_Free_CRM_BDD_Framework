#Author Srikanth
#Date
#Description

@SmokeScenario
Feature: Feature to test a login functionality

@SmokeTest
  Scenario: Check login is successful with valid credentials
    Given User is on login page
    When User enters username and password
    And Clicks on login button
    Then User is navigated to the homepage

  Scenario Outline: Check login is successful with valid credentials
    Given User is on login page
    When User enters <username> and <password>
    And Clicks on login button
    Then User is navigated to the homepage

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
