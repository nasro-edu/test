/**
 * 
 */
package abstrct.lib;

import abstrct.lib.Employee.Qualification;
import dw317.lib.Name;

abstract class Employee extends Person{
	protected String emp_Id;
	protected short experience;
	protected Qualification  qualif;
	 enum Qualification {TBC,BSC,MSC,PHD} ;
	
	protected Employee(Name name, int age,  String emp_Id, short experience, Qualification qualif) {
		super(name, age);
		this.emp_Id= emp_Id;
		setExperience (experience); //this.experience=experience;
		this.qualif = qualif;
	}
	private void  setExperience (short experience)
	{ if (experience>60 || experience<0) throw new IllegalArgumentException("experinec doesnt make senese");
		this.experience=experience;
	}
	public String toString() {return super.toString()+"\n  Employee Id ="+ this.emp_Id+ ", Experience=="+this.experience+ ", Qualif = "+qualif;}
}
