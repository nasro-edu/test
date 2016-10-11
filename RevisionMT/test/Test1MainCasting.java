/**
 * 
 */

/**
 * @author nasro
 *
 */
public class Test1MainCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Vehicle v1 = new Vehicle("v1");
	Car car1 = new Car("car1");
	
	v1.fillFuel();
	car1.fillFuel();
	
//-----------upcasting  -
	// a car is "always" a vehicle - from subclass to superclass
	Vehicle v2 = new Car("v2"); // this correct and use implicit casting
	//or
	//Vehicle v3 = car1;
	//Vehicle v4 = (Vehicle) new Car(); //you could also have used casting 
										// but redudnat - doesnt need explicit cating
	v2.fillFuel();
	// which fillFuel wil be called?
	// v2 has a refernce type (Vehicle) but v2 refers to actual object Car
	// therefore methods of the object are called.
	//v2.start(); // produces compiler error
	// the type of the variable detremines what methods  (the set of all methods) can be called
	// the object type of the variable decides which method is actually called	
//---------------------------	
//-----------down-casting  -
		// a vehicle is NOT always a car - from superclass to subclass 
		// so be careful,
	Vehicle v3  = new Car("v3");
	//Car car2 = v3;  //  this is down-casting --> needs explicit casting
	Car car2 = (Car) v3;
	car2.fillFuel();car2.start();
	
	// why is it unsafe?
	Vehicle v4  = new Car("v4");  
	Car car3 = (Car) v4;		//// a Vehcile v4 is a car
			car3.fillFuel();
			car3.start();

/*	if (v4 instanceof Car)
	{Car car3 = (Car) v4;		//// a Vehcile v4 is a car
		car3.fillFuel();
		car3.start();
	}
*/
	}

}


class Vehicle 
{	protected String objName ;
	public Vehicle (String objName) {this.objName=objName;}
	public void fillFuel () 
	{System.out.println("Vehicle: "+this.objName+" with fuel in");}
}

class Car extends Vehicle
{	public Car (String objName) {super(objName);}
	public void fillFuel () 
	{System.out.println("Car: "+this.objName+" with fuel in");}
	
	public void start() 
	{System.out.println("Car: "+this.objName+" starts");}

}