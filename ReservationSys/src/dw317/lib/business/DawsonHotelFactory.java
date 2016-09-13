package dw317.lib.business;

import dw317.hotel.business.interfaces.HotelFactory;
import dw317.lib.Email;
import dw317.lib.business.RoomDelegate.RoomType;
import dw317.lib.creditcard.AbstractCreditCard;
import dw317.lib.creditcard.CreditCard;
import dw317.lib.creditcard.CreditCard.CardType;

@SuppressWarnings("unused")
public enum DawsonHotelFactory implements HotelFactory {
	DAWSON;

	@Override
	public Customer getCustomerInstance(String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Customer getCustomerInstance(String firstName, String lastName, Email email) {
		// TODO Auto-generated method stub
		return new Customer(firstName, lastName, email);
	}

	@Override
	public Customer getCustomerInstance(Customer aCustomer) {
		// TODO Auto-generated method stub
		return new Customer(aCustomer); //return null;
	}
	@Override
	public CreditCard getCard(String cardtype, String number) {
		// TODO Auto-generated method stub
		return null;
		//return new CreditCard.getInstance(CreditCard.CardType.valueOf(cardtype), number);
	}
	//@Override
	//public CreditCard getCard(CardType cardtype, String number) {
		//return new CreditCard.getInstance (CreditCard.CardType.MASTERCARD, number);
	//}

	

	@Override
	public Resrevation getReservationInstance(Customer aCustomer, Room aRoom, int inYear, int inMonth, int inDay,
			int outYear, int outMonth, int outDay) {
		// TODO Auto-generated method stub
		return new Resrevation(aCustomer, aRoom, inYear, inMonth, inDay, outYear, outMonth, outDay);
	}
	@Override
	public Resrevation getReservationInstance(Resrevation aResrevation)
	 {
		// TODO Auto-generated method stub
		return new Resrevation(aResrevation);
	}
	
	@Override
	public Room getRoomInstance(int roomNumber, String roomtype) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Room getRoomInstance(int roomNumber, RoomType roomType) {
		// TODO Auto-generated method stub
		return new Room (roomNumber, roomType);
	}
	@Override
	public Room getRoomInstance(Room aRoom){
		// TODO Auto-generated method stub
		return new Room (aRoom);
	}
	
}
