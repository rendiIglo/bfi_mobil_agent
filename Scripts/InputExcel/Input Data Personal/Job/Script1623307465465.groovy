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

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_Profession'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlProfesion/span_ddlProfession_' + ddlProfession))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_JobLevel'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlJobLevel/span_ddlJobLevel_' + ddlJobLevel))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 2)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_JobPosition'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlJobPosition/span_ddlJobPosition_' + 
        ddlPosition))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 2)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_EconomySector'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlEconomySector/span_ddlEconomySector_' + 
        ddlEconomySector))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 2)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_IndustryType'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlIndustryType/span_ddlIndustryType_' + 
        ddlIndustryType))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/a_SaveButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(2)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(5)

