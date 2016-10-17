/**
 * 
 */
package dw317.lib;

public class BookSample implements Comparable<BookSample> {
	//isbn; title; author; genre, nber pages, year, price;
		private String isbn;	private String title;
		private String author;	private String genre;
		private int year;	private int nberPages;
		private double price;
		
		private void setBookData(String isbn, String title, String author, String genre, int year, int nberPages,double price) {
			this.isbn = isbn;			this.title = title;	this.author = author;
			this.genre = genre;	this.year = year;	this.nberPages = nberPages;
			this.price = price;
		}
		//------------
		public BookSample (BookSample  aBook) {
			aBook.setBookData(isbn, title, author, genre, year, nberPages,price) ;		}

		
		public BookSample(String isbn, String title, String author, String genre, int year, int nberPages, double price) {
			setBookData(isbn, title, author, genre, year, nberPages,price) ;		}

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

		public int compareTo(BookSample b) {
			return (price>b.price?1:price<b.price?-1:0);
		}

		
}
