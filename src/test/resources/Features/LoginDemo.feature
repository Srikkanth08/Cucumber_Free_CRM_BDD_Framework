Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and "password"   #we can do parameterization with conical brackets(<>) or by using double quotes
    And user clicks on login
    Then user is navigated to homepage

    Examples: 
      | username | password |
      | SRIKANTH |    12345 |
      | KANTH    |    12345 |
