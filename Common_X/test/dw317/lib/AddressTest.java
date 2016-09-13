/**
 * 
 */
package dw317.lib;
import static java.lang.System.out;

import java.util.*;
/**
 * @author nasro
 *
 */
public class AddressTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		testTheThreeParameterConstructor();
	}

	public static void testTheThreeParameterConstructor() {
		out.println("\nTesting the three parameter constructor.");
		testTheThreeParameterConstructor(
			"Case 1 - Valid data (3040 Sherbrooke Westmount)", "3040",
				"Sherbrooke", "Westmount", true);
		testTheThreeParameterConstructor(
				"Case 2 - Invalid data – empty civicNumber ( Sherbrooke Westmount)","",
					"Sherbrooke","Westmount", false);

		testTheThreeParameterConstructor(
				"Case 8 - Invalid data – null civicNumber (null Sherbrooke Westmount)",
						null,"Sherbrooke","Westmount",false);
		//-setp 4
		testGetCivicNumber();
		//-step 5
		testSetCivicNumber();
		// --- testing Name class
		
		Name myName = new Name("Nasr-eddine", "Hall'am");
		
		Name hisName = new Name("Leo", "Messi");
		//out.println("My Name is :"+ myName);
		Address theAddress = new Address("196", "Parc", "Montreal");
		
		Person me = new Person (myName,theAddress);
	   out.println("my info ="+me);
	   
	   Email myEmail = new Email("hello@bro-com");
	   Email myEmail1 = new Email("Za@ams.com");
	   Email myEmail2 = new Email("aell@break.com");
	   Email myEmail3 = new Email("dimitr@break.com");
	   Email myEmail4 = new Email("raj@micro.com");
	   Email myEmail5 = new Email("Suzan@dawson.com");
	   
	   List <Email> emails = new ArrayList <Email> ();
	   emails.add(0, myEmail);
	   emails.add(1, myEmail1);
	   emails.add(2, myEmail2);emails.add(3, myEmail3);
	   emails.add(4, myEmail4);emails.add(5, myEmail5);
	   
	   out.println(" --------before sorting ,,,");
	   emails.forEach(email->System.out.println(email));
	   Collections.sort(emails);//emails.sort(null);
	   out.println(" --------after sorting ,,,");
	   emails.forEach(email->System.out.println(email));
	   out.println("compare email with emuk 2  ="+myEmail.compareTo(myEmail2));
	   
	   out.println("my emila  ="+myEmail);
	   Person he = new Person(me);
	   he.setFullName(hisName);
	   out.println("my info ="+he);
	}

	private static void testTheThreeParameterConstructor(String testCase,
			String civicNumber, String streetName, String city,
				boolean expectValid) {

			out.println("   " + testCase);

			try {
				Address theAddress = new Address(civicNumber, streetName, city);
				out.print("\tThe Address instance was created: " + theAddress);
			
				if (!expectValid)
					out.print("  Error! Expected Invalid. ==== FAILED TEST ====");
			}
			catch (IllegalArgumentException iae)	{
				out.print("\t"+ iae.getMessage());
				if (expectValid)
					out.print("  Error! Expected Valid. ==== FAILED TEST ====");
			}
			catch (Exception e) {
				out.print("\tUNEXPECTED EXCEPTION TYPE! " + e.getClass() +  " "  + 					e.getMessage() + " ==== FAILED TEST ====");
				if (expectValid)
					out.print(" Expected Valid.");
			}

			out.println("\n");
		}
//------step 4
	public static void testGetCivicNumber()
	{
		out.println("\nTesting the getCivicNumber method.");
		testGetCivicNumber("Case 1: 3040 without leading/trailing spaces",
				"3040","3040");
		testGetCivicNumber("Case 2: 3040 with leading/trailing spaces",
				"    3040    ","3040");
	}
	
	private static void testGetCivicNumber(String testCase, 
			String civicNumber, String expectedCivicNumber)
	{
		out.println("   " + testCase);
		Address theAddress = 
				new Address (civicNumber, "Sherbrooke","Westmount");
		out.print("\tThe Address instance was created: " + theAddress);

		if (!theAddress.getCivicNumber().equals(expectedCivicNumber))
			out.print("  Error! Expected Invalid. ==== FAILED TEST ====");

		out.println("\n");
	}
//------step 5
	public static void testSetCivicNumber() {
		out.println("\nTesting the setCivicNumber method.");
		testSetCivicNumber("Case 1: Valid - 2086 without leading/trailing spaces",
				"2086","2086",true);
		testSetCivicNumber("Case 2: Invalid null civic number",
				null,"",false);
	}
	
	private static void testSetCivicNumber(String testCase, 
			String civicNumber, String expectedCivicNumber,boolean expectValid){
		out.println("   " + testCase);
		Address theAddress = 
				new Address ("3040", "Sherbrooke","Westmount");
		try {
			theAddress.setCivicNumber(civicNumber);
			out.print("\tThe Address instance was created: " + theAddress);
			
			if (!theAddress.getCivicNumber().equals(expectedCivicNumber))
				out.print("  Error! Expected Invalid. ==== FAILED TEST ====");
		}
		catch (IllegalArgumentException iae) {
			out.print("\t"+ iae.getMessage());
			if (expectValid)
				out.print("  Error! Expected Valid. ==== FAILED TEST ====");
		}
		catch (Exception e) {
			out.print("\tUNEXPECTED EXCEPTION TYPE! " + e.getClass() + " " +
					e.getMessage() + " ==== FAILED TEST ====");
			if (expectValid)
				out.print(" Expected Valid.");
		}

		out.println("\n");
	}

}



