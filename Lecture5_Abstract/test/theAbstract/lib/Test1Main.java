/**
 * 
 */
package theAbstract.lib;


/**
 * @author nasro
 *
 */
public class Test1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricFigure aFigure ;//= new GeometricFigure("white", false);
		//System.out.println(aFigure);
		Circle circ1 = new Circle ( 3.78,"disk1", "red", true);
		Rectangle rect1 = new Rectangle(4.1, 2.3,"Rect1", "black", false);
		System.out.println(rect1);
		System.out.println(circ1);
	}

}
