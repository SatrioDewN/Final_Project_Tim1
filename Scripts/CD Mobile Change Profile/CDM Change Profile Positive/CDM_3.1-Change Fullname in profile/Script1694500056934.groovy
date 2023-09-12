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

Mobile.startApplication('D:\\Users\\bsi80197\\Downloads\\DemoAppV2 (1).apk', true)

Mobile.tap(findTestObject('Mobile A/Homepage/Btn_Login-Here'), 0)

Mobile.setText(findTestObject('Mobile A/Login Page/Field_Email-Login Page'), 'aditya.dwinugraha@mail.ugm.ac.id', 0)

Mobile.setText(findTestObject('Mobile A/Login Page/Field_password-login page'), 'Adittest1', 0)

Mobile.tap(findTestObject('Mobile A/Login Page/Btn_Login'), 0)

Mobile.tap(findTestObject('Mobile A/Homepage/Btn_icon profile-homepage-already login'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile A/Profile/Btn_icon gear profile'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile A/Profile/Btn_Edit profile-profile page'), 0)

Mobile.setText(findTestObject('Mobile A/Edit profile/Field_Fullname-Edit profile page'), 'testing changes', 0)

Mobile.tap(findTestObject('Object Repository/Mobile A/Edit profile/Btn_Save changes-edit profile'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile A/Edit profile/Text_Your profile has been successfully updated - edit profile page'), 
    'Your profile has been successfully updated.')

Mobile.tap(findTestObject('Object Repository/Mobile A/Edit profile/Btn_Okay notification edit profile'), 0)

Mobile.closeApplication()

