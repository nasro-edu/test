/**
 * 
 */
package theAbstract.lib;

/**
 * @author nasro
 *
 */
public class Rectangle extends GeometricFigure {

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


		public String toString () {return super.toString()+"(width, height)=("+
				this.width + ","+ this.height +")";}
		//public String toString () {return super.toString()+"(color, filed, width, height)=("+
			//	this.color + ","+ this.filled + "," + this.width + ","+ this.height +")";}

		public double getArea() {return this.width* this.height;}
		public double getPerimeter() {return 2* (this.width* this.height);}
	}

