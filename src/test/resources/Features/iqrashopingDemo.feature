Feature: I want to verify Iqrashopingdemo page

  Scenario: I want to verify the login functionality
    Given I launch the chrome browser
    And   I click on My Account page
    And   I enter user name and password
    And   I click on the Login button
    Then  I should be landed to the My Acoount dashboard