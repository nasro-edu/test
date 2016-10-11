package theAbstract.lib;

import Interfaces.Interf1;
import Interfaces.Interf2;
import Interfaces.Interf3;

//-----------/
class AA 
{}
//class BB extends AA implements Interf1,  Interf2 {}

//class CC implements Interf1, Interf3 {	}


final public class Invention {
	private final Inventor inventor;
	private final int publicationYear;
	private final String domain = "TBC";

	public Invention(Inventor inventor, int year) {
		this.inventor = new Inventor(inventor.getFullName());
		publicationYear = year;
	}
	public Inventor getInventor() 
	{//return inventor;
		return new Inventor(inventor.getFullName());
	}
	public int getYear() {return publicationYear;}
	//public void setInventor(Inventor inv) { inventor=inv;}
	@Override
	public String toString() {
		return "Invention [inventor=" + inventor + ", publicationYear=" + publicationYear + ", domain=" + domain + "]";
	}

}

class Inventor 
{ protected String fullName;
  
  public Inventor (String name) { fullName=name;
  }

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

@Override
public String toString() {
	return "Inventor [fullName=" + fullName + "]";
}

}
