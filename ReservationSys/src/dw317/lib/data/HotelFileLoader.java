/**
 * 
PHASE II - PHASE II - PHASE II - PHASE II - PHASE II - PHASE II - PHASE II - 

Create a utility class called HotelFileLoader 
(with a private no-parameter constructor to prevent instantiation) 
as a member of the groupX.hotel.data package. 
This class will contain a series of static utility methods that can be used to load files 
of various formats (i.e. text sequential and binary files). 

During this phase, we will only be concerned with text sequential files.

 - Code a static getRoomListFromSequentialFile method. 
 The method must have the following method interface 
 (make sure to properly document it using JavaDoc style comments).
	public static Room[] getRoomListFromSequentialFile(String filename) throws IOException

- The Room array returned by the above method must be an array whose size is equal to its 
capacity (i.e. the array must be full to capacity).

- Create a test application as a member of the groupX.hotel.data package in your test source 
folder. 
Execute your test application to ensure that the method functions as expected. 
Create and use files with test data to ensure that you test all conditions including 
incorrect records.


- Add a method in the test application to ensure that the method functions as expected. 
Create and use files with test data to ensure that you test all conditions.
 */
package dw317.lib.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dw317.lib.business.RoomDelegate;

/**
 * @author nasro
 *
 */
public class HotelFileLoader {

	//(with a private no-parameter constructor to prevent instantiation) 
	private HotelFileLoader() {
		// TODO Auto-generated constructor stub
	}
	
	 //static getRoomListFromSequentialFile method. 
	 //The method must have the following method interface 
	 //(make sure to properly document it using JavaDoc style comments).
	//public static Room[] getRoomListFromSequentialFile(String filename) throws IOException

	//- The Room array returned by the above method must be an array whose size is equal to its 
	//capacity (i.e. the array must be full to capacity).
	public static RoomDelegate[] getRoomListFromSequentialFile(String fileName)
		{return null;}

	public static ArrayList getItemListFromSequentialFile(String fileName)
	{return storeDataFromFileintoArr(fileName);}

	public static ArrayList storeDataFromFileintoArr(String fileName)
	{
		ArrayList arrayList = new ArrayList();
	String line = null;
	try{	// FileReader reads text files in the default encoding.
        	FileReader fileReader = new FileReader (fileName);
        	// Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!= null)
            {
            	if(line.trim().length()>0)
            			arrayList.add(line);
            	//System.out.println(line);
            }
            bufferedReader.close();
		}
		catch (FileNotFoundException fex)
			{
			System.out.println("unable to open file:"+fileName);
			}
		catch (IOException ioe)
			{
			System.out.println("error when reading file:"+fileName);
			}
	return arrayList;
	
	}

}	

