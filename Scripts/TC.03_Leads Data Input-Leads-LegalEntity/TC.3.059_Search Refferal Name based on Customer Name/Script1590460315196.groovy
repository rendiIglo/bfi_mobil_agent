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

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_LeadsDataInput'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_SubBranch'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_SubBranch'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlSubBranch_Medan'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_GeraiInput'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlGeraiInput_Medan'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_Product'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlProduct_NDF Car'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_DataType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlDataType_Leads'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_CustomerType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlCustomerType_Legal Entity'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_NextButton'))

WebUI.delay(1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/div_menuCustomer'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerName'), 'PT. Belawan Indonesia')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerNPWP'), '86000129082812345')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhoneArea'), '021')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhone'), '21459000')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtEmail'), 'BelawanIndonesia@gmail.com')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtMobilePhoneNo1'), '08123456789')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/a_NextButton'))

WebUI.delay(1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.delay(1)

WebUI.comment('Address')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/txtAddress'), 'Perumahan Kota Harapan Indah, jl. Taman Heliconia Blok A no. 01')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/txtRT'), '001')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/txtRW'), '010')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/ddl_Province'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/span_ddlProvince_Jawa Barat'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/ddl_Country'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/ddlCountryItem/span_ddlCountry_Indonesia'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/a_ZIPCode'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/txtZIPCode'), '17214')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/span_Found_First'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/a_SaveButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

not_run: WebUI.comment('Documents')

not_run: WebUI.delay(1)

not_run: WebUI.comment('upload KTP')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_ektp'))

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/a_UploadButton'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), 
    '25')

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtReceivedBy'), 
    'null')

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), 
    '12/12/2020')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

not_run: WebUI.delay(1)

not_run: CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\leads-data-input\\KTP.png')

not_run: WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

not_run: WebUI.delay(1)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

not_run: WebUI.delay(1)

not_run: WebUI.comment('NPWP')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_NPWP'))

not_run: WebUI.delay(1)

not_run: WebUI.scrollToPosition(0, 0)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/a_UploadButton'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), 
    '25')

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtReceivedBy'), 
    'null')

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), 
    '12/12/2020')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

not_run: WebUI.delay(1)

not_run: CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\leads-data-input\\NPWP.jpg')

not_run: WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

not_run: WebUI.delay(1)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

not_run: WebUI.delay(1)

not_run: WebUI.comment('SIM')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/a_NextPage'))

not_run: WebUI.delay(1)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingAjaxLoaderChangePage'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingAjaxLoaderChangePage'), 20)

not_run: WebUI.delay(3)

not_run: WebUI.delay(1)

not_run: WebUI.focus(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_title_documentchecklist'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_SIM'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/a_UploadButton'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), 
    '25')

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtReceivedBy'), 
    'null')

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), 
    '12/12/2020')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

not_run: WebUI.delay(1)

not_run: CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\leads-data-input\\SIM.jpg')

not_run: WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

not_run: WebUI.delay(1)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

not_run: WebUI.delay(1)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/a_SaveButton'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

not_run: WebUI.delay(1)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

not_run: WebUI.delay(1)

WebUI.comment('Lead Detail')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/div_menuLeadDetail'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/ddl_Activity'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/span_ddlActivity_Customer Get Customer'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/ddl_FinancePurpose'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/span_ddlFinancePurpose_Productive'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/a_ReferalName'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

not_run: WebUI.scrollToPosition(0, 2000)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/span_FoundFirstData'))

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/a_btnChoose'))

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/txtCustomerID'), 
    '123')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/txtCustomerName'), 
    'dewi')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/a_btnSearch'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

