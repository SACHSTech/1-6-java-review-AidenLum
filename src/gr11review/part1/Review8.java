package gr11review.part1;

/* This program will print 3 sets of numbers from 0 to 8 1000 times and will count 
and output the number of times all 3 numbers are the same */

public class Review8{
    public static void main(String[] args) {
        
        int[] intRandom = new int[3]; // Variable to hold each number
        int intWin = 0; // Variable to count each time each set of numbers are equivalent

        // Loop 1000 times the creation and proccess of a set of 3 numbers from 0 to 8
        for (int i = 0; i < 1000; i++){
            for (int u = 0; u < 3; u++){
                intRandom[u] = (int)(Math.random() * 8); // Randomize number 0 to 8
            }
            System.out.println(intRandom[0] + " " + intRandom[1] + " " + intRandom[2]);

            if(intRandom[0] == intRandom[1] && intRandom[1] == intRandom[2]){
                intWin++; // Count each time the number set is equivalent
            }
        }

        System.out.println(intWin); // Output the number of times the set is equivalent.
    }
}