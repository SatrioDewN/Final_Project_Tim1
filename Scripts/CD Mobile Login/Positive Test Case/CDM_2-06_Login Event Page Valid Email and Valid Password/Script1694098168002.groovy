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

WebUI.callTestCase(findTestCase('CD Mobile Register/OpenApp'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Home Page/Button_See All'), 0)

Mobile.tap(findTestObject('Mobile/Event Page/Button_Event Day 3'), 0)

Mobile.tap(findTestObject('Mobile/Event Page/Event Details Page/Button_Login Event Details'), 0)

Mobile.verifyElementText(findTestObject('Mobile/Sign in Page/Text_Sign In'), 'Sign In')

Mobile.tap(findTestObject('Mobile/Sign in Page/Field_Email Event'), 0)

Mobile.setText(findTestObject('Mobile/Sign in Page/Field_Email Event'), 'leonleigard@gmail.com', 0)

Mobile.tap(findTestObject('Mobile/Sign in Page/Field_Event Password'), 0)

Mobile.setText(findTestObject('Mobile/Sign in Page/Field_Event Password'), 'Workinghour1!', 0)

Mobile.tap(findTestObject('Mobile/Sign in Page/Button_Login'), 0)

Mobile.tap(findTestObject('Mobile/Home Page/Button_My Profile'), 0)

Mobile.verifyElementText(findTestObject('Mobile/Profile Page/Text_Detail Information'), 'Detail Information')

Mobile.closeApplication()

