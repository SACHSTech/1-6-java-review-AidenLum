package gr11review.part1;

// Program to calculate the day of year with month and day entered

import java.io.*; // import code

public class Review1{
    public static void main(String[] args) throws IOException{
        
        // Create buffered reader object
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Prompt user to input month and day number
        System.out.print("Enter the month number: ");
        int month = Integer.parseInt(keyboard.readLine());

        System.out.print("Enter the day number: ");
        int days = Integer.parseInt(keyboard.readLine());

        // Proccess the how many days are in each month and calculate the day of the year number

        int daysOfMonths = 0; // Create variable to hold the days of months prior

        // Proccess / Calculate the number of days prior to the month selected using while loop
        month -= 1;

        while (month > 0){
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                daysOfMonths += 31;
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                daysOfMonths += 30;
            }
            else {
                daysOfMonths += 28;
            }
            month -= 1;
        }
        
        // Output total number of days by adding days prior to the month and days inputted.
        System.out.println(daysOfMonths + days);
    }
}