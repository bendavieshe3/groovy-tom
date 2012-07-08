package com.he3.tom


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


class Stage {

	def terms = []
	def defaultDriver = 'HtmlUnitDriver'
	def Map driverFqns = [
		'HtmlUnitDriver':'org.openqa.selenium.htmlunit.HtmlUnitDriver',
		'FirefoxDriver':'org.openqa.selenium.firefox.FirefoxDriver'
		]
	
	WebDriver session
	
	
	def getProperty(String name) {
		setTerm(name)
		name
	}
	
	def setTerm(String term) {
		terms.push(term)
	}
	
	
	void startTomSession(Map options = [:]) {
		
		options.driver = options?.driver ?: defaultDriver
		if(driverFqns.containsKey( options.driver )) {
			options.driver = driverFqns.(options.driver)
		}
		
		session = Class.forName(options.driver).newInstance()
		
	}
	
	void endTomSession() {
		session.quit()
	}
	
}
