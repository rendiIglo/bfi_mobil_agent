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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')

WebUI.setText(findTestObject('Login/input_Username_UserName'), '013873')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

if (WebUI.verifyElementPresent(findTestObject('Master/insecure_form'), 10, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_SendAnyway'))
}

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/a_MarketingVisit'))

WebUI.delay(1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 60)

not_run: WebUI.setText(findTestObject('TC.02_MarketingVisitTask/txtCustomerName'), 'Senecca')

WebUI.waitForElementClickable(findTestObject('TC.02_MarketingVisitTask/ddl_MarketingVisitTaskSearchBy'), 30)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/ddl_MarketingVisitTaskSearchBy'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/span_ddlMarketingVisitTaskSearchBy_Lead ID'))

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/txtLeadsID'), LeadsID)

not_run: WebUI.setText(findTestObject('TC.02_MarketingVisitTask/txtCustomerID'), '')

not_run: WebUI.setText(findTestObject('TC.02_MarketingVisitTask/txtAssignmentDateFrom'), '1-Apr-2020')

not_run: WebUI.setText(findTestObject('TC.02_MarketingVisitTask/txtAssignmentDateTo'), '2-Apr-2020')

WebUI.click(findTestObject('TC.02_MarketingVisitTask/a_Search'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 30)

WebUI.delay(2)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/span_dataFound'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('TC.02_MarketingVisitTask/span_dataFound'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 30)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/txtVisitScheduleDate'), txtVisitScheduleDate)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/txtVisitScheduleTime'), txtVisitScheduleTime)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/ddl_UpdateStatus'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/span_ddlUpdateStatus_Present'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/ddl_result'), 2)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/ddl_result'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/span_ddlResult_Present Prospect'))

WebUI.delay(2)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/a_saveButton'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/a_Ok'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/a_nextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 300)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/txtPlaceOfBirth'), txtCustomerPOB)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/txtCustomerNPWP'), txtNPWP)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/txtIDExpiredDate'), txtIDExpiredDate)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/txtIDNo'), txtIDNo)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/txtMobilePhoneNo2'), txtMobilePhone2)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/txtDateOfBirth'), txtDateOfBirth)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/ddl_MaritalStatusType'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/span_ddlMaritalStatus_' + ddlMaritalStatusType))

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/txtMotherMaidenName'), txtMotherMaidenName)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/txtMonthlyIncome'), txtMonthlyIncome)

WebUI.comment('Spouse Info')

if (ddlMaritalStatusType == 'Married') {
    WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/SpouseInfo/txtSpouseName'), txtSpouseName)

    WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/SpouseInfo/txtMobilePhone'), txtSpouseMobilePhone)

    WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/SpouseInfo/txtIDNo'), txtSpouseIDNo)

    WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/SpouseInfo/txtPlaceOfBirth'), txtSpousePOB)

    WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/SpouseInfo/txtDateOfBirth'), txtSpouseDOB)
}

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/ddl_Religion'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/span_ddlReligion_' + ddlReligion))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/ddl_Occupation'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/span_ddlOccupation_' + ddlOccupation))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Customer/RadioNationality' + radNationality), FailureHandling.OPTIONAL)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/div_menuAddress'))

WebUI.comment('Address Tab')

WebUI.delay(1)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/txtRT'), txtRT)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/txtRW'), txtRW)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/ddl_HouseStatus'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/span_ddlHouseStatus_' + ddlHouseStatus))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/a_ZIPCode'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.comment('Legal Address Tab')

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/ddl_SearchBy'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/span_ddlSearchBy_' + ddlSearchBy))

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/txtZIPCode'), txtZipCode)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/span_Found_First'))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

WebUI.delay(1)

switch (chkLegalSameAddress) {
    case 'No':
        WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/txtLegalAddress'), txtLegalAddress)

        WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/txtLegalRT'), txtLegalRT)

        WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/txtLegalRW'), txtLegalRW)

        WebUI.waitForElementClickable(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/a_LegalZIPCode'), 20)

        WebUI.scrollToElement(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/a_LegalZIPCode'), 20)

        WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/a_LegalZIPCode'))

        WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

        WebUI.delay(1)

        WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/ddl_SearchBy'))

        WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/span_ddlSearchBy_' + ddlSearchBy))

        WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/txtZIPCode'), txtLegalZipCode)

        WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

        WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 5)

        WebUI.delay(1)

        WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/span_Found_First'))

        WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

        WebUI.delay(1)

        break
}

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementClickable(findTestObject('TC.02_MarketingVisitTask/Leads Info/div_menuJob'), 20)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/div_menuJob'))

WebUI.delay(5)

WebUI.comment('Jobs')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Job/ddl_Profession'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Job/ddlProfesion/span_ddlProfession_' + ddlProfession))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.delay(2)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Job/ddl_JobLevel'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Job/ddlJobLevel/span_ddlJobLevel_' + ddlJobLevel))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 2)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Job/ddl_JobPosition'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Job/ddlJobPosition/span_ddlJobPosition_' + ddlPosition))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 2)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Job/ddl_EconomySector'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Job/ddlEconomySector/span_ddlEconomySector_' + ddlEconomySector))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 2)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Job/ddl_IndustryType'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Job/ddlIndustryType/span_ddlIndustryType_' + ddlIndustryType))

WebUI.delay(3)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/div_menuTagLocation'))

WebUI.delay(1)

WebUI.comment('Tag Location')

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Tag Location/a_UploadPhoto'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 15)

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Tag Location/popUpPhotoUpload/a_UploadButton'))

WebUI.delay(2)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.02_MarketingVisitTask/Leads Info/Tag Location/popUpPhotoUpload/a_UploadButton'), 
    GlobalVariable.projectPath + '\\TestFoto.jpg')

WebUI.waitForElementNotPresent(findTestObject('TC.02_MarketingVisitTask/Leads Info/Tag Location/popUpPhotoUpload/uploadStatus'), 
    30)

WebUI.delay(3)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Tag Location/popUpPhotoUpload/a_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/popup schedule marketing visit/a_Ok'))

WebUI.comment('Lead Detail')

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/div_menuLeadDetail'))

WebUI.delay(2)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/txtPICMobileNumber'), txtPICMobileNumber)

WebUI.comment('Edit Collateral Info')

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/a_editRow'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 15)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 120)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtLicensePlate'), 
    txtLicensePlate)

WebUI.sendKeys(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtLicensePlate'), 
    Keys.chord(Keys.TAB))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementClickable(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_BPKPBehalf'), 
    30)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_BPKPBehalf'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddlBPKPBehalfItem/span_ddlBPKPBehalf_' + 
        ddlBPKPBehalf))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

WebUI.delay(2)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.comment('pop up supplier')

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/a_SupplierName'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 2)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/Supplier/ddl_SearchBy'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/Supplier/span_ddlSearchBy_' + 
        ddlSupplierSearchBy))

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/Supplier/txtSupplierName'), 
    txtSupplierName)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/Supplier/a_btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 4, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 6, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/Supplier/span_FoundFirstData'))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(3)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_SifatKredit'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddlSifatKreditItem/span_ddlSifatKredit_' + 
        ddlSifatKredit))

WebUI.comment('Popup LJK')

if (ddlSifatKredit == 'New-RO-Take Over') {
    WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/a_LembagaLJK'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/LembagaLJK/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/LembagaLJK/ddlSearchByItem/span_ddlSearchBy_' + 
            ddlLJKSearchBy))

    WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/LembagaLJK/txtNamaLJK'), 
        txtNameLJK)

    WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/LembagaLJK/a_btnSearch'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 12, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/LembagaLJK/span_FoundFirstData'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/LembagaLJK/a_btnChoose'))

    WebUI.delay(1)
}

WebUI.comment('Finance info')

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtGracePeriod'), 
    txtGracePeriod)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtEffectiveRate'), 
    txtEffectiveRate)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_FirstInstallment'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/span_ddlFirstInstallment_' + 
        ddlFirstInstalment))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_CalculationMethod'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/CalculationMethod/span_ddlCalculationMethod_' + 
        ddlCalculationMethod))

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtFundingAmount'), 
    txtFundingAmount)

WebUI.sendKeys(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtFundingAmount'), 
    Keys.chord(Keys.TAB))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtTenor'), 
    txtTenor)

WebUI.sendKeys(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtTenor'), 
    Keys.chord(Keys.TAB))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

WebUI.delay(1)

WebUI.comment('Popup Product Offering')

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/a_ProductOffering'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 15, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ProductOffering/ddl_SearchBy'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ProductOffering/ddlSearchByItem/span_ddlSearchBy_' + 
        ddlProductOfferingSearchBy))

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ProductOffering/txtProductOfferingID'), 
    txtProductOfferingID)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ProductOffering/a_btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 8, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 8, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ProductOffering/span_FoundFirstData'))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

WebUI.comment('Biaya Biaya')

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtAdmin'), 
    txtAdmin)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtCMP'), 
    txtCMP)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtSurveyFee'), 
    txtSurveyFee)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtNotaryFee'), 
    txtNotaryFee)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtOtherFee'), 
    txtOtherFee)

WebUI.setText(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/txtPersenProvisi'), 
    txtPersenProvisi)

WebUI.delay(1)

WebUI.comment('Asset Insurance')

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_InsuredBy'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/span_ddlInsuredBy_' + 
        ddlInsuredBy))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_PaidBy'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/span_ddlPaidBy_' + 
        ddlPaidBy))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_AssetInsuranceCapitalize'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/span_ddlAssetInsuranceCapitalize_' + 
        ddlAssetInsuranceCapitalize))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/RadioCoveragePeriodeFullTenor'), 
    FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 25, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.comment('Life Insurance')

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_LifeInsurance'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/span_ddlLifeInsurance_' + 
        ddlLifeInsurance))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_LifeInsuranceCompany'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/span_ddlLifeInsuranceCompany_' + 
        ddlLifeInsuranceCompany))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/ddl_LifeInsuranceCapitalized'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/span_ddlLifeInsuranceCapitalized_' + 
        ddlLifeInsuranceCapitalized))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/RadioIsJoinIncomeNo'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/RadioPaymentLocationPaidToMultifinance'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/a_Calculate'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp3'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp3'), 20)

WebUI.delay(5)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/a_Ok'))

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/chkAmortization'))

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/colletaralInfoTab/Edit Colletaral Detail/a_Save'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 15)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/a_Ok'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 15)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/a_SaveButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/a_Ok'))

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/Leads Info/Lead Detail/a_SubmitButton'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 12)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(3)

WebUI.click(findTestObject('TC.02_MarketingVisitTask/a_Ok'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

