@smokeTest
Feature: Sign In Feature

  @signingin
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign In option
    And User enter email 'legend2@gmail.com' and password '12345@Qwe'
    And User click on login button
    Then User should be logged in into account

 