/**
 * 
 */

/**
 * @author nasro
 *
 */
public class Cohesion {

}


/*Cohesion 

Cohesion is the degree to which components of a class belong together to fit a particular role. 
What we want to avoid is low cohesion where a class incorporates several different aspects.  
A class that tries to do many things comes with higher maintenance and lower reusability.
*/
/*
  Low cohesion example
*/ 
class Furniture {/* .... */} class Device {/* .... */}

class RoomDawson 
{  int number; int floor; 
    Furniture furn; Device []devices;
    float rentalPrice;
    public void  setDecoration(){/* .... */}
    public void  getMonthlyPrice(){/* .... */}
    public void getRentalReport(){/* .... */}
    
}
/*Cohesion 
What is we want to use the RoomDawson for meeting room, or a lab room or teachin room
what if we want to work with storage room
*/

/*
High cohesion example
*/ 
class Room {}  class ClassRoom {} class RentalRoom {}  class StorageRoom {}

//---------------
// another example
class StaffEntity {
    void getStaffSalary(){/* .... */}
    void getStaffDetails(){/* .... */}
    void getStaffSalesReport(){/* .... */}
}

class Accounts {
    void getStaffSalary(){/* .... */}
    //...
}
class Personnel {
    void getStaffDetails(){/* .... */}
    //...
}
class SalesReporting {
    void getStaffSalesReport(){/* .... */}
    //...
}
