package Shopping;

import java.text.NumberFormat;

// Name: Mehak Chahal
public class ShoppingCart2
{
    private int itemCount;
    private double totalPrice;
    private int capacity;
    private Item[] cart;


    public ShoppingCart2()
    {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        //TODO 1a) Initialize the cart instance variable to the appropriate size
        cart = new Item[capacity];
    }

    /**
     * Adds an item to the shopping cart.
     * @param itemName
     * @param price
     * @param quantity
     */
    public void addToCart(String itemName, double price, int quantity)
    {
        cart[itemCount] = new Item(itemName, price, quantity);
        itemCount++;
        totalPrice += price * quantity;
        if (itemCount==capacity)
        {
            increaseSize();
        }
    }

    private void increaseSize()
    {
        //Create a temporary cart that is 3 items bigger than cart
        capacity += 3;
        Item[] tempCart = new Item[capacity];
        // Loop through the cart and copy each element into the temp cart.
        for (int i = 0; i < cart.length; i++)
        {
            tempCart[i] = cart[i];
        }
        cart = tempCart;
    }

    public double getTotalPrice()
    {
        return this.totalPrice;
    }

    public int getCartLength()
    {
        return cart.length;
    }

    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String contents = "\nShopping Cart\n";
        contents += String.format("%-15s%10s%10s%10s","Item","Price","Quantity","Total\n");


        for (int i = 0; i < itemCount; i++)
        {
            //contents += cart[i].toString() + "\n";
            contents += String.format("%-15s%10.2f%10d%10.2f\n",cart[i].getName(),cart[i].getPrice(), cart[i].getQuantity(),
                    (cart[i].getPrice()*cart[i].getQuantity()));

        }

        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";

        return contents;
    }

}

