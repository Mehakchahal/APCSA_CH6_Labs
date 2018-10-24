package Shopping;

import java.util.Scanner;

// Name: Mehak Chahal

public class ShopTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //ShoppingCart myCart = new ShoppingCart();
        ShoppingCart2 myCart = new ShoppingCart2();

        String n;
        double p;
        int q;

        //int count = 0;

        System.out.println("Would you like to go Shopping? (yes or no)");
        String response = scan.nextLine();
        if (!response.equalsIgnoreCase("no"))
        {
            while (true)
            {
                System.out.println("What would you like to buy?");
                n = scan.nextLine();
                System.out.println("How much does it cost? ");
                p = scan.nextDouble();
                System.out.println("How many do you want? ");
                q = scan.nextInt();
                myCart.addToCart(n,p,q);

                scan.nextLine();

                System.out.println("Would you like anything else? (yes or no)");
                response = scan.nextLine();
                if (response.equalsIgnoreCase("no"))
                {
                    break;
                }
//                else
//                {
//                    count++;
//                }
            }
        }
        System.out.println(myCart);
    }
}
