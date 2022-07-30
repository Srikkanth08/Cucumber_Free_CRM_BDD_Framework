#Author Srikanth
#Date
#Description

@SmokeFeature
Feature: Feature to test a login functionality

@smoketest
  Scenario: Check login is successful with valid credentials
    Given User is on login page
    When User enters username and password
    And Clicks on login button
    Then User is navigated to the homepage
