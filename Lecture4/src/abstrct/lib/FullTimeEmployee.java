/**
 * 
 */
package abstrct.lib;
import dw317.lib.Name;
import abstrct.lib.Employee.Qualification;

//-------------------- fullTimeEmployee --------------------
class FullTimeEmployee extends Employee
{
	private double baseSalary;
	protected FullTimeEmployee(Name name, int age, String emo_Id,  short experience, Qualification qualif, double baseSalary) {
		super(name, age, emo_Id, experience, qualif);
		this.baseSalary=baseSalary;
	}
	protected FullTimeEmployee(FullTimeEmployee emp) {
		super(emp.name, emp.age, emp.emp_Id, emp.experience, emp.qualif);
		this.baseSalary=emp.baseSalary;
	}
	@Override
	public double getIncome() {
      double factorExp=0.1;
		if(this.experience<5) factorExp=0.2;
		if(this.experience<10) factorExp=0.4;
		else factorExp=0.5;
		
		double factorQualif = 0.1;
		switch (this.qualif)
		{
		case TBC: factorQualif=0.2;break;case BSC: factorQualif=0.3;break;
		case MSC: factorQualif=0.5;break;case PHD: factorQualif=0.4;
		}
		return (baseSalary + (baseSalary*factorExp) + (baseSalary*factorQualif));
	}
	public String toString() {return super.toString()+"\n BaseSalary ="+ this.baseSalary + ", salary Readjusted="+this.getIncome();}
	@Override
	public String getSkills() {return this.qualif.toString();	}
	//proper method to FullTimers
	public double getBasicSalary() {return this.baseSalary;}
	
}
