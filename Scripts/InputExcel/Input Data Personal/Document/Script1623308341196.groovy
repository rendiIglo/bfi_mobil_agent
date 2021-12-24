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

WebUI.comment('upload KTP')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_ektp'))

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), txtKTPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), txtKTPExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), txtKTPDocumentDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(2)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    GlobalVariable.projectPath + '\\KTP.png')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(3)

WebUI.comment('SIM')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_SIM'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), txtSIMDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), txtSIMExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), txtSIMDocumentDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(2)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    GlobalVariable.projectPath + '\\SIM.jpg')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(3)

WebUI.comment('NPWP')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_NPWP'))

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), txtNPWPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), txtNPWPExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), txtNPWPDocumentDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(2)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    GlobalVariable.projectPath + '\\NPWP.jpg')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(3)

