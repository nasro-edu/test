package Abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2Main_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Book  book1 = new Book(100, "Peter", 41.25, "123456", "how to java", 0.15);
	Book  book2 = new Book(200, "Carl", 43.25, "321466", "how to C++", 0.15);
	NewsPaper news1 = new NewsPaper(30, "NY Times", 1.5, "01220", "NY Publisher", 0.17);
	
	Book  book3 = new Book(100, "Peter", 102.25, "123456", "how to java", 0.15);
	NewsPaper news2 = new NewsPaper(20, "la Gazette", 1.5, "03320", "Gazette Publisher", 0.17);
	NewsPaper news3 = new NewsPaper(15, "Le Monde", 2.5, "103320", "le monde Publisher", 0.18);
	Book  book4 = new Book(80, "Peter", 13.25, "778899", "how to relax", 0.19);
	Book  book5 = new Book(100, "Peter", 25.25, "335544", "dont talk", 0.13);
	
	Publication onlyBooksArr [] = new Publication[5];  int index=0;
	onlyBooksArr [index++] = book1; onlyBooksArr [index++] = book2; onlyBooksArr [index++] = book3;
	onlyBooksArr [index++] = book4; onlyBooksArr [index++] = book5;
	// put all thes pub in a tempArr
	Publication tempArray []= new Publication[8];  index=0;
	tempArray [index++] = book1;  tempArray [index++] = book2;  tempArray [index++] = news1;  tempArray [index++] = book3;
	tempArray [index++] = news2;  tempArray [index++] = news3;  tempArray [index++] = book4;  tempArray [index] = book5;
	
	//displayPublications(tempArray);
	
	// we want a random array of publications so that we do not know which 
	// particular publication is in an element of arrary publicationArray.
	// so when you write publicationArray[i].
	Publication publicationArray []= new Publication[8]; 
	Random rand = new Random ();
	int tossNber;
	for (int i=0; i<8; i++ )
	{
		tossNber = rand.nextInt(8);  // generate randoms between 0 and 8
		//System.out.println("tossNber="+tossNber);
		
		publicationArray [i]= tempArray[tossNber]; 
		// can you get the price? yes. This is polymorphism using overriding.(late binding)
		// multiple objects 
		System.out.println("price ="+publicationArray [i].getPrice());
		//can you display isbn of the book? we dont know 
		//System.out.println("price ="+publicationArray [i].getIsbn());
		//what do we need to do to correct compilation error?
		//System.out.println("price ="+((Book) publicationArray [i]).getIsbn());
		// is the above downcasting safe? no it is not.
		// we need to be carful, how ? we use instance of
		if ( publicationArray [i] instanceof Book)
			System.out.println("ISBN ="+((Book) publicationArray [i]).getIsbn());
	}
	displayPublications(publicationArray);
	System.out.println(" after sorting books only ");
	
	Publication[]  sortedBooks = sortBooks(onlyBooksArr);
	displayPublications(sortedBooks);
	
	}
//--------------------------------------------------------------------	
	public static void displayPublications(Publication pubArr[])
	{
		for (Publication publ : pubArr)
		{
			System.out.println(publ.toString());
			if(publ instanceof Book) ((Book) publ).getIsbn();
		}
	}

	//-------------------------------------------------------------------
// sort books according to neberPages, and if number pages is the same, use price.
//a book is bigger that another book if nberPage is bigger
// if they have the same pages, then the price decides whihc one is bigger-
// we need to compare books, thus, implements comparable and override compareTo

//------------------
public static Publication [] sortBooks(Publication pubArr[])
{
	Publication sortedPubArr[]; 
	Book maxBook; int i=0,j=0;
		for (i=0; i<pubArr.length-1; i++)
		{	int maxIndex=i; 
			for (j=i+1; j<pubArr.length; j++)
			{	if (((Book)pubArr[j]).compareTo((Book)pubArr[maxIndex])  <0 )
				{
					maxIndex=j;
				}
			}
		Book tmpbk = (Book) pubArr[maxIndex];
		pubArr[maxIndex] = pubArr[i];
		pubArr[i] =  tmpbk;
		
		}
return pubArr;
}

}
