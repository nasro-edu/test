/**
 * 
 */
package dw317.lib.creditcard;
import static java.lang.System.*;
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

		MasterCard aCard = new MasterCard ("4556737586899855");
		out.println(aCard.validateLuhnAlgorithm("4556737586899855"));
	aCard.print();
	
	VisaCard aCard2 = new VisaCard ("4556737586899855");
	aCard2.print();
	
	AmexCard aCard3 = new AmexCard ("374613352534489");
	aCard3.print();
	}

}
