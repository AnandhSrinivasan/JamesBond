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

WebUI.navigateToUrl('https://phptravels.com/demo')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/SignUp_PHP_Travels_/Page_Book Your Free Demo Now - Phptravels/input_first_name'), 
    'Muruganandh')

WebUI.setText(findTestObject('Object Repository/SignUp_PHP_Travels_/Page_Book Your Free Demo Now - Phptravels/input_last_name'), 
    'Srinivasan')

WebUI.setText(findTestObject('Object Repository/SignUp_PHP_Travels_/Page_Book Your Free Demo Now - Phptravels/input_business_name'), 
    'nothing')

WebUI.setText(findTestObject('Object Repository/SignUp_PHP_Travels_/Page_Book Your Free Demo Now - Phptravels/input_email'), 
    'ksasida@gmail.com')

WebUI.setText(findTestObject('Object Repository/SignUp_PHP_Travels_/Page_Book Your Free Demo Now - Phptravels/inputnumber'), 
    '13')

WebUI.click(findTestObject('Object Repository/SignUp_PHP_Travels_/Page_Book Your Free Demo Now - Phptravels/button_Submit'))

WebUI.getText(findTestObject('Object Repository/SignUp_PHP_Travels_/Page_Book Your Free Demo Now - Phptravels/h1_Demonstration'))

WebUI.closeBrowser()

