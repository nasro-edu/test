/**
 * 
 */
package dw317.lib.creditcard;

import static java.lang.System.out;

/**
 * @author hnasreddine
 *
 */

public abstract class AbstractCreditCard implements CreditCard{
	private static final long serialVersionUID = 42031768871L;
	final CardType cardType;
	final	 String number;


public AbstractCreditCard(CardType cardType,  String number) 
{
	validateLuhnAlgorithm(number) ;
	this.cardType=cardType;
	this.number=number;
	}
public boolean equals(AbstractCreditCard object) {return (object.getClass()==this.getClass()
											  && object.number==this.number && object.cardType==this.cardType);}

public String getNumber() {return this.number;}
public CardType  getType() {return this.cardType;}
public String toString() {return this.cardType + "*" +this.number;}
public void print(){};

protected static  String validateLuhnAlgorithm(String number) 
	{
	int testCardTot=0;
	try{
		//System.out.println(number.length());
		if (number.length()!=16) 
			throw new IllegalArgumentException(" Cad Number Error - wrong size");
		
		//System.out.println(number);
		
			for (int i=number.length()-1;i>=0;i--)
			{	int tempNumber;
				if(i%2==1) 	tempNumber = Character.getNumericValue(number.charAt(i));
				else 	tempNumber = Character.getNumericValue(number.charAt(i)) * 2;	
				if (tempNumber>9) tempNumber -= 9;
					testCardTot = testCardTot + tempNumber ;
			//System.out.println("i = "+i + " // charAt(i):"+number.charAt(i) + " // testCardTot)="+testCardTot);
			}	
		}
	catch(IllegalArgumentException iae)
	{
		return ("\t"+ iae.getMessage());
	}
	
		if(testCardTot %10 ==0) return number; //"card valid";
	//System.out.println(testCardTot);
	return "card invalid";
	} 

}
