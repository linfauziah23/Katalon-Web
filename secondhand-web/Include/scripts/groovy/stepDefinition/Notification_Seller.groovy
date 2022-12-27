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

public class Notification_Seller {
	@Given("Seller click notification icon")
	public void seller_click_notification_icon() {
		WebUI.click(findTestObject('Dashboard Page/button_notification'))
	}

	@Then("Seller gets notification of negotiation product")
	public void seller_gets_notification_of_negotiation_product() {
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/Notif_Penawaran Produk Seller'))
	}

	@Then("Seller gets notification transaction has been completed")
	public void seller_gets_notification_transaction_has_been_completed() {
		WebUI.scrollToElement(findTestObject('Dashboard Page/Notif_Penawaran Produk Berhasil Disepakati Seller'), 0)
		WebUI.verifyElementVisible(findTestObject('Dashboard Page/Notif_Penawaran Produk Berhasil Disepakati Seller'))
		WebUI.closeBrowser();
	}
}
