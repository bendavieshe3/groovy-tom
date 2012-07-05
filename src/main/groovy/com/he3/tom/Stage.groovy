package com.he3.tom

class Stage {

	def terms = []
	
	def getProperty(String name) {
		setTerm(name)
		name
	}
	
	def setTerm(String term) {
		terms.push(term)
	}
}
