package replacetxt;

import java.io.*;
import java.nio.channels.FileLockInterruptionException;
import java.util.Scanner;

public class TextReplace {

	public static void main(String[] args) throws Exception {
		Scanner inputFile ;
		PrintWriter outputFile;
		String filePath="myDataFiles/CustomersFiles";  //unix works also for windows because its a relative path
		String fileName="cust3.txt";  //unix
		String fullNameSrc = filePath+File.separator+fileName;
		
		//prepare the file name for the target
		String []targetNameArr = fileName.split(".");		
		//String fullNameTrgt = filePath+File.separator+targetNameArr[0]+"_TRGT"+targetNameArr[1]; 
		String fullNameTrgt = filePath+File.separator+"cust3_TRGT.txt"; 
		File sourceFileObj = new File(fullNameSrc);
		File targetFileObj = new File(fullNameTrgt);
		
		try {
				inputFile = new Scanner (sourceFileObj);
			outputFile = new PrintWriter(targetFileObj);
			
			while (inputFile.hasNext())
			{
				String aLine = inputFile.nextLine();
				outputFile.println(aLine.replaceAll("peter", "Hallam"));
			}
			inputFile.close(); outputFile.close();
			}
		catch (FileNotFoundException fnfe) {}
		}//main
	}
