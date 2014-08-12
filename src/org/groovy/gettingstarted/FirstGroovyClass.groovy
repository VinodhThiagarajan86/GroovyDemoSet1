package org.groovy.gettingstarted

class FirstGroovyClass {

	static main(args) {
	
		println Math.sqrt(16)
		println 'Test Drive Groovy'
		
		/*String.metaClass.isPalindrome = {
			delegate == delegate.reverse()
			println delegate
		}
		
		println 'mom'.isPalindrome()*/
		
	}

}
