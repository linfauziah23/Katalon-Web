Feature: Profile

  Background: User want to login using correct credential
    Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User input value of email with "linfauziah4455@gmail.com"
    And User input value of password with 'Bandung3210'
    And User click button of Masuk on Login page
    Then User successfully login
    
  @positive_case @PFL1001
  Scenario: User want to edit Profile
    Given User click icon Profile on the right side of Notification icon
    And User click Profile
    And User input name "Lin Fauziah"
    And User input address "Bandung"
    And user input phone "081585807973"
    And User click button of Submit
    Then Showing popup succesfully update profile
    

    