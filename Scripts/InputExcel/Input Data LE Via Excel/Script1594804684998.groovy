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

try {
    String s = WebUI.getUrl()

    WebUI.navigateToUrl(GlobalVariable.url)
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser(GlobalVariable.url)
} 

WebUI.setText(findTestObject('Login/input_Username_UserName'), GlobalVariable.usernameLeads)

WebUI.setText(findTestObject('Login/input_Username_Password'), GlobalVariable.passwordLeads)

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_LeadsDataInput'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(2)

WebUI.comment('Personal Info')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_SubBranch'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlSubBranch_' + ddlSubBranch))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_GeraiInput'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlGeraiInput_' + ddlGeraiInput))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_Product'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlProduct_' + ddlProduct))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_DataType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlDataType_' + ddlDataType))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_CustomerType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlCustomerType_' + ddlCustomerType))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_NextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 360)

WebUI.comment('Customer info')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/div_menuCustomer'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerName'), txtCustomerName)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerNPWP'), txtCustomerNPWP)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/ddl_CompanyType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/span_ddlCompanyType_CV'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/ddl_EconomySector'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/span_ddlEconomySector_JASA'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/ddl_IndustryType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/span_ddlIndustrySector_JASA LAINNYA'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhoneArea'), '62')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhone'), '162357615')

//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhoneArea2'), '62')
WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhone2'), '12351763')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtMobilePhoneNo1'), '162357615')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtMobilePhoneNo2'), '12351763')

WebUI.delay(2)

//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/ddl_BusinessScale'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/span_ddlBusinessScale_Usaha Kecil'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/RadioGoPublic_Yes'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/RadioAffiliateWithPP_Yes'))
WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtEmail'), txtEmail)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_SaveButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)

//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtNumberOfEmployee'), '123')
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtYearOfEstablish'), '1890')
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/a_NextButton'))
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

//WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))
/*
WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.comment('Duplicate check')

try {
    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

    if (WebUI.verifyElementPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'), 10, FailureHandling.OPTIONAL)) {
        //if (ddlDataType == 'Leads') {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerName'), txtCustomerName)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerNPWP'), txtCustomerNPWP)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhoneArea'), txtCustomerPhoneArea)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhone'), txtCustomerPhone)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtEmail'), txtEmail)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))

        WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

        WebUI.delay(1)
    }
}
catch (Exception e) {
    WebUI.scrollToPosition(0, 0)

    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

    if (DupDataNo == '0') {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/a_NewButton'))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))
    } else {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/span_Found_Data' + 
                DupDataNo))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/a_ChooseButton'))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerName'), txtCustomerName)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerNPWP'), txtCustomerNPWP)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhoneArea'), txtCustomerPhoneArea)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhone'), txtCustomerPhone)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtEmail'), txtEmail)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

        WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))
    }
    
    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

    WebUI.delay(1)
} 
finally { 
    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)
}
*/
WebUI.comment('Address')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/div_menuAddress'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/txtAddress'), txtAddress)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/txtRT'), txtRT)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/txtRW'), txtRW)

//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/ddlCountryItem/span_ddlCountry_' + ddlCountry))
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/a_ZIPCode'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/ddl_SearchBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/span_ddlSearchBy_ZipCode'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/txtZIPCode'), txtZipCode)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/span_Found_First'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/a_SaveButton'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/a_SaveButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

//WebUI.comment('Comittee')
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/btnAdd'))
//WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/ddl_IDType'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/span_ddlIDType_KTP'))
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeName'), txtCustomerName)
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtKTP'), '1234567890123456')
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteePOB'), 'Jakarta')
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeDOB'), '10/10/1990')
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/RadioGenderMale'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/RadioNationalityWNI'), FailureHandling.STOP_ON_FAILURE)
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeAddress'), txtAddress)
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeRT'), txtRT)
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeRW'), txtRW)
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeMobilePhone'), txtMobilePhone1)
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeShareHolder'), '100')
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/ddl_Position'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/span_ddlPosition_OWNER'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/ddl_RelationWithDebt'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/span_ddlRelationWithDebt_Other'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/RadioIsOwnerYes'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/RadioCommitteeStatusActive'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/a_ZIPCode'))
//WebUI.delay(1)
//WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 15)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)
//WebUI.delay(1)
//WebUI.scrollToPosition(0, 0)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/ddl_SearchBy'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/span_ddlSearchBy_ZipCode'))
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/txtZIPCode'), txtZipCode)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/a_SearchButton'))
//WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp21'), 10)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp21'), 180)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/span_Found_First'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/a_ChooseButton'))
//WebUI.delay(1)
//WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)
//WebUI.delay(1)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/btnSave'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))
//WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/a_NextButton'))
/*
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/ddl_Province'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/ddlProvinceItem/span_ddlProvince_' + ddlProvince))
*/
WebUI.comment('Documents')

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('upload Akte')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_Akte'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), txtKTPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), txtKTPExpiredDate)

//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocumentDate'), txtKTPExpiredDate)
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    (GlobalVariable.projectPath + '\\') + txtKTPFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.comment('NPWP')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_NPWP'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), txtNoRangkaDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), txtNoRangkaExpiredDate)

//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocumentDate'), txtNoRangkaExpiredDate)
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    (GlobalVariable.projectPath + '\\') + txtNoRangkaFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.comment('Notice Pajak')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_Foto Notice Pajak'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), txtNPWPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), txtNPWPExpiredDate)

//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocumentDate'), txtNPWPExpiredDate)
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    (GlobalVariable.projectPath + '\\') + txtNPWPFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.comment('STNK')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/a_NextPage'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_STNK'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), txtSIMDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), txtSIMExpiredDate)

//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocumentDate'), txtSIMExpiredDate)
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    (GlobalVariable.projectPath + '\\') + txtSIMFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/a_NextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(7)

WebUI.comment('Lead Detail')

WebUI.scrollToPosition(0, 0)

//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/ddl_Activity'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/span_ddlActivity_' + ddlActivity))
//WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)
WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/ddl_Activity'), 0)

//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/ddl_FinancePurpose'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/span_ddlFinancePurpose_' + ddlFinancePurpose))
//if ((ddlActivity == 'Customer Get Customer') || (ddlActivity == 'Employee Get Customer (EGC)')) {
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/a_ReferalName'))
WebUI.delay(1)

//}
WebUI.comment('Add Row')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/a_addRow'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtProductionYear'), 
    txtProductionYear)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtLicensePlate'), 
    txtLicensePlate)

//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_BPKPBehalf'), 
//FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlBPKPBehalf_' + 
//ddlBPKPBehalf))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioRental' + 
//radRental))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_SifatKredit'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddlSifatKreditItem/span_ddlSifatKredit_' + 
//ddlSifatKredit))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_SupplierName'))
WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_AssetCode'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/ddl_SearchBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/span_ddlSearchBy_Asset Description'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/txtAssetDescription'), 
    txtAssetDesription)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

//WebUI.delay(1)
//WebUI.acceptAlert()
//WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)
WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioUsageYes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

//if (ddlSifatKredit == 'New-RO-Take Over') {
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_LembagaLJK'))
//WebUI.delay(1)
//WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)
//WebUI.delay(1)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/ddl_SearchBy'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/span_ddlSearchBy_Nama LJK'))
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/txtNamaLJK'), 
//txtNameLJK)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/a_btnSearch'))
//WebUI.delay(1)
//WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)
//WebUI.delay(1)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))
//WebUI.delay(1)
//}
WebUI.comment('Finance info')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtFundingAmount'), 
    txtFundingAmount)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtTenor'), 
    txtTenor)

WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_TitleFinanceInfo'), 
    0)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtGracePeriod'), 
    txtGracePeriod)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtEffectiveRate'), 
    txtEffectiveRate)

//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_FirstInstallment'))
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlFirstInstallment_' + 
//ddlFirstInstallment))
WebUI.delay(1)

WebUI.comment('Popup Product Offering')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_ProductOffering'))

//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_ProductOffering'))
WebUI.delay(1)

//WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)
//WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)
WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/ddl_SearchBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/span_ddlSearchBy_Product Offering ID'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/txtProductOfferingID'), 
    txtProductOfferingID)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/a_btnSearch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp3'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp3'), 20)

WebUI.delay(1)

//WebUI.comment('Insurance')
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_InsuranceType'), 
//FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlinsuranceType_' + 
//ddlInsuranceType))
//if (chkBanjirBadaiLongsor == 'Yes') {
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkBanjirBadaiLongsor'))
//}
//if (chkBengkelAuthorized == 'Yes') {
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkBengkelAuthorized'))
//}
//if (chkHuruHaraTerorisme == 'Yes') {
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkHuruHaraTerorisme'))
//}
//if (chkGempaTsunami == 'Yes') {
//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkGempaTsunami'))
//}
WebUI.delay(1)

WebUI.comment('Fee')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtCMP'), 
    txtCMP)

//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtSurveyFee'), 
//txtSurveyFee)
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtProvisi'), 
//txtProvisi)
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtNotaryFee'), 
//txtNotaryFee)
//WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtOtherFee'), 
//txtOtherFee)
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Calculate'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

//WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Save'))
not_run: WebUI.delay(1)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

not_run: WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkAmortization'))

WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_saveButtonCalculate'), 
    0)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_saveButtonCalculate'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/a_SubmitButton'), 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/a_SubmitButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.waitForElementPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_Leads Search List'), 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

def LeadsID = WebUI.getText(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_FoundFirstDataLeadsID'))

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_User'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Master/button_Logout'))

WebUI.comment(LeadsID)

if (ddlDataType == 'Leads') {
    WebUI.callTestCase(findTestCase('InputExcel/Workspace'), [('LeadsIDWorkspace') : LeadsID], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('InputExcel/AdminVer LE'), [('LeadsIDAdminVer') : LeadsID], FailureHandling.STOP_ON_FAILURE)
}

not_run: WebUI.closeBrowser()

