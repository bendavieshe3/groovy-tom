package com.he3.tom.samples.groovysite.tests

import org.junit.After
import org.junit.Test
import org.junit.Before

import com.he3.tom.*

//import com.he3.tom.samples.groovysite.HomePage

@Mixin([Clauses,TomUnit])
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
