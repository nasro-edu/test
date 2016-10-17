/**
 * 
 */
package dw317.lib;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author nasro
 *
 */
public class Test2Main_ListUtilities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isbn; title; author; genre, nber pages, year, price;
		Integer[] intArr1= {2,4,8,9,13};
		Integer[] intArr2= {3,6,7,9,11,13,14};
		
		ArrayList <Integer> arrLIstInt1 = new ArrayList<>(Arrays.asList(intArr1));
		ArrayList <Integer> arrLIstInt2 = new ArrayList<>(Arrays.asList(intArr2));

		ArrayList<ArrayList> arrLIstInt3 = ListUtilities.merge2ArrayLists(arrLIstInt1, arrLIstInt2);
		ListUtilities.displayList(arrLIstInt1,"line");
		ListUtilities.displayList(arrLIstInt2,"line");
		ListUtilities.displayList(arrLIstInt3,"line");
		
		File fileHandle= new File("dataFileTest/test1.txt");
		ListUtilities.saveList2TextFile(fileHandle,arrLIstInt3);
		
		String []lineBookInfo= 
			{"	0534420123}::{	title 1}::{  peter}::{  Hello java}::{123}::{2010}::{43.5",
			"0534420124}::{title 2  }::{ smith }::{  Bye java}::{321}::{2011}::{ 53.5",
			"0321456787}::{title 3  }::{ jennifer }::{  C ++}::{241}::{2016}::{ 15.5"};
		ArrayList <String> bookArrLIstStr = new ArrayList<>(Arrays.asList(lineBookInfo));
		ListUtilities.displayList(bookArrLIstStr,"col");

		ArrayList <BookSample> bookArrLIstObj = new ArrayList<>();
		
		stringLine2Object(lineBookInfo, bookArrLIstObj, "\\}::\\{");
		ListUtilities.displayList(bookArrLIstObj,"col");
		ListUtilities.sortList(bookArrLIstObj,"desc");
		ListUtilities.displayList(bookArrLIstObj,"col");
		
		ListUtilities.saveList2TextFile(fileHandle,bookArrLIstObj);
		
			
	}
//--------------------------------
	public static void stringLine2Object(String []lineBookInfo, ArrayList <BookSample> bookArrLIstObj, String regex)
	{
		ArrayList <BookSample> aBookArrLIstObj = new ArrayList<>();
		String isbn, title,author,genre; 
		int  nberPages, year; double  price;
		String []tokensArr;
		for (String elem:lineBookInfo)
			{
			tokensArr = elem.split(regex);
			if(tokensArr.length<7) System.err.println("error in line:"+elem);
			isbn = tokensArr[0].trim(); title = tokensArr[1].trim();  author = tokensArr[2].trim(); genre= tokensArr[3].trim();  
			nberPages= Integer.parseInt(tokensArr[4].trim());  year= Integer.parseInt(tokensArr[5].trim());  
			price = Double.parseDouble(tokensArr[6].trim()); 

			bookArrLIstObj.add(new BookSample(isbn, title, author, genre, year, nberPages, price));
			}

	}
}
