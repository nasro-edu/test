/**
 * 
 */
package test_lectures;

import java.util.Optional;

/**
 * @author nasro
 *
 */
public class test_lectures123 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		short runLec1_copy=0, runLec2_Immutable=1, runLect3_Optional=0;
		
		//1. ------- compares hash code
		if(runLec1_copy==1)
		{
			Name name1= new Name ("Ali", "Day");
			Name name2= new Name ("Ali", "Day");
			//Name name2= new Name ("Sam", "Eric");
			Telephone phone1= new Telephone(514, 457898);
			Telephone phone2= new Telephone(514, 112233);
			SomeBody persone1 = new SomeBody(name1, 19, phone1);
			SomeBody persone2 = new SomeBody(name2, 19, phone1);

			System.out.println("pwrsone1 and persone 2 are they equal?:"+persone1.equals(persone2));

			Company comp1 = new Company("Ali Day", phone1, 123);
			System.out.println("comapnay1 and persone 1 are they equal?:"+persone1.equals(comp1));
	
		}
		
		// 2. defensive copy
		if(runLec2_Immutable==1)
		{
			System.out.println("************ Final - Deep copy -defensive copy ********");
			
			Name hisName = new Name ("Leo", "Messi");
			Name herName = new Name ("Pat", "Ricia");
			//System.out.println(hisName.toString());
			//System.out.println(herName.toString());
			Telephone hisPhone = new Telephone(514, 457898);
			SomeBody him = new SomeBody(hisName, 45, hisPhone );
			
			SomeBody her = new SomeBody(herName, 38);
			System.out.println(him.toString());
			System.out.println(her.toString());
			hisName.setFirstName("Lionel");
			System.out.println(her.toString());
			her.getName().setFirstName("Hello");
			System.out.println(her.toString());
	
		}
		
		//3. Optional 
		if(runLect3_Optional==1)
		{
		OptionalLect testOptinal = new OptionalLect();
		Optional<Professor> prof1= Optional.of(new Professor("Jaya", 38, "MSc"));
		//Optional <Professor> prof2= new Professor("Nasr", 46, "PhD");
		Course course1 = new Course("Java II");
		Course course2 = new Course("Oracle ", prof1, 22, 2);
		
		testOptinal.addCourses(course1); 
		testOptinal.addCourses(course2);
		course1.setProfessor(prof1);
		
		testOptinal.getCourses().stream().forEach(a -> 
			{
			/*if (((Course)a).getProfessor()==null)
				{System.out.println(((Course) a).getCourseName() + "/ no prof for u") ;}
			else
				{System.out.println((((Course) a).getCourseName() + "/" + ((Course) a).getProfessor()));}
			*/
			if (!((Course)a).getProfessor().isPresent())
			{System.out.println(((Course) a).getCourseName() + "/ no prof for u") ;}
		else
			{System.out.println((((Course) a).getCourseName() + "/" + ((Course) a).getProfessor()));}
			
			}
		);
		}
		
	}//main

}
