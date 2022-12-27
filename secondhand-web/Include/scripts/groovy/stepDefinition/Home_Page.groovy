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


public class Home_Page {

	@Given("User click button of Masuk")
	public void user_click_button_of_Masuk() {
		WebUI.click(findTestObject('Dashboard Page/button_Masuk'))
	}

	@Then("User redirected to homepage")
	public void user_redirected_to_homepage() {
		WebUI.verifyElementVisible(findTestObject('Home Page/Button_HomePage'))
		WebUI.verifyElementVisible(findTestObject('Home Page/button_Elektronik'))
		WebUI.verifyElementVisible(findTestObject('Home Page/button_Hoby'))
		WebUI.verifyElementVisible(findTestObject('Home Page/button_Kendaraan'))
		WebUI.verifyElementVisible(findTestObject('Home Page/Display_Iklan_disount'))
	}

	@When("User click category hobby")
	public void user_click_category_hobby() {
		WebUI.click(findTestObject('Home Page/button_Hoby'))
	}

	@Then("Showing product on category hobby")
	public void showing_product_on_category_hobby() {
		WebUI.verifyElementVisible(findTestObject('Home Page/Hobby_Action Figures Anime'))
	}

	@When("User click category transportations")
	public void user_click_category_transportations() {
		WebUI.click(findTestObject('Home Page/button_Kendaraan'))
	}

	@Then("Showing product on category transportations")
	public void showing_product_on_category_transportations() {
		WebUI.verifyElementVisible(findTestObject('Home Page/Transportation_Sepeda'))
	}

	@When("User click category electronic")
	public void user_click_category_electronic() {
		WebUI.click(findTestObject('Home Page/button_Elektronik'))
	}

	@Then("Showing product on category electronic")
	public void showing_product_on_category_electronic() {
		WebUI.verifyElementVisible(findTestObject('Home Page/Electronic_Kamera'))
		WebUI.closeBrowser()
	}
}
