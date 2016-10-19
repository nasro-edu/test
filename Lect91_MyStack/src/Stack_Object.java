import java.util.ArrayList;

/**
 * 
 */

/**
 * @author nasro
 *
 */
public class Stack_Object {
	private ArrayList <Object> aList;

	public Stack_Object() {
		this.aList = new ArrayList<>();
	}
	public Stack_Object(ArrayList <Object> aList) {
		this.aList = aList;
	}
	//isEmpty(): boolean
	public boolean isItEmpty() {return aList.isEmpty();}
	//+getSize(): int
	public int getSize(){return aList.size();}
	//+peek(): Object
	public Object peek() 
	{ try {return aList.get(aList.size()-1);}
		catch (Exception e) { System.out.println("stack is emplty, you cannot get the top");
								//System.exit(1);
								}
	return null;
	}
	//+pop(): Object
	public Object  pop() 
		{Object o =  peek();
		aList.remove(aList.size()-1);
		return o;
		}
	//+push(o: Object): void
	public void push(Object o) {aList.add(o);}
	//+search(o: Object): int
	public int search(Object o) {return aList.indexOf(o);}
	
	//display
	public   void displayStack()
	{	Object outputStr = "";  int index=aList.size()-1;
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
	
	public Object peek(int index) 
	{ try {return aList.get(index);}
		catch (Exception e) { System.out.println("stack is emplty, you cannot get the top");}
	return null;
	}
}

