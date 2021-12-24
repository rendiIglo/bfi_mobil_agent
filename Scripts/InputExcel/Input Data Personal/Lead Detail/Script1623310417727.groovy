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

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/div_menuLeadDetail'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 75)

WebUI.comment('Referal')

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddl_Activity'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddlActivityItem/span_ddlActivity_' + 
        ddlActivity))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 30)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddl_FinancePurpose'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddlFinancePurposeItem/span_ddlFinancePurpose_' + 
        ddlFinancePurpose))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

/* WebUI.comment('Referal')

if ((ddlActivity == 'Customer Get Customer') || (ddlActivity == 'Employee Get Customer (EGC)')) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/a_ReferalName'))

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

    not_run: WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/span_FoundFirstData'))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/a_btnChoose'))

    WebUI.delay(1)
} */
WebUI.comment('Add Row')

WebUI.scrollToPosition(0, 2000)

if (ddlDataType == 'Leads') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/a_addRow'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 15)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(1)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtManufacturingYear'), 
        txtManufacturingYear)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 8)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 8)

    WebUI.delay(1)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtLicensePlate'), 
        txtLicensePlate)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_BPKPBehalf'), 
        FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddlBPKPBehalfItem/span_ddlBPKPBehalf_' + 
            ddlBPKPBehalf))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

    WebUI.delay(2)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioPotongFunding' + 
            radPotongFunding), FailureHandling.OPTIONAL)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

    WebUI.delay(1)

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_SifatKredit'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddlSifatKreditItem/span_ddlSifatKredit_' + 
            ddlSifatKredit))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.comment('pop up supplier')

    WebUI.scrollToPosition(0, 0)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_SupplierName'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_ddlSearchBy_' + 
            ddlSupplierSearchBy))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/txtSupplierName'), 
        txtSupplierName)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 4, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

    WebUI.delay(3)

    WebUI.comment('pop up asset code')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_AssetCode'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 5, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/ddlSearchByItem/span_ddlSearchBy_Asset Description'))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/txtAssetDescription'), 
        txtAssetDescription)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 4, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/span_FoundFirstData'))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 8, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.comment('Popup LJK')

    if (ddlSifatKredit == 'New-RO-Take Over') {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_LembagaLJK'))

        WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

        WebUI.delay(1)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/ddl_SearchBy'))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/ddlSearchByItem/span_ddlSearchBy_' + 
                ddlLJKSearchBy))

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/txtNamaLJK'), 
            txtNameLJK)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/a_btnSearch'))

        WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 12, FailureHandling.OPTIONAL)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

        WebUI.delay(1)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/span_FoundFirstData'))

        WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

        WebUI.takeScreenshot(FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/a_btnChoose'))

        WebUI.delay(1)
    }
    
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioRental' + 
            radRental), FailureHandling.OPTIONAL)

    WebUI.delay(3)

    WebUI.comment('Finance info')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtGracePeriod'), 
        txtGracePeriod)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtEffectiveRate'), 
        txtEffectiveRate)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_FirstInstallment'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlFirstInstallment_' + 
            ddlFirstInstalment))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_CalculationMethod'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/CalculationMethod/span_ddlCalculationMethod_' + 
            ddlCalculationMethod))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtFundingAmount'), 
        txtFundingAmount)

    WebUI.sendKeys(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtFundingAmount'), 
        Keys.chord(Keys.TAB))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

    WebUI.delay(1)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtTenor'), 
        txtTenor)

    WebUI.sendKeys(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtTenor'), 
        Keys.chord(Keys.TAB))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

    WebUI.delay(1)

    WebUI.scrollToPosition(0, 0)

    WebUI.comment('Popup Product Offering')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_ProductOffering'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 15, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

    WebUI.delay(3)

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/ddlSearchByItem/span_ddlSearchBy_' + 
            ddlProductOfferingSearchBy))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/txtProductOfferingID'), 
        txtProductOfferingID)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/a_btnSearch'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 8, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 8, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/span_FoundFirstData'))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

    WebUI.delay(1)

    WebUI.comment('Biaya Biaya')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtAdmin'), 
        txtAdmin)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtCMP'), 
        txtCMP)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtSurveyFee'), 
        txtSurveyFee)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtNotaryFee'), 
        txtNotaryFee)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtOtherFee'), 
        txtOtherFee)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtPersenProvisi'), 
        txtPersenProvisi)

    WebUI.delay(1)

    WebUI.comment('Asset Insurance')

    WebUI.waitForElementClickable(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_InsuredBy'), 
        20)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_InsuredBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlInsuredBy_' + 
            ddlInsuredBy))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_PaidBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlPaidBy_' + 
            ddlPaidBy))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_AssetInsuranceCapitalize'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlAssetInsuranceCapitalize_' + 
            ddlAssetInsuranceCapitalize))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioCoveragePeriodeFullTenor'), 
        FailureHandling.OPTIONAL)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 25, FailureHandling.OPTIONAL)

    WebUI.delay(5)

    /*  WebUI.comment('Insurance')

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
	} */
    WebUI.comment('Life Insurance')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_LifeInsurance'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlLifeInsurance_' + 
            ddlLifeInsurance))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_LifeInsuranceCompany'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlLifeInsuranceCompany_' + 
            ddlLifeInsuranceCompany))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_LifeInsuranceCapitalized'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlLifeInsuranceCapitalized_' + 
            ddlLifeInsuranceCapitalized))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioIsJoinIncomeNo'), 
        FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Calculate'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(4)

    WebUI.sendKeys(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkAmortization'))

    WebUI.delay(1)

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Save'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 15)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 15)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 30)

    WebUI.sendKeys(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'), Keys.chord(Keys.ENTER))
} else {
    WebUI.click(findTestObject('TC.06_Leads Data Input-Database-Personal/a_addRow'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 30)

    WebUI.delay(8)

    WebUI.waitForElementClickable(findTestObject('TC.06_Leads Data Input-Database-Personal/txtManufacturingYear'), 30)

    WebUI.setText(findTestObject('TC.06_Leads Data Input-Database-Personal/txtManufacturingYear'), txtManufacturingYear)

    WebUI.sendKeys(findTestObject('TC.06_Leads Data Input-Database-Personal/txtManufacturingYear'), Keys.chord(Keys.TAB))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.comment('pop up asset code')

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.06_Leads Data Input-Database-Personal/a_AssetCode'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/ddlSearchByItem/span_ddlSearchBy_Asset Description'))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/txtAssetDescription'), 
        txtAssetDescription)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/span_FoundFirstData'))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

    WebUI.delay(3)

    WebUI.setText(findTestObject('TC.06_Leads Data Input-Database-Personal/txtLicensePlate'), txtLicensePlate)

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Save'))

    WebUI.delay(5)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))
}

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/a_SaveButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/a_SubmitButton'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 12)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(3)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

