package fileIO.lib;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;

public class FileClass {

	private File fileHandle;
	public String path;
	public String fileName;

	public FileClass(String path) { //only for directories
		this.path = path;
		this.fileHandle = new File (path);
	}
	
	public FileClass(String path, String fileName) {//for files with paths
		this.fileName = fileName; this.path = path;
		String fullFileName = path+File.separator+fileName;
		this.fileHandle = new File (fullFileName);
	}

	public void testExist()
	{ System.out.println("File ["+fileName+"] exist="+fileHandle.exists());		
	}
	public void test_Paths()
	{ 
	System.out.println("******  Testing paths for "+fileHandle.getName()+" ******");
		System.out.println("File ["+fileName+"] absolute path="+fileHandle.getAbsolutePath());
	 
		System.out.println("File ["+fileName+"] get name ="+fileHandle.getName());
		System.out.println("File ["+fileName+"] get parent="+fileHandle.getParent());
		System.out.println("File ["+fileName+"] get path="+fileHandle.getPath());
		System.out.println("File ["+fileName+"] is absolute="+fileHandle.isAbsolute());

		System.out.println("default separator="+File.separatorChar);		
		System.out.println("******  END of Testing paths for "+fileHandle.getName()+" ******");
			
	}

	public void fileAttributes()
	{
		System.out.println("******  Testing main attributes for "+fileHandle.getName()+" ******");
		System.out.println(fileHandle.getName()+" Attributes :");
		if (fileHandle.isDirectory())
			System.out.println(fileHandle.getName()+" is a folder");
		else if (fileHandle.isFile())
			System.out.println(fileHandle.getName()+" is a file");
		
		System.out.println(" Space available:"+fileHandle.getFreeSpace());
		System.out.println(" size:"+fileHandle.length());
		System.out.println(" R,W,X:"+fileHandle.canRead()+","+fileHandle.canWrite()+","+fileHandle.canExecute());
		
		System.out.println("******  END of Testing main attrib for "+fileHandle.getName()+" ******");	
	}
	public void traversDirectory()
	{
		System.out.println("******  Testing directory traverse for '"+fileHandle.getName()+"' ******");
	
		if (fileHandle.isDirectory())
		{	
			System.out.println(" Content of directory "+fileHandle.getName()+":");
			String [] allContentDirectory = fileHandle.list();
			for (String directoryElem:allContentDirectory)
			{
				System.out.println(directoryElem);
			}
		}
		else 	System.out.println(fileHandle.getName() + " is not a directory");
		System.out.println("******  END of Testing directory traverse for "+fileHandle.getName()+" ******");
	}
}
