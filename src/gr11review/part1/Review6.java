package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;


public class Review6{
    public static void main(String[] args) throws IOException {
        
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatter = new DecimalFormat("0.00"); // Create decimal format object

        double dblPrice;
        double dblSubtotal = 0;

        do { 
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(keyboard.readLine());
            dblSubtotal += dblPrice;

        } while (dblPrice > 0);

        double dblTax = dblSubtotal * 0.13;

        System.out.println("Subtotal: $" + formatter.format(dblSubtotal));
        System.out.println("Tax: $" + formatter.format(dblTax));
        System.out.println("Total: $" + formatter.format(dblSubtotal + dblTax));
        



        


    }
}