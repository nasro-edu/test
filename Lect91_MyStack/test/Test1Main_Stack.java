import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		//testStackStrings();
		testStackFigures();
	}
	
	public static void testStackStrings()
	{
		//MyStack<String> pile1 = new MyStack<>();
		//System.out.println("elem on top:"+pile.peek());
		//Stack_Object pile = new Stack_Object();
		Stack_String pile = new Stack_String();
		pile.push("peter");	pile.push("smith");
		pile.push("karim");	pile.push("leo");
		pile.displayStack();
		
		System.out.println("elem on top:"+pile.peek());
		System.out.println("after peek:");
		pile.displayStack();
		
		pile.pop(); System.out.println("after pop:");
		pile.displayStack();
		//System.out.println("elem in middle:"+getMiddle( pile ));
	}
//------------------------------------
	public static void testStackFigures()
	{
		//MyStack<GeometricFigure> pile = new MyStack<>();
		//Stack_String pile = new Stack_String();
		Stack_Object pile = new Stack_Object();
		
		//MyStack<GeometricFigure> pile = new MyStack<>();
		Circle circ1 = new Circle ( 3.78,"disk1", "red", true);
		Rectangle rect1 = new Rectangle(4.1, 2.3,"Rect1", "black", false);
	
		System.out.println("elem on top:"+pile.peek());
		pile.push(circ1);	
		pile.push("helo");
		
		int resCompare = pile.compare((Comparable) pile.peek(1), (Comparable)pile.peek(0));
		System.out.println("comparing ineer elements:"+resCompare );
		
		pile.push(rect1);
		pile.displayStack();
			System.out.println("elem on top:"+pile.peek());
			pile.displayStack();
			pile.pop();
			pile.displayStack();
	}
	//----------  generic method to get the element in the middle (median) --------
	public static Object getMiddle(Stack_Object pile )
	{
		int middle = pile.getSize()/2;
		for (int i=0; i<middle; i++) pile.pop();
		return pile.peek();
	}
}
