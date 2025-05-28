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

Mobile.startApplication('C:\\Users\\User\\Downloads\\app-production-release.apk', true)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Login'), 0)

Mobile.setText(findTestObject('Object Repository/New APP/Input - Email'), 'userprodcompany6@qwertysystem.net', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/New APP/Input - Password'), '6uWU9cOie7Ys/jaKOFMScQ==', 0)

Mobile.tap(findTestObject('New APP/Button - Password Visibility'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Login User'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Module Select'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Menu - Fixed Asset'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Menu - Available'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Register Asset'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Select Group'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/List - default'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Select'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Select Category'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/List - default'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Select'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Input - Asset Name'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/List - Asset Name Default'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Select'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Input - Brand Name'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/List - Asset Name Default'), 0)

Mobile.tap(findTestObject('New APP/Button - Apply'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Input - Model or Type'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/List - Asset Name Default'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Select'), 0)

Mobile.setText(findTestObject('Object Repository/New APP/Input - Quantity'), '1', 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Image Upload'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Take a Photo'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Capture'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Done Photo'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - POTONG'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Input - Select date'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Apply'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Register'), 0)

Mobile.tap(findTestObject('Object Repository/New APP/Button - Continue'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Toast - Success'), 0)

Mobile.closeApplication()

