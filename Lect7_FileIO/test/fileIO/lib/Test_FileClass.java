package fileIO.lib;

import java.io.File;

public class Test_FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="myDataFiles/CustomersFiles";  //unix
		//String filePath1="myDataFiles";  //unix
		
		String fileName = "cust3.txt";

		File fileObj1 = new File(filePath+"/"+fileName);
		System.out.println(filePath+"/"+fileName + " is file:"+fileObj1.isFile());
		File fileObj2 = new File(filePath);
		System.out.println(filePath+ "is a file:"+fileObj2.isFile());
		System.out.println(filePath+ "is a directory:"+fileObj2.isDirectory());
		
		
	}

}
