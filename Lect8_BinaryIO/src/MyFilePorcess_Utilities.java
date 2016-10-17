import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import abstrct.lib.*;
import dw317.lib.DataClean;
import dw317.lib.Name;

/**
 * 
 */

/**
 * @author nasro
 *
 */
public class MyFilePorcess_Utilities {

	//---------------------------------------
	// read lines from a text file, and then put each String line in the ArrayList element
	
	public static List readTextFileToList(File fileObj)
		{
			List <String>	itemsList = new ArrayList<>();
			try {
				Scanner inputFile = new Scanner(fileObj);
				String aLine ="";
				while(inputFile.hasNext())
				{	aLine = inputFile.nextLine().trim();
					if(aLine.length()>10)
						itemsList .add(aLine.replaceAll(",", ":"));
				}
			} 
			catch (FileNotFoundException e) 
				{ System.out.println("erro FNF "+e.getMessage());
				System.exit(1);
				}
			return itemsList ;
		}
	//-----------------------------------------------------------------
	//-- given the string list of String lines  that were read from a text file, put them as objects in an array of object Employees
	public static ArrayList<Employee> constructEmplyeeObjArrayList(List<String> employeesSTRList) {	ArrayList <Employee> EmployeeArrList = new ArrayList();
	String tokenizedEmplStr [] = null;
	int index=0;
	for (String employeeStrItem:employeesSTRList)
	{	tokenizedEmplStr  = employeesSTRList.get(index++).split(":");	
		//---- if PTime instanciate a partime employee, if FT: instanciate a full time employee
	//PartTimeEmployee(name, age, emp_Id,experience, qualif, rate,nberWorkingHours)	
	//FullTimeEmployee(name, age, emo_Id,  experience, qualif, baseSalary) {
	System.out.println("*********processing record "+index);
	Employee anEmpl =null, ptEmpl = null; 
		if (tokenizedEmplStr[0].equals("PT"))	
			{anEmpl  = new PartTimeEmployee(new Name(tokenizedEmplStr[1],tokenizedEmplStr[2]), 
					DataClean.fixIntData(tokenizedEmplStr[3]), //age
								tokenizedEmplStr[4],			//empid 
								(short)( DataClean.fixIntData(tokenizedEmplStr[5])),			//exper
								Qualification.valueOf(tokenizedEmplStr[6].trim().toUpperCase()), //qulif
								DataClean.fixDoubleData(tokenizedEmplStr[7]) , //rate
								DataClean.fixIntData(tokenizedEmplStr[8]));
			}
		else
		{anEmpl  = new FullTimeEmployee(new Name(tokenizedEmplStr[1],tokenizedEmplStr[2]), 
				DataClean.fixIntData(tokenizedEmplStr[3]), //age
				tokenizedEmplStr[4],									// empid , 
				(short)( DataClean.fixIntData(tokenizedEmplStr[5])),			//exper
					Qualification.valueOf(tokenizedEmplStr[6].trim().toUpperCase()), //qulif
					DataClean.fixDoubleData(tokenizedEmplStr[7]) ); ////baseSalary
				}
		EmployeeArrList.add( (Employee)anEmpl);
		
	}

return EmployeeArrList;	
}
//---------------------------------------------
public static void displayEmployeeArrayList (List <Employee> EmployeeArrList )	
{
		for(Employee emp:EmployeeArrList)
		{ if (emp instanceof PartTimeEmployee)
				System.out.println(emp);
		
		}
	}
}
