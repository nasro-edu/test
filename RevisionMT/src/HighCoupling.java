
public class HighCoupling {

}

class Item
{
   public float price;
   public int Quantity;
}

class BasketContent
{
   public Item[] items;
}
//----------------------------
class Order
{
   private BasketContent basket;
   private float salesTax;

   public Order(BasketContent basket, float salesTax)
   {
       this.basket = basket;
       this.salesTax = salesTax;
   }

   public float OrderTotal()
   {
       float total = 0;
       for (int i = 0; i < basket.items.length; i++)
       {
           total += basket.items[i].price * basket.items[i].Quantity;
       }
       total += total*salesTax;
       return total;
   }
}

