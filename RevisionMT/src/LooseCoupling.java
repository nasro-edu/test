/**
 * 
 */

/**
 * @author nasro
 *
 The logic that is specific to the implementation of the item or the basket or the order 
 is restricted to just that class. 
 So we could change the implementation of any of these classes without having to change the other classes. 
 We could take this decoupling yet further by improving the design, introducing interfaces, etc, 
 */
public class LooseCoupling {

}

class Item_
{
    public float price;
    public int quantity;

    public float GetLineItemTotal()
    {
        return price * quantity;
    }
}
//----------------------
class BasketContent_
{
    public Item_[] items;

    public float GetBasketTotal()
    {
        float total = 0;
        for(Item_ item :items)
        {
            total += item.GetLineItemTotal();
        }
        return total;
    }
}
//----------------------
 class Order_
{
    private BasketContent_ baskt;
    private float salesTax;

    public Order_(BasketContent_ baskt, float salesTax)
    {
        this.baskt= baskt;
        this.salesTax = salesTax;
    }

    public float OrderTotal()
    {
        return baskt.GetBasketTotal() * (1.0f + salesTax);
    }
}
