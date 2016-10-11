/**
 * 
 */
package dw317.lib;

/**
 * @author nasro
 *
 */
public  abstract class DataClean implements Trimmable{

	
	public static String dataTrimmedLeft(String str) {
		return str.trim();
	}

	public static String dataTrimmedRight(String str) {
		return str.trim();
	}


	public static String dataTrimmed(String str) {
		return str.trim();
	}

	public static double fixDoubleData(String str) {
		str = dataTrimmed(str);
		double x = 0.0;
		try{ x = Double.parseDouble(str);
		return x;
		}
		catch(NumberFormatException nfe)
			{
			System.out.println("data is not a double "+nfe.getMessage());
			System.exit(1);
			}		
		return x;
	}

	public static  int fixIntData(String str) {
		str = dataTrimmed(str);
		int x=0;
		try{ x = Integer.parseInt(str);
		return x;
		}
		catch(NumberFormatException nfe)
			{
			System.out.println("data is not an int"+nfe.getMessage());
			System.exit(1);
			}		
	return x;
	}
}
