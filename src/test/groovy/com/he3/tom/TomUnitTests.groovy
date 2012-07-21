package com.he3.tom

import org.junit.After
import org.junit.Test
import org.junit.Before

import com.he3.tom.*

class TomUnitTests {

	def TomUnit cut
	
    @Test
    public void testEstablishConditions() {
    	cut.establishConditions
    }

	
	@Before
	public void setup() {
		cut = new TomUnit()
	}
	
}
