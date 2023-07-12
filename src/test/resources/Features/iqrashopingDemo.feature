Feature: I want to verify Iqrashopingdemo page

  Scenario: I want to verify login functionality
    Given I launch the chrome browser
    And I click on Myaccount page
    And I enter user name and password
    And I click on the Login button
    Then I should landed to the myacoount dashboard