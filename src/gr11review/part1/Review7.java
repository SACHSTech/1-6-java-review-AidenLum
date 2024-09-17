package gr11review.part1;

/* This program will create different statistics based off of the sentence including character length,
number of a, number of spaces, and number of odd characters. */

import java.io.*; // import native java

public class Review7{
    public static void main(String[] args) throws IOException {

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); // Create buffered reader object

        String sentence = keyboard.readLine(); // Allow user to enter in sentence

        System.out.println("There are " + sentence.length() + " characters in the sentence."); // Output number of characters

        int intSpaceCount = 0; // Variable to count spaces
        int intACount = 0; // Variable to count a/A(s)

        // Calculate how many spaces and a there are in the sentence
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.substring(i,i+1).equals(" ")){
                intSpaceCount += 1;
            }
            if (sentence.substring(i,i+1).equalsIgnoreCase("a")){
                intACount += 1;
            }
        }

        // Output the number of spaces and a/A(s) in the sentence
        System.out.println("There are " + intSpaceCount + " spaces in the sentence.");    
        System.out.println("There are " + intACount + " letter a in the sentence.");

        int intOddCharacters = 0; // Stores number of odd characters

        // Calculate number of odd numbers
        for (int i = 0; i < sentence.length(); i += 2){
            intOddCharacters += 1;
        }
        // Print dashes according to the number of odd numbers
        for (int i = 0; i < intOddCharacters; i++){
            System.out.print("-");
        }




    }
}