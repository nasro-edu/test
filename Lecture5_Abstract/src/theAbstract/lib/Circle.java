/**
 * 
 */
package theAbstract.lib;

import Interfaces.Movable;

/**
 * @author nasro
 *
 */
public class Circle extends GeometricFigure implements Movable{

		private double radius=0.0;
		private Position position;
		
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

		@Override
		public void accelerate() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void decelerate() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void changePosition(Position pos) {
			position.setX(pos.getX());
			position.setY(pos.getY());
			// TODO Auto-generated method stub
			
		}

		@Override
		public Position getCurrentPosition() {
			// TODO Auto-generated method stub
			return position;
		}
}

