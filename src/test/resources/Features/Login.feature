Feature: Login

  Scenario: LoginPage  
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in Dashboard