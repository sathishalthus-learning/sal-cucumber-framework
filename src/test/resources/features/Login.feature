@Login
Feature: Login

  @validLogin
  Scenario: login with valid credentials
    Given navigated to login page
    When enters valid credentials "Admin" and "admin123"
    Then validate "Dashboard" is displayed
#
  #@invalidLogin
  #Scenario : invalid credentials verification
    #Given navigated to login page
    #When enters invalid creds "sathish" and "password"
    #Then verify the "Invalid Crentials" is displayed
#
  #@emptyLogin
  #Scenario : invalid credentials verification
    #Given navigated to login page
    #When enters empty creds "" and ""
    #Then verify the "Required" is displayed
