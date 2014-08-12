

class Car {

	//private int miles;
	def miles = 0
	
	//private final int year;
	final year
	
	//public Car(int theYear) { year = theYear; }
	//This is a contructor
	Car (theYear) {year = theYear;}
	
	
	
	
	
}

Car car = new Car(2008)
println "Year: $car.year"
println "Miles: $car.miles"
println 'Setting miles'
car.miles = 25
println "Miles: $car.miles"

