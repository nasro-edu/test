/**
 * 
 */
package test_lectures;

import java.util.Date;


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
public  class GeometricFigure {
//private String color="";
//private boolean filled=false;
protected  String color="";
protected boolean filled=false;
protected String name;
private Date dateCreated;

	public GeometricFigure(){this.color = "white";
	this.filled =false; this.name="TBC";}
 public  GeometricFigure(String name, String color, boolean filled) {
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

public Date getDateCreated() {return dateCreated;}
public void setDateCreated(Date dateCreated) {this.dateCreated = dateCreated;}

public String toString(){ return "Figure "+this.name+", hascolor:"+this.color +" and created on :"+this.dateCreated;}

}
//---- define sub class---------------------//
class Circle extends GeometricFigure
{
	private double radius=0.0;
	
	//public Circle () {super();}
	//public Circle (double radius) {this.radius = radius;}
	public Circle (double radius, String name, String color, boolean filled)
	{	super(name, color, filled);
		this.radius = radius;
	}

	public double getRadius() {		return radius;	}
	public void setRadius(double radius) {this.radius = radius;}
	
	public double getArea() {return this.radius * this.radius  * Math.PI;}
	public double getDiameter() {return 2* this.radius;}
	public double getPerimeter() {return 2* this.radius * Math.PI;}
	public String toString () {return " This a circle with radius:"+this.radius;}

}
//----- define a sub class Rectangle -----
 class Rectangle extends GeometricFigure
{
	private double width;
	private double height;
	
	
	//public Circle () {super();}
	//public Circle (double radius) {this.radius = radius;}
	public Rectangle (double width, double height , String name, String color, boolean filled)
	{	super(name, color, filled);
		this.width= width;
		this.height= height;		
	}

	public double getWidth() {	return width;}
	public void setWidth(double width) {this.width = width;}

	public double getHeight() {return height;}
	public void setHeight(double height) {this.height = height;}

	public double getArea() {return this.width* this.height;}
	public double getPerimeter() {return 2* (this.width* this.height);}

	public String toString () {return super.toString()+". This a Rectangle  with (color, filed, width, height)=("+
			this.color + ","+ this.filled + "," + this.width + ","+ this.height +")";}
}
 //--------------------------
 //--  testing contsructor chaining
 
 class A {
	 protected int xA;
	 //public A() {System.out.println("Setting xA...");this.xA=1;}	 
	 //public A(int xA) {System.out.println("Setting xA with parame...");this.xA=xA;}	 
 
 }
 
 class B extends A {
	 protected int xB;
	 public B() {System.out.println("Setting xB...");this.xB=10;}	 
	 public B(int xA, int xB) 
	 	{super();
	 		System.out.println("Setting xB with parame...");
	 	this.xB=xB;}	 
 }
 class C extends B {
	 protected int xC;
	 public C() {System.out.println("Setting xC...");this.xC=100;}	 
	 public C(int xA, int xB, int xC) 
	 	{super(xA,xB);
	 	System.out.println("Setting xA with parame...");
	 	this.xC=xC;
	 	}	 

	 public String toString() {return "xA,xB,xC)=("+xA+","+xB+","+xC+")";}
	 
 }
  