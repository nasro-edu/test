import dw317.lib.BookSample;

/**
 * 
 */

/**
 * @author nasro
 *
 */
public class Test2_MainManyTypes {
	
	public static void main(String[] args) {

		OrderedPair<Integer, Integer> pair1 = new OrderedPair<Integer, Integer>(1, 5);
		pair1.display();

		//OrderedPair<int, String> pair2 = new OrderedPair<>(1, "hello");
		
		
		OrderedPair<String, Double> pair3 = new OrderedPair("machine", 2500.12);
		pair3.display();
		
		MyStack<String> stk1 = new MyStack<>(); stk1.push("hello");stk1.push("bye");
		OrderedPair<Integer, MyStack<String>> pair4 = new OrderedPair<Integer, MyStack<String>>(1,stk1 );
		pair4.display();
		
		BookSample b1 = new BookSample();
		OrderedPair<Integer, BookSample> pair5= new OrderedPair <Integer, BookSample>(1,b1 );
		pair5.display();

	}
	
	
	

}
