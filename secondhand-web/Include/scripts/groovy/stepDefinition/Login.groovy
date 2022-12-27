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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Login {
	@Given("User open URL secondhand web")
	public void user_open_url_secondhand_web() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://secondhand-store.herokuapp.com/')
	}

	@When("User click button of Masuk in Dashboard Page")
	public void user_click_button_of_Masuk_in_Dashboard_Page() {
		WebUI.click(findTestObject('Dashboard Page/button_Masuk'))
	}

	@When("User redirect to Login Page")
	public void user_redirect_to_Login_Page() {
		WebUI.verifyElementVisible(findTestObject('Login Page/title_header'))
		WebUI.verifyElementVisible(findTestObject('Login Page/text_Email'))
		WebUI.verifyElementVisible(findTestObject('Login Page/input_Email'))
		WebUI.verifyElementVisible(findTestObject('Login Page/text_Password'))
		WebUI.verifyElementVisible(findTestObject('Login Page/input_Password'))
		WebUI.verifyElementVisible(findTestObject('Login Page/button_Masuk'))
	}

	@When("User input value of email with {string}")
	public void user_input_value_of_email_with(String email) {
		WebUI.setText(findTestObject('Login Page/input_Email'), email)
	}

	@When("User input value of password with {string}")
	public void user_input_value_of_password_with(String password) {
		WebUI.setText(findTestObject('Login Page/input_Password'), password)
	}

	@When("User click button of Masuk on Login page")
	public void user_click_button_of_Masuk_on_Login_page() {
		WebUI.click(findTestObject('Login Page/button_Masuk'))
	}

	@Then("User successfully login")
	public void user_successfully_login() {
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/navlink_daftarjual'))
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/button_notification'))
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/button_account'))
	}


	@Then("User will see a popup or notification that explains if the email was not found")
	public void user_will_see_a_popup_or_notification_that_explains_if_the_email_was_not_found() {
		WebUI.verifyElementVisible(findTestObject('Login Page/warning_Akun tidak ditemukan'))
	}

	@When("User input wrong value of password with {string}")
	public void user_input_wrong_value_of_password_with(String password) {
		WebUI.setText(findTestObject('Login Page/input_Password'), password)
	}

	@Then("User will see a popup or notification that explains if the password is incorrect")
	public void user_will_see_a_popup_or_notification_that_explains_if_the_password_is_incorrect() {
		WebUI.verifyElementVisible(findTestObject('Login Page/warning_Password anda salah'))
	}

	@Then("User stay in Login Page")
	public void user_stay_in_login_page() {
		WebUI.verifyElementVisible(findTestObject('Login Page/title_header'))
		WebUI.verifyElementVisible(findTestObject('Login Page/text_Email'))
		WebUI.verifyElementVisible(findTestObject('Login Page/input_Email'))
		WebUI.verifyElementVisible(findTestObject('Login Page/text_Password'))
		WebUI.verifyElementVisible(findTestObject('Login Page/input_Password'))
		WebUI.verifyElementVisible(findTestObject('Login Page/button_Masuk'))
		WebUI.closeBrowser()
	}
}
