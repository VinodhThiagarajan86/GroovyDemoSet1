
//Java would have recommend to force create FileNotFoundException. But Groovy 
/*Doesnt force checked excpetion. If the
exception occurs, it’s not suppressed. Instead, it’s passed to the calling code,
which can handle it,*/
def openFile(fileName) {
	new FileInputStream(fileName)
}

try {
	
	openFile("nonexistentfile")
	
} 
/*If we are interested in catching all Exceptions that may be thrown, we can
simply omit the exception type in the catch statement:

catch(ex) {
// Do whatever you like about this exception here
println "Oops: " + ex
}
*/

catch(FileNotFoundException ex) {
	// Do whatever you like about this exception here
	println "Oops: " + ex
}
	
	