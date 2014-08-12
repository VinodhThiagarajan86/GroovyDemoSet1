package org.groovy.groovyforeyes;


public class Sleep {
	
	public static void main(String[] args){
		
		/*Uncomment this line and see what java compiler recommends and hence we
		 *  have added the catch block*/
		/*Thread.sleep(5000);*/
		
	try {
		Thread.sleep(5000);
		} catch(InterruptedException ex) {
		// eh? I'm losing sleep over what to do here.
		}
}
}
