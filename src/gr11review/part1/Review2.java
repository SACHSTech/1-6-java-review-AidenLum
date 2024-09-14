package gr11review.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Program to prompt user to choose a joke catergory and output corresponding joke

public class Review2{
    public static void main(String[] args) throws IOException {
        
        // Create buffered reader object
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Display menu and prompt user to select a menu option.
        System.out.println("0 - print a joke about your hair\n1 - print a joke about your feet\n2 - print a joke about your clothes\n3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");
        int selectJoke = Integer.parseInt(keyboard.readLine());
        
        // Output joke depending on message selected. (Also Ive never used this before and had to look up how to do switch case)
        switch (selectJoke) {
        case 0:
            System.out.println("What do you call a stew with hair in it?\nHairy Pot-ter");
            break;
        case 1:
            System.out.println("What do you call an american foot?\nMissile-Toe");
            break;
        case 2:
            System.out.println("What clothing do scammers wear?\nA Lawsuit");
            break;
        case 3:
            System.out.println("What do you call a teacher who is stuck in traffic?\nLate");
            break;
        default:
            System.out.print("Invalid menu option");
        }
    }
}