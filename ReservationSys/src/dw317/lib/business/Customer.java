/**
 * 
 */
package dw317.lib.business;

import java.util.Optional;

import dw317.lib.Email;
import dw317.lib.Name;
import dw317.lib.creditcard.CreditCard;

/**
 * @author nasro
 *
 - Customer type objects have a name, email and optionally a credit card. 
 - In order to enforce this business rule, your implementing class is to have a single three parameter constructor 
taking in 3 Strings – first name, last name and email. Since an email object is immutable, 
you do not have to create a new object. 
Initialize the credit card to null.

 - You must include the following private static variable since Customer type objects implement Serializable interface.
private static final long serialVersionUID = 42031768871L;

- No validation is needed in the constructor: The customer’s first name and last name is validated in the Name class, 
while the customer’s email string is validated by the Email class.
- getName must return a deep copy since Name is not immutable; getEmail may return the object since Emails are immutable.
- Customer type subclasses must have overridden equals, hashCode, and toString methods. 
	Two customer objects are considered equal if they are instances of the same class and their email attributes are equal.
- The overridden hashCode method must use the same fields as those checked by the equals method. If the equals ignores casing, the hashCode must first convert the field value to a consistent casing (i.e. uppercase) before using the field to determine the object’s hashCode value. Recall that the hashCode’s contract states that two equal objects must have the same hashCode value. Make sure to declare the overridden equals and hashCode as final since you will be checking for instanceof in the equals instead of same class.
- The overridden toString method must return a string formatted as
 */
public final class Customer implements CustomerDelegate{
	private static final long serialVersionUID = 42031768871L;
	private Name name;
	private Email email ;
	private CreditCard creditCard;
	
	public Customer(Name name, Email email, Optional<CreditCard> creditCard) 
	{
		this.name = name; this.email=email; 
		this.creditCard= creditCard.orElse(null);
	}
	public Customer(String fName, String lName, Email email) 
	{
		this.name = new Name(fName, lName); 
		this.email=email; this.creditCard= null;
	}
	public Customer(Customer aCustomer) 
	{
		this.name = aCustomer.name; this.email=aCustomer.email; this.creditCard= aCustomer.creditCard;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return ( this.name.getLastName().compareTo( ((Customer) o).getName().getLastName()) );
		
		//if comparing based n credit crad
		//return this.creditCard.getNumber().compareTo( ((Customer) o).getCreditCard().getNumber());
		//return 0;
	}

	@Override
	public Name getName() {
		// TODO Auto-generated method stub
		Name aName = new Name (this.name.getFirstName(), this.name.getLastName());
		return aName;
		//return this.name;
	}

	@Override
	public Email getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public Optional<CreditCard> getCreditCard() {
		// TODO Auto-generated method stub
		return (Optional.of(this.creditCard));
	}

	@Override
	public void setCreditCard(Optional<CreditCard> card) {
		this.creditCard = card.orElse(null);
	}

	//equals, hashCode, and toString methods
//	Two customer objects are considered equal if they are instances of the same class and their email attributes are equal.
	public boolean equals__(Object anotherCust)
	{	if(anotherCust==null) return false;
	
		return (anotherCust instanceof Customer 
				&&	this.email.equals( ((Customer)anotherCust).getEmail())
				//&&	this.name.equals((Customer)anotherCust).name)
					) ;
		}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		return true;
	}
	public int hashCode__()
	{
	    final int PRIME = 31;
	    int result = 1;
	    //result = PRIME * result + this.getEmail();
	    return result;
	}
	//- The overridden hashCode method must use the same fields as those checked by the equals method. 
	//If the equals ignores casing, the hashCode must first convert the field value to a consistent casing (i.e. uppercase) 
	//before using the field to determine the object’s hashCode value. 
	//Recall that the hashCode’s contract states that two equal objects must have the same hashCode value. 
	//Make sure to declare the overridden equals and hashCode as final since you will be checking for instanceof in the equals instead of same class.

	//- The overridden toString method must return a string formatted as
	
	/*email*firstname*lastname*creditcardtype *creditcardnumber
	- Note that the optional credit card field must be represented as empty strings and not by the string null 
	within the string that is returned by the toString method.
	- For example, a customer with an email and name, but no credit card:
	joe.mancini@mail.me*Joe*Mancini**
	=> implies 3 fields with split method
	- Customer type objects must realize the compareTo method. Patients are naturally ordered by their email.
	- Once you have coded your concrete implementation, create a test application 
	(as a member of a package called groupX.hotel.business in your test folder) in order to test the concrete class.*/
	
	public String toString() {return this.email.toString()+"*"+this.name.toString()+"*"+( (this.creditCard==null)?"":this.creditCard.toString());}
	
}

