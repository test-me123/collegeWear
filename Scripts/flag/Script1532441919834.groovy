import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
WebUI.click(findTestObject('Object Repository/page2/a_Next'))
Thread.sleep(5000)

WebUI.click(findTestObject('Object Repository/page3/div_flag'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/closeButton1/flagClose'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/flag/div_cancel'))
Thread.sleep(5000)

//select the flag
WebUI.click(findTestObject('Object Repository/page3/div_flag'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/flag/img_Benin'))
WebUI.click(findTestObject('Object Repository/page3/flag/flagOkay/div_ok'))

//search the flag
WebUI.click(findTestObject('Object Repository/page3/div_flag'))
Thread.sleep(5000)
WebUI.setText(findTestObject('Object Repository/page3/flag/div_search'), "albania")
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/flag/img_albania'))

//place the flag on right
WebUI.click(findTestObject('Object Repository/page3/flag/div_right'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/flag/div_ok'))


//place the flag on neck
WebUI.click(findTestObject('Object Repository/page3/div_flag'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/flag/img_Benin'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/flag/div_neck'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/flag/div_ok'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/flag/div_Front'))
Thread.sleep(5000)


WebUI.closeBrowser()