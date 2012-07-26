package com.he3.tom

import groovy.lang.Closure;

class TomUnit {
	
	//TODO: Try @Delegate annotation around stage?
	
	
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

class TomException extends Exception {
	TomException(o) { super(o) }	
}

class ConditionNotHandledException extends TomException {

	ConditionNotHandledException(o) { super(o) }
		
}