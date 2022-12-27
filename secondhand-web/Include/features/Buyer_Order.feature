Feature: Buyer Order

  Background: User want to login using correct credential
    Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User input value of email with 'virtualqwerty67@gmail.com'
    And User input value of password with 'qwertyuiop'
    And User click button of Masuk on Login page
    Then User successfully login

  @positive_case @BO1001
  Scenario: Buyer want to see product details
    When Buyer view product list
    And Buyer click electronic category
    And Buyer click camera
    Then Buyer will redirected to product page

  @negative_case @BO1002
  Scenario: Buyer make an order without login
    When Buyer logout
    And Buyer view product list
    And Buyer click electronic category
    And Buyer click camera
    And Buyer click Saya tertarik dan ingin nego button
    Then Buyer redirected to login page
  
  @positive_case @BO1003
  Scenario: Buyer make an order after login
    When Buyer view product list
    And Buyer click electronic category
    And Buyer click camera
    And Buyer click Saya tertarik dan ingin nego button
    And Buyer set value '5000000' in Harga tawar column
    And Buyer click Kirim button
    Then Showing notification Harga tawarmu berhasil dikirim ke penjual
