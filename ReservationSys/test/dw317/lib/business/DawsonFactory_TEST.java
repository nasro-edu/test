/**
 * 
 */
package dw317.lib.business;

import static java.lang.System.out;

import java.time.LocalDate;
import java.util.*;

import dw317.hotel.business.interfaces.HotelFactory;
import dw317.lib.Email;
import dw317.lib.Name;
import dw317.lib.business.RoomDelegate.RoomType;
import dw317.lib.creditcard.*;

/**
 * @author nasro
 *
 */

public class DawsonFactory_TEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List <HotelFactory> hotelFactories = new ArrayList <HotelFactory>();
	hotelFactories.addAll(Arrays.asList(DawsonHotelFactory.values()));
	
	LocalDate checkInDate, checkOutDate;
	checkInDate = setCheckInDates();//enterDate("enter the check in date (year/month/day):");
	checkOutDate = setCheckOutDates();//enterDate("enter the check in date (year/month/day):");
	
	DawsonHotelFactory enumDawsonHotel = null;
	
	AmexCard aCard1 = new AmexCard ("374613352534489");
	VisaCard aCard2 = new VisaCard ("444413352534489");
	//aCard1.print();
	
	
	Room room1 = new Room (803,RoomType.NORMAL);
	Room room2 = new Room (504,RoomType.PENTHOUSE);
	//out.println("floor="+myRoom.getFloor() + " nber="+ myRoom.getNumber() +" RoomNumber="+ myRoom.getRoomNumber() + " Type="+myRoom.getRoomType());
	
	Name cust1Name = new Name("Joe", "Does");
	Name cust2Name = new Name("Jaya", "Pradish");
	Email cust1Email = new Email("JoeDoe@dawson.com");
	Email cust2Email = new Email("jaya.pradish@vanier.com");
	
	Customer aCust1 = new Customer (cust1Name, cust1Email, aCard1);
	Customer aCust2 = new Customer (cust2Name, cust2Email, aCard2);
	
	Resrevation aReservation1 = new Resrevation(aCust1,room1,checkInDate, checkOutDate);
	Resrevation aReservation2 = new Resrevation(aCust2,room2,checkInDate, checkOutDate);
	
	List <DawsonHotel> dawsonHotelsList = new ArrayList<DawsonHotel>();
	
	DawsonHotel dawsonHotel1= new DawsonHotel(enumDawsonHotel.DAWSON, aCust1, room1, aReservation1);
	DawsonHotel dawsonHotel2= new DawsonHotel(enumDawsonHotel.DAWSON, aCust2, room2, aReservation2);
	
	dawsonHotelsList.add(dawsonHotel1);
	dawsonHotelsList.add(dawsonHotel2);
	
	dawsonHotelsList.forEach(elem->out.println(elem));
	
	
	}

	public static LocalDate setCheckInDates()
	{return LocalDate.of(2016,8,24);}
	public static LocalDate setCheckOutDates()
	{return LocalDate.of(2016,8,13);}
	
public static LocalDate enterDate (String dateLabel)
{	Scanner scanner = new Scanner(System.in);
	int inYear, inMonth, inDay, outYear, outMonth, outDay;
	out.println(dateLabel);//"enter the check in date (year/month/day):");
	out.println("enter year:"); inYear = scanner.nextInt();
	out.println("enter month:"); inMonth= scanner.nextInt();
	out.println("enter day:"); inDay = scanner.nextInt();
	
	LocalDate aLOLcalDate = LocalDate.of(inYear,inMonth,inDay);
	return aLOLcalDate;

}
}
class DawsonHotel
{
	private 	DawsonHotelFactory enumDawsonHotel;
	private 	Customer aCustomer;
	private 	Room aRoom;
	private 	Resrevation aReservation;
	
	public DawsonHotel (DawsonHotelFactory enumDawsonHotel, Customer aCustomer, Room aRoom, Resrevation aReservation)
	{
		initData(enumDawsonHotel, aCustomer, aRoom,aReservation);
	}
	
	public void initData(DawsonHotelFactory enumDawsonHotel, Customer aCustomer, Room aRoom, Resrevation aReservation)
	{this.enumDawsonHotel = enumDawsonHotel;
	this.aCustomer = enumDawsonHotel.getCustomerInstance(aCustomer);
	this.aRoom= enumDawsonHotel.getRoomInstance(aRoom);
	this.aReservation= enumDawsonHotel.getReservationInstance(aReservation);
	}
	public String toString()
	{String frameStr = "\n -------------------------\n";
	 String leadTabs= "\n\t\t";	
		return 
	frameStr+ enumDawsonHotel.getCustomerInstance(aCustomer).toString() + "/n"
	+ leadTabs+ enumDawsonHotel.getRoomInstance(aRoom).toString()
	+ leadTabs+ enumDawsonHotel.getReservationInstance(aReservation).getCheckInDate()
	+ leadTabs+ enumDawsonHotel.getReservationInstance(aReservation).getCheckOutDate();
	}

}