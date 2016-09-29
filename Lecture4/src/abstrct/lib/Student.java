/**
 * 
 */
package abstrct.lib;
import dw317.lib.Name;
class Student extends Person
{
	private short year;
	private String program;
	private double baseScholarship;
	private double gpa;
	
	
	public Student(Name name, int age, short year, String program, double baseScholarship, double gpa) {
		super(name, age);
		this.year = year;
		this.program = program;
		this.baseScholarship= baseScholarship;
		this.gpa = gpa;
	}
	@Override
	public double getIncome() {
		double factorPerfom= 0.0;
		if(this.gpa>3.9)	factorPerfom= 1;
		else if(this.gpa>3.5)	factorPerfom= 0.8;
		else if(this.gpa>3.0)	factorPerfom= 0.5;
		else if(this.gpa>2.5)	factorPerfom= 0.3;
		return  (baseScholarship+ (baseScholarship*factorPerfom) );
	}
	public String toString() {return super.toString()+"\n Year ="+ this.year+ ", program="+
											this.program+" -->schoklarship="+this.getIncome();}
	@Override
	public String getSkills()  {return this.program;	}
	
}