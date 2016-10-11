/**
 * 
 */
package Interfaces;

import theAbstract.lib.Position;

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
