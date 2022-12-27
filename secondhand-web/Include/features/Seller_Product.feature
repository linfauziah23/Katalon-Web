Feature: Add Product

  Background: User want to login using correct credential
    Given User open URL secondhand web
    When User click button of Masuk in Dashboard Page
    And User redirect to Login Page
    And User input value of email with 'almas.testing@gmail.com'
    And User input value of password with '12345678'
    And User click button of Masuk on Login page
    Then User successfully login

  @positive_case @create_product @CP1001
  Scenario: Seller want to add new item
  Given Seller on secondhand homepage
  When Seller click the button Jual
  And Seller fill the value in Nama Produk column with 'Baju Anak'
  And Seller fill the value in Harga Produk column with '50000'
  And Seller select the value in Kategori column with '3'
  And Seller fill the value in Deskripsi column with 'Tersedia ukuran S, M, L'
  And Seller upload foto product "D:\platinum_challange\secondhand-web\Image Product\baju anak.jpg"
  And Seller click the button Terbitkan
  Then New product successfully added
  
  @negative_case @create_product @CP1002
  Scenario: Seller want to add new item without fill form
    Given Seller on secondhand homepage
    When Seller click the button Jual
    And Seller click the button Terbitkan
    Then New product unsuccessfully added
    
  @positive_case @view_product @VP1001
  Scenario: Seller want to view item
    Given Seller on secondhand homepage
    When Seller click the icon List
    Then Seller products displayed

  @positive_case @edit_product @EP1001
  Scenario: Seller want to edit item
    Given Seller click the icon List
    When Seller select product
    And Seller click the button Edit
    And Seller fill the value in Nama Produk column with 'Baju Dewasa'
    And Seller fill the value in Harga Produk column with '200000'
    And Seller select the value in Kategori column with '4'
    And Seller fill the value in Deskripsi column with 'Tersedia ukuran S, M, L, XL, XXL'
    And Seller upload foto product "D:\platinum_challange\secondhand-web\Image Product\baju dewasa.jpg"
    And Seller click the button Terbitkan
    Then Saved changes successfully

  @positive_case @delete_product @DP1001
  Scenario: Seller want to delete item
    Given Seller click the icon List
    When Seller select new product
    And Seller click the button Hapus
    Then Product deleted successfully
