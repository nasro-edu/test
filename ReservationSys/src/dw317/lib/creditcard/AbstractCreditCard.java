/**
 * 
 */
package dw317.lib.creditcard;

/**
 * @author hnasreddine
 *
 */
public abstract class AbstractCreditCard implements CreditCard{
	private static final long serialVersionUID = 42031768871L;
	final CardType cardType;
	final	 String number;


public AbstractCreditCard(CardType cardType,  String number) throws IllegalArgumentException
{
	this.cardType=cardType;
	this.number=number;
	}
public boolean equals(AbstractCreditCard object) {return (object.getClass()==this.getClass()
											  && object.number==this.number);}

public String getNumber() {return this.number;}
public CardType  getType() {return this.cardType;}
public String toString() {return this.cardType + "*" +this.number;}
public void print(){};

protected static  String validateLuhnAlgorithm(String number) {return number;} 

}
