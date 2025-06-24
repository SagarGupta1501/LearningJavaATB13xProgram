package ex_12_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab092_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a num between 1 and 100'

        Random random = new Random();
        int numToGuess = random.nextInt(100)+1; // 0 to 100
        //System.out.println(numToGuess);

        Scanner sc = new Scanner(System.in);


        int guess;
        int attempts = 0;
        while(true){
            System.out.println("Enter a num");
            guess = sc.nextInt();
            attempts++;

            if(guess < numToGuess)
                System.out.println("Too low, try again");
            else if (guess > numToGuess)
                System.out.println("Too big, try again");
            else {
                System.out.println("Correct ans, you got the num in " + attempts + " attempts");
                break;
            }

        }

    }
}
