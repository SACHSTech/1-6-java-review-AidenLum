package gr11review.part1;

// This program prompts user to enter in how many items to purchase then calculates subtotal, tax, and total.

import java.text.DecimalFormat; // Import scanner class
import java.util.Scanner; // Import decimal format class

public class Review4{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in); // Create scanner object
        DecimalFormat formatter = new DecimalFormat("#.##"); // Create decimal format object
        

        // Prompt user to enter in number of items to purchase
        System.out.print("How many items do you want to buy? ");
        int items = in.nextInt();

        double[] cost = new double[items]; // Array variable to hold each cost value
        double subtotal = 0; // Variable for subtotal

        // Prompt user for the cost of each item and store cost into an array space while calculating subtotal
        for (int i = 1; i <= items; i++){
            System.out.print("Enter the price for item " + i + ": ");
            cost[i-1] = in.nextDouble();
            subtotal += cost[i-1];
        }

        double tax = subtotal * 0.13; // Calculate tax

        // Output subtotal, tax, and total.
        System.out.println("Subtotal: $" + formatter.format(subtotal));
        System.out.println("Tax: $" + formatter.format(tax));
        System.out.println("Total: $" + formatter.format(subtotal + tax));

        in.close(); // Close scanner object
    }
}