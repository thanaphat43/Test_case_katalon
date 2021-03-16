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

WebUI.navigateToUrl('https://alumni-2.000webhostapp.com/alumni_james/index.php')

WebUI.click(findTestObject('Object Repository/Page_Document/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_/input__user'), '614259017')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input__pass'), 'zD4wU0GLuKM=')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input__pass'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Document/a_'))

WebUI.setText(findTestObject('Object Repository/Page_Document/input__nname'), 'เจม')

WebUI.click(findTestObject('Object Repository/Page_Document/button_'))

WebUI.verifyTextPresent('ข้อมูลศิษย์เก่า', false)

WebUI.closeBrowser()
