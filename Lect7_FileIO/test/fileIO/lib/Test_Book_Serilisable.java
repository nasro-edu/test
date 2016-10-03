package fileIO.lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test_Book_Serilisable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="myDataFiles";  //unix works also for windows because its a relative path
		String fileName="book1.txt";  //unix
		String fullName = filePath+File.separator+fileName; 
	File  fileObjBook =  new File(fullName);
	enterBookData(fileObjBook) ;
		
	}
	public static void enterBookData(File fileObjBook) throws IOException
	{
		Scanner inputConsole = new Scanner(System.in);
		String isbn, title; double price;
		FileOutputStream fos = new FileOutputStream(fileObjBook);
		ObjectOutputStream outputObject = new ObjectOutputStream(fos);
		Book aBook;
		for (int i=1; i<5; i++)
		{
			System.out.println("- enter isbn:");isbn = inputConsole.next();
			System.out.println("- enter title:");title= inputConsole.next();
			System.out.println("- enter price:");price= inputConsole.nextDouble();
			
			aBook = new Book(isbn, title, price);
			outputObject.writeObject(aBook);
		}
		outputObject.close();
		fos.close();
	}

}
