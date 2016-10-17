
import abstrct.lib.*;
import dw317.lib.DataClean;
import dw317.lib.Name;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3Main_Serializable  {



	public static void main(String[] args)   {
		File fileTXTHandle = new File("fileData/allemployess");
		File fileBinHandle= new File("fileData/employeeFile1.bit");
		List <String> employeesSTRList = new ArrayList<>();
		List <Employee> EmployeeArrList =null;
		
		boolean testCreateFile=false;
		if(testCreateFile==true)
		{employeesSTRList = MyFilePorcess_Utilities.readTextFileToList(fileTXTHandle);
		for (String empl:employeesSTRList)
			System.out.print("---"+empl);
		
		EmployeeArrList = MyFilePorcess_Utilities.constructEmplyeeObjArrayList(employeesSTRList);
		writeObjects2BinaryFile(EmployeeArrList, fileBinHandle);
		MyFilePorcess_Utilities.displayEmployeeArrayList(EmployeeArrList);
		}		
		if(!testCreateFile)
		{//File fileHandle= new File("fileData/employeeFile.bit");
		EmployeeArrList = readObjectsFromBinaryFile( fileBinHandle); 
		MyFilePorcess_Utilities.displayEmployeeArrayList(EmployeeArrList);//, cond=(emp instanceof PartTimeEmployee));
		}
	}
	//---- Write objects into an binary (object) file using ObjectOutputStream
	// ---- test it as it is and you see that you cannot stream write objects of type Employee 
	//  if Employee class is not serializable
	public static void writeObjects2BinaryFile(List <Employee> EmployeeArrList, File fileHandle)
	{	ObjectOutputStream objFile=null;
		try {
			objFile= new ObjectOutputStream(new FileOutputStream(fileHandle));
			for (Employee emplObj:EmployeeArrList)
			{
				objFile.writeObject(emplObj);
			}
		} 			
		catch (IOException e) {System.out.println("-- some error in I/O:"+e.getMessage());}

		finally 
		{	if (objFile!=null)
			try {
				objFile.close();
				System.out.println("-- done writing to the binary file ....");
			} 
			catch (IOException e) {System.out.println("-- some error in I/O:"+e.getMessage());}
		}
	}
	//-------------------------------
	//---- Read objects from an binary (object) file using ObjectInputStream
	// and either dispay them or better store them in an ArrayList 
	// ---- test it as it is and you see that you cannot stream read objects of type Employee 
	//  if Employee class is not serializable
	public static List <Employee> readObjectsFromBinaryFile(File fileHandle) //List <Employee> EmployeeArrList, File fileHandle) 
	{	List <Employee> EmployeeArrList=null;
		ObjectInputStream objFile=null;
		try {
			objFile= new ObjectInputStream(new FileInputStream(fileHandle));
			Employee tempEmployee=null;
			while (true)
			{	tempEmployee=  (Employee) (objFile.readObject());
			EmployeeArrList.add(tempEmployee);
			}
		} 			
		catch (ClassNotFoundException cnfe) {System.out.println("-- error in reading and assignng an employee (classnot found"+cnfe.getMessage());}
		catch (EOFException eof) {System.out.println("-- EOF reached "+eof.getMessage());}
		catch (IOException e) {System.out.println("-- some error in I/O:"+e.getMessage());}
		finally 
		{	if (objFile!=null)
			try {
				objFile.close();
				System.out.println("-- done done retrieving binary objects from the binary file "+fileHandle.getName());
			} 
			catch (IOException e) {System.out.println("-- some error in I/O:"+e.getMessage());}
		}
		return EmployeeArrList;
	}
	//-------------------------------
	
}
