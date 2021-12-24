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

try {
    String s = WebUI.getUrl()

    WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
} 

WebUI.setText(findTestObject('Login/input_Username_UserName'), username)

WebUI.setText(findTestObject('Login/input_Username_Password'), password)

WebUI.click(findTestObject('Login/a_Login'))

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_LeadsDataInput'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_SubBranch'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlSubBranch_' + ddlSubBranch))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_GeraiInput'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlGeraiInput_' + ddlGeraiInput))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_Product'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlProduct_' + ddlProduct))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_DataType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlDataType_' + ddlDataType))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_CustomerType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlCustomerType_' + ddlCustomerType))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_NextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 30)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/div_menuCustomer'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtCustomerName'), txtCustomerName)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtIDNo'), txtIDNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo2'), txtMobilePhone2)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtEmail'), txtEmail)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtDateOfBirth'), txtDateOfBirth)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/RadioGender' + radGender), FailureHandling.STOP_ON_FAILURE)

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

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtDateOfBirth'), 
        txtSpouseDOB)
}

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Duplicate check')

try {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))
}
catch (Exception e) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/span_Found_Data' + 
            DupDataNo))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/a_ChooseButton'))
} 
finally { 
    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

    WebUI.delay(1)
}

WebUI.comment('Address Tab')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtAddress'), txtAddress)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtRT'), txtRT)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtRW'), txtRW)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/ddl_Province'))

not_run: WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/ddlProvinceItem/span_ddlProvince_' + 
        ddlProvince))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_ZIPCode'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/txtZIPCode'), txtZipCode)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_First'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.comment('Legal Address Tab')

switch (chkLegalSameAddress) {
    case 'Yes':
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/chkCopyFromResidenceAddress'))

        break
    case 'No':
        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalAddress'), txtLegalAddress)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalRT'), txtLegalRT)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalRW'), txtLegalRW)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/ddl_LegalProvince'))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/ddlLegalProvinceItem/span_ddlProvince_' + 
                ddlLegalProvince))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_LegalZIPCode'))

        WebUI.delay(1)

        WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

        WebUI.delay(1)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/txtZIPCode'), 
            txtLegalZipCode)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

        WebUI.delay(1)

        WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

        WebUI.delay(1)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_First'))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

        WebUI.delay(1)

        WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

        break
}

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_SaveButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.comment('Jobs')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_Profession'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlProfesion/span_ddlProfession_' + ddlProfession))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_JobPosition'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlJobPosition/span_ddlJobPosition_' + 
        ddlPosition))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/a_SaveButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.comment('Documents')

WebUI.delay(1)

WebUI.comment('upload KTP')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_ektp'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_UploadButton'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), txtKTPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtReceivedBy'), txtKTPReceivedBy)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), txtKTPExpiredDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    txtKTPFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.comment('NPWP')

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_NPWP'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_UploadButton'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), txtNPWPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtReceivedBy'), txtNPWPReceivedBy)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), txtNPWPExpiredDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    txtNPWPFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.comment('SIM')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_NextPage'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingAjaxLoaderChangePage'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingAjaxLoaderChangePage'), 20)

WebUI.delay(3)

not_run: WebUI.focus(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_title_documentchecklist'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_SIM'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_UploadButton'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), txtSIMDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtReceivedBy'), txtSIMReceivedBy)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), txtSIMExpiredDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    txtSIMFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.comment('Lead Detail')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/div_menuLeadDetail'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddl_Activity'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddlActivityItem/span_ddlActivity_' + 
        ddlActivity))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddl_FinancePurpose'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddlFinancePurposeItem/span_ddlFinancePurpose_' + 
        ddlFinancePurpose))

WebUI.comment('Referal')

if ((ddlActivity == 'Customer Get Customer') || (ddlActivity == 'Employee Get Customer (EGC)')) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/a_ReferalName'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(1)

    if (ddlActivity == 'Customer Get Customer') {
        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/txtCustomerName'), 
            txtReferalName)
    } else {
        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/txtEmployeeName'), 
            txtReferalName)
    }
    
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/a_btnSearch'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/span_FoundFirstData'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/a_btnChoose'))

    WebUI.delay(1)
}

WebUI.comment('Add Row')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/a_addRow'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp3'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp3'), 20)

WebUI.delay(3)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtManufacturingYear'), 
    txtProductionYear)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtLicensePlate'), 
    txtLicensePlate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_BPKPBehalf'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddlBPKPBehalfItem/span_ddlBPKPBehalf_' + 
        ddlBPKPBehalf))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioRental' + 
        radRental))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_SifatKredit'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddlSifatKreditItem/span_ddlSifatKredit_' + 
        ddlSifatKredit))

WebUI.comment('pop up supplier')

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_SupplierName'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/txtSupplierName'), 
    txtSupplierName)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp3'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp3'), 20)

WebUI.delay(1)

WebUI.comment('pop up asset code')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_AssetCode'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/txtAssetDescription'), 
    txtAssetDescription)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 30)

WebUI.delay(1)

WebUI.comment('Popup LJK')

if (ddlSifatKredit == 'New-RO-Take Over') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_LembagaLJK'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

    WebUI.delay(1)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/txtNamaLJK'), 
        txtNameLJK)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/a_btnSearch'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

    WebUI.delay(1)
}

WebUI.comment('Finance info')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtFundingAmount'), 
    txtFundingAmount)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtTenor'), 
    txtTenor)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_FirstInstallment'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlFirstInstallment_' + 
        ddlFirstInstalment))

WebUI.delay(1)

WebUI.comment('Popup Product Offering')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_ProductOffering'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/txtProductOfferingID'), 
    txtProductOfferingID)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/a_btnSearch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp3'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp3'), 20)

WebUI.delay(1)

WebUI.comment('Insurance')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_InsuranceType'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlinsuranceType_' + 
        ddlInsuranceType))

if (chkBanjirBadaiLongsor == 'Yes') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkBanjirBadaiLongsor'))
}

if (chkBengkelAuthorized == 'Yes') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkBengkelAuthorized'))
}

if (chkHuruHaraTerorisme == 'Yes') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkHuruHaraTerorisme'))
}

if (chkGempaTsunami == 'Yes') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkGempaTsunami'))
}

WebUI.comment('Fee')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtCMP'), 
    txtCMP)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtSurveyFee'), 
    txtSurveyFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtNotaryFee'), 
    txtNotaryFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtOtherFee'), 
    txtOtherFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtProvisi'), 
    txtProvisi)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Calculate'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp3'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp3'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Save'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp3'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp3'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/a_SubmitButton'))

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_User'))

WebUI.click(findTestObject('Master/button_Logout'))

not_run: WebUI.closeBrowser()

