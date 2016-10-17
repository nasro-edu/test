import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 */

/**
 * @author nasro
 *
 * FileInputStream reads bytes from files
 * FileOutputStream writes bytes to files
 * 
 */
public class MyFileIOStream {

	
	public static void createFileOutputStream(File fileObj)
	{	FileOutputStream fos =null;
		try 
		{fos = new FileOutputStream(fileObj);
		whatToDoIfFileExist(fileObj, "nostop");
		byte []chars = {'a', 'b','c','d','e','f','g'};
		for (int i=112; i<132; i++)
				fos.write(i);
		//fos.write(chars);;
		fos.write(chars, 2, 3);;
		fos.close();
		}
	
			catch (IOException ioe)
			{
				System.out.println(ioe.getMessage());
			}
		//finally {fos.close();}
		
		}
	//---------------------------
	public static void readFileInputStream	(File fileObj) 
	{	FileInputStream fis = null;
		try{
			fis = new FileInputStream(fileObj);
			int c;
			while ( (c=  fis.read()) !=-1)
			{	
				System.out.print((char)c +" ");
			}
			
		fis.close();
		}
		catch (FileNotFoundException fnfe){ fnfe.getMessage();}
		catch (Exception ex){ ex.getMessage();}
		}

	//---------------------------
	public static boolean whatToDoIfFileExist(File fileObj, String stop_continue)
	{
	 if(fileObj.exists() && stop_continue=="stop")
		 {System.out.println("File "+fileObj.getName()+" already exists ...");
		 System.exit(0);
		 } 
	 return true;
	}
	//---------------------------

}
