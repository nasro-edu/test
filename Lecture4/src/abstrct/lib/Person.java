package abstrct.lib;
import dw317.lib.Name;
/**
 * @author hnasreddine
 *
 */
public abstract  class Person implements Comparable{
	protected Name name;  // composition ( consist of  relationship
	int age;
	protected  Person(Name name, int age) // notice protected ... why? 
	{	setName(name);//this.name = name; 
		setAge( age) ; //this.age=age;
		}
	public Name getName() {
		return name;
	}
	private void setName(Name name) {	this.name = name;}
	private void setAge(int age) {	this.age=age;}

	public String toString() {return super.toString()+"-----------------------------"+
			"\n Name ="+ this.name + ", Age="+this.age;}
	//--- abstract methods --> implementation later
	public abstract double getIncome();
	//public abstract String getSkills(){}  // why this is wrong?
	public abstract String getSkills();
	@Override
	public int compareTo(Object o) {
	
		//if (this.age>((Person) o).age) return 1;
		//else if (this.age<((Person) o).age) return -1;
		//return 0;
		
		if (this.getIncome()>((Person) o).getIncome()) return 1;
		else if (this.getIncome()<((Person) o).getIncome()) return -1;
		return 0;
	}
}
//--------------------------------
