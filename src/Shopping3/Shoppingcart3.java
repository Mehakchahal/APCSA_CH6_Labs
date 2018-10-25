package Shopping3;

import Shopping.Item;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Shoppingcart3
{
        private int itemCount;      // total number of items in the cart
        private double totalPrice;  // total price of items in the cart
        //private int capacity;       // current cart capacity
        private ArrayList<Item> cart;


        public Shoppingcart3()
        {
            //capacity = 5;
            itemCount = 0;
            totalPrice = 0.0;
            cart = new ArrayList<>();
        }

        /**
         * @param itemName
         * @param price
         * @param quantity
         */

        public void addToCart (String itemName,double price, int quantity)
        {
            //TODO 1b) Complete the addToCart method
            cart.add(new Item(itemName, price, quantity));
            itemCount++;
            totalPrice += price * quantity;
        }

        public double getTotalPrice ()
        {
            return this.totalPrice;
        }

        public int getCartLength ()
        {
            return cart.size();
        }

        public String toString ()
        {
            NumberFormat fmt = NumberFormat.getCurrencyInstance();

            String contents = "\nShopping Cart\n";
            contents += String.format("%-15s%10s%10s%10s", "Item", "Price", "Quantity", "Total\n");


            for (int i = 0; i < itemCount; i++)
            {
                //contents += cart[i].toString() + "\n";
                contents += String.format("%-15s%10.2f%10d%10.2f\n", cart.get(i).getName(), cart.get(i).getPrice(), cart.get(i).getQuantity(),
                        (cart.get(i).getPrice() * cart.get(i).getQuantity()));

            }

            contents += "\nTotal Price: " + fmt.format(totalPrice);
            contents += "\n";

            return contents;
        }

}

