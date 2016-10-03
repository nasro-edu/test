package sort.lib;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private String name;
	private double gpa;
	private String id;
	
	public Student(String name, double gpa, String id) {
		this.name = name;
		this.gpa = gpa;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Student otherStud) {
		// it depends on how you want to compare students based on 
		//gpa, id, name or any combination		
		return (this.gpa>otherStud.gpa?1:this.gpa<otherStud.gpa?-1:0);
	}	
}
//----- We use the interface Comparator and implements the "compare" abstract method
class StudentComaparison implements Comparator <Student> 
{
	@Override
	public int compare (Student stud1, Student stud2)
	{
		int gpaCompRes = stud1.getGpa()>stud2.getGpa()?1:stud1.getGpa()<stud2.getGpa()?-1:0;
		//if the two student got the same gpa, then sort their names
		if (gpaCompRes==0) 
				return stud1.getName().compareTo(stud2.getName());
		return gpaCompRes;
	}
}
