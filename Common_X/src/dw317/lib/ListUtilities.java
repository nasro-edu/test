/**
 * 
 */
package dw317.lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author nasro
 *
 */
public class  ListUtilities <T>{
	
	private ListUtilities() {}
	
	public static <T> void saveList2TextFile(File fileHandle, ArrayList <T>  list)
	{	PrintWriter outputFile;
		try {
			outputFile = new PrintWriter(fileHandle);
			for (T elem:list)
			{
				outputFile.println(elem);
			}
			outputFile.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	
	}
//-------------------
	public static <T> ArrayList <String> loadTextFile2List(File fileHandle)
		{
		ArrayList <String> list =null;
		Scanner inputFile;
		try {
			inputFile = new Scanner(fileHandle);
			while (inputFile.hasNext())
			{
				list.add( inputFile.nextLine());
			}
			inputFile.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		}
	//-----------------------------------------
	//display
		public   static <T> void displayList(ArrayList<T> aList, String line_col)
		{String newLine="";
		if (line_col.toLowerCase()=="col")  newLine="\n";		
			String outputStr = "";  String listSepart=" || "+newLine;
		outputStr = "List(size:"+aList.size()+")["+newLine;
			for (int i=0; i<aList.size(); i++)
				outputStr += "("+aList.get(i)+")"+listSepart;
		if(outputStr.length()>1) outputStr= outputStr.substring(0, outputStr.length()-listSepart.length())+"]]";
		System.out.println(outputStr);
		}
	//-----------------------------------------
	public static <T> void sortList(ArrayList <T> list, String asc_desc)
	{
		int factor=1;
		if (asc_desc.toLowerCase()=="desc") factor=-1;
		T maxObj ; int maxIndex=0;
		for (int i=0; i<list.size()-1; i++)
		{	maxObj = list.get(i); maxIndex = i;
			for (int j=i+1; j<list.size(); j++)
			{
				if(((Comparable<T>) list.get(j)).compareTo(maxObj)*factor>0)
							maxIndex = j;
			}
			//== swapping
			T temp = list.get(i);
			list.set(i, list.get(maxIndex));
			list.set(maxIndex, temp);
		}
	}
	//----------------------------------------------------------------------
	public static <T> ArrayList <ArrayList> merge2ArrayLists(ArrayList <T> list1, ArrayList <T> list2)
	{
		ArrayList <ArrayList> list2D = new  ArrayList <ArrayList>();
		ArrayList <T> list3=new ArrayList<>();
		ArrayList <T> listDuplicates=new ArrayList<>();
		int size1= list1.size() 	, 	size2= list2.size();
		int i, index1=0, index2= 0;
		
		while ((index1<size1 &&  index2<size2 ) )
				{
					T elem1= list1.get(index1);
					T elem2= list2.get(index2);
					if(((Comparable<T>) elem1).compareTo(elem2) >0)
							{list3.add(elem2); index2++;}
					else if(((Comparable<T>) elem1).compareTo(elem2) <0)
						{list3.add(elem1); index1++;}
					else {list3.add(elem1); listDuplicates.add(elem1);index1++;index2++;}
				}
			//if you done from the loop, copy the rest
			if(index1<size1) 
				for (i=index1; i<size1; i++)
					list3.add(list1.get(i));
			if(index2<size2) 
				for (i=index2; i<size2; i++)
					list3.add(list2.get(i));
			
			list2D.add(list3); 
			list2D.add(listDuplicates);
			return list2D;
	}
}
