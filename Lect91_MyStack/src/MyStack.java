import java.util.ArrayList;

/**
 * 
 */

/**
 * @author nasro
 *
 *Returns true if  stack is empty.
Returns the number of elements in this stack.
Returns the top element in this stack.
Returns and removes the top element in this stack.
Adds a new element to the top of this stack.
Returns the position of the first element in the stack from the top that matches the specified element.
 * @param <T>

 */
public class MyStack<E> {
	private ArrayList <E> aList;

	public MyStack() {
		this.aList = new ArrayList<>();
	}
	public MyStack(ArrayList <E> aList) {
		this.aList = aList;
	}
	//isEmpty(): boolean
	public boolean isItEmpty() {return aList.isEmpty();}
	//+getSize(): int
	public int getSize(){return aList.size();}
	//+peek(): Object
	public E peek() 
	{ try {return aList.get(aList.size()-1);}
		catch (Exception e) { System.out.println("stack is emplty, you cannot get the top");
								//System.exit(1);
								}
	return null;
	}
	//+pop(): Object
	public E  pop() 
		{E o =  peek();
		aList.remove(aList.size()-1);
		return o;
		}
	//+push(o: Object): void
	public void push(E o) {aList.add(o);}
	//+search(o: Object): int
	public int search(E o) {return aList.indexOf(o);}
	public String toString() {return aList.toString();}
	//display
	public   void displayStack()
	{	String outputStr = "";  int index=aList.size()-1;
		outputStr = "Stack(size:"+aList.size()+")";
		for (int i=index; i>=0; i--)
			outputStr += "\n--------\n"+i+":"+aList.get(i);//+")"+listSepart;
	outputStr+="\n =========Base of the Stack ===============\n";
	System.out.println(outputStr);
	}
	//----
	public int compare(Comparable o1, Comparable o2)
		{ return o1.compareTo(o2);}
	
	//------ cheating peek : This is just for testing why we should use generic instead of Object
	//------- cheating peek (it shouldnt be allowed in stacks as it defines the inherent nature of stacks).
	
	public E peek(int index) 
	{ try {return aList.get(index);}
		catch (Exception e) { System.out.println("stack is emplty, you cannot get the top");}
	return null;
	}

}
