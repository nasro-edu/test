/**
 * 
nasro
 iMMUTABLE
 fINAL 
 DEEP COPY 
 COPY CONSTRICTOR
 *
 */
package test_lectures;

import java.io.Serializable;
import java.util.Optional;

public final class SomeBody {

private final Name name;
private final String fullName;
public String getFullName() {
	return fullName;
}
private final int age;
private Telephone telephone ; 

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	return result;
}
public boolean equals(Object obj) {
	Object other__;
	//age == other.age && 
	if(obj.getClass().getName()=="Company")
	{
		//other.getClass().cast("Company");
		Company other = (Company) obj;
		if (fullName.equalsIgnoreCase( other.getFullName()) && telephone.equals(other.getTelephone()))
			return true;
	}
	else
	{//other.getClass().cast("SomeBody");
	SomeBody other = (SomeBody) obj;
	if (fullName.equalsIgnoreCase(other.getFullName()) && telephone.equals(other.getPhone()))
		return true;
	}	
	
	return false;
}
public SomeBody(Name name, int age )
{ Name aName = new Name (name);
	int aAge = age;///  <-- weird 
this.name = aName;
this.age = aAge;
this.fullName=this.name.getFirstName()+" " +this.name.getLastName();
}
public SomeBody(Name name, int age , Telephone hisPhone)
		{ Name aName = new Name (name);
			int aAge = age;///  <-- weird 
		this.name = aName;
		this.age = aAge;
		this.fullName=this.name.getFirstName()+" " +this.name.getLastName();
		this.telephone = hisPhone;
		}

public Name getName() {
	Name aName = new Name () ;
	aName = name;
	//aName.setFirstName(name.getFirstName());
	//aName.setLastName(name.getLastName());
	return aName;}

public void setName(Name name) {
	//this.name = aName;
}

public int getAge() {
	return age;
}
public Telephone getPhone() {return this.telephone;}
public void setAge(int age) {	//this.age = age;
	}

public void setTelphone(Telephone fone) {this.telephone= fone;}
public String toString() 
	{Telephone defPhone=new Telephone(514,1234567);
		return this.getName() + " - " + this.age + " // "+this.getPhone();}

}
//----------------------------
// we use it to explain equal hash compareTo amon its instancated objects and with other classes
class Company
{
	//private final Name name;
	private final String fullName;
	private Telephone telephone ; 
	private int numberEmployees;
	
	public Telephone getTelephone() {
		return telephone;
	}

	public Company(Company aComp) {
		this.fullName = aComp.fullName;
		this.telephone = aComp.telephone;
		this.numberEmployees = aComp.numberEmployees;
	}
	public Company(String fullName, Telephone telephone, int numberEmployees) {
		this.fullName = fullName;
		this.telephone = telephone;
		this.numberEmployees = numberEmployees;
	}

	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}
	public int getNumberEmployees() {
		return numberEmployees;
	}
	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	public String getFullName() {
		return fullName;
	}
}
//========================
 class Name implements Serializable {
	private static final long serialVersionUID = 42031768871L;
	
	private String firstName="";
	private String lastName="";

	public Name() {this.firstName=this.lastName="";}
	public Name(Name aName) {this.firstName=aName.firstName; this.lastName=aName.lastName; ;}
	public Name(String fName, String lName) {this.firstName=validateName("[a-zA-Z ,'-]+", fName,2, "fName"); 
											this.lastName=validateName("[a-zA-Z ,'-]+", lName,2, "lName");}
	
	public String toString() {return this.firstName+ " "+this.lastName;}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public static String validateName(String namePattren, String theName, int minSize, String labelError)
	{  //String namePattren = "[a-zA-Z ,'-]+";
		try{
		if(theName.length()<2)
				throw new IllegalArgumentException(labelError+" must be more than "+minSize+" chars");
		if(!theName.matches(namePattren)) throw new IllegalArgumentException ("wrong" +labelError +"content");
		}
		catch (IllegalArgumentException iae)
		{
			return iae.getMessage();
		}
		return theName;
			
	}
}
//--------------------------
 class Telephone
 {
	 private long number;
	 private int areaCode;
	 
	 public Telephone(long number, int areaCode)
	 {this.number= number; this.areaCode=areaCode;}
	 public Telephone(Telephone aPhone)
	 {this.number= aPhone.number; aPhone.areaCode=areaCode;}
	 
	 public String toString () {return "(" + this.areaCode + ") " + this.number; }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaCode;
		result = prime * result + (int) (number ^ (number >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)	return true;
		if (obj == null || (getClass() != obj.getClass()) )			return false;
		Telephone other = (Telephone) obj;
		if (areaCode != other.areaCode)
			return false;
		if (number != other.number)
			return false;
		return true;
	}
 
 }