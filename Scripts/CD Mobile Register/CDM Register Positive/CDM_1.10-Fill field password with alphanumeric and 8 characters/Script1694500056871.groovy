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

Mobile.tap(findTestObject('Object Repository/Mobile A/Homepage/Btn_Login-Here'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile A/Register page/Btn_Register, now_Footer'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile A/Register page/Text_Enter register page_Lets join our community'), 
    'Lets join our community!')

Mobile.setText(findTestObject('Object Repository/Mobile A/Register page/Field_Nama'), GlobalVariable.RegisterNama, 0)

Mobile.tap(findTestObject('Object Repository/Mobile A/Register page/Btn_Date_icon'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile A/Register page/Btn_Date-number-1-Tanggal-lahir'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile A/Register page/Btn_OK in date calendar'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile A/Register page/Field_Email'), GlobalVariable.RegisterEmail, 0)

Mobile.setText(findTestObject('Object Repository/Mobile A/Register page/Field_Whatsapp-number'), GlobalVariable.RegisterPhone, 
    0)

Mobile.setText(findTestObject('Object Repository/Mobile A/Register page/Field_Kata sandi'), GlobalVariable.RegisterSandi, 
    0)

Mobile.setText(findTestObject('Object Repository/Mobile A/Register page/Field_Konfirmasi kata sandi'), GlobalVariable.RegisterConfirmSandi, 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile A/Register page/Checkbox_Term and condition'), 0)

Mobile.tap(findTestObject('Mobile A/Register page/Btn_Daftar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile A/Verification email page/Text_We have sended link of verification to your email'), 
    'We have sended link of verification to your email')

Mobile.closeApplication()

