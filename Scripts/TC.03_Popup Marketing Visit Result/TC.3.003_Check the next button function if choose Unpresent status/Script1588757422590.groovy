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

WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'agus')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/a_MarketingVisit'))

WebUI.delay(1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/txtCustomerName'), 'fdgd')

not_run: WebUI.setText(findTestObject('TC.02_MarketingVisitTask/txtLeadsID'), '20200415-401-L-000145')

not_run: WebUI.setText(findTestObject('TC.02_MarketingVisitTask/txtCustomerID'), '')

not_run: WebUI.setText(findTestObject('TC.02_MarketingVisitTask/txtAssignmentDateFrom'), '1-Apr-2020')

not_run: WebUI.setText(findTestObject('TC.02_MarketingVisitTask/txtAssignmentDateTo'), '2-Apr-2020')

WebUI.click(findTestObject('TC.02_MarketingVisitTask/a_Search'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('TC.02_MarketingVisitTask/span_Found_Arrod'))

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/txtVisitDate'), '30-Des-2020')

not_run: WebUI.setText(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/txtVisitHour'), '10:00')

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/ddl_present'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/span_ddlPresent_UnPresent'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/ddl_result'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/span_ddlResult_UnPresent_tidak bertemu'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/a_nextButton'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

