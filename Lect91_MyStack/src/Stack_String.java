import java.util.ArrayList;

/**
 * 
 */

/**
 * @author nasro
 *
 */
public class Stack_String {

	private ArrayList <String> aList;

	public Stack_String() {
		this.aList = new ArrayList<>();
	}
	public Stack_String(ArrayList <String> aList) {
		this.aList = aList;
	}
	//isEmpty(): boolean
	public boolean isItEmpty() {return aList.isEmpty();}
	//+getSize(): int
	public int getSize(){return aList.size();}
	//+peek(): Object
	public String peek() 
	{ try {return aList.get(aList.size()-1);}
		catch (Exception e) { System.out.println("stack is emplty, you cannot get the top");
								//System.exit(1);
								}
	return null;
	}
	//+pop(): Object
	public String  pop() 
		{String o = (String) peek();
		aList.remove(aList.size()-1);
		return o;
		}
	//+push(o: Object): void
	public void push(String o) {aList.add(o);}
	//+search(o: Object): int
	public int search(String o) {return aList.indexOf(o);}
	
	//display
	public   void displayStack()
	{	String outputStr = "";  int index=aList.size()-1;
		outputStr = "Stack(size:"+aList.size()+")";
		for (int i=index; i>=0; i--)
			outputStr += "\n--------\n"+i+":"+aList.get(i);//+")"+listSepart;
	outputStr+="\n =========Base of the Stack ===============\n";
	System.out.println(outputStr);
	}
}
