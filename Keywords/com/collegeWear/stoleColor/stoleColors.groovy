package com.collegeWear.stoleColor

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

public class stoleColors {
	@Keyword
	public stolecolourss() {
		Scanner input=new Scanner(System.in)
		System.out.println("Enter the stole color")
		String color = input.nextLine();
		switch (color) {
			case 'bargundy':WebUI.click(findTestObject('Object Repository/page2/stole/span_Bargundy'))
				break

			case 'black':   WebUI.click(findTestObject('Object Repository/page2/stole/span_Black'))
				break;

			case "brown":   WebUI.click(findTestObject('Object Repository/page2/stole/span_Brown'))
				break;

			case "grey":    WebUI.click(findTestObject('Object Repository/page2/stole/span_Grey'))
				break;

			case "hot pink":WebUI.click(findTestObject('Object Repository/page2/stole/span_Hot Pink'))
				break;

			case "maroon":  WebUI.click(findTestObject('Object Repository/page2/stole/span_Maroon'))
				break;

			case "pink":    WebUI.click(findTestObject('Object Repository/page2/stole/span_Pink'))
				break;

			case "red cardinal":WebUI.click(findTestObject('Object Repository/page2/stole/span_Red Cardinal'))
				break;

			case "red":     WebUI.click(findTestObject('Object Repository/page2/stole/span_Red'))
				break;

			case "silver":  WebUI.click(findTestObject('Object Repository/page2/stole/span_Silver'))
				break;

			case "white":   WebUI.click(findTestObject('Object Repository/page2/stole/span_White'))
				break;

			default:        WebUI.click(findTestObject('Object Repository/page2/stole/span_Yellow Gold'))
				break;
		}
	}
	
	
	
	}
