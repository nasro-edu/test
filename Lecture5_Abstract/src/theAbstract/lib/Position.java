/**
 * 
 */
package theAbstract.lib;

/**
 * @author nasro
 *
 */
public class Position {
private double x;
private double y;
public Position(double x, double y) {
	this.x = x;
	this.y = y;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public void resetPosition (double x, double y)
	{setX(x); setY(y);}
@Override
public String toString() {
	return "Position [x,y]=[" + x +","+ y + "]";
}

}
