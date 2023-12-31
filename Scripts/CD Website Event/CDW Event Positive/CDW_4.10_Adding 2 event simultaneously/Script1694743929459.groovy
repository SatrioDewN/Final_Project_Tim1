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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.WebUrl)

WebUI.click(findTestObject('Website/Home Page/Button_Masuk_Header'))

WebUI.setText(findTestObject('Website/Login Page/Field_Email'), GlobalVariable.LoginEmail)

WebUI.setText(findTestObject('Website/Login Page/Field_Password'), GlobalVariable.LoginPassword)

WebUI.click(findTestObject('Website/Login Page/Button_Login'))

WebUI.click(findTestObject('Website/Home Page/Button_Event'))

WebUI.click(findTestObject('Website/Event Page/Event_Day 3 Predict using Machine Learning'))

WebUI.click(findTestObject('Website/Event Day 3 Page/Button_Beli Tiket'))

WebUI.verifyElementText(findTestObject('Website/Event Day 3 Page/Verify_Add to cart Day 3 success'), 'add to cart success')

WebUI.click(findTestObject('Website/Event Day 3 Page/Button_Lihat Event Lainnya'))

WebUI.click(findTestObject('Website/Event Page/Event_Day 4 Workshop'))

WebUI.click(findTestObject('Website/Event Day 4 Page/Button_Beli Tiket'))

WebUI.verifyElementText(findTestObject('Website/Event Day 4 Page/Verify_Add to cart Day 4 success'), 'add to cart success')

WebUI.click(findTestObject('Website/Event Day 4 Page/Button_Pembelian Saya'))

WebUI.click(findTestObject('Website/Cart Page/Remove_Cart'))

WebUI.click(findTestObject('Website/Cart Page/Remove_Cart'))

WebUI.closeBrowser()

