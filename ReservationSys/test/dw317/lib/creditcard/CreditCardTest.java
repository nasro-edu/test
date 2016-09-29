/**
 * 
 */
package dw317.lib.creditcard;
import static java.lang.System.*;

import java.util.Optional;

import dw317.lib.*;
import dw317.lib.business.*;
import dw317.lib.business.RoomDelegate.RoomType;
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
	
	
	Room myRoom = new Room (803,RoomType.NORMAL);
	out.println("floor="+myRoom.getFloor() + " nber="+ myRoom.getNumber() +" RoomNumber="+ myRoom.getRoomNumber() + " Type="+myRoom.getRoomType());
	
	Name cust1Name = new Name("Joe", "Does");
	Name cust2Name = new Name("Jaya", "Pradish");
	
	Email cust1Email = new Email("hello@bro-com");
	Email cust2Email = new Email("hello@Brho-com");
	
	Customer aCust = new Customer (cust1Name, cust1Email, Optional.ofNullable(aCard2));
	System.out.println(aCust.toString());;
	
	Customer aCust2 = new Customer (cust2Name, cust2Email, Optional.ofNullable(aCard));
	System.out.println(aCust2.toString());
	if(aCust.equals(aCust2)) System.out.println("same"); else System.out.println("diff");
	
	}

}
