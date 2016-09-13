/**
 * 
 */
package dw317.lib.business;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import dw317.lib.*;
import dw317.lib.creditcard.*;

/**
 * @author nasro
 *package dw317.lib.business;

<<interface>>
Reservation extends Comparable<Reservation>, Serializable
+ getCustomer(): Customer {must return a deep copy}
+ getRoom() : Room
+ getCheckInDate(): LocalDate
+ getCheckOutDate(): LocalDate
+ getNumberDays() : int*/

public interface ReservationDelagate extends Comparable, Serializable{

	public Customer getCustomer();//:  {must return a deep copy}
	public Room getRoom() ;
	public LocalDate  getCheckInDate();//: LocalDate
	public LocalDate  getCheckOutDate();//: LocalDate
	public int getNumberDays();

}
