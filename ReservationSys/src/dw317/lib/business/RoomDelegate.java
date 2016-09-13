/**
 * 
 */
package dw317.lib.business;

import java.io.Serializable;

/**
 * @author nasro
 *
 <<interface>>
Room extends Comparable<Room>, Serializable
+ getRoomType() : RoomType
+ getRoomNumber() : int
+ getFloor() : int
+ getNumber() : int
*/
public interface RoomDelegate extends Comparable, Serializable{

public RoomType getRoomType();
public int getRoomNumber();
public int getFloor();
public int getNumber();


public enum RoomType
		{NORMAL, SUITE, PENTHOUSE;
		public String toString(){return this.name().toLowerCase();}
		}
		
}

