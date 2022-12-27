Feature: Notification

  Background: User want to login using correct credential
    Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User input value of email with 'devipuspita217@gmail.com'
    And User input value of password with 'qwertyuiop'
    And User click button of Masuk on Login page
    Then User successfully login

  @positive_case @NS1001
  Scenario: Seller get notification after buyer send a negotiation to seller
    When Seller click notification icon
    Then Seller gets notification of negotiation product

  @positive_case @NS1002
  Scenario: Seller get notification after the transaction has been completed
    When Seller click notification icon
    Then Seller gets notification transaction has been completed