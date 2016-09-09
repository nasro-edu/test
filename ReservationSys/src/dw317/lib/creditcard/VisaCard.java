/**
 * 
 */
package dw317.lib.creditcard;

import dw317.lib.creditcard.CreditCard.CardType;

/**
 * @author hnasreddine
 *
 */
public final class VisaCard extends AbstractCreditCard{

	/**
	 * 
	 */
	public VisaCard(String number) throws IllegalArgumentException
	{	super(CardType.VISA, validateNumber(number));
	//this.number=number;
	}
	
	public void print () {System.out.println(toString());} 
	
	private   static String validateNumber(String number) throws IllegalArgumentException
	{return  validateLuhnAlgorithm(number);
	}
}
