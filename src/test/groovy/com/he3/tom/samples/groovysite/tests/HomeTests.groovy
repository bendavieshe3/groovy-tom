package com.he3.tom.samples.groovysite.tests

import org.junit.Rule
import org.junit.Test

import com.he3.tom.Clauses

//import com.he3.tom.samples.groovysite.HomePage

@Mixin([Clauses])
class HomeTests {
	
	/*
	@Rule
	public WebDriverHelper webdriver = new WebDriverHelper()
	*/
	
    @Test
    public void testContentOnDirectVisit() {
		
		given {
			userIsAnyBody
		}
		when {
			userVisitsHomePage
		}
		then {
			HeaderIsVisible
			TryLinkIsVisible
			SignInLinkIsVisible
			SignUpLinkIsVisible
		}
    }

	
}
