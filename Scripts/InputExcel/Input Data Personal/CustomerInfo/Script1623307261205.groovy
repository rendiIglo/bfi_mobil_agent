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

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/div_menuCustomer'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtCustomerName'), txtCustomerName)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtEmail'), txtEmail)

if (ddlDataType == 'Leads') {
    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtPlaceOfBirth'), txtCustomerPOB)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerNPWP'), txtNPWP)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtIDExpiredDate'), txtIDExpiredDate)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtIDNo'), txtIDNo)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo2'), txtMobilePhone2)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtDateOfBirth'), txtDateOfBirth)
}

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

if (ddlDataType == 'Leads') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/ddl_MaritalStatusType'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/span_ddlMaritalStatus_' + ddlMaritalStatusType))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMotherMaidenName'), txtMotherMaidenName)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMonthlyIncome'), txtMonthlyIncome)

    WebUI.comment('Spouse Info')

    if (ddlMaritalStatusType == 'Married') {
        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtSpouseName'), 
            txtSpouseName)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtMobilePhone'), 
            txtSpouseMobilePhone)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtIDNo'), txtSpouseIDNo)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtPlaceOfBirth'), 
            txtSpousePOB)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtDateOfBirth'), 
            txtSpouseDOB)
    }
}

WebUI.scrollToPosition(0, 0)

if (ddlDataType == 'Leads') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/ddl_Religion'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/span_ddlReligion_' + ddlReligion))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/ddl_Occupation'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/span_ddlOccupation_' + ddlOccupation))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/RadioNationality' + radNationality), 
        FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/RadioGender' + radGender), FailureHandling.OPTIONAL)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'), 2, FailureHandling.OPTIONAL) == 
true) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)

    WebUI.delay(1)
}

