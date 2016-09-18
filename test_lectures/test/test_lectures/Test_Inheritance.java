/**
 * 
 */
package test_lectures;


/**
 * @author nasro
 *
 */
public class Test_Inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GeometricFigure aFigure ;//= new GeometricFigure("white", false);
		//System.out.println(aFigure);
		Circle circ1 = new Circle (3.78, "red", false);
		Rectangle rect1 = new Rectangle(4.1, 2.3, "black", false);
		System.out.println(rect1);
		System.out.println(circ1);
		
		
	}

}
