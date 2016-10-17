import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author nasro
 * DataInputStream reads bytes from stream + converts them to primitive-type data values and strings
 * DataOutputStream converts primitive-type data values and strings to bytes and writes these bytes to stream
 */
public class MyDataIOStream {

	String name; int age ; char gender;
	double gpa;
	DataOutputStream output = null;
	DataInputStream input =null;
	
	private void fromConsole2Array(Scanner console)
	{
			try {System.out.print("name:");name = console.next();
			System.out.print("age:");age = console.nextInt();
			System.out.print("gender:");
			gender= (char)(console.next().charAt(0));
			System.out.print("gpa:");gpa= console.nextDouble();
			}
			catch (IllegalArgumentException iae) {
				System.out.println("somhing wrong with data input-->"+iae.getMessage());
			}
			catch (Exception e) {
				System.out.println("somthing not correct with data input-->"+e.getMessage());
				System.exit(1);
			}
	}
	
	public void  dataOutputStreamWrite2File( File fileObj)
	{
		Scanner console= new Scanner(System.in);
		
		try {
			output = new DataOutputStream (new FileOutputStream(fileObj));
		for (int i=0; i<4; i++)
		{System.out.println("enter infor for person :"+i);
			fromConsole2Array(console);
			output.writeUTF(name);output.writeInt(age);
			output.writeChar(gender);output.writeDouble(gpa);
		}
		}
		catch (IOException ioe) {}	
	}
	//--------------------------------------------
	public void dataInputStreamReadfromFile(File fileObj) 
	{
		try{
			input = new DataInputStream(new FileInputStream (fileObj));
			while(true)
			{
				name = input.readUTF(); age = input.readInt();
				
				gender = input.readChar(); gpa= input.readDouble();
				System.out.println(name +" "+ age +" "+ gender +" "+gpa);	
			}
		}
		catch (EOFException eof) { System.out.println("all data read ...");}
		catch(FileNotFoundException fnfe){System.out.println(fnfe.getMessage());}
		catch (IOException ioe) {System.out.println(ioe.getMessage());}
		
	}
	
}
