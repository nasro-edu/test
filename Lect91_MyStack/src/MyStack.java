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
public class MyStack<T> {
	private ArrayList <T> aList;

	public MyStack() {
		this.aList = new ArrayList<>();
	}
	public MyStack(ArrayList <T> aList) {
		this.aList = aList;
	}
	//isEmpty(): boolean
	public boolean isItEmpty() {return aList.isEmpty();}
	//+getSize(): int
	public int getSize(){return aList.size();}
	//+peek(): Object
	public <T> Object peek() 
	{ try {return aList.get(aList.size()-1);}
		catch (Exception e) { System.out.println("stack is emplty, you cannot get the top");
								return -1;
								}
	}
	//+pop(): Object
	public <T> Object pop() 
		{Object o = peek();
		aList.remove(aList.size()-1);
		return o;
		}
	//+push(o: Object): void
	public void push(T o) {aList.add(o);}
	//+search(o: Object): int
	public int search(T o) {return aList.indexOf(o);}
	
	//display
	public  <T> void displayList()
	{String outputStr = "";  String listSepart=" || ";
	outputStr = "List(size:"+aList.size()+")[";
		for (int i=0; i<aList.size(); i++)
			outputStr += "("+aList.get(i)+")"+listSepart;
	if(outputStr.length()>1) outputStr= outputStr.substring(0, outputStr.length()-listSepart.length())+"]]";
	System.out.println(outputStr);
	}

}
