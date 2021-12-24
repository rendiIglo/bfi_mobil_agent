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

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 30)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtAddress'), txtAddress)

if (ddlDataType == 'Leads') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/ddl_HouseStatus'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/span_ddlHouseStatus_' + ddlHouseStatus))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtRT'), txtRT)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtRW'), txtRW)

    WebUI.sendKeys(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtRW'), Keys.chord(Keys.TAB))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_ZIPCode'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(1)

    WebUI.comment('Legal Address Tab')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_ddlSearchBy_' + 
            ddlSearchBy))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/txtZIPCode'), txtZipCode)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.delay(3)

    WebUI.waitForElementClickable(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_First'), 
        15)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_First'))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

    WebUI.delay(1)

    switch (chkLegalSameAddress) {
        case 'No':
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalAddress'), txtLegalAddress)

            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalRT'), txtLegalRT)

            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalRW'), txtLegalRW)

            WebUI.sendKeys(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalRW'), Keys.chord(
                    Keys.TAB))

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_LegalZIPCode'))

            WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

            WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

            WebUI.delay(1)

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/ddl_SearchBy'))

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_ddlSearchBy_' + 
                    ddlSearchBy))

            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/txtZIPCode'), 
                txtLegalZipCode)

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

            WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

            WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 10)

            WebUI.delay(3)

            WebUI.waitForElementClickable(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_First'), 
                15)

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_First'))

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

            WebUI.delay(1)

            break
    }
}

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 4)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_SaveButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(5)

