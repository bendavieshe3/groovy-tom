package com.he3.tom

import org.junit.After
import org.junit.Test
import org.junit.Before

import com.he3.tom.*

class TomUnitTests {

	def TomUnit cut
	
    @Test
    public void testGiven() {
    	cut.given(mathGiven)
    }
	
	@Test
	public void testWhen() {
		cut.when(mathWhen)	
	}
	
	@Test
	public void testThen() {
		cut.then(mathThen)
	}

	
	@Before
	public void setup() {
		cut = new TomUnit()
	}
	
	private Closure mathGiven = {
		valueAIs10
		valueBIs5
	}
	
	private Closure mathWhen = {
		valueCIsCalculatedAsValueAPlusValueB
	}
	
	private Closure mathThen = {
		valueCIs15
	}
	
}
