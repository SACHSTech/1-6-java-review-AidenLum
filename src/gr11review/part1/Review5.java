package gr11review.part1;

/* This program will allow the user to enter in an annual invested amount, annual compound interest rate, and a target amount to 
calculate how long it will take to reach the target amount. */

import java.io.*; // Import native java

public class Review5{
    public static void main(String[] args) throws IOException{

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); // Create buffered reader object

        // Prompt user to input yearly invested amount, interest rate, and target amount.
        System.out.print("Enter the yearly invested amount: ");
        double invested = Double.parseDouble(keyboard.readLine());
        System.out.print("Enter the compound interest rate: ");
        double interestRate = Double.parseDouble(keyboard.readLine());
        System.out.print("Enter the target amount: ");
        double target = Double.parseDouble(keyboard.readLine());

        double calculatedAmount = 0; // Create a variable to track the investment towards the target value
        int year = 0; // Create a variable to record the number of years it takes to reach the target value

        // Calculate the yearly investement and the yearly interest rate until the investment reaches the target value.
        while (calculatedAmount < target){
            calculatedAmount += invested;
            calculatedAmount += calculatedAmount * interestRate * 0.01;
            year += 1;
        }

        // Output the amount of years it takes the investment to reach the target amount
        System.out.println("The target amount will be earned in " + year + " years.");
    }
}