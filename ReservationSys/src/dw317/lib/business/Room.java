/**
 * 
 */
package dw317.lib.business;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nasro
 *
The DawsonRoom class - implementing Room interface:
- Room type objects have an int room number and a room type. 
	In order to enforce this business rule, your implementing class is to have 
		a single 2 parameter constructor.
- You must include the following private static variable since Room type objects 
	implement Serializable interface.
	private static final long serialVersionUID = 42031768871L;
- Room-type objects are immutable; we assume that the floor and room configurations 
	cannot be changed on the fly in the hotel.
- The room number is made up of the floor and the number. 
	The floors must be within the range of 1 to 8 inclusive; 
		numbers must be in the range of 01 to 08. Make sure you validate this!
- getFloor returns an int with the floor. If the room number is 801, 
	the floor will be 8 (i.e., hundreds position and above).
- getNumber returns the number of the room on a floor. 
	If the room number is 801, the number will be 1 (i.e., tens position and less).
- Room subclasses must have overridden equals, hashCode, and toString methods. 
	Two Room objects are considered equal if they are of the instanceof the same class 
		and their room number attributes are equal. Recall from 214, 
		that you can’t check for equality with the == operator when comparing object types
- The overridden hashCode method must use the same attributes as those checked by the equals method. 
	Recall that the hashCode’s contract states that two equal objects must have 
		the same hashCode value. 
		Make sure to declare the overridden equals and hashCode as final 
		since you will be checking for instanceof in the equals instead of same class.
- The overridden toString method must return a string formatted as
roomnumber*roomtype
e.g.: 108*normal
- Room type objects must realize the compareTo method. 
	Rooms are naturally ordered by their room number (i.e., floor, followed by number)
- Once you have coded your concrete implementation, 
	create a test application (as a member of a package called groupX.hotel.business 
		in your test folder) in order to test the concrete class.
 */
public final class Room implements RoomDelegate{
/**
- getFloor returns an int with the floor. If the room number is 801, 
	the floor will be 8 (i.e., hundreds position and above).
- getNumber returns the number of the room on a floor. 
	If the room number is 801, the number will be 1 (i.e., tens position and less).
**/
	private static final long serialVersionUID = 42031768871L;
	
	private  final int roomNumber;
	private final RoomType roomType;
	
	public Room(int roomNumber, RoomType roomType) 
		{this.roomNumber=validateRoomNumber(roomNumber); this.roomType = roomType;}
	public Room(Room aRoom) 
	{this.roomNumber=aRoom.roomNumber; this.roomType = aRoom.roomType;}

	private int validateRoomNumber(int roomNumber)
	{	int firstRoom = 101; int lastRoom = 108;
	   List <Integer> roomNumbersArr= new ArrayList <Integer>();
	   for (int i=1 ; i<=8; i++)
		   for (int j=1 ; j<=8; j++)				   
		   roomNumbersArr.add(Integer.parseInt(Integer.toString(i)+"0"+Integer.toString(j)));
		try {
			if ( roomNumbersArr.contains((Integer)roomNumber)) 
				{
					return roomNumber;
				}	
			else throw new IllegalArgumentException ("error in room nber");
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println(" Room Number error - "+iae.getMessage());
		return -1;
		}
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public RoomType getRoomType() {
		return this.roomType;
	}
	@Override
	public int getRoomNumber() {
		return this.roomNumber;
	}
	@Override
	public int getFloor() {
		return (int)(roomNumber / 100);
	}
	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		String number = Integer.toString(roomNumber).substring(1, 3);
		System.out.println("number="+number);
		return  Integer.parseInt(number);
	}

		public String toString()
		{return this.roomNumber+" - " + this.roomType.toString();}
}
