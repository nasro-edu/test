import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

//here we experiment with byte Input output stream to read/write raw bytes (in this example an image) using
	//FileInputStream  / FileOutputStream to read/write the raw bytes, 
	//BufferedInputStream  / BufferedOutputStream to read/write the raw bytes,
	// compare the performances.
    //
public class Test2Mai_CopyImage {

	public static void main(String[] args)   {

		//wnat to time out the cpoy  process
		long startTimeExec = System.nanoTime();		

		//----------------------------
		FileInputStream fis =null; int nberBytesCopied=0;
		FileOutputStream fos  =null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(new File("fileData/26102012775.jpg"));
			fos  = new FileOutputStream(new File("fileData/copy1Haj.jpg"));
			int bufferSize = 1000000;
			bis = new BufferedInputStream(fis, bufferSize );
			bos = new BufferedOutputStream(fos, bufferSize );
			int  rawData; nberBytesCopied=0;
			//---- processin I/O with filestream
			//while( (rawData= fis.read())!=-1)	{	fos.write(rawData); nberBytesCopied++;			}
			
			//---- processing I/O with bufferedstream
			while( (rawData= bis.read())!=-1)	{	bos.write(rawData); nberBytesCopied++;			}
			
			
		}
		catch (IOException ioe) {System.out.println("eroor IO:"+ioe.getMessage());}
		catch (Exception e)  {System.out.println(e.getMessage());}
		finally {
				try {	if(fis!=null)	fis.close();
						if(fos!=null)	fos.close();
						if(bis!=null)	fis.close();
						if(bos!=null)	fos.close();
						long endTimeExcec = System.nanoTime();
						long duration = (endTimeExcec - startTimeExec)/1000000; //in milliseconds
						System.out.println("For FleStreams, it took:"+duration );
						System.out.println("For FleStreams, size :"+nberBytesCopied/1024);
					} 
				catch (IOException e) {
					e.printStackTrace();				
					} 
		}
		
	}

}
