package com.he3.tom


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


class Stage {

	def conditions = []
	def defaultDriver = 'HtmlUnitDriver'
	def Map driverFqns = [
		'HtmlUnitDriver':'org.openqa.selenium.htmlunit.HtmlUnitDriver',
		'FirefoxDriver':'org.openqa.selenium.firefox.FirefoxDriver'
		]
	
	WebDriver session
	
	
	def getProperty(String name) {
		setCondition(name)
		name
	}
	
	def setCondition(String conditionText) {
		conditions.push(new Condition(conditionText))
	}
	
	def checkConditions() {
		if(getUnfulfilledConditions().size()) {
			throw new Exception('Conditions not met')
		}
	}
	
	def establishConditions() {
		getUnfulfilledConditions().each { condition ->
			fulfillCondition(condition)
		}
	}
	
	def checkAndFulfillConditions() {
		establishConditions()
		if(getUnfulfilledConditions().size()) {
			throw new Exception('Could not fulfill conditions')
		}
	}
	
	List getUnfulfilledConditions() {
		return conditions.findAll { condition ->
			condition.isFulfilled()
		}
	}
	
	void fulfillCondition(Condition condition) {
		condition.fulfill()		
	}
	
	void startTomSession(Map options = [:]) {
		
		options.driver = options?.driver ?: defaultDriver
		if(driverFqns.containsKey( options.driver )) {
			options.driver = driverFqns.(options.driver)
		}
		
		session = Class.forName(options.driver).newInstance()
		
	}
	
	void endTomSession() {
		session?.quit()
	}
	
}
