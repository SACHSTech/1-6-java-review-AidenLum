package gr11review.part1;

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