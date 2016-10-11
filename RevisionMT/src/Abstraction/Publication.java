/**
 * 
 */
package Abstraction;

/**
 * @author nasro
 *
 */
public abstract class Publication {

	protected int nberPages;
	protected String author;
	protected double price;
	public Publication(int nberPages, String author, double price) {
		this.nberPages = nberPages;
		this.author = author;
		this.price = price;
	}
	
	public abstract double getPrice();

	@Override
	public String toString() {
		return "Publication [nberPages=" + nberPages + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
