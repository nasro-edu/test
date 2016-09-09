/**
 * 
 */
package dw317.lib.creditcard;

import dw317.lib.creditcard.CreditCard.CardType;

/**
 * @author hnasreddine
 *
 */
public final class AmexCard extends AbstractCreditCard{

	/**
	 * 
	 */
	public AmexCard(String number) throws IllegalArgumentException
	{	super(CardType.AMEX, validateNumber(number));
	//this.number=number;
	}
	
	public void print () {System.out.println(toString());} 
	
	private   static String validateNumber(String number) throws IllegalArgumentException
	{return  validateLuhnAlgorithm(number);
	}

}
