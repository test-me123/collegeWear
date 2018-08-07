import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.selectItem_return
import org.junit.After
import org.openqa.selenium.By
import org.openqa.selenium.By.ByClassName
import org.openqa.selenium.By.ById
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.testng.Assert as Assert


import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://newcollegewear.dev-fsit.com/sash-app/step/1')
WebUI.maximizeWindow()
//CustomKeywords.'com.collegeWear.stoleSelection.stoleSelection.selectedStole'()
//CustomKeywords.'com.collegeWear.stoleColor.stoleColors.stolecolourss'()

//--------------------step 2----------------------------------------
WebUI.click(findTestObject('Object Repository/page1/nextPage'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page2/stole/span_Brown'))
//CustomKeywords.'com.collegeWear.backFrontZoom.backfrontZoom.bfZoom'()

//-------------------step 3------------------------------------------
WebUI.click(findTestObject('Object Repository/page2/a_Next'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/div_greek crest'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/closeButton (1)/greekCrestClose'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/div_cancel'))

WebUI.click(findTestObject('Object Repository/page3/div_greek letters'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/greekLetters/div_cancel'))

WebUI.click(findTestObject('Object Repository/page3/div_logoseal'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/closeButton1/logoSealClose'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/logoANDseal/div_cancel'))

WebUI.click(findTestObject('Object Repository/page3/div_symbol'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/closeButton1/symbolClose'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/symbols/div_cancel'))

WebUI.click(findTestObject('Object Repository/page3/div_flag'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/closeButton1/flagClose'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/flag/div_cancel'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/a_Next'))
//-------------step 4---------------------
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page4/a_Save to cart'))
Thread.sleep(8000)
//--------------------------cart----------------------
WebUI.click(findTestObject('Object Repository/pageCart/a_Proceed to checkout'))
Thread.sleep(8000)
//------------------checkout-----------------------------

WebUI.setText(findTestObject('Object Repository/pageCheckOut/input_billing_address_1'), "addrtesss 1")
WebUI.setText(findTestObject('Object Repository/pageCheckOut/input_billing_address_2'), "address 222")
Thread.sleep(5000)
//WebUI.click(findTestObject('Object Repository/pageCheckOut/span_Select a country'))
//Thread.sleep(5000)

//WebUI.selectOptionByValue(findTestObject('Object Repository/pageCheckOut/Page_Checkout  Sash and Stole/li_Select a country'), 'AS', false)
Thread.sleep(5000)
WebUI.setText(findTestObject('Object Repository/pageCheckOut/input_billing_city'), "City city")
WebUI.setText(findTestObject('Object Repository/pageCheckOut/input_billing_company'),"companies" )
WebUI.setText(findTestObject('Object Repository/pageCheckOut/input_billing_email'), "test@gmail.com")
WebUI.setText(findTestObject('Object Repository/pageCheckOut/input_billing_first_name'),"FirstName" )
WebUI.setText(findTestObject('Object Repository/pageCheckOut/input_billing_last_name'), "lastName")
WebUI.setText(findTestObject('Object Repository/pageCheckOut/input_billing_phone'), "9876543210")
WebUI.setText(findTestObject('Object Repository/pageCheckOut/input_billing_postcode'), "500210")
WebUI.setText(findTestObject('Object Repository/pageCheckOut/input_billing_state'), "State")

try{
WebDriver driver
e=driver.findElement(By.id("ship-to-different-address-checkbox")).click()

Select s=new Select(WebElement e=driver.findElement(By.id("billing_country")).click())
s.selectByValue("AL")
Thread.sleep(8000)
}
catch(Exception e)
{
System.out.println("Drop Down not selected")
WebUI.click(findTestObject('Object Repository/pageCheckOut/placeOrder/button_Place order'))
}



