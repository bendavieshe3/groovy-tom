package com.he3.tom

import org.openqa.selenium.*
import org.openqa.selenium.firefox.*

class TomUnit {

	def WebDriver driver
	
	
	void startTomSession() {
		
		driver = new FirefoxDriver();
		
	}
	
	void endTomSession() {
		driver.quit()	
	}
	
	
}
