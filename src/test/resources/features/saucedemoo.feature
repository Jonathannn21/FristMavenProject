#go to website
#type username and password
#click sign in
#verify login successfully
# this is an example of a test case denied as a user step
Feature: Sauce Demo functionalities
  this is to autmate sauce demo scenarios functionalities

  Scenario: Sauce demo valid login
    Given user is on the login page
    When user enters valid user name and valid password
    And user clicks on signin button
    Then user is logged in successfully
