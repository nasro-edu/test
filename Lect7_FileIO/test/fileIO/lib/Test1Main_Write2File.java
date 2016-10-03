package fileIO.lib;

import java.io.File;
import java.lang.instrument.ClassFileTransformer;
import java.util.ArrayList;

public class Test1Main_Write2File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String absfilePath="D:\\0tem_DawsonColg\\Java_Lectures\\Lect7_FileIO\\myDataFiles\\CustomersFiles";
		//String filePath1="myDataFiles\\CustomersFiles"; //windows escaped
		//String filePath2="myDataFiles\CustomersFiles";//windows wrong
		String filePath="myDataFiles/CustomersFiles";  //unix works also for windows because its a relative path
		String filePath1="myDataFiles";  //unix
		
		String fileName = "cust3.txt";

		FileClass myObjFile = new FileClass(filePath, fileName);
		myObjFile.testExist();
		myObjFile.test_Paths();
		
		FileClass myObjDirect= new FileClass(filePath1);
		myObjDirect.traversDirectory();
		//String filePath=".\\Lect7_FileIO\\myDataFiles";
		//WriteFile write2FileObj = new WriteFile(filePath, fileName);
		//write2FileObj.populateFile();
	myObjDirect.fileAttributes();
	myObjFile.fileAttributes();
	//String absPath = "D:\\0tem_DawsonColg\\Java_Lectures\\Lect7_FileIO\\test\\fileIO\\lib";
	String absPath = "fileIO/lib";
	FileClass myObjTestMain  = new FileClass(absPath,"Test1Main_Write2File.java");
	myObjTestMain.testExist();
	myObjTestMain.fileAttributes();
	
	//---- reading from file
	ReadFromFile myFileReader = new ReadFromFile(absfilePath, fileName);
	//myFileReader.displayFromFile();
	ArrayList<String> myList = myFileReader.getIntoList();
	for (String elem:myList)
		{System.out.println(elem);
		}
	}

}
