import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.booking.com/')

WebUI.setText(findTestObject('Object Repository/Page_Bookingcom  Official site  The best hotels  accommodations/input_Type your destination_ss'), 
    'Paris')

WebUI.click(findTestObject('Object Repository/Page_Bookingcom  Official site  The best hotels  accommodations/li_ParisIle de FranceFrance'))

WebUI.click(findTestObject('Page_Bookingcom  Official site  The best hotels  accommodations/svg'))

WebUI.click(findTestObject('Object Repository/Page_Bookingcom  Official site  The best hotels  accommodations/svg'))

WebUI.click(findTestObject('Object Repository/Page_Bookingcom  Official site  The best hotels  accommodations/svg'))

WebUI.click(findTestObject('Object Repository/Page_Bookingcom  Official site  The best hotels  accommodations/span_21'))

WebUI.click(findTestObject('Object Repository/Page_Bookingcom  Official site  The best hotels  accommodations/span_28'))

WebUI.click(findTestObject('Object Repository/Page_Bookingcom  Official site  The best hotels  accommodations/span_0 children'))

WebUI.click(findTestObject('Object Repository/Page_Bookingcom  Official site  The best hotels  accommodations/span_'))

WebUI.setText(findTestObject('Object Repository/Page_Bookingcom  Official site  The best hotels  accommodations/input_Children_group_children'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_Bookingcom  Official site  The best hotels  accommodations/span_Search'))

WebUI.closeBrowser()

