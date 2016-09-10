/**
 * 
 */
package dw317.lib;

/**
 * @author nasro
 *
Person class description.
This class will define a person. 
	It must encapsulate a person’s name and address, both of which are separate objects. 
Note that the relationship between a person object and its name and address is one of composition; 
	which implies that a person has sole ownership of its name and its address.

The class must provide the following two constructors:
•	public Person(String firstName, String lastName) 
Note that this constructor must also properly initialize the address object.
•	public Person(String firstName, String lastName, Address address). 
•	Do not include a no-parameter constructor since we are making the assumption that a person must have a name. 

Define the following getter methods (make sure to return copies of the objects 
			and not simply a reference to the actual objects since we don’t want to allow privacy leaks)
+getAddress(): Address
+getName() : Name
•	Define the following setter methods
+setName(String firstName, String lastName)
+setAddress(Address address) 
•	Override the toString method  as follows
@Override
public String toString() {
             
    return name.toString() + "*" + 
(address == null ? ""  : 
       address.toString());                      
}

 */
public class Person {
	private Name fullName;
	private Address address;

	public Person(String firstName, String lastName) 
	{fullName.setFirstName(firstName); fullName.setLastName(lastName);}
	
	//copy constructir
	public Person(Person aPerson) 
	{ this.setFullName(aPerson.fullName);
	 this.setAddress(aPerson.address);
	 }
	
	public Person(String firstName, String lastName, Address address) 
	{fullName.setFirstName(firstName); fullName.setLastName(lastName);
	this.address = address;
	}

	public Person(Name fullName, Address address) 
	{this.fullName = fullName; 
	this.address = address;
	}
	public Name getFullName() {
		return fullName;
	}

	public void setFullName(Name fullName) {
		this.fullName = fullName;
	}

	public Address getAddress() {
		 return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	} 
	
	@Override
	public String toString() {
	             
	    return fullName.toString() + "*" + 
	(address == null ? ""  : 
	       address.toString());                      
	}

}
