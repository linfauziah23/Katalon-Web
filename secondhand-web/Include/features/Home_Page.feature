Feature: Home Page

  @positive_case @HP1001
  Scenario: User viewing the home page
  	Given User open URL secondhand web
    When User click button of Masuk
    And User input value of email with "linfauziah4455@gmail.com"
    And User input value of password with "Bandung3210"
    And User click button of Masuk on Login page
    Then User redirected to homepage

  @positive_case @HP1002
  Scenario: User can views category hobby
  	Given User open URL secondhand web
    When User click button of Masuk
    And User input value of email with "linfauziah4455@gmail.com"
    And User input value of password with "Bandung3210"
    And User click button of Masuk on Login page
    And User redirected to homepage
    And User click category hobby
    Then Showing product on category hobby

  @positive_case @HP1003
  Scenario: User can views category transportations
  	Given User open URL secondhand web
    When User click button of Masuk
    And User input value of email with "linfauziah4455@gmail.com"
    And User input value of password with "Bandung3210"
    And User click button of Masuk on Login page
    And User redirected to homepage
    And User click category transportations
    Then Showing product on category transportations

  @positive_case @HP1004
  Scenario: User can views category electronic
  	Given User open URL secondhand web
    When User click button of Masuk
    And User input value of email with "linfauziah4455@gmail.com"
    And User input value of password with "Bandung3210"
    And User click button of Masuk on Login page
    And User redirected to homepage
    And User click category electronic
    Then Showing product on category electronic
