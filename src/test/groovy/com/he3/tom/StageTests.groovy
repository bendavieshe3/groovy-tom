package com.he3.tom


import org.junit.After
import org.junit.Test
import org.junit.Before

import com.he3.tom.*



class StageTests {

	def Stage cut
	
    @Test
    public void testStartStopTomSession() {
		cut.startTomSession()
		cut.endTomSession()
    }
	
	@Test
	public void testCheckConditions() {
		cut.checkConditions()
	}
	
	@Test
	public void testEstablishConditions() {
		cut.establishConditions()
	}
	
	@Test
	public void testCheckAndFulfillConditions() {
		cut.checkAndFulfillConditions()
	}
	
	@Before
	public void setup() {
		cut = new Stage()
	}
	
}
