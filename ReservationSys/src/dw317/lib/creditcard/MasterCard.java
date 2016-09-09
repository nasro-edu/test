/**
 * 
 */
package dw317.lib.creditcard;

/**
 * @author hnasreddine
 *
 */
public class MasterCard extends AbstractCreditCard {

	public MasterCard(String number) throws IllegalArgumentException
	{	super(CardType.MASTERCARD, validateNumber(number));
	//this.number=number;
	}
	
	public void print () {System.out.println(toString());} 
	
	private   static String validateNumber(String number) throws IllegalArgumentException
	{return  validateLuhnAlgorithm(number);
	}
	
	
}
