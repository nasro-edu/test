/**
 * 
 */
package Abstraction;

/**
 * @author nasro
 *
 */
public class NewsPaper extends Publication {
		 private String number;
		 private String publisherName;
		 private double taxOnNewsPaper;
		 
		
		public NewsPaper(int nberPages, String author, double price, String number, String publisherName,double taxOnNewsPaper) {
			super(nberPages, author, price);
			this.number = number;this.publisherName = publisherName;this.taxOnNewsPaper = taxOnNewsPaper;
		}

		public double getPrice() { return this.price * (1-taxOnNewsPaper);}
		
		@Override
		public String toString() {
			return "NewsPaper "+super.toString() +"[number=" + number + ", publisherName=" + publisherName + ", taxOnNewsPaper="
					+ taxOnNewsPaper + "]";
		}

		public String getNumber() {
			return number;
		}
		public String getPublisherName() {
			return publisherName;
		}
		 
	}
