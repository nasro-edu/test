/**
 * 
 */
package fileIO.lib;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author nasro
 *
 */
public class ReadFromFile {
	private String filePath;//="D:\\0tem_DawsonColg\\Java_Lectures\\Lect7_FileIO\\myDataFiles";
	private String fileName;
	private File fileObject ;
	private Scanner readFromFile;
	
	public ReadFromFile(String filePath, String fileName) {
		this.filePath = filePath;
		this.fileName = fileName;
	
		fileObject = new File (filePath+"/"+fileName);	
		if (!fileExist())
		{	try {readFromFile = new Scanner(fileObject);}
			catch(IOException ioe) {System.out.println(ioe.getMessage());
			}
		}
		}
	public void displayFromFile()
	{	String name; int age;
		while(readFromFile.hasNext())
		{ name = readFromFile.next();
			age = readFromFile.nextInt();
		   System.out.print(name +"*"+age);	
		}
	}
	public ArrayList<String> getIntoList()
	{ 	String name; int age;
		ArrayList <String> listData = new ArrayList<>();
		while(readFromFile.hasNext())
		{ name = readFromFile.next();
			age = readFromFile.nextInt();
			listData.add(name+"*"+Integer.toString(age));
			//listData.add(name);
			//listData.add("*");
			//listData.add(Integer.toString(age));
		}
		return listData;
	}
	
	public boolean fileExist() 
	{ 
		if (!fileObject.exists())
		{
			System.out.println(" fileName:"+fileName+" does not already exist ...");
			System.exit(1);
		}
		return false;
	}
}
