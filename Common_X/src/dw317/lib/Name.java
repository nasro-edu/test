/**
 * 
 */
package dw317.lib;

import java.io.Serializable;

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

/**
 * 
 * The Name class must validate the first and last names (refer to Lab 2 where you validated the Address class). 
 * Both first and last names must each contain at least 2 letters. 
 * In addition to letters, the characters ‘ (apostrophe), - (hyphen) and space between two letters are valid. 
 * All validation is case-insensitive. You may override the equals and hashCode methods in the Name class. 
Note that if you do, you must do so in such a way that only same class name objects with all equal attributes are considered equal.
 Since you will be ignoring the casing of characters in the equals method, 
 make sure to convert the first name and last name to uppercase in the hashCode method prior to computing the hash code. 
 If the equals method is overridden as final, the hashCode method must be final as well. *
 */

public class Name implements Serializable {
	private static final long serialVersionUID = 42031768871L;
	
	private String firstName="";
	private String lastName="";

	public Name() {this.firstName=this.lastName="";}
	public Name(String fName, String lName) {this.firstName=validateName("[a-zA-Z ,'-]+", fName,2, "fName"); 
											this.lastName=validateName("[a-zA-Z ,'-]+", lName,2, "lName");}
	
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
	public static String validateName(String namePattren, String theName, int minSize, String labelError)
	{  //String namePattren = "[a-zA-Z ,'-]+";
		try{
		if(theName.length()<2)
				throw new IllegalArgumentException(labelError+" must be more than "+minSize+" chars");
		if(!theName.matches(namePattren)) throw new IllegalArgumentException ("wrong" +labelError +"content");
		}
		catch (IllegalArgumentException iae)
		{
			return iae.getMessage();
		}
		return theName;
			
	}
}
