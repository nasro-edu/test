/**
 * 
 */
package dw317.lib;

/**
 * @author nasro
 *
 This class will define a Name object. 
 It must encapsulate a first name and last name. 
 It must provide the usual getter and setter methods. 
 It must also include a getFullName() method that returns the name in the following format:
	first name space last name
The class must provide two constructors: 
a no-parameter constructor which initializes the instance variables to empty strings, 
and a two-parameter constructor which will accept string values in the order of first name followed by last name. 

It must also contain setter methods for the first and last name attributes. 
Override the toString method following the format used for the overridden toString method in the Address class.
 */
public class Name {
private String firstName="";
private String lastName="";

public Name() {this.firstName=this.lastName="";}
public Name(String fName, String lName) {this.firstName=fName; this.lastName=lName;}

public String toString() {return this.firstName+ " "+this.lastName;}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

}
