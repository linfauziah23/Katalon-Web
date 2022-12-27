Feature: Login

  @positive_case @seller @LGN1001
  Scenario: User want to login using correct credential
    Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User input value of email with 'almas.testing@gmail.com'
    And User input value of password with '12345678'
    And User click button of Masuk on Login page
    Then User successfully login

  @positive_case @buyer @LGN1002
  Scenario: User want to login using correct credential
    Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User input value of email with 'qurates1@yopmail.com'
    And User input value of password with 'qwertyuiop'
    And User click button of Masuk on Login page
    Then User successfully login

  @negative_case @LGN1003
  Scenario: User want to login using incorrect credential (e-mail is not registered)
    Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User input value of email with 'safira@gmail.com'
    And User input value of password with 'students1234'
    And User click button of Masuk on Login page
    Then User will see a popup or notification that explains if the email was not found

  @negative_case @LGN1004
  Scenario: User want to login using incorrect credential (wrong password)
    Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User input value of email with 'almas.testing@gmail.com'
    And User input wrong value of password with 'abcdefgh'
    And User click button of Masuk on Login page
    Then User will see a popup or notification that explains if the password is incorrect

  @negative_case @LGN1005
  Scenario: User want to login but doesn't fill email and password
    Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User click button of Masuk on Login page
    Then User stay in Login Page
