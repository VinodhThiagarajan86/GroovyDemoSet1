
//To demonstrate Safe-navigation operator

/*The call to reverse() on the null reference using ?. resulted in a null instead of a
NullPointerException—another way Groovy reduces noise and effort*/
def foo(str){
	str?.reverse()
}

println foo('evil')
println (null)