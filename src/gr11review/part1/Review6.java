package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;


public class Review6{
    public static void main(String[] args) throws IOException {
        
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatter = new DecimalFormat("#.##"); // Create decimal format object

        double dblPrice;
        double dblSubtotal = 0;

        do { 
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(keyboard.readLine());
            dblSubtotal += dblPrice;

        } while (dblPrice > 0);

        double dblTax;
        System.out.println("Subtotal: ");
        System.out.println("Tax: ");
        System.out.println("Total: ");
        



        


    }
}