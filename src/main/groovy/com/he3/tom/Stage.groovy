package com.he3.tom


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*


class Stage {

	def terms = []
	
	WebDriver driver
	
	
	def getProperty(String name) {
		setTerm(name)
		name
	}
	
	def setTerm(String term) {
		terms.push(term)
	}
	
	
	void startTomSession() {
		
		driver = new FirefoxDriver();
		
	}
	
	void endTomSession() {
		driver.quit()
	}
	
}
