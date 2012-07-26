package com.he3.tom


import org.junit.After
import org.junit.Test
import org.junit.Before

import com.he3.tom.*



class StageIntegrationTests {

	def Stage cut
	
	@Test
	public void testStartStopTomSessionFirefox() {
		cut.startTomSession(driver:'FirefoxDriver')
		cut.endTomSession()
	}
		
	@Before
	public void setup() {
		cut = new Stage()
	}
	
}
