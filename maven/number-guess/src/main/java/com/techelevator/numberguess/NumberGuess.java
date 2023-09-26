package com.techelevator.numberguess;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        NumberGuess numberGuess = new NumberGuess();
        numberGuess.run();
    }

    public void run() {
        Random rando = new Random();
        int answer = rando.nextInt(100) + 1; // nextInt(100) return 0 to 99. Add 1 for 1 to 100

        int numGuesses = 0;
        int guess;
        do {
            numGuesses++;
            guess = getIntegerFromUser();
            if (guess == answer) {
                System.out.println("Correct!");
            } else if (guess < answer) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }
        } while (guess != answer);

        System.out.println("You guessed the correct number in " + numGuesses + " tries");
    }

    public int getIntegerFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a whole number: ");
        String numStr = input.nextLine();
        return Integer.parseInt(numStr);
    }
}
