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
		Circle circ1 = new Circle (3.78, "Circle1", "red", false);
		Rectangle rect1 = new Rectangle(4.1, 2.3,"Rect1", "black", false);
		System.out.println(rect1);
		System.out.println(circ1);
		
		//chaining consrcutor
		C c = new C();
		System.out.println(c);
		C c1 = new C(3,4,5);
		System.out.println(c1);
		B b = new B();
		System.out.println(b);
	//=====polymorphism	
		displayFigureInfo(rect1);
		displayFigureInfo(circ1);
	}
	//----polymprphic method
	public static void displayFigureInfo(GeometricFigure aFigure)
	{
		System.out.println("the Figure "+ aFigure.getName()+" has the following info:"+aFigure.toString());
	}

}
