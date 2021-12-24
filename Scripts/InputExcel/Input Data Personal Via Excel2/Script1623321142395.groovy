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

    WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
} 

WebUI.setText(findTestObject('Login/input_Username_UserName'), username)

WebUI.setText(findTestObject('Login/input_Username_Password'), password)

WebUI.click(findTestObject('Login/a_Login'))

if (WebUI.verifyElementPresent(findTestObject('Master/insecure_form'), 10, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_SendAnyway'))
}

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_LeadsDataInput'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.comment('Personal Info')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_SubBranch'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlSubBranch_' + ddlSubBranch))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingGeraiInput'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingGeraiInput'), 5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_GeraiInput'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlGeraiInput_' + ddlGeraiInput))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_Product'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlProduct_' + ddlProduct))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_DataType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlDataType_' + ddlDataType))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_CustomerType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlCustomerType_' + ddlCustomerType))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_NextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 35, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 240, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.comment('Customer info')

WebUI.callTestCase(findTestCase('InputExcel/Input Data Personal/CustomerInfo'), [('txtCustomerName') : txtCustomerName, ('txtIDNo') : txtIDNo
        , ('txtMobilePhone1') : txtMobilePhone1, ('txtMobilePhone2') : txtMobilePhone2, ('txtEmail') : txtEmail, ('txtNPWP') : txtNPWP
        , ('txtCustomerPOB') : txtCustomerPOB, ('txtDateOfBirth') : txtDateOfBirth, ('radGender') : radGender, ('radNationality') : radNationality
        , ('ddlMaritalStatusType') : ddlMaritalStatusType, ('txtIDExpiredDate') : txtIDExpiredDate, ('ddlReligion') : ddlReligion
        , ('txtMotherMaidenName') : txtMotherMaidenName, ('txtMonthlyIncome') : txtMonthlyIncome, ('txtSpouseName') : txtSpouseName
        , ('ddlOccupation') : ddlOccupation, ('txtSpouseMobilePhone') : txtSpouseMobilePhone, ('txtSpouseIDNo') : txtSpouseIDNo
        , ('txtSpousePOB') : txtSpousePOB, ('txtSpouseDOB') : txtSpouseDOB, ('DupDataNo') : DupDataNo, ('ddlDataType') : ddlDataType], 
    FailureHandling.STOP_ON_FAILURE)

/*
try {
    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

    if (WebUI.verifyElementPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'), 10, FailureHandling.OPTIONAL)) {
        //if (ddlDataType == 'Leads') {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtCustomerName'), txtCustomerName)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/RadioGender' + radGender), 
            FailureHandling.OPTIONAL)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtEmail'), txtEmail)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

        if (ddlDataType == 'Leads') {
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtIDNo'), txtIDNo)
        }
        
        if (ddlDataType == 'Leads') {
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo2'), 
                txtMobilePhone2)
        }
        
        if (ddlDataType == 'Leads') {
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtDateOfBirth'), txtDateOfBirth)
        }
        
        if (ddlDataType == 'Leads') {
            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/ddl_MaritalStatusType'))

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/span_ddlMaritalStatus_' + 
                    ddlMaritalStatusType))

            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMotherMaidenName'), 
                txtMotherMaidenName)

            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMonthlyIncome'), 
                txtMonthlyIncome)

            WebUI.comment('Spouse Info')

            if (ddlMaritalStatusType == 'Married') {
                WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtSpouseName'), 
                    txtSpouseName)

                WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtMobilePhone'), 
                    txtSpouseMobilePhone)

                WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtIDNo'), 
                    txtSpouseIDNo)

                WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtDateOfBirth'), 
                    txtSpouseDOB)
            }
        }
        
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))

        WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

        WebUI.delay(1)
    }
}
catch (Exception e) {
    WebUI.scrollToPosition(0, 0)

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    if (DupDataNo == '0') {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/a_NewButton'))
    } else {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/span_Found_Data' + 
                DupDataNo))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/a_ChooseButton'))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

        if (ddlDataType == 'Leads') {
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtIDNo'), txtIDNo)
        }
        
        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

        if (ddlDataType == 'Leads') {
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo2'), 
                txtMobilePhone2)
        }
        
        if (ddlDataType == 'Leads') {
            WebUI.comment('Spouse Info')

            if (ddlMaritalStatusType == 'Married') {
                WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtMobilePhone'), 
                    txtSpouseMobilePhone)
            }
        }
        
        WebUI.takeScreenshot(FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))
    }
    
    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

    WebUI.delay(1)
} 
finally { 
    WebUI.takeScreenshot(FailureHandling.OPTIONAL)
}
*/
WebUI.comment('Address Tab')

WebUI.callTestCase(findTestCase('InputExcel/Input Data Personal/Address'), [('ddlHouseStatus') : ddlHouseStatus, ('ddlSearchBy') : ddlSearchBy
        , ('ddlSupplierSearchBy') : ddlSupplierSearchBy, ('ddlAssetSearchBy') : ddlAssetSearchBy, ('txtAddress') : txtAddress
        , ('txtRT') : txtRT, ('txtRW') : txtRW, ('ddlProvince') : ddlProvince, ('txtZipCode') : txtZipCode, ('chkLegalSameAddress') : chkLegalSameAddress
        , ('txtLegalAddress') : txtLegalAddress, ('txtLegalRW') : txtLegalRW, ('txtLegalRT') : txtLegalRT, ('ddlLegalProvince') : ddlLegalProvince
        , ('txtLegalZipCode') : txtLegalZipCode, ('ddlDataType') : ddlDataType], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Jobs')

if (ddlDataType == 'Leads') {
    WebUI.callTestCase(findTestCase('InputExcel/Input Data Personal/Job'), [('ddlProfession') : ddlProfession, ('ddlJobLevel') : ddlJobLevel
            , ('ddlPosition') : ddlPosition, ('ddlEconomySector') : ddlEconomySector, ('ddlIndustryType') : ddlIndustryType
            , ('ddlDataType') : ddlDataType], FailureHandling.STOP_ON_FAILURE)
}

WebUI.comment('Documents')

WebUI.callTestCase(findTestCase('InputExcel/Input Data Personal/Document'), [('txtKTPDocNo') : txtKTPDocNo, ('txtKTPReceivedBy') : txtKTPReceivedBy
        , ('txtKTPExpiredDate') : txtKTPExpiredDate, ('txtKTPFilePath') : txtKTPFilePath, ('txtNPWPDocNo') : txtNPWPDocNo
        , ('txtNPWPReceivedBy') : txtNPWPReceivedBy, ('txtNPWPExpiredDate') : txtNPWPExpiredDate, ('txtNPWPFilePath') : txtNPWPFilePath
        , ('txtSIMDocNo') : txtSIMDocNo, ('txtSIMReceivedBy') : txtSIMReceivedBy, ('txtSIMExpiredDate') : txtSIMExpiredDate
        , ('txtSIMFilePath') : txtSIMFilePath, ('txtBPKBDocNo') : txtBPKBDocNo, ('txtBPKPReceivedBy') : txtBPKPReceivedBy
        , ('txtBPKPExpiredDate') : txtBPKPExpiredDate, ('txtBPKPFilePath') : txtBPKPFilePath, ('LeadsID') : LeadsID, ('txtKTPDocumentDate') : txtKTPDocumentDate
        , ('txtNPWPDocumentDate') : txtNPWPDocumentDate, ('txtSIMDocumentDate') : txtSIMDocumentDate, ('ddlDataType') : ddlDataType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Lead Detail')

WebUI.callTestCase(findTestCase('InputExcel/Input Data Personal/Lead Detail'), [('ddlDataType') : ddlDataType, ('ddlActivity') : ddlActivity
        , ('ddlFinancePurpose') : ddlFinancePurpose, ('txtReferalName') : txtReferalName, ('txtManufacturingYear') : txtManufacturingYear
        , ('radPotongFunding') : radPotongFunding, ('txtLicensePlate') : txtLicensePlate, ('ddlBPKPBehalf') : ddlBPKPBehalf
        , ('radRental') : radRental, ('ddlSifatKredit') : ddlSifatKredit, ('txtSupplierName') : txtSupplierName, ('txtAssetDescription') : txtAssetDescription
        , ('ddlLJKSearchBy') : ddlLJKSearchBy, ('txtNameLJK') : txtNameLJK, ('txtFundingAmount') : txtFundingAmount, ('txtTenor') : txtTenor
        , ('ddlFirstInstalment') : ddlFirstInstalment, ('ddlProductOfferingSearchBy') : ddlProductOfferingSearchBy, ('txtProductOfferingID') : txtProductOfferingID
        , ('ddlInsuranceType') : ddlInsuranceType, ('chkBanjirBadaiLongsor') : chkBanjirBadaiLongsor, ('chkBengkelAuthorized') : chkBengkelAuthorized
        , ('chkHuruHaraTerorisme') : chkHuruHaraTerorisme, ('chkGempaTsunami') : chkGempaTsunami, ('txtCMP') : txtCMP, ('txtSurveyFee') : txtSurveyFee
        , ('txtNotaryFee') : txtSurveyFee, ('txtOtherFee') : txtOtherFee, ('txtProvisi') : txtProvisi, ('txtAdmin') : txtAdmin
        , ('txtPersenProvisi') : txtPersenProvisi, ('ddlCMP') : ddlCMP, ('ddlInsuredBy') : ddlInsuredBy, ('ddlPaidBy') : ddlPaidBy
        , ('txtInsuranceLength') : txtInsuranceLength, ('ddlLifeInsurance') : ddlLifeInsurance, ('ddlLifeInsuranceCompany') : ddlLifeInsuranceCompany
        , ('txtEffectiveRate') : txtEffectiveRate, ('txtGracePeriod') : txtGracePeriod, ('ddlCalculationMethod') : ddlCalculationMethod
        , ('ddlAssetInsuranceCapitalize') : ddlAssetInsuranceCapitalize, ('txtCoverageExistingInsurance') : txtCoverageExistingInsurance
        , ('ddlLifeInsuranceCapitalized') : ddlLifeInsuranceCapitalized], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_Leads Search List'), 0)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/ddlLeadsDataSearchBy'))

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_ddlLeadsDataSearchBy_' + ddlLeadsDataSearchBy))

WebUI.setText(findTestObject('TC.02_Leads Data Search-Leads-Personal/txtLeadsName'), txtCustomerName)

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

def LeadsID = WebUI.getText(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_FoundFirstDataLeadsID'))

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_User'))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master/button_Logout'))

if (ddlDataType == 'Leads') {
    /*WebUI.callTestCase(findTestCase('InputExcel/openEmail'), [:], FailureHandling.OPTIONAL)

    WebUI.callTestCase(findTestCase('InputExcel/FPP Personal'), [('txtCustomerNameFPP') : txtCustomerName, ('txtAddressFPP') : txtAddress
            , ('txtRWFPP') : txtRW, ('txtRTFPP') : txtRT, ('txtMobilePhoneFPP') : txtMobilePhone1, ('txtZipCodeFPP') : txtZipCode
            , ('txtIDNoFPP') : txtIDNo], FailureHandling.OPTIONAL)*/

    WebUI.callTestCase(findTestCase('InputExcel/AdminVer Personal'), [('LeadsIDAdminVer') : LeadsID], FailureHandling.OPTIONAL)

    WebUI.delay(1)
} else {
    WebUI.callTestCase(findTestCase('InputExcel/Workspace'), [('LeadsIDWorkspace') : LeadsID], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('InputExcel/MarketingVisit'), [('LeadsID') : LeadsID, ('txtVisitScheduleDate') : txtVisitScheduleDate
            , ('txtVisitScheduleTime') : txtVisitScheduleTime, ('txtIDNo') : txtIDNo, ('txtMobilePhone2') : txtMobilePhone2
            , ('txtEmail') : txtEmail, ('txtNPWP') : txtNPWP, ('txtCustomerPOB') : txtCustomerPOB, ('txtDateOfBirth') : txtDateOfBirth
            , ('radGender') : radGender, ('radNationality') : radNationality, ('ddlMaritalStatusType') : ddlMaritalStatusType
            , ('txtIDExpiredDate') : txtIDExpiredDate, ('ddlReligion') : ddlReligion, ('txtMotherMaidenName') : txtMotherMaidenName
            , ('txtMonthlyIncome') : txtMonthlyIncome, ('txtSpouseName') : txtSpouseName, ('ddlOccupation') : ddlOccupation
            , ('txtSpouseMobilePhone') : txtSpouseMobilePhone, ('txtSpouseIDNo') : txtSpouseIDNo, ('txtSpousePOB') : txtSpousePOB
            , ('txtSpouseDOB') : txtSpouseDOB, ('DupDataNo') : DupDataNo, ('ddlHouseStatus') : ddlHouseStatus, ('ddlSearchBy') : ddlSearchBy
            , ('ddlSupplierSearchBy') : ddlSupplierSearchBy, ('ddlAssetSearchBy') : ddlAssetSearchBy, ('txtAddress') : txtAddress
            , ('txtRT') : txtRT, ('txtRW') : txtRW, ('ddlProvince') : ddlProvince, ('txtZipCode') : txtZipCode, ('chkLegalSameAddress') : chkLegalSameAddress
            , ('txtLegalAddress') : txtLegalAddress, ('txtLegalRW') : txtLegalRW, ('txtLegalRT') : txtLegalRT, ('ddlLegalProvince') : ddlLegalProvince
            , ('txtLegalZipCode') : txtLegalZipCode, ('ddlProfession') : ddlProfession, ('ddlJobLevel') : ddlJobLevel, ('ddlPosition') : ddlPosition
            , ('ddlEconomySector') : ddlEconomySector, ('ddlIndustryType') : ddlIndustryType, ('ddlActivity') : ddlActivity
            , ('ddlFinancePurpose') : ddlFinancePurpose, ('txtReferalName') : txtReferalName, ('txtManufacturingYear') : txtManufacturingYear
            , ('radPotongFunding') : radPotongFunding, ('txtLicensePlate') : txtLicensePlate, ('ddlBPKPBehalf') : ddlBPKPBehalf
            , ('radRental') : radRental, ('ddlSifatKredit') : ddlSifatKredit, ('txtSupplierName') : txtSupplierName, ('txtAssetDescription') : txtAssetDescription
            , ('ddlLJKSearchBy') : ddlLJKSearchBy, ('txtNameLJK') : txtNameLJK, ('txtFundingAmount') : txtFundingAmount, ('txtTenor') : txtTenor
            , ('ddlFirstInstalment') : ddlFirstInstalment, ('ddlProductOfferingSearchBy') : ddlProductOfferingSearchBy, ('txtProductOfferingID') : txtProductOfferingID
            , ('ddlInsuranceType') : ddlInsuranceType, ('chkBanjirBadaiLongsor') : chkBanjirBadaiLongsor, ('chkBengkelAuthorized') : chkBengkelAuthorized
            , ('chkHuruHaraTerorisme') : chkHuruHaraTerorisme, ('chkGempaTsunami') : chkGempaTsunami, ('txtCMP') : txtCMP
            , ('txtSurveyFee') : txtSurveyFee, ('txtNotaryFee') : txtNotaryFee, ('txtOtherFee') : txtOtherFee, ('txtProvisi') : txtProvisi
            , ('txtAdmin') : txtAdmin, ('txtPersenProvisi') : txtPersenProvisi, ('ddlCMP') : ddlCMP, ('ddlInsuredBy') : ddlInsuredBy
            , ('ddlPaidBy') : ddlPaidBy, ('txtInsuranceLength') : txtInsuranceLength, ('ddlLifeInsurance') : ddlLifeInsurance
            , ('ddlLifeInsuranceCompany') : ddlLifeInsuranceCompany, ('txtEffectiveRate') : txtEffectiveRate, ('txtGracePeriod') : txtGracePeriod
            , ('ddlCalculationMethod') : ddlCalculationMethod, ('ddlAssetInsuranceCapitalize') : ddlAssetInsuranceCapitalize
            , ('txtCoverageExistingInsurance') : txtCoverageExistingInsurance, ('ddlLifeInsuranceCapitalized') : ddlLifeInsuranceCapitalized
            , ('ddlLeadsDataSearchBy') : ddlLeadsDataSearchBy, ('txtPICMobileNumber') : txtPICMobileNumber], FailureHandling.STOP_ON_FAILURE)
}

WebUI.delay(1)

WebUI.closeBrowser()

