#Author: your.email@your.domain.com
#Keywords Summary :
@Login
Feature: Login
  To verify the login feature

  @validLogin
  Scenario: login with valid credentials
    Given navigated to login page
    When enters valid credentials "Admin" and "admin123"
    Then validate "Dashboard" is displayed

  @invalidLogin
  Scenario Outline: invalid credentials verification
    Given navigated to login page
    When enters invalid creds "sathish" and "password"
    Then verify the "Invalid Crentials" is displayed

  @emptyLogin
  Scenario Outline: invalid credentials verification
    Given navigated to login page
    When enters empty creds "" and ""
    Then verify the "Required" is displayed
