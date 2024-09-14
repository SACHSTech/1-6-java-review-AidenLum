package gr11review.part1;

// This program prints the odd numbers from 20 to 100 and prints the numbers from 29 to 2 in decreasing order

public class Review3{
    static void main(String[] args){

        // Loop to print odd numbers from 20 to 100
        for(int i = 21; i <= 100; i += 2){
            System.out.print(i + " ");
        }

        System.out.print("\n\n"); // Seperate loops with blank line

        // Loop to print numbers 29 to 2 in decreasing order
        for(int i = 29; i >= 2; i--){
            System.out.print(i + " ");
        }

    }
}