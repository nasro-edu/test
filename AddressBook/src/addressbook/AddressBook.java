/**
 * 
 */
package addressbook;
import dw317.lib.Address;

/**
 * @author your name
 *
 */
public class AddressBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Address myAddress = new Address("1222", "Thompsin","Montreal");
		Address myAddress1 = new Address("1222", "parc","Montreal");
		
		System.out.println(myAddress.getAddress());
		System.out.println(myAddress.hashCode());
		System.out.println(myAddress1.hashCode());
		System.out.println(myAddress.equals(myAddress1));


		
	}

}
