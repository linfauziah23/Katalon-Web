Feature: Notification

  Background: User want to login using correct credential
    Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User input value of email with 'testingbinar001@gmail.com'
    And User input value of password with 'binar123'
    And User click button of Masuk on Login page
    Then User successfully login

  @positive_case @NB1001
  Scenario: Buyer Click button notification
    When Buyer click button notification in navbar
    Then The system displays a pop up notification

  @positive_case @NB1002
  Scenario: Buyer get notification after buyer send negotiation product to seller
    When Buyer click button notification in navbar
    Then Buyer gets notification negotiation product

  @positive_case @NB1003
  Scenario: Buyer get notification after seller accepted negotiation
    When Buyer click button notification in navbar
    Then Buyer gets notification accepted

  @positive_case @NB1004
  Scenario: Buyer get notification after seller rejected negotiation
    When Buyer click button notification in navbar
    Then Buyer gets notification rejected

  @positive_case @NB1005
  Scenario: Buyer get notification after the seller confirms the transaction has been completed
    When Buyer click button notification in navbar
    Then Buyer gets notification transaction has been completed
