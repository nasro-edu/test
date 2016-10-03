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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + ((fileObject == null) ? 0 : fileObject.hashCode());
		result = prime * result + ((filePath == null) ? 0 : filePath.hashCode());
		result = prime * result + ((write2File == null) ? 0 : write2File.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WriteFile other = (WriteFile) obj;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (fileObject == null) {
			if (other.fileObject != null)
				return false;
		} else if (!fileObject.equals(other.fileObject))
			return false;
		if (filePath == null) {
			if (other.filePath != null)
				return false;
		} else if (!filePath.equals(other.filePath))
			return false;
		if (write2File == null) {
			if (other.write2File != null)
				return false;
		} else if (!write2File.equals(other.write2File))
			return false;
		return true;
	}
	public boolean fileExist() 
	{ 
		if (fileObject.exists())
		{
			System.out.println(" fileName:"+fileName+" already exist ...");
			System.exit(1);
		}
		return false;
	}
	
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

	