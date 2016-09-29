/**
 * 
 */
package theAbstract.lib;

/**
 * @author nasro
 *
 */
public class Circle extends GeometricFigure {

		private double radius=0.0;
		
		//public Circle () {super();}
		//public Circle (double radius) {this.radius = radius;}
		public Circle (double radius, String name, String color, boolean filled)
		{	super(name, color, filled);
			this.radius = radius;
		}

		public double getRadius() {		return radius;	}
		public void setRadius(double radius) {this.radius = radius;}
		
		public double getDiameter() {return 2* this.radius;}
		public double getArea() {return this.radius * this.radius  * Math.PI;}
		public double getPerimeter() {return 2* this.radius * Math.PI;}
		public String toString () {return " This a circle with radius:"+this.radius;}

}

