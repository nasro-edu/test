import java.util.ArrayList;

import theAbstract.lib.Circle;
import theAbstract.lib.GeometricFigure;
import theAbstract.lib.Rectangle;

/**
 * 
 */

/**
 * @author nasro
 *
 */
public class Test1Main_Stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testStackStrings();
		testStackFigures();
	}
	
	public static void testStackStrings()
	{
		MyStack<String> pile = new MyStack<>();
		System.out.println("elem on top:"+pile.peek());
		pile.push("peter");	
		pile.push("smith");
		pile.push("karim");	pile.push("leo");

		pile.displayList();
			System.out.println("elem on top:"+pile.peek());
			pile.displayList();
			pile.pop();
			pile.displayList();
	}
//------------------------------------
	public static void testStackFigures()
	{
		MyStack<GeometricFigure> pile = new MyStack<>();
		
		Circle circ1 = new Circle ( 3.78,"disk1", "red", true);
		Rectangle rect1 = new Rectangle(4.1, 2.3,"Rect1", "black", false);
	
		System.out.println("elem on top:"+pile.peek());
		pile.push(circ1);	
		pile.push(rect1);
		pile.displayList();
			System.out.println("elem on top:"+pile.peek());
			pile.displayList();
			pile.pop();
			pile.displayList();
	}
}
