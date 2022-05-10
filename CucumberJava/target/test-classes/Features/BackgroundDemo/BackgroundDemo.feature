Feature: Check home page functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario: Check logout link
    When user clicks on Welcome link
    Then logout link is displayed

  Scenario: Verify quick launch menu bar is present
    When user clicks on Dashboard link
    Then quick launch toolbar is displayed
