import java.util.ArrayList;
import java.util.Date;

import dw317.lib.BookSample;

/**
 * 
 */

/**
 * @author nasro
 *
 */
public class Test1_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//test1DetectErrorRunTime();
		
		ArrayList arrList = new ArrayList<>();
		arrList.add(25);
		arrList.add("Hello"); 		arrList.add("test");

		String listSeparator=" # ", col_Line="line", mainMessage=" Testing ArrayList without generic type";
		System.out.println(arrList);
		//displayListString(arrList, listSeparator, col_Line, mainMessage);

		//compare this one (generic type) with the earlier one (raw type). 
		ArrayList <Integer>arrList1 = new ArrayList<>();
		arrList1.add(15);
		

	}
	//-----------------------------------
	public static void test1DetectErrorRunTime()
	{
		Comparable <Date> date1 = new Date();
		BookSample book1 = new BookSample();
		//int result = date1.compareTo(book1);
		
	}
	//-----------------------------------
public static void displayListString(ArrayList arrList, String listSeparator, String col_Line, String mainMessage)
{	System.out.println(mainMessage);		
String outputStr = ""; String newLine="";
if(col_Line=="col") newLine="\n";
outputStr = "List("+arrList.size()+")[["+newLine;
	for (Object elem: arrList)
		outputStr += elem+listSeparator+newLine;
if(outputStr.length()>1) outputStr= outputStr.substring(0, outputStr.length()-2)+"]]";
System.out.println(outputStr);
}
//-----------------------------------

}
