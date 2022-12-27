Feature: Logout

  Background: User want to login using correct credential
  	Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User input value of email with 'almas.testing@gmail.com'
    And User input value of password with '12345678'
    And User click button of Masuk on Login page
    Then User successfully login

  @positive_case @LGT1001
  Scenario: User want to log out
    When User click account logo on top right corner
    And User click logout
    Then User successfully logout