/**
 * @author nasro
 *
 */

/**
 * 
 The HotelFactory interface and the DawsonHotelFactory enum:
In order to decouple the Dawson Hotel actual concrete implementations from the system, 
we will use the Abstract Factory design pattern. 
This will enable us to use the interface of the abstract factory to create specific concrete classes.


Add the following enum to the groupX.hotel.business package.
Note that we use an enum as a mechanism to ensure that only one DawsonHotelFactory object is ever created 
(i.e., the Singleton design pattern). 
There are other ways to ensure singletons. From this point, use the DawsonHotelFactory when you need instances of 
DawsonCustomers, Credit Cards, DawsonRooms, or DawsonReservations!

package groupX.hotel.business;
import dw317.hotel.business.RoomType;
import dw317.hotel.business.interfaces.Customer;
import dw317.hotel.business.interfaces.HotelFactory;
import dw317.hotel.business.interfaces.Reservation;
import dw317.hotel.business.interfaces.Room;
import dw317.lib.creditcard.CreditCard;
public enum DawsonHotelFactory implements HotelFactory {
DAWSON;
@Override
public Customer getCustomerInstance(String firstName, String lastName, String email) {
return new DawsonCustomer(firstName, lastName, email);
}
@Override
public CreditCard getCard(String cardtype, String number) {
return CreditCard.getInstance(
CreditCard.CardType.valueOf(cardtype.toUpperCase()), number);
}
@Override
public Room getRoomInstance(int roomNumber, String roomtype) {
return new DawsonRoom(roomNumber,
RoomType.valueOf(roomtype.toUpperCase()));
}
@Override
420-317-DW Fall 2016
J. Nilakantan, N. Hallam 10/10 Dawson College
public Reservation getReservationInstance(Customer aCustomer, Room aRoom, int inYear, int inMonth, int inDay,
int outYear, int outMonth, int outDay) {
return new DawsonReservation(aCustomer, aRoom, inYear, inMonth, inDay, outYear, outMonth, outDay);
}
}
Create test application (as a member of a package called groupX.clinic.business in your test folder) in order to test the DawsonHotelFactory
*/
package dw317.hotel.business.interfaces;
import java.io.Serializable;

import dw317.lib.Email;
import dw317.lib.business.*;
import dw317.lib.business.RoomDelegate.RoomType;
import dw317.lib.creditcard.CreditCard;
import dw317.lib.creditcard.CreditCard.CardType;

public interface HotelFactory extends Serializable {

	Customer getCustomerInstance(String firstName, String lastName, String email);
	Customer getCustomerInstance(String firstName, String lastName, Email email);
	Customer getCustomerInstance(Customer aCustomer);

	CreditCard getCard(String cardtype, String number);
	static CreditCard getCard(CardType cardtype, String number) {return null;};

	Room getRoomInstance(int roomNumber, String roomtype);
	Room getRoomInstance(int roomNumber, RoomType roomtype);
	Room getRoomInstance(Room aRoom);

	Resrevation getReservationInstance(Customer aCustomer,Room aRoom, int inYear, int inMonth, int inDay,
	int outYear, int outMonth, int outDay);
	Resrevation getReservationInstance(Resrevation aResrevation);
}


