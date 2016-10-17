/**
 * 
 */
package theAbstract.lib;

import Interfaces.Interf1;
import Interfaces.Interf2;
import Interfaces.Interf3;

/**
 * @author nasro
 *
 *Lecture on 
 *	inheritance. polymorphism, ...
-Using super to access parent methods
-Using parent constructors and constructor chaining
-Overriding
-Overriding vs Overloading
-Object class
-Polymorphism
-Dynamic binding
-instance of

 */
public abstract class GeometricFigure {

	//private String color="";
	//private boolean filled=false;
	protected  String color="";
	protected boolean filled=false;
	protected String name;

		protected  GeometricFigure(){this.color = "white";
		this.filled =false; this.name="TBC";}
	 protected GeometricFigure(String name, String color, boolean filled) {
		this.name= name;
		this.color = color;
		this.filled = filled;
	}

	 public String getName() {return this.name;}
	 public void setName(String name) {this.name= name;}

	 public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}

	public boolean isFilled() {return filled;}
	public void setFilled(boolean filled) {this.filled = filled;}

	public String toString(){ return this.name+":";}
	//public String toString(){ return "Figure "+this.name+", hascolor:"+this.color ;}
	public abstract double getArea();
	public abstract double getPerimeter() ; 

	//public abstract void methodName1() ;  //ok
	//public abstract double methodName2() {} //X
	//public int methodName3() ; //X
	//public void methodName4() { } //ok
}
