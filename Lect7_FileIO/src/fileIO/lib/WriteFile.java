/**
 * 
 */
package fileIO.lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author nasro
 *
 */
public class WriteFile {
	private String filePath;//="D:\\0tem_DawsonColg\\Java_Lectures\\Lect7_FileIO\\myDataFiles";
	private String fileName;
	private File fileObject ;
	private PrintWriter write2File;
	
	public WriteFile(String filePath, String fileName) {
		this.filePath = filePath;
		this.fileName = fileName;
		fileObject = new File (filePath+File.separatorChar+fileName);	
		//fileObject = new File (filePath+"/"+fileName);	
			try {
				if (!fileExist())
					write2File = new PrintWriter(fileObject);
			} catch (IOException ioe) {
				// TODO Auto-generated catch block
				ioe.printStackTrace();
			}
	}
	//------------------------------
	public boolean fileExist() 
	{ 
		if (fileObject.exists())
		{
			System.out.println(" fileName:"+fileName+" already exist ...");
			System.exit(1);
		}
		return false;
	}
	//------------------------------
	public void populateFile()
	{   Scanner keyBRDinput = new Scanner(System.in);
	
		String name=""; int age, i=1;
		while (name.compareToIgnoreCase("xxx")!=0)
		{
			System.out.println(" Enter record no:"+i+" , when finished enter xxx for name...");
			name = keyBRDinput.next();
			age = keyBRDinput.nextInt();
			if(name.compareToIgnoreCase("xxx")!=0)
			{write2File.print(name);
			write2File.println(age);
			}
		}
		write2File.close();
	}
}

	