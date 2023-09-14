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

String path = System.getProperty('user.dir')

String filePath = path + '/APK/DemoAppV2.apk'

Mobile.startApplication(filePath, true)

Mobile.tap(findTestObject('Object Repository/Mobile A/Homepage/Btn_Login-Here'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile A/Register page/Btn_Register, now_Footer'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile A/Register page/Text_Enter register page_Lets join our community'), 
    'Lets join our community!')

Mobile.setText(findTestObject('Object Repository/Mobile A/Register page/Field_Kata sandi'), 'Test123', 0)

Mobile.verifyElementText(findTestObject('Mobile A/Register page/Text_Password atleast must contain alphanumeric (a-Z,0-9) with minim 8 characters'), 
    'Password atleast must contain alphanumeric (a-Z,0-9) with minim 8 characters')

Mobile.closeApplication()

