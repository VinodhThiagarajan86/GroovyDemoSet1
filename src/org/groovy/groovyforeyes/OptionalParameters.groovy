/*In Groovy we can make method and constructor parameters optional. In fact,
we can make as many parameters optional as we like, but they have to be
trailing. We can use this in evolutionary design to add new parameters to
existing methods.

Play around and remove the = and see what happens
*/

def add(x,base=10){
	x+base
}

println add(1024)
println add(1024,10)
println add(1024,2)

def task(name , String[] details){
	println name  + " " + details
}

task 'Call', '123-456-7890'
task 'Call', '123-456-7890', '231-546-0987'
task 'Check Mail'