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

public class Notification_Buyer {

	@When("Buyer click button notification in navbar")
	public void buyer_click_button_notification_in_navbar() {
		WebUI.click(findTestObject('Dashboard Page/button_notification'))
	}

	@Then("The system displays a pop up notification")
	public void the_system_displays_a_pop_up_notification() {
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/PopUp_Notification'))
	}


	@Then("Buyer gets notification negotiation product")
	public void buyer_gets_notification_negotiation_product() {
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/Notif_Penawaran Produk Buyer'))
	}


	@Then("Buyer gets notification accepted")
	public void buyer_gets_notification_accepted() {
		WebUI.scrollToElement(findTestObject('Dashboard Page/Notif_Penawaran Produk Diterima'), 0)
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/Notif_Penawaran Produk Diterima'))
	}

	@Then("Buyer gets notification rejected")
	public void buyer_gets_notification_rejected() {
		WebUI.scrollToElement(findTestObject('Dashboard Page/Notif_Penawaran Produk Ditolak'), 0)
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/Notif_Penawaran Produk Ditolak'))
	}
	@Then("Buyer gets notification transaction has been completed")
	public void buyer_gets_notification_transaction_has_been_completed() {
		WebUI.scrollToElement(findTestObject('Dashboard Page/Notif_Penawaran Produk Berhasil Disepakati'), 0)
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/Notif_Penawaran Produk Berhasil Disepakati'))
		WebUI.closeBrowser();
	}
}
