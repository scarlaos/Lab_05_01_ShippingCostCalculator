import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.00;
        double shippingPrice = 0.02;
        double priceOfShipping;
        double totalShipping;
        String price = "";

        System.out.print("Enter your item's price. ");
        itemPrice = in.nextDouble(); // buffer is cleared

        if (itemPrice >= 100)
        {
            System.out.println("You do not have to pay for shipping! Your total price is $" + itemPrice);
        }

        else if (itemPrice < 100)
        {
            priceOfShipping = itemPrice * shippingPrice;
            totalShipping = priceOfShipping + itemPrice;
            System.out.println("Your price with shipping is $" + totalShipping + ".");
        }



    }
}