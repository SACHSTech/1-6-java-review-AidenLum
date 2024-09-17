package gr11review.part1;

// Program to calculate the day of year with month and day entered

import java.io.*; // import code

public class Review1{
    public static void main(String[] args) throws IOException{
        
        // Create buffered reader object
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Prompt user to input month and day number
        System.out.print("Enter the month number: ");
        int intMonth = Integer.parseInt(keyboard.readLine());

        System.out.print("Enter the day number: ");
        int intDays = Integer.parseInt(keyboard.readLine());

        // Proccess the how many days are in each month and calculate the day of the year number

        int intDaysOfMonths = 0; // Create variable to hold the days of months prior

        // Proccess / Calculate the number of days prior to the month selected using while loop
        intMonth -= 1;

        while (intMonth > 0){
            if (intMonth == 1 || intMonth == 3 || intMonth == 5 || intMonth == 7 || intMonth == 8 || intMonth == 10 || intMonth == 12){
                intDaysOfMonths += 31;
            }
            else if(intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11){
                intDaysOfMonths += 30;
            }
            else {
                intDaysOfMonths += 28;
            }
            intMonth -= 1;
        }
        
        // Output total number of days by adding days prior to the month and days inputted.
        System.out.println(intDaysOfMonths + intDays);
    }
}