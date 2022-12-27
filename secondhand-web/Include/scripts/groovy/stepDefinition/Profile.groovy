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

public class Profile {
	@Given("User click icon Profile on the right side of Notification icon")
	public void user_click_icon_Profile_on_the_right_side_of_Notification_icon() {
		WebUI.click(findTestObject('Dashboard Page/button_account'))
	}

	@Given("User click Profile")
	public void user_click_Profile() {
		WebUI.click(findTestObject('Dashboard Page/Button_Profile'))
	}

	@Given("User input name {string}")
	public void user_input_name(String username) {
		WebUI.setText(findTestObject('Profile Page/input_Nama'), username)
	}

	@Given("User input address {string}")
	public void user_input_address(String address) {
		WebUI.setText(findTestObject('Profile Page/Input_Alamat'), address)
	}

	@Given("user input phone {string}")
	public void user_input_phone(String phone) {
		WebUI.setText(findTestObject('Profile Page/input_Hp'), phone)
	}

	@Given("User click button of Submit")
	public void user_click_button_of_Submit() {
		WebUI.click(findTestObject('Profile Page/button_submit'))
	}

	@Then("Showing popup succesfully update profile")
	public void showing_popup_succesfully_update_profile() {
		WebUI.verifyElementVisible(findTestObject('Profile Page/Notification_Berhasil update profile'))
		WebUI.closeBrowser()
	}
}
