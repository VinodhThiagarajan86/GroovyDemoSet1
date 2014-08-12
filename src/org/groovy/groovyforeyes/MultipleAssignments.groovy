//Split Easily and Retrieve them easily if you definitely what is in the index

def splitName (name) {
 name.split(' ')	
}

def(firstName , lastName) = splitName('James Bond')

println lastName + ","+ firstName + " " + lastName


//Easy swapping without temporary variables

def name1 = "Vinodh"
def name2 = "Thiagarajan"

println name1 + " " + name2

/*We’ve seen how Groovy takes care of multiple assignment when we have the
proper number of variables on the left to receive the values on the right.
Groovy can also deal with this gracefully when the number of variables and
values don’t match. If we have excess variables, Groovy will set them to null,
and excess values will be discarded.*/
(name1 ,name2 , name3) = [name2 , name1]

println name2 + " " + name1 + " " +name3


def (String cat, String mouse) = ['Tom', 'Spike', 'Jerry', 'Tyke']
println "$cat and $mouse"