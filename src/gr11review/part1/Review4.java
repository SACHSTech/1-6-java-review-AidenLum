package gr11review.part1;

// This program prompts user to enter in how many items to purchase then calculates subtotal, tax, and total.

import java.io.*; // Import scanner class
import java.text.DecimalFormat; // Import native java

public class Review4{
    public static void main(String[] args) throws IOException{

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); // Create buffered reader object
        DecimalFormat formatter = new DecimalFormat("0.00"); // Create decimal format object
        

        // Prompt user to enter in number of items to purchase
        System.out.print("How many items do you want to buy? ");
        int items = Integer.parseInt(keyboard.readLine());

        double[] cost = new double[items]; // Array variable to hold each cost value
        double dblSubtotal = 0; // Variable for subtotal

        // Prompt user for the cost of each item and store cost into an array space while calculating subtotal
        for (int i = 1; i <= items; i++){
            System.out.print("Enter the price for item " + i + ": ");
            cost[i-1] = Double.parseDouble(keyboard.readLine());
            dblSubtotal += cost[i-1];
        }

        double dblTax = dblSubtotal * 0.13; // Calculate tax

        // Output subtotal, tax, and total.
        System.out.println("Subtotal: $" + formatter.format(dblSubtotal));
        System.out.println("Tax: $" + formatter.format(dblTax));
        System.out.println("Total: $" + formatter.format(dblSubtotal + dblTax));
    }
}