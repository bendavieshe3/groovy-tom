package com.he3.tom


import org.junit.After
import org.junit.Test
import org.junit.Before

import com.he3.tom.*



class ConditionTests {

	def Condition cut
	
	@Test
	void testInstantiationWithCamelCase() {
		def camelCaseCondition = new Condition('IAmACamelCaseCondition')
	}
	
	@Test
	void testInstantiationWithSentence() {
		def sentenceCondition = new Condition('I am a sentence condition')
	}
	
	@Test
	void testFulfillCondition() {
		assert(!cut)
		assert(!cut.isFulfilled())
		cut.fulfill()
		assert(cut)
		assert(cut.isFulfilled())
		
	}
		
	@Before
	public void setup() {
		cut = new Condition('IAmANewCondition')
	}
	
}
