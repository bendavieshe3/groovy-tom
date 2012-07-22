package com.he3.tom

class Condition {
	
	String conditionText
	boolean fulfilled = false
	
	Condition(String conditionText) {
		conditionText = conditionText	
	}
	
	boolean isFulfilled() { return fulfilled }
	
	void fulfill() {
		fulfilled = true
	}
	
	boolean asBoolean() {
		return fulfilled
	}

}
