Feature: Login Functionality

Scenario: Successfull Login
    Given User is on login page
    When User enter valid username and password
    And Clicks on the login button
    Then User is logged in successfully



