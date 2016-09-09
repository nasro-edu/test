/**
 * 
 */
package dw317.lib.creditcard;

/**
 * @author hnasreddine
 *
 */
public class CreditCardTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MasterCard aCard = new MasterCard ("5592795977256823");
	aCard.print();
	
	VisaCard aCard2 = new VisaCard ("4794992316227503");
	aCard2.print();
	
	AmexCard aCard3 = new AmexCard ("374613352534489");
	aCard3.print();
	}

}
