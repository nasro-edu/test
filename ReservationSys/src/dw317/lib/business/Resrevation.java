/**
 * @author nasro
 *
The DawsonReservation class - implementing Reservation interface:
- Reservation type objects must have a Customer, a Room, a checkin date and a checkout date. 
	In order to enforce this business rule your implementing class must provide an 8 parameter constructor 
	(i.e. Customer aCustomer, Room aRoom, int inYear, int inMonth, int inDay, int outYear, int outMonth, int outDay).
- The instance customer and room fields must be final.
- You must include data validation. It is sufficient to ensure that the date and times are valid 
	(note that LocalDate objects throw DateTimeExceptions if the date and time arguments are invalid), 
	and that the checkout date is after the checkin date. 
	Throw an IllegalArgumentException with an explanatory message for invalid data. 
	Note that LocalDate objects provide useful methods, such as isBefore and isAfter.
- getCustomer must return a deep copy.
- The getNumberOfDays() method returns the number of days for which the room is reserved. 
	Note that LocalDate class provides useful methods, such as until.
- Reservation types must have overridden equals, hashCode and toString methods.
- Two Reservation type objects are considered equal if their customer, room and checkin and checkout times are equal. 
	Make sure to declare the overridden equals and hashCode as final since you will be checking for instanceof in the equals 
	instead of same class.
- The overridden toString method must return a string formatted as
email*checkinYr*checkinMonth*checkinDay* checkoutYr*checkoutMonth*checkoutDay*roomnumber

- Reservation type objects must implement compareTo. They are naturally ordered by their check in date, followed by room
	Once you have coded your concrete implementation, create test application 
	(as a member of a package called groupX.hotel.business in your test folder) in order to test the concrete class.

 */

package dw317.lib.business;

import java.time.DateTimeException;
import java.time.LocalDate;
//import java.util.Date;

import dw317.lib.Name;

public class Resrevation implements ReservationDelagate{

	private Customer aCustomer;
	private Room aRoom;
	private LocalDate checkin;
	private LocalDate checkout;
	
	public Resrevation( Customer aCustomer, Room aRoom, int inYear, int inMonth, int inDay, int outYear, int outMonth, int outDay) 
		{ this.aCustomer=aCustomer; this.aRoom = aRoom; 
		 this.checkin = LocalDate.parse(Integer.toString(inYear)+"-"+Integer.toString(inMonth)+"-"+Integer.toString(inDay)+"-");
		 this.checkout = LocalDate.parse(Integer.toString(outYear)+"-"+Integer.toString(outMonth)+"-"+Integer.toString(outDay)+"-");
		try{
			if (checkin.isAfter(checkout))
				throw new IllegalArgumentException ("error check in date");
			}
		catch (IllegalArgumentException  iae)
			{
			System.out.println(iae.getMessage());
			}
		catch(DateTimeException dte)
		{
			System.out.println(dte.getMessage());
		}
		}
	
	public Resrevation( Customer aCustomer, Room aRoom, LocalDate checkInDate, LocalDate checkOutDate)
	{ this.aCustomer=aCustomer; this.aRoom = aRoom; 
	 this.checkin = checkInDate;
	 this.checkout = checkOutDate;
	try{
		if (checkin.isAfter(checkout))
			throw new IllegalArgumentException ("error check in date");
		}
	catch (IllegalArgumentException  iae)
		{
		System.out.println(iae.getMessage());
		}
	catch(DateTimeException dte)
	{
		System.out.println(dte.getMessage());
	}

	}
	public Resrevation( Resrevation aResrevation) 
	{ this.aCustomer=aResrevation.aCustomer; this.aRoom = aResrevation.aRoom; 
	this.checkin = aResrevation.checkin;
	 this.checkout =aResrevation.checkout; 
	}
	
	 @Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		Customer asCust = new Customer (this.aCustomer.getName(), this.aCustomer.getEmail(), this.aCustomer.getCreditCard());
		return asCust ;
		
		}

	@Override
	public Room getRoom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate getCheckInDate() {
		// TODO Auto-generated method stub
		return this.checkin;
	}

	@Override
	public LocalDate getCheckOutDate() {
		// TODO Auto-generated method stub
		return this.checkout;
	}

	@Override
	public int getNumberDays() {
		// TODO Auto-generated method stub
		return 0;
	}

}
