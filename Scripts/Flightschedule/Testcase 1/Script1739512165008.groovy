import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flightaware.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_FlightAware - Flight Tracker  Flight Status/input_Search by Route_origin'), 'Chennai')

WebUI.click(findTestObject('Page_FlightAware - Flight Tracker  Flight Status/div_Chennai Intl (Chennai  Madras)  - MAA - VOMM'))

WebUI.setText(findTestObject('Page_FlightAware - Flight Tracker  Flight Status/input_Search by Route_destination'), 'Bengaluru')

WebUI.click(findTestObject('Page_FlightAware - Flight Tracker  Flight Status/div_Bengaluru Intl (Bangalore)  - BLR - VOBL'))

WebUI.click(findTestObject('Page_FlightAware - Flight Tracker  Flight Status/search'))

WebUI.click(findTestObject('Page_FlightAware - Flight Tracker  Flight Status/Page_Flight Finder  Chennai Intl (VOMM) - Bengaluru Intl (VOBL) - FlightAware/td_IndiGO'))

WebUI.click(findTestObject('Page_FlightAware - Flight Tracker  Flight Status/Page_6E6892 (IGO6892) IndiGO Flight Tracking and History 15-Feb-2025 (MAA  VOMM-BLR  VOBL) - FlightAware/span_Join FlightAware'))

WebUI.click(findTestObject('Page_FlightAware - Flight Tracker  Flight Status/Page_1739518066075/checkbox'))

WebUI.closeBrowser()

