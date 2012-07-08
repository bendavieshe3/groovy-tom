package com.he3.tom

import groovy.lang.Closure;

class TomUnit {
	
	Stage testStage = new Stage()
	
	def given(Closure preConditions) {
		testStage.startTomSession()
		runWithDelegate(preConditions, testStage)
		establishConditions()
	}
	
	def when(Closure actions) {
		
		runWithDelegate(actions, testStage)
	}
	
	def then (Closure postConditions) {
		
		runWithDelegate(postConditions, testStage)
		checkPostConditions()
		testStage.endTomSession()
	}
	
	def establishConditions() {
		
	}
	
	def checkPostConditions() {
		
	}
	
	def runWithDelegate(Closure cl, Object delegate) {
		cl.delegate = delegate
		cl.resolveStrategy = Closure.DELEGATE_FIRST
		cl()
	}
}
