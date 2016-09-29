/**
 * 
 */
package Interfaces;

/**
 * @author nasro
 *
 */
public interface Movable {

	 void accelerate();
	 void decelerate();
	 void changePosition(Position pos);
	 Position getCurrentPosition();
	
}
class Position{ double x; double y; public Position(){}
}
