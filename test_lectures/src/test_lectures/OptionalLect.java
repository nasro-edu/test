package test_lectures;

import java.util.*;

public class OptionalLect {

	private List courseList = new ArrayList();
	public void addCourses (Course aCourse)
	{
	courseList.add(aCourse)	;
	}
	public List getCourses()
	{return courseList;}
}
//-----

class Course 
{
	private String courseName;
	private Optional  professor = Optional.empty();
	private int nberStudents;
	private int yearLevel;
	
	public Course(String courseName)
	{this.courseName = courseName; 
	}
	public Course(String courseName, Optional professor, int nberStudents, int yearLevel)
	{this.courseName = courseName;  this.nberStudents = nberStudents;
	this.yearLevel = yearLevel;
	this.professor=professor;
	}
	public String getCourseName() {return courseName;}
	public Optional getProfessor() {return professor;}
	public void setProfessor(Optional prof) {this.professor=prof;}

	public int getNberStudents() {
		return nberStudents;
	}
	public void setNberStudents(int nberStudents) {
		this.nberStudents = nberStudents;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
//---------
class Professor
{private String fullName;
 private int age;
 private String degree;
 
 Professor(String fullName, int age, String degree)
 	{
	  this.fullName= fullName; this.age=age; this.degree=degree;
 	}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String toString() {return this.fullName+ " = " + this.degree + " - "+ this.age; }

	}
