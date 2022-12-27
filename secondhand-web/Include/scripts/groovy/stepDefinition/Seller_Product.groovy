package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows



import internal.GlobalVariable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Seller_Product {
	@When("Seller click the icon List")
	public void seller_click_the_icon_List() {
		WebUI.click(findTestObject('Dashboard Page/icon_daftarJual'))
	}

	@Then("Seller products displayed")
	public void seller_products_displayed() {
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Page/text_Kategori'))
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Page/text_Daftar Jual Saya'))
		WebUI.closeBrowser();
	}


	@Given("Seller on secondhand homepage")
	public void seller_on_secondhand_homepage() {
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/navlink_daftarjual'))
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/button_notification'))
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/button_account'))
	}

	@When("Seller click the button Jual")
	public void seller_click_the_button_Jual() {
		WebUI.click(findTestObject('Dashboard Page/btn_jual'))
	}

	@When("Seller click the button Edit")
	public void seller_click_the_button_Edit() {
		WebUI.click(findTestObject('Product Page/button_Edit'))
	}


	@When("Seller fill the value in Nama Produk column with {string}")
	public void seller_fill_the_value_in_Nama_Produk_column_with(String product_name) {
		WebUI.setText(findTestObject('Product Info Page/input_Nama Produk'), product_name)
	}

	@When("Seller fill the value in Harga Produk column with {string}")
	public void seller_fill_the_value_in_Harga_Produk_column_with(String product_price) {
		WebUI.setText(findTestObject('Product Info Page/input_Harga Produk'), product_price)
	}

	@When("Seller select the value in Kategori column with {string}")
	public void seller_select_the_value_in_Kategori_column_with(String product_category) {
		WebUI.selectOptionByIndex(findTestObject('Product Info Page/select_kategori'), product_category)
	}

	@When("Seller fill the value in Deskripsi column with {string}")
	public void seller_fill_the_value_in_Deskripsi_column_with(String product_description) {
		WebUI.setText(findTestObject('Product Info Page/input_Deskripsi'), product_description)
	}


	@When("Seller click the button Terbitkan")
	public void seller_click_the_button_Terbitkan() {
		WebUI.click(findTestObject('Product Info Page/button_Terbitkan 1'))
	}

	@Then("New product successfully added")
	public void new_product_successfully_added() {
		WebUI.click(findTestObject('Dashboard Page/icon_daftarJual'))
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Page/text_Kategori'))
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Page/text_Daftar Jual Saya'))
		WebUI.click(findTestObject('Daftar Jual Page/Card_Product 1'))
		WebUI.verifyElementVisible(findTestObject('Product Page/text_Deskripsi'))
		WebUI.closeBrowser();
	}

	@When("Seller select product")
	public void seller_select_product() {
		WebUI.click(findTestObject('Daftar Jual Page/Card_Product 1'))
	}

	@When("Seller select new product")
	public void seller_select_new_product() {
		WebUI.click(findTestObject('Daftar Jual Page/Card_Product 2'))
	}

	@Then("Saved changes successfully")
	public void saved_changes_successfully() {
		WebUI.click(findTestObject('Dashboard Page/icon_daftarJual'))
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Page/text_Kategori'))
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Page/text_Daftar Jual Saya'))
		WebUI.click(findTestObject('Daftar Jual Page/Card_Product'))
		WebUI.verifyElementVisible(findTestObject('Product Page/text_Deskripsi'))
		WebUI.closeBrowser();
	}

	@When("Seller click the button Hapus")
	public void seller_click_the_button_Hapus() {
		WebUI.click(findTestObject('Product Page/button_Hapus'))
	}

	@Then("Product deleted successfully")
	public void product_deleted_successfully() {
		WebUI.click(findTestObject('Dashboard Page/icon_daftarJual'))
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Page/text_Kategori'))
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Page/text_Daftar Jual Saya'))
		WebUI.closeBrowser();
	}

	@When("Seller upload foto product {string}")
	public void seller_upload_foto_product(String photo_product) {
		WebUI.uploadFile(findTestObject('Product Info Page/Upload'), photo_product)
	}

	@Then("New product unsuccessfully added")
	public void new_product_unsuccessfully_added() {
		WebUI.verifyElementVisible(findTestObject('Product Info Page/label_Harga Produk'))
		WebUI.closeBrowser();
	}
}
