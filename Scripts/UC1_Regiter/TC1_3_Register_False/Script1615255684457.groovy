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

WebUI.navigateToUrl('https://alumni-2.000webhostapp.com/alumni_james/index.php')

WebUI.click(findTestObject('Object Repository/Page_Document/a_Register'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Document/input__c_pass'), 'w+XbbEPXAJE=')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__cname'), 'สมชาย')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__lname'), 'จินดาโชติ')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__nname'), 'ชาย')

WebUI.setText(findTestObject('Object Repository/Page_Document/input_()_cardid'), '614259058')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Document/select_2563              2562              _9759ef'), 
    '2562', true)

WebUI.setText(findTestObject('Object Repository/Page_Document/textarea__caddress'), 'ถ.ลาดพร้าว')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Document/select_---------  ---------                _d1aeed'), 
    'กรุงเทพมหานคร', true)

WebUI.setText(findTestObject('Object Repository/Page_Document/input__joblv'), 'นักวิชาการ')

WebUI.setText(findTestObject('Object Repository/Page_Document/input__jobname'), 'เทศบาลเมืองพัทยา')

WebUI.setText(findTestObject('Object Repository/Page_Document/textarea__jobaddress'), 'พัทยา  ชลบุรี')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Document/select_---------  ---------                _d1aeed_1'), 
    'ชลบุรี', true)

WebUI.setText(findTestObject('Object Repository/Page_Document/input__hphone'), '0907742352')

WebUI.setText(findTestObject('Object Repository/Page_Document/input_()_email'), 'ch@ch.com')

WebUI.setText(findTestObject('Object Repository/Page_Document/input_facebook_facebook'), 'สมชาย จินดาโชติ')

WebUI.click(findTestObject('Object Repository/Page_Document/button_'))

WebUI.verifyTextPresent('ข้อมูลศิษย์เก่า', false)

WebUI.closeBrowser()

