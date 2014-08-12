//Object
lst0 = null
println lst0 ? 'lst0 true' : 'lst0 false'
//Non-empty  collection
lst1 = [1, 2, 3]
println lst1 ? 'lst1 true' : 'lst1 false'
//Empty  collection
lst2 = []
println lst2 ? 'lst2 true' : 'lst2 false'
//Integer 0
lst2 = 0
println lst2 ? 'lst2 true' : 'lst2 false'

//Integer 1
lst2 = 1
println lst2 ? 'lst2 true' : 'lst2 false'

//No-Character
lst2 = ''
println lst2 ? 'lst2 true' : 'lst2 false'

//Has Character
lst2 = 'a'
println lst2 ? 'lst2 true' : 'lst2 false'

/*Type 			Condition for Truth
Boolean 		True
Collection 		Not empty
Character 		Value not 0
CharSequence 	Length greater than 0
Enumeration 	Has more elements
Iterator 		Has next
Number 			Double value not 0
Map 			Not empty
Matcher 		At least one match
Object[] 		Length greater than 0
Any other type 	Reference not null*/