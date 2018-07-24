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
WebUI.click(findTestObject('Object Repository/page1/nextPage'))

Thread.sleep(5000)

WebUI.click(findTestObject('Object Repository/page2/stole/span_Maroon'))

//CustomKeywords.'com.collegeWear.backFrontZoom.backfrontZoom.bfZoom'()
//---------------------------greek crest operations--------------
WebUI.click(findTestObject('Object Repository/page2/a_Next'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/div_greek crest'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/closeButton (1)/greekCrestClose'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/div_cancel'))

//select an image
WebUI.click(findTestObject('Object Repository/page3/div_greek crest'))
Thread.sleep(5000)
WebUI.click(findTestObject('Object Repository/page3/crest images/img_CollegeWear'))

WebUI.click(findTestObject('Object Repository/page3/closeButton (1)/greekCrestClose'))
Thread.sleep(6000)
//right
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/div_right'))
Thread.sleep(5000)
//left
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/div_left'))
Thread.sleep(6000)
//back
WebUI.click(findTestObject('Object Repository/page3/greeekCrestnew/div_Back'))
Thread.sleep(6000)
//front
WebUI.click(findTestObject('Object Repository/page3/greeekCrestnew/div_Front'))
Thread.sleep(6000)
//zoom
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/div_Zoom'))
Thread.sleep(6000)
//close
WebUI.click(findTestObject('Object Repository/page3/greeekCrestnew/button_close'))
Thread.sleep(6000)
//ok
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/div_ok'))

//-----------------search the image and click on it------------------------------------
WebUI.click(findTestObject('Object Repository/page3/div_greek crest'))
Thread.sleep(5000)
WebUI.setText(findTestObject('Object Repository/page3/greeekCrest/innerSearch'), "Phi Mu")
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/img_Phi Mu'))


//-------------------outer search---------------------

WebUI.click(findTestObject('Object Repository/page3/greeekCrestnew/div_search'))
Thread.sleep(6000)
WebUI.setText(findTestObject('Object Repository/page3/greeekCrest/innerSearch'), "Phi Mu")
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/img_Phi Mu'))




WebUI.click(findTestObject('Object Repository/page3/greeekCrestnew/div_search'))
Thread.sleep(6000)
WebUI.setText(findTestObject('Object Repository/page3/greeekCrest/innerSearch'), "Phi Mu")
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/img_Phi Mu'))

WebUI.click(findTestObject('Object Repository/page3/greeekCrestnew/div_search'))
Thread.sleep(6000)
WebUI.setText(findTestObject('Object Repository/page3/greeekCrest/innerSearch'), "Phi Mu")
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/img_Phi Mu'))

WebUI.click(findTestObject('Object Repository/page3/greeekCrestnew/div_search'))
Thread.sleep(6000)
WebUI.setText(findTestObject('Object Repository/page3/greeekCrest/innerSearch'), "Phi Mu")
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/img_Phi Mu'))

WebUI.click(findTestObject('Object Repository/page3/greeekCrestnew/div_search'))
Thread.sleep(6000)
WebUI.setText(findTestObject('Object Repository/page3/greeekCrest/innerSearch'), "Phi Mu")
WebUI.click(findTestObject('Object Repository/page3/greeekCrest/img_Phi Mu'))






