package sort.lib;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestSort_Main {

	public static void main(String[] args) {

		Student s1 = new Student("peter", 3.54, "1425");
		Student s2 = new Student("sarah", 2.14, "1425");
		Student s3 = new Student("jerry", 3.54, "1425");
		Student s4 = new Student("mark", 3.9, "1425");

		Student studentArr[] = new Student[4];
		studentArr[0] = s1;		studentArr[1] = s2;
		studentArr[2] = s3; studentArr[3] = s4;

		displayStudents(studentArr, "  ---- Student list initial ----");
		Arrays.sort(studentArr);
		displayStudents(studentArr, "  ---- Student list Afet sorting ----");
		
		ArrayList studentList = new ArrayList<Student>(Arrays.asList(studentArr));
		Collections.sort(studentList, new StudentComaparison());
		displayStudentList(studentList, "  ---- Student list After sorting (gpa, name)----");			
	}
	//to display lists
	public static void displayStudentList(ArrayList studentList, String message) {
			System.out.println(message);
			for (Object aStud : studentList) {
				System.out.println(aStud);
			}
	}
	// displays arrays
	public static void displayStudents(Student studentArr[], String message) {
		System.out.println(message);
		for (Student aStud : studentArr) {
			System.out.println(aStud.toString());
		}
	}
}
