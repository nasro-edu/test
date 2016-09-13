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

public final class Email implements Serializable, Comparable{

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
	public boolean equals__(Object object) 
	{return true;}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Email))
			return false;
		Email other = (Email) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		return true;
	}

	public String getNumber(){return "";}
	public String getType() {return this.toString();} //: Scheme
	public String  toString(){ return address;}
	public String validateEmail(String eAddress) 
			{ String [] splitAddress = eAddress.split("@");
			String host = Name.validateName("[a-zA-Z ,-.]+", splitAddress[1], 4, "emailHost");
			String userId = Name.validateName("[a-zA-Z ,-]+", splitAddress[0], 2, "emailID");
			return (userId + "@"+ host);
			}
	
	public int compareTo(Email arg0) {
		// TODO Auto-generated method stub
		int compareHost = this.getHost().compareToIgnoreCase(arg0.getHost());
		int compareID = this.getHost().compareToIgnoreCase(arg0.getUserId());
		System.out.println(this.getHost()+" vs "+ arg0.getHost()+ ": "+ compareHost);
		if(compareHost==0) return compareID;
		return compareHost;
		}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
