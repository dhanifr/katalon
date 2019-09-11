import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://m.staging.karir.com/')

WebUI.click(findTestObject('Page_Lowongan Kerja Terbaru 2019  K/a_Sign In'))

WebUI.setText(findTestObject('Page_Karir.com/input_Email_useremail'), 'dhani@qerja.com')

WebUI.setText(findTestObject('Page_Karir.com/input_Kata sandi_userpassword'), 'icecream')

WebUI.click(findTestObject('Page_Karir.com/input_Daftar sekarang_commit'))

WebUI.click(findTestObject('Page_Lowongan Kerja Terbaru 2019  K/a_Sign Out'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

