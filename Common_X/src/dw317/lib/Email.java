/**
 * 
 */
package dw317.lib;

/**
 * @author nasro
 *
The Email class
Email implements Serializable Comparable<Email>
- serialVersionUID = 42031768871L
- address: String {readOnly}
+ Email(String address)
+ getAddress() : String
+ getUserId() : String
+ getHost() : String
//override the following methods
+ equals(Object object): boolean
+ getNumber(): String
+ getType(): Scheme
+ toString(): String
- validateEmail(String email) : String
throws IllegalArgumentException
*You may add as many private static methods as you deem necessary.
NOTE:
. The address field in the Email class must be declared as final since it was indicated that the field was read only.
. Two email objects are considered equal if they are of the same class and their addresses are equal. 
	If the equals method is overridden as final, the hashCode method must be final as well.
. The overridden toString method must return the address string
. Email must implement the compareTo method. Emails are naturally ordered by their case-insensitive host name, 
	followed by case-insensitive userid. So zhu@abc.com is before A@ba.com
. The validateEmail method validates the email as described in prep phase part A. 
	It is invoked by the constructor. If the address is invalid, throw an IllegalArgumentException */
import java.io.Serializable;

public class Email implements Serializable, Comparable{

	private final long  serialVersionUID = 42031768871L;
	private final String  address;
	
	public Email(String address){this.address = this.validateEmail(address);}
	
	public String getAddress() {return address;}
	public String getUserId() {String [] splitAddress = address.split("@");
								return splitAddress [0];
								}
	
	public String getHost() {String [] splitAddress = address.split("@");
							return splitAddress [1];
							}
	
			//override the following methods
	public boolean equals(Object object) {return true;}
	public String getNumber(){return "";}
	public String getType() {return this.toString();} //: Scheme
	public String  toString(){ return address;}
	public String validateEmail(String eAddress) 
			{ String [] splitAddress = eAddress.split("@");
			String host = Name.validateName("[a-zA-Z ,-.]+", splitAddress[1], 4, "emailHost");
			String userId = Name.validateName("[a-zA-Z ,-]+", splitAddress[0], 2, "emailID");
			return (userId + "@"+ host);
			}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
