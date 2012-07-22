package com.he3.tom

import groovy.lang.Closure;

class TomUnit {
	
	Stage testStage = new Stage()
	
	def given(Closure preConditions) {
		testStage.startTomSession()
		runWithDelegate(preConditions, testStage)
		testStage.checkAndFulfillConditions()
	}
	
	def when(Closure actions) {
		runWithDelegate(actions, testStage)
		testStage.checkAndFulfillConditions()
	}
	
	def then (Closure postConditions) {
		
		runWithDelegate(postConditions, testStage)
		testStage.checkConditions()
		testStage.endTomSession()
	}
	
	def runWithDelegate(Closure cl, Object delegate) {
		cl.delegate = delegate
		cl.resolveStrategy = Closure.DELEGATE_FIRST
		cl()
	}
}
