/**
 * 
 */
package abstrct.lib;
import dw317.lib.Name;
import abstrct.lib.Employee.Qualification;

//-------------------- fullTimeEmployee --------------------
class PartTimeEmployee extends Employee
{
	private double rate;
	private double nberWorkingHours;
	
	
	public PartTimeEmployee(Name name, int age, String emp_Id, short experience, Qualification qualif, double rate,
			double nberWorkingHours) {
		super(name, age, emp_Id, experience, qualif);
		this.rate = rate; this.nberWorkingHours = nberWorkingHours;
	}
	public PartTimeEmployee(PartTimeEmployee emp) {
		super(emp.name, emp.age, emp.emp_Id, emp.experience, emp.qualif);
		this.rate = emp.rate;	this.nberWorkingHours = emp.nberWorkingHours;
	}
	
	@Override
	public double getIncome() {
  	return (this.rate*this.nberWorkingHours);
	}
	public String toString() {return super.toString()+"\n rate ="+ this.rate+ ", Nber Hours="+
											this.nberWorkingHours+" -->salary Readjusted="+this.getIncome();}
	@Override
	public String getSkills()  {return this.qualif.toString();	}
	//proper method to PartTimers
	public double getRate() {return this.rate;}
}
