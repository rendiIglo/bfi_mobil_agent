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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://los-k2app.dev-ad.co.id/customForm/')

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'Agus')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_LeadsDataInput'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_SubBranch'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_SubBranch'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlSubBranch_Medan'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_GeraiInput'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlGeraiInput_Medan'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_Product'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlProduct_NDF Car'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_DataType'))

WebUI.click(findTestObject('TC.05_Leads Data Input-Database-LE/span_ddlDataType_Database'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_CustomerType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlCustomerType_Legal Entity'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_NextButton'))

WebUI.delay(1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

