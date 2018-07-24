package com.collegeWear.backFrontZoom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class backfrontZoom {
	@Keyword
	public bfZoom() {
		for(int i=0;i<4;i++) {
			Thread.sleep(5000)
			WebUI.click(findTestObject('Object Repository/page2/div_Back'))
			Thread.sleep(5000)
			WebUI.click(findTestObject('Object Repository/page2/front/div_Front'))
			Thread.sleep(5000)
			WebUI.click(findTestObject('Object Repository/page2/div_Zoom'))
			Thread.sleep(5000)
			WebUI.click(findTestObject('Object Repository/page2/page2/button_close'))
		}
	}
	
	
	
	
	
	
	}
