/**
 * 
 */
package dw317.lib.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dw317.lib.*;
import dw317.lib.business.Customer;
import dw317.lib.creditcard.AmexCard;
import dw317.lib.creditcard.CreditCard;
import dw317.lib.creditcard.MasterCard;
import dw317.lib.creditcard.VisaCard;

/**
 * @author nasro
 *
 */
public class HotelFileLoader_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String pathToDatFiles =  "D:\\0tem_DawsonColg\\java317\\ReservationSys\\src\\dw317\\lib\\data\\";
		String pathToDatFiles =  "D:\\0tem_DawsonColg\\java317\\ReservationSys\\dataFiles\\";
		String reservFileName  = pathToDatFiles+"reservationsACDV.txt";
		String custFileName  =pathToDatFiles+"customerACDV.txt";
		String roomFileName  =pathToDatFiles+"Rooms.txt";
		
		
		HotelFileLoader hotelFileLoader =new HotelFileLoader();
		
		List  <String> customerList = new ArrayList ();
		customerList  = hotelFileLoader.getItemListFromSequentialFile(custFileName);
		System.out.println(customerList .toString());
		List <Customer> customerObjList = new ArrayList <Customer>();
		
		for(String elem: customerList)
			{
			//System.out.println(elem);
			String[] tmpArr= elem.split("\\*");
			Email email= new Email(tmpArr[0]);
			Name name= new Name(tmpArr[1], tmpArr[2]);
			CreditCard card = null;
			if(tmpArr.length>3 && tmpArr[3]!=null)
			{ 
				switch(tmpArr[3].toUpperCase())
				{	case "MASTERCARD":
						card =  new MasterCard(tmpArr[4]);
						break;
					case "VISA":
						card =  new VisaCard(tmpArr[4]);
						break;
					case "AMEX":
						card = new AmexCard(tmpArr[4]);
					}
			}//if
			Customer custObj = new Customer(name, email, card);
			customerObjList.add(custObj);
			}
		
		//SORTING
		//Collections.sort(customerList );
		System.out.println(customerObjList .toString());

		Collections.sort(customerObjList);
		System.out.println(customerObjList .toString());
		// Sorting
		//hotelFileLoader .readFromFile(fileName3);
		
	}

}
