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

WebUI.navigateToUrl('https://healthfirst.org/')

WebUI.click(findTestObject('Object Repository/Page_New York Health Insurance  Healthfirst/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_New York Health Insurance  Healthfirst/a_Member Portal'))

WebUI.switchToWindowTitle('Member Portal | Healthfirst')

WebUI.setText(findTestObject('Object Repository/Page_Member Portal  Healthfirst/input_Forgot Username_username'), 'ninnijokefoi-1470@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Member Portal  Healthfirst/input_Forgot Password_password'), 
    'p4y+y39Ir5OeiLgMCVLGWg==')

WebUI.click(findTestObject('Object Repository/Page_Member Portal  Healthfirst/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Member Portal  Healthfirst/a_Skip for now'))

WebUI.click(findTestObject('Object Repository/Page_Member Portal  Healthfirst/button_No Thanks'))

WebUI.click(findTestObject('Object Repository/Page_Member Portal  Healthfirst/span_john'))

WebUI.click(findTestObject('Object Repository/Page_Member Portal  Healthfirst/button_Log Out'))

