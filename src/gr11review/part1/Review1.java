package gr11review.part1;

// Program to calculate the day of year with month and day entered

import java.io.*; // import code

public class Review1{
    public static void main(String[] args) throws IOException{
        
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Prompt user to input month and day number
        System.out.print("Enter the month number: ");
        int month = Integer.parseInt(keyboard.readLine());

        System.out.print("Enter day number: ");
        int days = Integer.parseInt(keyboard.readLine());

        // Proccess the how many days are in each month and calculate the day of the year number

        int daysOfYear = 0;
        month -= 1;

        while (month > 0){
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                daysOfYear += 31;
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                daysOfYear += 30;
            }
            else {
                daysOfYear += 28;
            }
            month -= 1;
        }
        System.out.println(daysOfYear + days);
    }
}