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

WebUI.click(findTestObject('Object Repository/Page_New York Health Insurance  Healthfirst/a_Find a Doctor'))

WebUI.click(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/div_Search For CareHealthfirst 65 Plus Plan_b3e24e'))

WebUI.click(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/p_Primary Care Provider'))

WebUI.setText(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/input_Find a Doctor_location'), '07310')

WebUI.click(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/div_Jersey City, NJ 07310'))

WebUI.click(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/div_Healthfirst 65 Plus Plan (HMO)'))

WebUI.click(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/button_Healthfirst CompleteCare (HMO D-SNP)'))

WebUI.click(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/p_GARY B PALATUCCI, MD'))

WebUI.click(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/a_Text Info'))

WebUI.setText(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/input_Phone Number_InformationInput-sc-8l1q_6f8473'), 
    '201-912-3162 ')

WebUI.click(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/button_Send'))

WebUI.click(findTestObject('Object Repository/Page_Find a Doctor  Healthfirst/img_Provider details have been sent success_931390'))

WebUI.closeBrowser()

