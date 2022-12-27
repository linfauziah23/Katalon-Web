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

public class Buyer_Order {

	@Given("Buyer view product list")
	public void buyer_view_product_list() {
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/List Product on Homepage/Alat Tensi'))
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/List Product on Homepage/Kamera'))
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/List Product on Homepage/Kemeja Pria'))
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/List Product on Homepage/Sarung'))
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/List Product on Homepage/Sepeda'))
	}

	@When("Buyer click electronic category")
	public void buyer_click_electronic_category() {
		WebUI.click(findTestObject('Dashboard Page/button_Elektronik'))
	}

	@When("Buyer click camera")
	public void buyer_click_camera() {
		WebUI.click(findTestObject('Dashboard Page/Kamera'))
	}

	@Then("Buyer will redirected to product page")
	public void buyer_will_redirected_to_product_page() {
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/button_Home'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/img_item'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/field_deskripsi'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/button_Saya tertarik dan ingin nego'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/img_buyer'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/nama_buyer'))
	}

	@Given("Buyer logout")
	public void buyer_logout() {
		WebUI.click(findTestObject('Dashboard Page/button_account'))
		WebUI.click(findTestObject('Dashboard Page/button_Log Out'))
	}

	@When("Buyer click Saya tertarik dan ingin nego button")
	public void buyer_click_Saya_tertarik_dan_ingin_nego_button() {
		WebUI.click(findTestObject('Product Page Buyer/button_Saya tertarik dan ingin nego'))
	}

	@Then("Buyer redirected to login page")
	public void buyer_redirected_to_login_page() {
		WebUI.verifyElementVisible(findTestObject('Login Page/title_header'))
		WebUI.verifyElementVisible(findTestObject('Login Page/text_Email'))
		WebUI.verifyElementVisible(findTestObject('Login Page/input_Email'))
		WebUI.verifyElementVisible(findTestObject('Login Page/text_Password'))
		WebUI.verifyElementVisible(findTestObject('Login Page/input_Password'))
		WebUI.verifyElementVisible(findTestObject('Login Page/button_Masuk'))
	}

	@When("Buyer set value {string} in Harga tawar column")
	public void buyer_set_value_in_Harga_tawar_column(String string) {
		WebUI.setText(findTestObject('Product Page Buyer/input_Harga Tawar'), '5000000')
	}

	@When("Buyer click Kirim button")
	public void buyer_click_Kirim_button() {
		WebUI.click(findTestObject('Product Page Buyer/button_Kirim'))
	}

	@Then("Showing notification Harga tawarmu berhasil dikirim ke penjual")
	public void showing_notification_Harga_tawarmu_berhasil_dikirim_ke_penjual() {
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/button_Home'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/link_daftarjual'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/button_notification'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/button_account'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/img_item'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/field_deskripsi'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/img_buyer'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/nama_buyer'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/popup_Harga tawarmu berhasil dikirim ke penjual'))
		WebUI.verifyElementVisible(findTestObject('Product Page Buyer/disabblebutton_Menunggu respon penjual'))
		WebUI.closeBrowser()
	}
}
