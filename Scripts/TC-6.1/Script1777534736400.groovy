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

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Page_Bentilzone Restaurant/p_Login'))

WebUI.setText(findTestObject('Page_Bentilzone Restaurant/input_Email address'), 'abang@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Bentilzone Restaurant/input_Password'), 'M0mOzho8dkI=')

WebUI.setEncryptedText(findTestObject('Page_Bentilzone Restaurant/input_Password'), 'WfboKQmp8gSiqSry9W5an3qZoMAVxinNNtr2+tqWZLgmFjnS4w+8kUBnZxdb7nKdSt4AyPkSH3ip8hmaGCcgb1CWgTGM67Gnvw0kaLzup8uOaPfxis4YjqZQVGCzuVowdrFwQpgEDds=')

WebUI.click(findTestObject('Page_Bentilzone Restaurant/p_Sign in'))

