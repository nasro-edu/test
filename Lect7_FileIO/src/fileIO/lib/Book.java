/**
 * 
 */
package fileIO.lib;

import java.io.Serializable;

/**
 * @author nasro
 *
 */
public class Book implements Serializable, Comparable<Book> {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	private String isbn;
	private String title;
	private double price;
	
	public Book(String isbn, String title, double price) {
	setBookData(isbn, title, price);	
	}
	public Book(Book aBook) {
		aBook.setBookData(isbn, title, price);
	}
	private void setBookData(String isbn, String title, double price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book arg0) {
		if(this.price>arg0.price) return 1;
		if(this.price<arg0.price) return -1;
		return 0;
	}
	
	
	
}
