/**
 * 
 */
package dw317.lib.business;

import java.io.Serializable;

import dw317.lib.*;
import dw317.lib.creditcard.*;

/**
 * @author nasro
 *
 <<interface>>
Customer extends Comparable<Customer>, Serializable
+ getName(): Name {must return a deep copy}
+ getEmail(): Email
+ getCreditCard() : Optional<CreditCard>
+ setCreditCard(Optional<CreditCard> card)
*/
public interface CustomerDelegate extends Comparable, Serializable{

	public abstract Name getName();//: Name {must return a deep copy}
	public abstract Email getEmail();
	public abstract  CreditCard getCreditCard();// : Optional<CreditCard>
	public abstract void setCreditCard(CreditCard card);
}
