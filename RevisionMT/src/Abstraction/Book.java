/**
 * 
 */
package Abstraction;

/**
 * @author nasro
 *
 */
public class Book extends Publication implements Comparable<Book> {

	 private String isbn;
	 private String title;
	 private double  taxOnBook;
	public Book(int nberPages, String author, double price, String isbn, String title, double taxOnBook) {
		super(nberPages, author, price);
		this.isbn = isbn; this.title = title;	this.taxOnBook = taxOnBook;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}


	public double getPrice() { return this.price * (1-taxOnBook);}
	@Override
	public String toString() {
		return "Book "+super.toString() +"[isbn=" + isbn + ", title=" + title + ", taxOnBook=" + taxOnBook + ", toString()="
				+  "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if (this.nberPages> o.nberPages) return 1;
		else 		if (this.nberPages < o.nberPages) return -1;
		else
		{
			if (this.price> o.price) return 1;
			else 		if (this.price< o.price) return -1;
		}
		return 0;  // means they have the same page numbers and same price

			
	}}
