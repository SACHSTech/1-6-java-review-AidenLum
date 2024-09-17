package gr11review.part1;

// This program will alllow the user to enter in the price of items until they enter 0, and will calculate the subtotal, tax, and total.

import java.io.*; // Import nativa java
import java.text.DecimalFormat; // import decimal format


public class Review6{
    public static void main(String[] args) throws IOException {
        
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); // Create buffered reader object
        DecimalFormat formatter = new DecimalFormat("0.00"); // Create decimal format object

        double dblPrice; // Create price and subototal variable
        double dblSubtotal = 0;

        // Allow user to enter in price until 0 is entered and calculate subtotoal
        do { 
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(keyboard.readLine());
            dblSubtotal += dblPrice;

        } while (dblPrice > 0);

        double dblTax = dblSubtotal * 0.13; // Calculate tax

        // Output subtotal, tax, total
        System.out.println("Subtotal: $" + formatter.format(dblSubtotal));
        System.out.println("Tax: $" + formatter.format(dblTax));
        System.out.println("Total: $" + formatter.format(dblSubtotal + dblTax));
        



        


    }
}