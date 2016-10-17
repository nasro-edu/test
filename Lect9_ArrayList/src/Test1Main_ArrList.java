import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import dw317.lib.BookSample;

public class Test1Main_ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arrayList_TestAssign();
		
		
		arrayList_StringTest();
		
		arrayList_IntegerTest();
		arrayList_BookSampleTest();
		
		
		

	}
	//---------------------------
	public static void arrayList_StringTest()
	{
		System.out.println("------citiesList Testing ---------------------------------------------");
		//noraml array
				String anArray[]= new String[3];
				anArray[0]="Paris"; anArray[1]="NewYork";anArray[2]="Tokyo";
				//anArray[3]="Berlin"; // array length are fixed at the time of creation - ArrayIndexOutOfBoundsException: 3
		
		//Arraylist  the size is dynamic
		
		ArrayList<String> citiesList= new ArrayList();
		System.out.println("list contain:"+citiesList.size()+" element(s)");
		
		String listSeparator=", ", col_Line="line";
		String mainMessage = "\n------adding Montreal to the ArrayList :";
		//adding elements
		citiesList.add("Montreal");		
		displayListString(citiesList,listSeparator,col_Line, mainMessage);		
		
		//we can inject an array in an arraylist.
		mainMessage = "\n------after adding all elements of anArray to citiesList:";
		citiesList.addAll(Arrays.asList(anArray));
		displayListString(citiesList,listSeparator, col_Line, mainMessage);
		
		//removing an element using its index		
		mainMessage = "\n------after removing element in position 1 from citiesList:";
		citiesList.remove(1);
		displayListString(citiesList,listSeparator, col_Line, mainMessage);

		//removing an element using its index
		mainMessage = "\n------after removing element in position 1 from citiesList:";
		int index = 8;
		if (index>=0 && index<citiesList.size())	
				citiesList.remove(index);
		displayListString(citiesList,listSeparator, col_Line, mainMessage);

		//removing an element using the object
		mainMessage = "\n------after removing paris from citiesList:";
		citiesList.remove("Paris");
		displayListString(citiesList,listSeparator, col_Line, mainMessage);
		
		//inserting inside the arraylist
		mainMessage = "\n------after adding 'new coty' to citiesList:";
		citiesList.add(1, "new City");
		displayListString(citiesList,listSeparator, col_Line, mainMessage);

		System.out.println("------End of test ---------------------------------------------\n");
	}
	//-----------------------------------
	public static void arrayList_IntegerTest()
	{
		//noraml array
		Random rand = new Random();
		
		int anArray[]= {rand.nextInt(10),rand.nextInt(10), rand.nextInt(10)};
		System.out.println("\n------creating an array 'anArray' of 3 simple random integers :");
		for (int i:anArray) System.out.print(i+", ");		
		//Arraylist  the size is dynamic

		//ArrayList<int> intList= new ArrayList();
		ArrayList<Integer> intList= new ArrayList();
		String mainMessage = "\n------creating an ArrayList initially empty :";
		System.out.println("\n list contain:"+intList.size()+" element(s)");
		
		String listSeparator=", ", col_Line="line";
		//adding elements
		intList.add(42);
		mainMessage = "\n------after inserting 42 into the ArrayList :";		
		displayList_(intList,"","line", mainMessage);		
		//add array elements in an arraylist.
		for(int i: anArray) intList.add(i);
		displayList_(intList,listSeparator, col_Line, mainMessage);
		
		//removing an element using its index		
		intList.remove(1);
		mainMessage = "\n------after removing element in poistion 1:";		
		displayList_(intList,listSeparator, col_Line, mainMessage );

		//removing an element using its index
		int index = 8;
		//if (index>=0 && index<citiesList.size())	
		//		citiesList.remove(index);
		//displayList_(intList,listSeparator, col_Line);

		//removing an element using the object
		intList.remove(intList.get(intList.size()-2));
		mainMessage = "\n------after removing element in position 'second last':";		
		displayList_(intList,listSeparator, col_Line, mainMessage );
		
		//inserting inside the arraylist
		intList.add(1, 124);
		mainMessage = "\n------after inserting 124 in position 1:";		
		displayList_(intList,listSeparator, col_Line, mainMessage );		
	}
	//-----------------------------------
	//-----------------------------------
		public static void arrayList_BookSampleTest()
		{
			//noraml array
			ArrayList <BookSample> bookList = new ArrayList<>();
			BookSample b1, b2, b3;
			b1 = new BookSample("0534420123","title 1", "peter","Hello java",123,2010,43.5);
			b2 = new BookSample("0534420124","title 2","smith","Bye java",321,2011,53.5);
			b3 = new BookSample("0321456787","title 3","jennifer","C ++",241,2016,15.5);
			
			bookList.add(b1);	bookList.add(b2);	bookList.add(b3);

			String listSeparator=", ", col_Line="line";
			String mainMessage = "\n------after adding 3 books into the ArrayList :";		
			displayListBookSample(bookList,listSeparator,col_Line, mainMessage);		
						
			//removing an element using its index		
			bookList.remove(1);
			mainMessage = "\n------after removing element in poistion 1:";		
			displayListBookSample(bookList,listSeparator, col_Line, mainMessage );

			//removing an element using the object
			bookList.remove(bookList.get(bookList.size()-2));
			mainMessage = "\n------after removing element in position 'second last':";		
			displayList_(bookList,listSeparator, col_Line, mainMessage );
			
		}
		//-----------------------------------
public static void displayListString(ArrayList <String>arrList, String listSeparator, String col_Line, String mainMessage)
	{	System.out.println(mainMessage);		
String outputStr = ""; String newLine="";
	if(col_Line=="col") newLine="\n";
	outputStr = "List("+arrList.size()+")[["+newLine;
		for (String elem: arrList)
			outputStr += elem+listSeparator+newLine;
	if(outputStr.length()>1) outputStr= outputStr.substring(0, outputStr.length()-2)+"]]";
	System.out.println(outputStr);
	}
//-----------------------------------
public  void displayListInteger(ArrayList <Integer> arrList, String listSeparator, String col_Line, String mainMessage)
{
	System.out.println(mainMessage);		
String outputStr = ""; String newLine="";
if(col_Line=="col") newLine="\n";
outputStr = "List("+arrList.size()+")[["+newLine;
for (Integer elem: arrList)
	outputStr += elem+listSeparator+newLine;
if(outputStr.length()>1) outputStr= outputStr.substring(0, outputStr.length()-2)+"]]";
System.out.println(outputStr);
}
//-----------------------------------
public static void displayListBookSample(ArrayList <BookSample>arrList, String listSeparator, String col_Line, String mainMessage)
{
	System.out.println(mainMessage);		
String outputStr = ""; String newLine="";
if(col_Line=="col") newLine="\n";
outputStr = "List("+arrList.size()+")[["+newLine;
for (BookSample elem: arrList)
	outputStr += elem+listSeparator+newLine;
if(outputStr.length()>1) outputStr= outputStr.substring(0, outputStr.length()-2)+"]]";
System.out.println(outputStr);
}
//------------------------
public static <T> void displayList_(ArrayList<T> arrList, String listSeparator, String col_Line, String mainMessage)
{
	System.out.println(mainMessage);		

String outputStr = ""; String newLine="";
if(col_Line=="col") newLine="\n";
outputStr = "List("+arrList.size()+")[["+newLine;
	for (T elem: arrList)
		outputStr += elem+listSeparator+newLine;
if(outputStr.length()>1) outputStr= outputStr.substring(0, outputStr.length()-2)+"]]";
System.out.println(outputStr);
}
//----------------
public static void arrayList_TestAssign()
	{
	String[] lis1 = {"Matt", "Sam", "Ali"};
	ArrayList <String> list1 = new ArrayList<>(Arrays.asList(lis1));
	String listSeparator=", ", col_Line="line";
	String mainMessage = "------Content of list 1:";
	displayListString(list1,listSeparator,col_Line, mainMessage);	

	//copy reference
	ArrayList <String> list2 = list1;
	 mainMessage = "------Content of list 2:";
	 list1.set(1, "Jerry");
	displayListString(list2,listSeparator,col_Line, mainMessage);	

	//cloning list 
		ArrayList <String> list3 = new ArrayList<>(list1);
		 mainMessage = "------Content of list 3 (clone):";
		 list3.set(1, "now");
		displayListString(list3 ,listSeparator,col_Line, mainMessage);	
		displayListString(list1 ,listSeparator,col_Line, mainMessage);	

	
	}


}

