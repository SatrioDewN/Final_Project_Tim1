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

WebUI.callTestCase(findTestCase('Website A/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Website A/Homepage/Btn_icon profile'))

WebUI.click(findTestObject('Website A/Homepage/Btn_My account'))

WebUI.click(findTestObject('Website A/Edit profile page/Btn_profile'))

WebUI.click(findTestObject('Website A/Edit profile page/Btn_Edit Profile'))

WebUI.setText(findTestObject('Website A/Edit profile page/Field_Fullname'), 'qwertyuiopasdfghjklzxcvbnmqwerty')

WebUI.click(findTestObject('Website A/Edit profile page/Btn_Save Changes'))

WebUI.verifyElementText(findTestObject('Website A/Edit profile page/Text_The name may not be greater than 30'), 'The name may not be greater than 30 characters.')

WebUI.closeBrowser()

