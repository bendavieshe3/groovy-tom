package com.he3.tom

import groovy.lang.Closure;

class Clauses {

	Stage testStage = new Stage()
	
	def given(Closure preConditions) {
		
		runWithDelegate(preConditions, testStage)
		establishConditions()
	}
	
	def when(Closure actions) {
		
		runWithDelegate(actions, testStage)
	}
	
	def then (Closure postConditions) {
		
		runWithDelegate(postConditions, testStage)
		checkPostConditions()
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
